/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.KhaiBao;

/**
 *
 * @author admin
 */
public interface KhaiBaoService {
    public List<KhaiBao> getList();
        public int createOrUpdate(KhaiBao khaiBao);
    
}
