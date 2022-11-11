/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Helper.JDBCHeper;
import Model.SanPham;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
/**
 *
 * @author Admin
 */
public class SanPhamDao implements InterfaceSanPham{
    
    String sqlInsert = "insert dbo.SanPham(ID_Sanpham,TenSP,Gia,ID_DonviSP,ID_LoaiSP,Trangthai,Hinh) values (?,?,?,?,?,?,?)";
    
    String sqlUpdate = "update SanPham set TenSP = ?, Gia =?,ID_DonviSP=?,"
            +"ID_LoaiSP=?,Trangthai=?, Hinh=? where ID_Sanpham=?";
    String sqlDelete = "delete from SanPham where ID_Sanpham = ?";
    
    String sqlSelectAll = "select * from SanPham";
    
    String sqlSelectID = "select * from SanPham where ID_Sanpham = ?";
    
    String sqlSelect_Trangthai1 = "select * from dbo.SanPham where Trangthai = 1";
    String sqlSelect_Trangthai2 = "select * from dbo.SanPham where Trangthai = 0";
    
    String update_Trangthai = "update SanPham set Trangthai = 0 where ID_Sanpham = ?";
    
    String name_loaiSP = "select * FROM dbo.LoaiSanPham WHERE ID_LoaiSP = ?";

    String name_donviSP = "select * FROM dbo.DonViSanPham WHERE ID_DonviSP = ?";

    String SElECT_SQL_IDSP = "select * FROM dbo.SanPham WHERE Trangthai = 1 AND ID_Sanpham = ?";
    
    
    @Override
    public void insert(SanPham sp) {
        JDBCHeper.update(sqlInsert,sp.getId_sp(), sp.getTen_sp(),sp.getGia_sp(),sp.getId_donviSP(),
                sp.getId_loaiSP(), sp.isTrangthai(),sp.getHinh());
    }
    

    @Override
    public void update(SanPham sp) {
        JDBCHeper.update(sqlUpdate, sp.getTen_sp(),sp.getGia_sp(),sp.getId_donviSP(),
                sp.getId_loaiSP(),sp.isTrangthai(),sp.getHinh(),sp.getId_sp());
    }

    @Override
    public void delete(String id) {
        JDBCHeper.update(update_Trangthai, id);
    }

    @Override
    public List<SanPham> selectAll() {
        return selectBySQL(sqlSelect_Trangthai1);
    }

    @Override
    public SanPham selectID(String id) {
        List<SanPham> list = selectBySQL(sqlSelectID, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<SanPham> selectBySQL(String sql, Object... args) {
        List<SanPham> list_sp = new ArrayList<>();
        try {
            ResultSet rs = JDBCHeper.query(sql, args);
            while(rs.next()){
                SanPham sp = new SanPham();
                sp.setId_sp(rs.getString("ID_Sanpham"));
                sp.setTen_sp(rs.getString("TenSP"));
                sp.setGia_sp(rs.getInt("Gia"));
                sp.setId_loaiSP(rs.getString("ID_LoaiSP"));
                sp.setId_donviSP(rs.getString("ID_DonviSP"));
                sp.setTrangthai(rs.getBoolean("Trangthai"));
                sp.setHinh(rs.getString("Hinh"));
                list_sp.add(sp);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list_sp;
    }
    
    public List<SanPham> select_TrangThai(){
        return selectBySQL(sqlSelect_Trangthai2);
    }
    public List<SanPham> selectByKeyword(String keyword, String LoaiSP) {
        String sql = "SELECT * FROM dbo.SanPham WHERE TenSP LIKE ? AND ID_LoaiSP = ? AND Trangthai = 1 ";
        return selectBySQL(sql, "%" + keyword + "%", LoaiSP);
    }

    public SanPham selecteByIDSP(String key) {
        List<SanPham> list = (List<SanPham>) selectBySQL(SElECT_SQL_IDSP, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public int select_Max_id_java() {
        try {
            String sql = "select max(cast(substring(ID_Sanpham,3,LEN(ID_Sanpham))as int)) from  SanPham ";
            ResultSet rs = JDBCHeper.query(sql);
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public List<SanPham> selectALLL() {
        return selectBySQL(sqlSelectAll);
    }

    public List<SanPham> Select_ByName(String name) {  // tìm theo tên sản phẩm
        String Select_ByName = "select  *  from SanPham where TenSP like ? and Trangthai =1";
        return selectBySQL(Select_ByName, "%" + name + "%");
    }
    // lấy tên sản phẩm

    public String selectnameSP(String id) {
        String sql = "select * from SanPham where ID_SanPham = ?";
        return selectBySQL(sql, id).get(0).getTen_sp();
    }
    // lấy ra giá sản phẩm

    public int selectPrice(String id) {
        String sql = "select * from SanPham where ID_SanPham = ?";
        return selectBySQL(sql, id).get(0).getGia_sp();
    }
    // lấy id qua tên sản phẩm

    public String selectNameByID(String name) {
        String sql = "select * from SanPham where TENSP   = ?";
        return selectBySQL(sql, name).get(0).getId_sp();
    }
}
