/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuf5;

/**
 *
 * @author alumne
 */
public class Aliment implements Comparable{ 
    private String nom;
    private String tipus;
    private int cal; 

    public Aliment(String nom, String tipus, int cal) {
        this.nom = nom;
        this.tipus = tipus;
        this.cal = cal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Aliment{" + "nom=" + nom + ", tipus=" + tipus + ", cal=" + cal + '}';
    }
        
    @Override
    public int compareTo(Object o) {
        Aliment a = (Aliment)o;
        return nom.compareTo(a.getNom());
    }
}
