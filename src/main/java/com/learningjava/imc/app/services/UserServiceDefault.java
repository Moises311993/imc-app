/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learningjava.imc.app.services;
import com.learningjava.imc.app.models.IMC;
import com.learningjava.imc.app.models.User;
import com.learningjava.imc.app.repositories.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceDefault implements UserService{

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private IMCServiceDefault imcService;

    public List<User> getAll() {
        return userRepo.findAll();
    }

    public User getById(String id) {
        return userRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }

    public User save(User usuario) {
        return userRepo.save(usuario);
    }

    public User update(String id, User newUser) {
        return userRepo.update(id, newUser);
    }

    public User delete(String id) {
        return userRepo.delete(id);
    }
}
