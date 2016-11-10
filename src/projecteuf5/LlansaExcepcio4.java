/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuf5;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author alumne
 */
public class LlansaExcepcio4 {

    private PrintWriter fitxer = null;

    void metode1() {
       try {
        metode2();
        } catch (FileNotFoundException e) {
            System.out.println("Fitxer no trobat. " + e.getMessage());
        }
    }

    void metode2() throws FileNotFoundException{
        try {
            metode3();
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    void metode3() throws FileNotFoundException {
        try {
            metode4();
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    void metode4() throws FileNotFoundException {
        try {
            fitxer = new PrintWriter("c:/sortida.txt");
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException(e.getMessage());
        }

    }
}
