/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.learningjava.imc.app.services;

import java.util.List;

interface DataService<T, ID> {
    List<T> getAll();
    T getById(ID id); 
    T save(T entity);
    T update(ID id, T mewEntity);
    T delete(ID id);
}
