/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuf5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumne
 */
public class Animal {
    private String nom;
    private String tipus;
    private double pes;
    private Llicencia llic;
    private Propietari prop;
    //Ho faig en ArrayList perquè vull elements repetits i és més ràpid d'accés que una LinkedList.
    final private List<Aliment> menja = new ArrayList<Aliment>();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public double getPes() {
        return pes;
    }

    public void setPes(double pes) {
        this.pes = pes;
    }
  
    
}
