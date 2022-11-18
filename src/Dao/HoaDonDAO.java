/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.HoaDon;
import Helper.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author HP
 */
public class HoaDonDAO implements InterfaceHoaDon {

    String INSERT_SQL = "INSERT dbo.HoaDon VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
    String UPDATE_SQL_TrangThai = "UPDATE dbo.HoaDon SET Trangthai = ? WHERE ID_Hoadon = ?";
    String UPDATE_SQL_khachhang = "UPDATE dbo.HoaDon SET SDT = ?,Ten = ?,tenShip =?,diaChi =? WHERE ID_Hoadon = ?";
    String UPDATE_SQL_TrangThaiTT = "UPDATE dbo.HoaDon SET TTThanhtoan = ? WHERE ID_Hoadon = ?";
    String UPDATE_SQL_ThanhTien = "UPDATE dbo.HoaDon SET Thanhtien = ? WHERE ID_Hoadon = ?";
    String UPDATE_SQL_Ly_DO = "UPDATE dbo.HoaDon SET Lydohuy = ? WHERE ID_Hoadon = ?";
    String UPDATE_SQL_DEM_SP_HUY = "UPDATE dbo.HoaDon SET Soluongsanphamhuy = ? WHERE ID_Hoadon = ?";
    String DELETE_SQL = "{CALL chuyendon(?)}";
    String SELECT_ALL_SQL = "SELECT * FROM dbo.HoaDon";
    String SELECT_ALL_SQL_HD_CTT_BY_ID_BAN = "SELECT * FROM dbo.HoaDon JOIN dbo.BanChiTiet ON BanChiTiet.ID_Hoadon = HoaDon.ID_Hoadon WHERE TTThanhtoan = 0 AND dbo.HoaDon.Trangthai = 1 AND  ID_Ban = ? ";
    String SELECT_ALL_SQL_HD_CTT = "SELECT * FROM dbo.HoaDon where Trangthai = 1 AND TTThanhtoan = 0";
    String SELECT_BY_ID_SQL = "SELECT * FROM dbo.HoaDon WHERE ID_Hoadon = ?";
    String SELECT_ALL_SQL_trangthai1 = "SELECT * FROM dbo.HoaDon where Trangthai = 1";
    String SELECT_ALL_SQL_trangthai1_chuathanhtoan = "SELECT * FROM dbo.HoaDon where Trangthai = 1 AND TTThanhtoan = 0";
    String SELECT_ALL_SQL_trangthai1_dathanhtoan = "SELECT * FROM dbo.HoaDon where Trangthai = 1 AND TTThanhtoan = 1";
    String SELECT_ALL_SQL_trangthai0 = "SELECT * FROM dbo.HoaDon where Trangthai = 0";
    String SELECT_ALL_SQL_trangthai0_chuathanhtoan = "SELECT * FROM dbo.HoaDon where Trangthai = 0 AND TTThanhtoan = 0";
    String SELECT_ALL_SQL_trangthai0_dathanhtoan = "SELECT * FROM dbo.HoaDon where Trangthai = 0 AND TTThanhtoan = 1";
    String select_all_sql_find_HOATDOng = "select *from HoaDon where Ngaytao between ? and ? and Trangthai = 1";
    String select_all_sql_find_HOATDOng_chuathanhtoan = "select *from HoaDon where Ngaytao between ? and ? and Trangthai = 1 and TTThanhtoan = 0";
    String select_all_sql_find_HOATDOng_dathanhtoan = "select *from HoaDon where Ngaytao between ? and ? and Trangthai = 1 and TTThanhtoan = 1";
    String select_all_sql_find_KoHoatDong = "select *from HoaDon where Ngaytao between ? and ? and Trangthai = 0";
    String select_all_sql_find_KoHoatDong_dathanhtoan = "select *from HoaDon where Ngaytao between ? and ? and Trangthai = 0 AND TTThanhtoan = 1";
    String select_all_sql_find_KoHoatDong_chuathanhtoan = "select *from HoaDon where Ngaytao between ? and ? and Trangthai = 0 AND TTThanhtoan = 0";
    String select_all_sql_find_HOATDOng_keyword_IDHoaDon = "select *from HoaDon where Ngaytao between ? and ? and Trangthai = 1";
    String select_all_sql_find_KoHoatDong_keyword_IDHoaDon = "select *from HoaDon where Ngaytao between ? and ? and Trangthai = 0";
    String select_all_sql_find_KoHoatDong_keyword_IDMaNV = "SELECT * FROM HoaDon WHERE ID_Nhanvien LIKE ? and Trangthai = 0 ";
    String select_all_sql_find_HoatDong_keyword_IDMaNV = "SELECT * FROM HoaDon WHERE ID_Nhanvien LIKE ? and Trangthai = 1 ";
    String select_all_sql_find_KoHoatDong_1ngay = "select *from HoaDon where Ngaytao =?  and Trangthai = 1 ";
    String select_all_sql_find_KoHoatDong_1ngay_dathanhtoan = "select *from HoaDon where Ngaytao =?  and Trangthai = 1 AND TTThanhtoan = 1";
    String select_all_sql_find_KoHoatDong_1ngay_chuathanhtoan = "select *from HoaDon where Ngaytao =?  and Trangthai = 1 AND TTThanhtoan = 0";
    String select_all_sql_find_HoatDong_1ngay = "select *from HoaDon where Ngaytao =?  and Trangthai = 0";
    String select_all_sql_find_HoatDong_1ngay_dathanhtoan = "select *from HoaDon where Ngaytao =?  and Trangthai = 0 AND TTThanhtoan = 1";
    String select_all_sql_find_HoatDong_1ngay_chuathanhtoan = "select *from HoaDon where Ngaytao =?  and Trangthai = 0 AND TTThanhtoan = 0";

    @Override
    public void insert(HoaDon Entity) {
        Helper.JDBCHelper.update(INSERT_SQL, Entity.getIdNhanVien(), Entity.getNgayTao(), Entity.isTrangThai(),
                Entity.isTrangThaiTT(), Entity.getThanhTien(), Entity.getLyDoHuy(), Entity.getSlSanPhamHuy(), Entity.getGhiChu(),
                Entity.getSDT(), Entity.getTen(), Entity.getDiaChi(), Entity.getTienShip());
    }

    @Override
    public void updateThanhToan(HoaDon Entity) {
        Helper.JDBCHelper.update(UPDATE_SQL_TrangThaiTT, Entity.isTrangThaiTT(), Entity.getIdHoaDon());
    }

    @Override
    public void delete(HoaDon Entity) {
        Helper.JDBCHelper.update(DELETE_SQL, Entity.getIdHoaDon());
    }

    public void updatekh(HoaDon Entity) {
        Helper.JDBCHelper.update(UPDATE_SQL_khachhang, Entity.getSDT(), Entity.getTen(), Entity.getTienShip(), Entity.getDiaChi(), Entity.getIdHoaDon());
    }

    @Override
    public HoaDon selectById(int id) {
        List<HoaDon> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<HoaDon> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                HoaDon Entity = new HoaDon();
                Entity.setIdHoaDon(rs.getInt("ID_Hoadon"));
                Entity.setIdNhanVien(rs.getString("ID_Nhanvien"));
                Entity.setNgayTao(rs.getDate("Ngaytao"));
                Entity.setTrangThai(rs.getBoolean("Trangthai"));
                Entity.setTrangThaiTT(rs.getBoolean("TTthanhtoan"));
                Entity.setThanhTien(rs.getInt("Thanhtien"));
                Entity.setLyDoHuy(rs.getString("Lydohuy"));
                Entity.setSlSanPhamHuy(rs.getInt("Soluongsanphamhuy"));
                Entity.setGhiChu(rs.getString("ghichu"));
                Entity.setSDT(rs.getString("SDT"));
                Entity.setTen(rs.getString("Ten"));
                Entity.setDiaChi(rs.getString("diaChi"));
                Entity.setTienShip(rs.getInt("tenShip"));
                list.add(Entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<HoaDon> selectCTT(int key) {
        return selectBySql(SELECT_ALL_SQL_HD_CTT_BY_ID_BAN, key);
    }

    public List<HoaDon> selectCTTALL() {
        return selectBySql(SELECT_ALL_SQL_HD_CTT);
    }

    @Override
    public void updateTrangThai(HoaDon Entity) {
        Helper.JDBCHelper.update(UPDATE_SQL_TrangThai, Entity.isTrangThai(), Entity.getIdHoaDon());
    }

    @Override
    public void updateThanhtien(HoaDon Entity) {
        Helper.JDBCHelper.update(UPDATE_SQL_ThanhTien, Entity.getThanhTien(), Entity.getIdHoaDon());
    }

    @Override
    public void updateLydohuy(HoaDon Entity) {
        Helper.JDBCHelper.update(UPDATE_SQL_Ly_DO, Entity.getLyDoHuy(), Entity.getIdHoaDon());
    }

    @Override
    public void updateSLSPHUY(HoaDon Entity) {
        Helper.JDBCHelper.update(UPDATE_SQL_DEM_SP_HUY, Entity.getSlSanPhamHuy(), Entity.getIdHoaDon());
    }

    @Override
    public List<HoaDon> selectAll_trangthai1() {
        return selectBySql(SELECT_ALL_SQL_trangthai1);
    }

    public List<HoaDon> selectAll_trangthai1_chuathanhtoan() {
        return selectBySql(SELECT_ALL_SQL_trangthai1_chuathanhtoan);
    }

    public List<HoaDon> selectAll_trangthai1_dathanhtoan() {
        return selectBySql(SELECT_ALL_SQL_trangthai1_dathanhtoan);
    }

    @Override
    public List<HoaDon> selectAll_trangthai0() {
        return selectBySql(SELECT_ALL_SQL_trangthai0);
    }

    public List<HoaDon> selectAll_trangthai0_chuathanhtoan() {
        return selectBySql(SELECT_ALL_SQL_trangthai0_chuathanhtoan);
    }

    public List<HoaDon> selectAll_trangthai0_dathanhtoan() {
        return selectBySql(SELECT_ALL_SQL_trangthai0_dathanhtoan);
    }

    @Override
    public List<HoaDon> selectAll_SQL_Find_HoatDong(Date a, Date b) {
        List<HoaDon> list = this.selectBySql(select_all_sql_find_HOATDOng, a, b);
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

    public List<HoaDon> selectAll_SQL_Find_HoatDong_chuathanhtoan(Date a, Date b) {
        List<HoaDon> list = this.selectBySql(select_all_sql_find_HOATDOng_chuathanhtoan, a, b);
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

    public List<HoaDon> selectAll_SQL_Find_HoatDong_dathanhtoan(Date a, Date b) {
        List<HoaDon> list = this.selectBySql(select_all_sql_find_HOATDOng_dathanhtoan, a, b);
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

    @Override
    public List<HoaDon> selectAll_SQL_Find_HoatDong_keyword(String keyword) {
        String sql = "SELECT * FROM HoaDon WHERE ID_Hoadon LIKE ? and Trangthai = 1 ";
        return selectBySql(sql, "%" + keyword + "%");
    }

    @Override
    public List<HoaDon> select_all_sql_find_HoatDong_keyword_IDMaNV(String keyword) {
        return selectBySql(select_all_sql_find_HoatDong_keyword_IDMaNV, "%" + keyword + "%");
    }

    @Override
    public List<HoaDon> select_all_sql_find_KoHoatDong_keyword_IDMaNV(String keyword) {
        return selectBySql(select_all_sql_find_KoHoatDong_keyword_IDMaNV, "%" + keyword + "%");
    }

    @Override
    public List<HoaDon> selectAll_SQL_Find_koHoatDong_keyword(String keyword) {
        String sql = "SELECT * FROM HoaDon WHERE ID_Hoadon LIKE ? and Trangthai = 0 ";
        return selectBySql(sql, "%" + keyword + "%");
    }

    @Override
    public List<HoaDon> selectAll_SQL_Find_KoHoatDong(Date a, Date b) {
        List<HoaDon> list = this.selectBySql(select_all_sql_find_KoHoatDong, a, b);
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

    public List<HoaDon> selectAll_SQL_Find_KoHoatDong_dathanhtoan(Date a, Date b) {
        List<HoaDon> list = this.selectBySql(select_all_sql_find_KoHoatDong_dathanhtoan, a, b);
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

    public List<HoaDon> selectAll_SQL_Find_KoHoatDong_chuathanhtoan(Date a, Date b) {
        List<HoaDon> list = this.selectBySql(select_all_sql_find_KoHoatDong_chuathanhtoan, a, b);
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

    @Override
    public List<HoaDon> selectAll_SQL_Find_HoatDong_1ngay(Date a) {
        List<HoaDon> list = this.selectBySql(select_all_sql_find_HoatDong_1ngay, a);
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

    public List<HoaDon> selectAll_SQL_Find_HoatDong_1ngay_dathanhtoan(Date a) {
        List<HoaDon> list = this.selectBySql(select_all_sql_find_HoatDong_1ngay_dathanhtoan, a);
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

    public List<HoaDon> selectAll_SQL_Find_HoatDong_1ngay_chuathanhtoan(Date a) {
        List<HoaDon> list = this.selectBySql(select_all_sql_find_HoatDong_1ngay_chuathanhtoan, a);
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

    @Override
    public List<HoaDon> selectAll_SQL_Find_KoHoatDong_1ngay(Date a) {
        List<HoaDon> list = this.selectBySql(select_all_sql_find_KoHoatDong_1ngay, a);
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

    public List<HoaDon> selectAll_SQL_Find_KoHoatDong_1ngay_dathanhtoan(Date a) {
        List<HoaDon> list = this.selectBySql(select_all_sql_find_KoHoatDong_1ngay_dathanhtoan, a);
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

    public List<HoaDon> selectAll_SQL_Find_KoHoatDong_1ngay_chuathanhtoan(Date a) {
        List<HoaDon> list = this.selectBySql(select_all_sql_find_KoHoatDong_1ngay_chuathanhtoan, a);
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

}