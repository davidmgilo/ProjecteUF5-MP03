/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuf5;

import java.io.*;

import java.util.List;

import java.util.ArrayList;

public class LlistaDeNumeros2 {

    private List<Integer> list;

    private static final int SIZE = 10; 

    public LlistaDeNumeros2 () {

        list = new ArrayList<Integer>(SIZE);

        for (int i = 0; i < SIZE; i++) {

            list.add(new Integer(i));

        }

    }

    public void writeList(String fileName) {
        
        PrintWriter out = null;
        try{
            out= new PrintWriter(new FileWriter(fileName));
        for (int i = 0; i < SIZE; i++) {

            out.println("Value at: " + i + " = " + list.get(i));

        }
        }catch (IOException e){
            System.out.println("Hi ha hagut un error: " + e.getMessage());
        }finally{
            if(out!=null)
                out.close();
        }

        

    }

    public void readList(String fileName) {

        String line = null;

        RandomAccessFile raf = null;
        
        try{
            raf = new RandomAccessFile(fileName, "r");

            while ((line = raf.readLine()) != null) {

                Integer i = new Integer(Integer.parseInt(line));

                System.out.println(i); list.add(i);

            }
        }catch(FileNotFoundException e){
            System.out.println("Hi ha hagut un error: " + e.getMessage());
        }catch(IOException e){
            System.out.println("Hi ha hagut un error: " + e.getMessage());
        }catch(NumberFormatException e){
            System.out.println("El format no és correcte. "+e.getMessage());
        }finally {
            
            try{
            raf.close();
            }catch(IOException e){
               System.out.println("Hi ha hagut un error: " + e.getMessage());
            }      
        
        }
         

    }

}
