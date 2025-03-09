/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learningjava.imc.app.repositories;

import com.learningjava.imc.app.models.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


public class UserRepo implements Repository<User, Integer>{
    private final Map<Integer, User> usuarios = new HashMap<>();

    @Override
    public List<User> findAll() {
        return new ArrayList<>(usuarios.values());
    }

    @Override
    public Optional<User> findById(Integer id) {
        return Optional.ofNullable(usuarios.get(id));
    }

    @Override
    public boolean save(User usuario) {
        return usuarios.put(usuario.getId(), usuario) == null;
    }

    @Override
    public boolean update(Integer id, User usuario) {
        if (usuarios.containsKey(id)) {
            User prev = usuarios.put(id, usuario);
            return prev.equals(usuario);
        }
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        if(!usuarios.containsKey(id)) return false;
        usuarios.remove(id);
        return true;
    }
    
}
