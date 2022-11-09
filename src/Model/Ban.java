/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Ban {
    private int id;
    private boolean trangThai;
    private boolean hoatDong;
    private int soLuongCho;
    
    public Ban(){
        
    }

    public Ban(int id, boolean trangThai, boolean hoatDong, int soLuongCho) {
        this.id = id;
        this.trangThai = trangThai;
        this.hoatDong = hoatDong;
        this.soLuongCho = soLuongCho;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public boolean isHoatDong() {
        return hoatDong;
    }

    public void setHoatDong(boolean hoatDong) {
        this.hoatDong = hoatDong;
    }

    public int getSoLuongCho() {
        return soLuongCho;
    }

    public void setSoLuongCho(int soLuongCho) {
        this.soLuongCho = soLuongCho;
    }
    
    @Override
    public String toString(){
        return "Bàn "+id+" (" + soLuongCho + ")";
    }
}
