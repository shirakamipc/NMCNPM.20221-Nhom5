/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.HoKhau;

/**
 *
 * @author admin
 */
public interface HoKhauService {
    public List<HoKhau> getList();
        public int createOrUpdate(HoKhau hoKhau);
    
}
