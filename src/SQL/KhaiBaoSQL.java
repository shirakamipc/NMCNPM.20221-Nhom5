package SQL;

import java.util.List;

import model.KhaiBao;
import model.KiemTra;

/**
 *
 * @author admin
 */
public interface KhaiBaoSQL {
    public List<KhaiBao> getList();
    public int createOrUpdate(KhaiBao khaiBao);
}
