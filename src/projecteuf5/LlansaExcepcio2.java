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
public class LlansaExcepcio2 {
    
   private PrintWriter fitxer = null;

   void metode1() {
      metode2();
   }

   void metode2() {
      metode3();
   }

   void metode3() {
      try{
       metode4();
      }catch(FileNotFoundException e){
          System.out.println("Fitxer no trobat. " + e.getMessage());
      }
   }

   void metode4() throws FileNotFoundException{
      
       fitxer=new PrintWriter("c:/sortida.txt");
       throw new FileNotFoundException();
      
   }
}
