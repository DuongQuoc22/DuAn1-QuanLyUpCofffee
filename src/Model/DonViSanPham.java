
package Model;

public class DonViSanPham {
    private String ID_DonviSP;
    private String TenDonvi;
    private int Kichthuoc;

    public DonViSanPham() {
    }

    public DonViSanPham(String ID_DonviSP, String TenDonvi, int Kichthuoc) {
        this.ID_DonviSP = ID_DonviSP;
        this.TenDonvi = TenDonvi;
        this.Kichthuoc = Kichthuoc;
    }

    public String getID_DonviSP() {
        return ID_DonviSP;
    }

    public void setID_DonviSP(String ID_DonviSP) {
        this.ID_DonviSP = ID_DonviSP;
    }

    public String getTenDonvi() {
        return TenDonvi;
    }

    public void setTenDonvi(String TenDonvi) {
        this.TenDonvi = TenDonvi;
    }

    public int getKichthuoc() {
        return Kichthuoc;
    }

    public void setKichthuoc(int Kichthuoc) {
        this.Kichthuoc = Kichthuoc;
    }
    @Override
    public String toString(){
        return TenDonvi;
    }
}
