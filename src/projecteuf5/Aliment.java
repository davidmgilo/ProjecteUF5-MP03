/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuf5;

import java.util.Comparator;

/**
 *
 * @author alumne
 */
public class Aliment implements Comparable{ 
    private String nom;
    private String tipus;
    private int cal; 
    static final Comparator<Aliment> CAL_ORDER =
            new Comparator<Aliment> (){
        @Override
        public int compare(Aliment a1, Aliment a2) {
            return (a1.getCal() < a2.getCal() ? -1 :
                    (a1.getCal() == a2.getCal() ? 0 : 1));
        }
    };
    static final Comparator<Aliment> TYPE_ORDER =
            new Comparator<Aliment> (){
        @Override
        public int compare(Aliment a1, Aliment a2) {
            return a1.getTipus().compareTo(a2.getTipus());
        }
    };

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

    public int getCal() {
        return cal;
    }

    public void setCal(int cal) {
        this.cal = cal;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
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
