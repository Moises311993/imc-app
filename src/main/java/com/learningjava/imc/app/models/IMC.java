/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learningjava.imc.app.models;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author caryuter
 */
@Getter
@Setter
@AllArgsConstructor
public class IMC {
    private static int idCounter = 1; // Simula generación de IDs
    private int id;
    private int userId;
    private double weight;
    private double imcValue;
    private LocalDate date;
    
}
