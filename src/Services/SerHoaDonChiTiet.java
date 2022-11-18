/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;
import Model.HoaDonChiTiet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import View.HoaDonChiTietJDialog;
import Dao.HoaDonChiTietDAO;
import Model.HoaDon;
/**
 *
 * @author ADMIN ASUS
 */
public class SerHoaDonChiTiet {
     HoaDonChiTietDAO dao=new HoaDonChiTietDAO();
      public void filltotablehoadonchitiet(int a){
       List<HoaDonChiTiet> list = new ArrayList<>();
        DefaultTableModel model=(DefaultTableModel) HoaDonChiTietJDialog.tblHoaDonChiTiet.getModel();
        model.setRowCount(0);
        try {
          list= dao.selectById1(a);
           for (HoaDonChiTiet hd : list) {
                model.addRow(new Object[]{
                    hd.getID_Hoadon(),
                    hd.getID_SanPHam(),
                    hd.getSoluong(),
                    hd.getGia(),
                    hd.getTongGia(),
                    hd.isTrangThai() ?"" : "Hủy",
                        hd.getLyDoHuy()
                    
                });
                 
            }
          
       } catch (Exception e) {
       }
    }
    
}
