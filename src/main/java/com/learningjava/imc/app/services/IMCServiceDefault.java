/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learningjava.imc.app.services;

import com.learningjava.imc.app.models.IMC;
import com.learningjava.imc.app.models.User;
import com.learningjava.imc.app.repositories.IMCRepo;
import com.learningjava.imc.app.repositories.UserRepo;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class IMCServiceDefault implements IMCService{
    
    @Autowired
    private IMCRepo imcRepo;
    @Autowired
    private UserRepo userRepo;
    
    @Override
    public IMC calculateImc(String username, double weight){
         User user = userRepo.findById(username).orElseThrow(
                 () -> new RuntimeException(" El usuario no existe "));
        double height = user.getHeight();
        IMC imc = new IMC(username, weight, weight / (height * height), LocalDate.now());
        return  save(imc);
    }

    @Override
    public List<IMC> getAll() {
       return imcRepo.findAll();
    }
    

    @Override
    public IMC getById(Integer id) {
        return imcRepo.findById(id).orElseThrow(
                () -> new RuntimeException("registro de IMC no encontrado"));
    }

    @Override
    public IMC save(IMC entity) {
        return imcRepo.save(entity);
    }

    @Override
    public List<IMC> findByUser(String username) {
        User user = userRepo.findById(username)
                .orElseThrow(() -> new RuntimeException("nombre de usuario invalido"));
        return imcRepo.findAll().stream()
                .filter(imc -> 
                    imc.getUsername().equals(user.getUsername()))
                .collect(Collectors.toList());
    }

    @Override
    public IMC update(Integer id, IMC mewEntity) {
       return imcRepo.update(id, mewEntity);
    }

    @Override
    public IMC delete(Integer id) {
        return imcRepo.delete(id);
    }
    
}
