package com.learningjava.imc.app.models;

import java.util.List;
import java.util.Objects;
public class User {
    
    private static int idCounter = 0; 
    private int id;
    private String fullName;
    private String username;
    private String password;
    private int age;
    private String gender;
    private double height;
    
    {
        idCounter++;
    }
    
     public User(String fullName, String username, String password, int age, String gender, double height) {
        this.id = idCounter;
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.age = age;
        this.gender = gender;
        this.height = height;
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
        final User other = (User) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if (Double.doubleToLongBits(this.height) != Double.doubleToLongBits(other.height)) {
            return false;
        }
        if (!Objects.equals(this.fullName, other.fullName)) {
            return false;
        }
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return Objects.equals(this.gender, other.gender);
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", fullName=" + fullName + ", username=" + username + ", password=" + password + ", age=" + age + ", gender=" + gender + ", height=" + height + '}';
    }

     

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        User.idCounter = idCounter;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
