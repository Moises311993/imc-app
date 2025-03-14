/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learningjava.imc.app.services;

import com.learningjava.imc.app.models.IMC;
import java.util.List;

public interface IMCService extends DataService<IMC, Integer>{
    List<IMC> findByUser(String username);
    IMC calculateImc(String username, double weight);
}
