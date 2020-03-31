/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nutrifitv2.controller.database.dao;

import java.sql.Connection;

/**
 *
 * @author elect
 */
public interface DataBaseAcessor<T> {
    
    int create(T t);
    T read(int key);
    T update(T t);
    boolean delete(int key);
    
}
