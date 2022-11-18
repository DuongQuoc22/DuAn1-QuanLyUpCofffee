
package Dao;

import Model.GiamGiaChitiet;
import Model.LoaiSanPham;
import java.util.List;

/**
 *
 * @author top1z
 */
public interface InterfaceGiamGiaCT {
    abstract public void insert(GiamGiaChitiet sale);
    abstract public void update(int phantramGiam,String idsanpham);
    abstract public void delete(String id);
    abstract public List<GiamGiaChitiet> selectll();
    abstract public GiamGiaChitiet selectID(int id, String idsanpham);
    abstract public List<GiamGiaChitiet> selectBysql(String sql, Object...agrs);
}
