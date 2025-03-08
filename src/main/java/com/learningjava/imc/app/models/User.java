package com.learningjava.imc.app.models;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author caryuter
 */
@Getter
@Setter
@AllArgsConstructor
public class User {
    
    private static int idCounter = 1; // Simula generación de IDs
    private int id;
    private String fullName;
    private String username;
    private String password;
    private int age;
    private String gender;
    private double height;
    private List<IMC> imcRecords;
    
    {
        idCounter++;
    }
    
}
