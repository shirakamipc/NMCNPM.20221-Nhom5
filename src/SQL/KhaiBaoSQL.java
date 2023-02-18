package SQL;

import java.util.List;

import model.KhaiBao;

/**
 *
 * @author admin
 */
public interface KhaiBaoSQL {
    public List<KhaiBao> getList();
    public int createOrUpdate(KhaiBao khaiBao);

    int delete(int id);
}
