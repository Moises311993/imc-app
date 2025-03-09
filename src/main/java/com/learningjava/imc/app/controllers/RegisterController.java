/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learningjava.imc.app.controllers;

import com.learningjava.imc.app.models.User;
import com.learningjava.imc.app.services.UserServiceDefault;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegisterController {

    @Autowired
    private UserServiceDefault userService;

    public RegisterController() {
    }

    
    @GetMapping("/register")
    public String showRegisterForm() {
        return "register";  // Vista del formulario de registro
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String fullName, 
                                    @RequestParam String username, 
                                    @RequestParam String password, 
                                    @RequestParam String passwordConfirm, 
                                    @RequestParam int age, 
                                    @RequestParam String gender, 
                                    @RequestParam double height, 
                                    HttpSession session,
                                    Model model) {

        if (!password.equals(passwordConfirm)) {
            model.addAttribute("error", "Las contraseñas no coinciden");
            return "register"; 
        }

        if (age < 15) {
            model.addAttribute("error", "La edad debe ser mayor o igual a 15");
            return "register"; 
        }

        if (height < 1.0 || height > 2.5) {
            model.addAttribute("error", "La estatura debe estar entre 1m y 2.5m");
            return "register"; 
        }

        userService.save(new User(fullName, username, password, age, gender, height));
        model.addAttribute("username", username);
        session.setAttribute("username", username);
        return "redirect:/dashboard"; 
    }
}
