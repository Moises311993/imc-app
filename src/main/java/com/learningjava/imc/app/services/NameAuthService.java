/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learningjava.imc.app.services;

import com.learningjava.imc.app.models.User;
import com.learningjava.imc.app.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NameAuthService implements SimpleAuthService{

    @Autowired
    private UserRepo userRepo;

    public boolean login(String username, String password) {
        User usuario = userRepo.findById(username)
                .orElse(null);
        
        return usuario != null && usuario.getPassword().equals(password);
    }
}
