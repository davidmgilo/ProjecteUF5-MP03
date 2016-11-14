/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuf5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author alumne
 */
public class Alumne {
    private String nom;
    private String cognom1;
    private String cognom2;
    private Date data;
    private String email;
    private List<String> moduls = new ArrayList<>();

    public Alumne() {
    }

    public Alumne(String nom, String cognom1, String cognom2, Date data, String email, List<String> moduls) {
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.data = data;
        this.email = email;
        this.moduls = moduls;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom1() {
        return cognom1;
    }

    public void setCognom1(String cognom1) {
        this.cognom1 = cognom1;
    }

    public String getCognom2() {
        return cognom2;
    }

    public void setCognom2(String cognom2) {
        this.cognom2 = cognom2;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getModuls() {
        return moduls;
    }

    public void setModuls(List<String> moduls) {
        this.moduls = moduls;
    }
    
    
}
