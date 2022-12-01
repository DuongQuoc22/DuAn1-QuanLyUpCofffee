
package Dao;
import Model.*;
import java.util.List;

public interface InterfaceDonViSanPham {
    abstract public void insert(DonViSanPham dv);
    abstract public void update(DonViSanPham dv);
    abstract public void delete(String id);
    abstract public List<DonViSanPham> selectAll();
    abstract public DonViSanPham selectID(String id);
    abstract public List<DonViSanPham> selectBySQL(String sql, Object...agrs);
}
