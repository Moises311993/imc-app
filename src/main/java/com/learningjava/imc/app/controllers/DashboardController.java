/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learningjava.imc.app.controllers;

import com.learningjava.imc.app.models.IMC;
import com.learningjava.imc.app.services.IMCServiceDefault;
import com.learningjava.imc.app.services.UserServiceDefault;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DashboardController {

    @Autowired
    private IMCServiceDefault imcService;

    @GetMapping("/dashboard")
    public String mostrarDashboard(HttpSession session, Model model) {
        if (session.getAttribute("username") == null) {
            return "redirect:/login";  
        }

        String username = (String) session.getAttribute("usuario");
        model.addAttribute("username", username);
        model.addAttribute("IMCHistory", imcService.findByUser(username));  // Método que obtiene el historial de IMC
        return "dashboard";
    }

    @PostMapping("/dashboard")
    public String calcularIMC(@RequestParam double weight, HttpSession session, Model model) {
        if (session.getAttribute("username") == null) {
            return "redirect:/login";  
        }
        IMC imc = imcService.calculateImc((String) session.getAttribute("usuario"), weight);

        model.addAttribute("imc", imc.getImcValue());

        return "dashboard";
    }
}