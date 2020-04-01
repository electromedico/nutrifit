/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nutrifitv2.controller.database.dao;
import com.mycompany.nutrifitv2.controller.database.DatabaseConnector;
import com.mycompany.nutrifitv2.model.DatosAntro;
import java.sql.Connection;

/**
 *
 * @author toro_
 */
public class DatosAntroDAO implements DataBaseAcessor<DatosAntro>{
    
    private Connection connection;

    public DatosAntroDAO(Connection connection) {
        this.connection = connection;
    } 

    @Override
    public int create(DatosAntro t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DatosAntro read(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DatosAntro update(DatosAntro t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
