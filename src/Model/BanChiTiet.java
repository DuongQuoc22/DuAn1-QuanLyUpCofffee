/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class BanChiTiet {
    private int idHoaDon;
        private int idBan;
        private Date thoiDiemCoNguoi;
        private boolean banChinh;

    public BanChiTiet() {
    }

    public BanChiTiet(int idHoaDon, int idBan, Date thoiDiemCoNguoi, boolean banChinh) {
        this.idHoaDon = idHoaDon;
        this.idBan = idBan;
        this.thoiDiemCoNguoi = thoiDiemCoNguoi;
        this.banChinh = banChinh;
    }

    public int getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(int idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public int getIdBan() {
        return idBan;
    }

    public void setIdBan(int idBan) {
        this.idBan = idBan;
    }

    public Date getThoiDiemCoNguoi() {
        return thoiDiemCoNguoi;
    }

    public void setThoiDiemCoNguoi(Date thoiDiemCoNguoi) {
        this.thoiDiemCoNguoi = thoiDiemCoNguoi;
    }

    public boolean isBanChinh() {
        return banChinh;
    }

    public void setBanChinh(boolean banChinh) {
        this.banChinh = banChinh;
    }
}
