/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nutrifitv2.controller.database.dao;

import com.mycompany.nutrifitv2.controller.database.DatabaseConnector;
import com.mycompany.nutrifitv2.model.Paciente;
import java.sql.Connection;

/**
 *
 * @author elect
 */
public class PacienteDAO implements DataBaseAcessor<Paciente>{
    
    private Connection connection;

    public PacienteDAO(Connection connection) {
        this.connection = connection;
    } 
    
    @Override
    public int create(Paciente t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Paciente read(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Paciente update(Paciente t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
