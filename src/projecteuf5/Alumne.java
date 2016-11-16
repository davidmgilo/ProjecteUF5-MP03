/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuf5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author alumne
 */
public class Alumne implements Serializable{
    private String nom;
    private String cognom1;
    private String cognom2;
    private Date data;
    private String email;
    final protected List<String> moduls = new ArrayList<>();

    public Alumne() {
    }

    public Alumne(String nom, String cognom1, String cognom2, Date data, String email) {
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.data = data;
        this.email = email;
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
    
    public void setElement (String element){
        moduls.add(element);
    }
    
    public String getElement(int index){
       return moduls.get(index);
    }

    @Override
    public String toString() {
        String modul = "";
        Iterator it = moduls.iterator();
        while(it.hasNext()){
            modul += it.next() + " ";
        }
        return "Alumne{" + "nom=" + nom + ", cognom1=" + cognom1 + ", cognom2=" + cognom2 + ", data=" + data + ", email=" + email + ", moduls=" + modul + '}';
    }
    
}
