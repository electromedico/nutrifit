/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nutrifitv2.controller.database.dao;

import com.mycompany.nutrifitv2.controller.database.DatabaseConnector;
import com.mycompany.nutrifitv2.model.Paciente;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public int create(Paciente t){
    String query="";  
    
        try {
            connection.createStatement();
            query="INSERT INTO paciente(idpaciente, " + "nombre, " +
                    "apeido, " + "direccion, " + "estadocivil," + 
                    "nocelular, " + "fechana, " + "lugarna, " +
                    "ocupacion,"+"antecedentehf,"+"antecendetepp,"+
                    "alegias,"+"adiccion,"+"enfermedada,"+"medicamente,"+
                    "motivo,"+"horadespertar,"+"horadormir,"+"horatrabajo"+
                    "actividadfisica,"+"comidasdias,"+"horaprimercomida,"+
                    "quienhace,"+ "dondecome,"+"gestacion,"+"fecha"+") "
                    + "VALUES('"+ t.getId() + "', " + t.getNombre() +  "', "+
                    t.getApeido() + "', " +t.getDireccion() + "', " + t.getEstadoCivil() + "', "+
                    t.getNoCelular() + "', "+ t.getFechaNa()+ "', "+ t.getLugarNa()+ "', "+
                    t.getOcupacion()+  "', "+ t.getAntecedentesHF()+ "', "+t.getAntecedentesPP()+ "', "+
                    t.getAlergias()+  "', "+ t.getAdiccion() + "', " + t.getEnfermedadA()+ "', " + t.getMedicamento()+ "', " +
                    t.getMotivo() + "', " + t.getHoraDespertar() + "', " + t.getHoraDormir() + "', " + t.getHoraTrabajo() + "', " +
                    t.getActividadfisica() + "', " +t.getComidasDia() + "', " + t.getHoraprimercomida() + "', " +
                    t.getQuienhace() + "', " + t.getDondecome() + "', " + t.getGestacion() + "', " + t.getFecha()+")";
                    
   
                    
                    
                    
        } catch (SQLException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    
   
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
