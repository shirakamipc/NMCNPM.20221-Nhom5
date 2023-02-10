/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import SQL.CachLySQL;
import SQL.CachLySQLImpl;
import java.util.List;
import model.CachLy;

/**
 *
 * @author admin
 */
public class CachLyServiceImpl implements CachLyService{
    private CachLySQL cachLySQL = null;

    public CachLyServiceImpl() {
        cachLySQL = new CachLySQLImpl();
    }
    

    @Override
    public List<CachLy> getList() {
        return cachLySQL.getList();

    }

    @Override
    public int createOrUpdate(CachLy cachLy) {
        return cachLySQL.createOrUpdate(cachLy);
    
    }
}
