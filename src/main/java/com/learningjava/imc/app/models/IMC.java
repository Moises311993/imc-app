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
    private String username;
    private double weight;
    private double imcValue;
    private LocalDate date;
    
    {
        idCounter++;
    }
    
    
    public IMC(String username, double weight, double imcValue, LocalDate date) {
        this.id = idCounter;
        this.username = username;
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
        if (this.username != other.username) {
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
        return "IMC{" + "id=" + id + ", userId=" + username + ", weight=" + weight + ", imcValue=" + imcValue + ", date=" + date + '}';
    }
    

    

    public static int getIdCounter() {
        return idCounter;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
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

    public static void setIdCounter(int idCounter) {
        IMC.idCounter = idCounter;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setImcValue(double imcValue) {
        this.imcValue = imcValue;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    
      
}
