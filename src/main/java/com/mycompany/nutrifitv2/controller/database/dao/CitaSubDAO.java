/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nutrifitv2.controller.database.dao;
import java.sql.Connection;
import com.mycompany.nutrifitv2.controller.database.DatabaseConnector;
import com.mycompany.nutrifitv2.model.CitaSub;

/**
 *
 * @author toro_
 */
public class CitaSubDAO implements DataBaseAcessor<CitaSub>{

    private Connection connection;

    public CitaSubDAO(Connection connection) {
        this.connection = connection;
    } 
    @Override
    public int create(CitaSub t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CitaSub read(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CitaSub update(CitaSub t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
