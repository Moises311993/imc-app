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
import java.util.UUID;


public class IMCRepo implements Repository<IMC, Integer>{

   private final Map<Integer, IMC> registros = new HashMap<>();

    @Override
    public List<IMC> findAll() {
        return new ArrayList<>(registros.values());
    }

    @Override
    public Optional<IMC> findById(Integer id) {
        return Optional.ofNullable(registros.get(id));
    }

    @Override
    public boolean save(IMC imc) {
        return registros.put(imc.getId(), imc).equals(imc);
    }

    @Override
    public boolean update(Integer id, IMC imc) {
        if (registros.containsKey(id)) {
            IMC prev = registros.put(id, imc);
            return prev.equals(imc);
        }
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return registros.remove(id) != null;
    }
    
}
