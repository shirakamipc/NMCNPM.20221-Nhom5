/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import SQL.KhaiBaoSQL;
import SQL.KhaiBaoSQLImpl;
import java.util.List;
import model.KhaiBao;

/**
 *
 * @author admin
 */
public class KhaiBaoServiceImpl implements KhaiBaoService{
    private KhaiBaoSQL khaiBaoSQL = null;

    public KhaiBaoServiceImpl() {
        khaiBaoSQL = new KhaiBaoSQLImpl();
    }
    

    @Override
    public List<KhaiBao> getList() {
        return khaiBaoSQL.getList();

    }

    @Override
    public int createOrUpdate(KhaiBao khaiBao) {
        return khaiBaoSQL.createOrUpdate(khaiBao);
    
    }
}
