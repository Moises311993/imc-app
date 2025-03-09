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


@org.springframework.stereotype.Repository
public class UserRepo implements Repository<User, String>{
    private final Map<String, User> usuarios = new HashMap<>();

    public UserRepo() {
    }

    
    
    @Override
    public List<User> findAll() {
        return new ArrayList<>(usuarios.values());
    }

    @Override
    public Optional<User> findById(String id) {
        return Optional.ofNullable(usuarios.get(id));
    }

    @Override
    public User save(User usuario) {
        return usuarios.put(usuario.getUsername(), usuario);
    }

    @Override
    public User update(String id, User usuario) {
        if (usuarios.containsKey(id)) {
            return usuarios.put(id, usuario);
        }
        return null;
    }

    @Override
    public User delete(String id) {
        return usuarios.remove(id);
    }
    
}
