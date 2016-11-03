/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuf5;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author alumne
 */
public class Propietari {
    private String nom;
    private String DNI;
    private String cognoms;
    private Habitatge casa;
    // No vull que es repeteixin i vull que estiguin ordenats (per algun camp).
    private Set <Animal> tecura = new TreeSet<>();
    
}
