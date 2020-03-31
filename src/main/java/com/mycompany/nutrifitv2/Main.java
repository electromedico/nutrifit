/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nutrifitv2;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.mycompany.nutrifitv2.controller.database.DatabaseConnector;

/**
 *
 * @author elect
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            new DatabaseConnector().connect();
                           
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    
}
