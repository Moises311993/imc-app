/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learningjava.imc.app.models;

import java.time.LocalDate;
import java.util.Objects;

public class IMC {
    
    private static int idCounter = 0;
    private int id;
    private int userId;
    private double weight;
    private double imcValue;
    private LocalDate date;
    
    {
        idCounter++;
    }
    
    
    public IMC(int userId, double weight, double imcValue, LocalDate date) {
        this.id = idCounter;
        this.userId = userId;
        this.weight = weight;
        this.imcValue = imcValue;
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final IMC other = (IMC) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.userId != other.userId) {
            return false;
        }
        if (Double.doubleToLongBits(this.weight) != Double.doubleToLongBits(other.weight)) {
            return false;
        }
        if (Double.doubleToLongBits(this.imcValue) != Double.doubleToLongBits(other.imcValue)) {
            return false;
        }
        return Objects.equals(this.date, other.date);
    }

    @Override
    public String toString() {
        return "IMC{" + "id=" + id + ", userId=" + userId + ", weight=" + weight + ", imcValue=" + imcValue + ", date=" + date + '}';
    }
    

    

    public static int getIdCounter() {
        return idCounter;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public double getWeight() {
        return weight;
    }

    public double getImcValue() {
        return imcValue;
    }

    public LocalDate getDate() {
        return date;
    }
    
    public double calculateImc(double weight, double height){
        return weight / (height * height);
    }
    
    
    
    
    
}
