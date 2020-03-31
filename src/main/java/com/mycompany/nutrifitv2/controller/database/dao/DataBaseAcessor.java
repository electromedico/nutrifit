/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nutrifitv2.controller.database.dao;

/**
 *
 * @author elect
 */
public interface DataBaseAcessor<T> {
    
    int Create();
    T Read();
    T Update();
    boolean Delete();
    
}
