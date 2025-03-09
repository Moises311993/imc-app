package com.learningjava.imc.app.controllers;

import com.learningjava.imc.app.services.NameAuthService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

@Controller
public class AuthController {
   
    @Autowired
    private NameAuthService authService;

    @GetMapping(value = {"/login"})
    public String showLoginForm() {
        return "login"; 
    }
    
    @GetMapping(value = {"", "/"})
    public String showHomePage(){
        return "index";
    }
    

    public AuthController() {
    }

    @PostMapping(value = {"/login"})
    public String login(@RequestParam String username, @RequestParam String password, HttpSession session,Model model) {
        boolean autenticado = authService.login(username, password);
      
        if (autenticado) {
            model.addAttribute("isValid", true);
            model.addAttribute("username", username);
            session.setAttribute("username", username);
            return "redirect:/dashboard"; 
        } else {
            model.addAttribute("isValid", false);
            model.addAttribute("error", "Credenciales inválidas");
            return "login"; 
        }
    }
    
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/login";
    }
    
    
    
}
