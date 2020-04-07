/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nutrifitv2.controller.database.dao;


import com.mycompany.nutrifitv2.controller.database.DatabaseConnector;
import com.mycompany.nutrifitv2.model.Clinico;
import java.sql.Connection;

/**
 *
 * @author toro_
 */
public class ClinicoDAO implements DataBaseAcessor<Clinico>{

    private Connection connection;

    public ClinicoDAO(Connection connection) {
        this.connection = connection;
    } 
    @Override
    public int create(Clinico t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Clinico read(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Clinico update(Clinico t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
