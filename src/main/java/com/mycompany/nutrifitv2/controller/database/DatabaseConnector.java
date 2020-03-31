/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nutrifitv2.controller.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author elect
 */
public class DatabaseConnector {

    private Connection connection;

    public DatabaseConnector() {
         
    }
    
   public void getConnection() throws SQLException {
       try{
           connection = DriverManager.getConnection("jdbc:mysql://localhost/test?user=root&password=admin");
       }catch(SQLException ex){
        // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            
            throw ex;
            
       }
       
       
   }
    
    
}
