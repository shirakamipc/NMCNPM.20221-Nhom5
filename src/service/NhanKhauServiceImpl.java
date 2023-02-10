
package service;

import SQL.NhanKhauSQL;
import SQL.NhanKhauSQLImpl;
import java.util.List;
import model.NhanKhau;

/**
 *
 * @author admin
 */
public class NhanKhauServiceImpl implements NhanKhauService{
    private NhanKhauSQL nhanKhauSQL = null;

    public NhanKhauServiceImpl() {
        nhanKhauSQL = new NhanKhauSQLImpl();
    }
    

    @Override
    public List<NhanKhau> getList() {
        return nhanKhauSQL.getList();

    }

    @Override
    public int createOrUpdate(NhanKhau nhanKhau) {
        return nhanKhauSQL.createOrUpdate(nhanKhau);
    
    }
    
    
}
