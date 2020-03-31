/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nutrifitv2.controller;

import com.mycompany.nutrifitv2.controller.database.DatabaseConnector;
import com.mycompany.nutrifitv2.controller.database.dao.PacienteDAO;
import com.mycompany.nutrifitv2.model.Paciente;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elect
 */
public class InicioController {
    
    public void getPaciente(){
        try {
            PacienteDAO dao = new PacienteDAO(DatabaseConnector.getConnection());
            Paciente paciente = dao.read(1);
        } catch (SQLException ex) {
            Logger.getLogger(InicioController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
