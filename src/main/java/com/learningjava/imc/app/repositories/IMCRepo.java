/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learningjava.imc.app.repositories;

import com.learningjava.imc.app.models.IMC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@org.springframework.stereotype.Repository
public class IMCRepo implements Repository<IMC, Integer>{

   private final Map<Integer, IMC> registros = new HashMap<>();

    public IMCRepo() {
    }

   
    @Override
    public List<IMC> findAll() {
        return new ArrayList<>(registros.values());
    }

    @Override
    public Optional<IMC> findById(Integer id) {
        return Optional.ofNullable(registros.get(id));
    }

    @Override
    public IMC save(IMC imc) {
        return registros.put(imc.getId(), imc);
    }

    @Override
    public IMC update(Integer id, IMC imc) {
        if (registros.containsKey(id)) {
            return registros.put(id, imc);
        }
        return null;
    }

    @Override
    public IMC delete(Integer id) {
        return registros.remove(id);
    }
    
}
