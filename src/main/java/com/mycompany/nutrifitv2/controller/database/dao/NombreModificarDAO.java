/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nutrifitv2.controller.database.dao;

import com.mycompany.nutrifitv2.model.NombreModificar;
import java.sql.Connection;
import com.mycompany.nutrifitv2.controller.database.DatabaseConnector;

/**
 *
 * @author toro_
 */
public class NombreModificarDAO implements DataBaseAcessor<NombreModificar>{
private Connection connection;

    public NombreModificarDAO(Connection connection) {
        this.connection = connection;
    } 
    @Override
    public int create(NombreModificar t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NombreModificar read(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NombreModificar update(NombreModificar t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
