/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import model.TaiKhoan;

/**
 *
 * @author admin
 */
public interface TaiKhoanService {
    public TaiKhoan login(String tdn, String mk);
}
