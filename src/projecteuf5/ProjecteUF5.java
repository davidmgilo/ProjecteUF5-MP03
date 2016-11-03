/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuf5;

import java.text.Normalizer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author alumne
 */
public class ProjecteUF5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        if(args.length == 0){
//            
//            System.out.println("No hi ha cap argument.");
//            
//        }else if (!args[0].contains(".")){
//            
//            System.out.println("No és un número real.");
//            
//        }else{
//            String[] numero = args[0].split("\\.");
//            System.out.println(numero[1].length());
//        }

//        if(args.length>0){
//            int punt = args[0].indexOf('.');
//            try {
//                double d = Double.valueOf(args[0]);
//                if (punt==-1) System.out.println("El número té 0 decimals.");
//                else System.out.println("El número té "+(args[0].length()-punt-1)+" decimals.");
//            } catch (java.lang.NumberFormatException e){
//                System.out.println("L'argument no és un número real.");
//            }
//            
//        }
//Exercici 2
//
//        Scanner entrada = new Scanner (System.in);
//            
//        boolean notrobat = true;
//        
//        System.out.println("Introdueix un text acabat en INTRO:");
//        String text = entrada.nextLine();
//        
//        //Si agafem només el caràcter podrien no posar res i llavors peta.
//        
//        String chstr;
//        do{
//        System.out.println("Introdueix el caràcter a buscar.");
//         chstr = entrada.nextLine();
//        }while(chstr.isEmpty());
//        
//        char ch = chstr.charAt(0);
//        
//        int majmin;
//        do {
//            System.out.println("Vols distingir entre majúscules i minúscules? (S/N)");
//            char resposta;
//            try {
//                resposta = entrada.nextLine().trim().toUpperCase().charAt(0);
//            }catch (StringIndexOutOfBoundsException e){
//                resposta = 'C';
//            }
//            majmin = "SN".indexOf(resposta);
//         }while (majmin == -1);
//        
//        
////        String distingir;
////        char cDistingir;
////        do {            
////            System.out.println("Vols distingir entre majúscules i minúscules? (S/N)");
////            distingir=entrada.nextLine();
////            if(!distingir.isEmpty()){
////                if("SN".indexOf(distingir.toUpperCase().charAt(0))!=-1){
////                    cDistingir = distingir.toUpperCase().charAt(0);
////                    break;
////                  }
////            }
////        } while (true);
//        
//        
//        int dretesq;
//        do {
//            System.out.println("Vols buscar de dreta a esquerra o d'esquerra a dreta? ( 1.dreta a esquerra - 2. esquerra a dreta )");
//            char resposta = entrada.nextLine().trim().charAt(0);
//            dretesq = "12".indexOf(resposta);
//        } while (dretesq == -1);
//        
//        if(majmin==1) {
//            text = text.toLowerCase();
//            ch = Character.toLowerCase(ch);
//        }
//        
//        if (dretesq == 1){
//            for (int i = 0; i != -1;) {
//                i= text.indexOf(ch, i);
//                if(i != -1) {
//                    notrobat=false;
//                    System.out.println("La lletra \""+ ch + "\" es troba a la posició "+ i);
//                    i++;
//                }
//            }
//        }else {
//            for (int i = text.length(); i != -1;) {
//                i= text.lastIndexOf(ch, i);
//                if(i != -1) {
//                    notrobat = false;
//                    System.out.println("La lletra \""+ ch + "\" es troba a la posició "+ i);
//                    i--;
//                }
//            }
//        }
//        
//        if(notrobat) System.out.println("No s'ha trobat el caràcter al text!!");
//        
//        
////Exercici 3
//
//        String text;
//        Scanner entrada = new Scanner (System.in);
//        
//        System.out.println("Introdueix un text acabat en INTRO:");
//        text = entrada.nextLine().toUpperCase();
//        
//        StringBuilder textSt = new StringBuilder(text);
//        
//        String Sttext =textSt.reverse().toString();
//        
//        if(text.equals(Sttext))System.out.println("El text introduït és palíndrom");
//        else System.out.println("El text introduït NO és palíndrom");
// http://docs.oracle.com/javase/tutorial/essential/regex/
////Exercici 6        
//        
//          Scanner entrada = new Scanner (System.in);
//          String text1,text2,text1elim,text2elim;
//          
//          
//          System.out.println("Entra el primer text acabat en INTRO:");
//          do {            
//             text1 = entrada.nextLine().toLowerCase();
//          } while (text1.isEmpty());
//          
//          System.out.println("Entra el segon text acabat en INTRO:");
//          text2 = entrada.nextLine().toLowerCase();
//          
//          text1elim = eliminaNoLletres(text1);
//          text2elim = eliminaNoLletres(text2);
//        
//          char[] text1char = text1elim.toCharArray();
//          char[] text2char = text2elim.toCharArray();
//          
//          Arrays.sort(text1char);
//          Arrays.sort(text2char);
//          
//          if (Arrays.equals(text1char, text2char)) 
//              System.out.println(text1+" i "+text2+ " són anagrama.");
//          else 
//              System.out.println(text1+" i "+text2+ " NO són anagrama.");
//Exercici 5. Part 1
//        Scanner entrada = new Scanner(System.in);
//        String text;
//
//        System.out.println("Introdueix un text acabat en INTRO:");
//        do {
//            text = entrada.nextLine().trim();
//        } while (text.isEmpty());
//
////            text = text.replaceAll(",", " " ); 
////            text = text.replaceAll(";"," ");
////            text = text.replaceAll(":"," ");
////            text = text.trim(); 
////            Character.isWhiteSpace();
//        int i = 0;
//        while (i != text.length()) {
//            if (!Character.isLetterOrDigit(text.charAt(i))) {
//                for (int j = i; j < text.length(); j++) {
//                    if (Character.isLetterOrDigit(text.charAt(j))) {
//                        System.out.println("Paraula amb inicial " + text.charAt(j));
//                        i = j++;
//                        break;
//                    }
//                    
//
//                }
//            } else {
//                if (i == 0 && Character.isLetterOrDigit(text.charAt(i))) {
//                    System.out.println("Paraula amb inicial " + text.charAt(i));
//                }
//
//                i++;
//            }
//
//        }
// Expressions regulars
//        System.out.println("1".matches("\\d"));
//Exercici 3 millorat
//        String text;
//        Scanner entrada = new Scanner (System.in);
//        
//        System.out.println("Introdueix un text acabat en INTRO:");
//        text = entrada.nextLine().toUpperCase();
//        
//        text = Normalizer.normalize(text, Normalizer.Form.NFD);
//        text = text.replaceAll("\\p{M}", "");
//        
//        Pattern pattern=null;
//        try{
//            pattern = Pattern.compile("\\W");
//        }catch(PatternSyntaxException e){            
//            System.out.println("Error a l'expressió regular: "+e.getDescription()+"\nTorna-ho a provar.");
//        }
//        
//        Matcher matcher = pattern.matcher(text);
//        text = matcher.replaceAll("");
//        text = pattern.matcher(text).replaceAll("");
//        
//        System.out.println(text);
//        
//        StringBuilder textSt = new StringBuilder(text);
//        
//        String Sttext =textSt.reverse().toString();
//        
//        if(text.equals(Sttext))System.out.println("El text introduït és palíndrom");
//        else System.out.println("El text introduït NO és palíndrom");
////Exercici 5. Part 2
//        Scanner entrada = new Scanner(System.in);
//        String text;
//
//        System.out.println("Introdueix un text acabat en INTRO:");
//        do {
//            text = entrada.nextLine().trim();
//        } while (text.isEmpty());
//
//        Pattern pattern=null;
//        try{
//            pattern = Pattern.compile("\\B.|\\p{Punct}|\\p{Space}");
//            //Per a find seria: \b[\P{Punct}&&\P{Space}]
//        }catch(PatternSyntaxException e){            
//            System.out.println("Error a l'expressió regular: "+e.getDescription()+"\nTorna-ho a provar.");
//        }
//        
//        text = pattern.matcher(text).replaceAll("");
//        
//        for (int i = 0; i < text.length(); i++) {
//            System.out.println("Una paraula comença per "+text.charAt(i));
//        }
//        
//Exercici 6 millorat
//         Scanner entrada = new Scanner (System.in);
//          String text1,text2;
//          
//          
//          System.out.println("Entra el primer text acabat en INTRO:");
//          do {            
//             text1 = entrada.nextLine().toLowerCase();
//          } while (text1.isEmpty());
//          
//          System.out.println("Entra el segon text acabat en INTRO:");
//           do {            
//             text2 = entrada.nextLine().toLowerCase();
//          } while (text2.isEmpty());
//          
//          text1 = Normalizer.normalize(text1, Normalizer.Form.NFD);
//          text1 = text1.replaceAll("\\p{M}", "");
//
//          text2 = Normalizer.normalize(text2, Normalizer.Form.NFD);
//          text2 = text2.replaceAll("\\p{M}", "");
//           
//          Pattern pattern=null;
//          try{
//            pattern = Pattern.compile("\\p{Punct}|\\p{Space}");
//          }catch(PatternSyntaxException e){            
//            System.out.println("Error a l'expressió regular: "+e.getDescription()+"\nTorna-ho a provar.");
//          }
//          
//          text1 = pattern.matcher(text1).replaceAll("");
//          text2 = pattern.matcher(text2).replaceAll("");
//
//        
//          char[] text1char = text1.toCharArray();
//          char[] text2char = text2.toCharArray();
//          
//          Arrays.sort(text1char);
//          Arrays.sort(text2char);
//          
//          if (Arrays.equals(text1char, text2char)) 
//              System.out.println("Són anagrama.");
//          else 
//              System.out.println("NO són anagrama.");
////Exercici 7
//        Scanner entrada = new Scanner(System.in);
//        String text;
//
//        System.out.println("Entra les adreces de correu. Acaba en INTRO:");
//        do {
//            text = entrada.nextLine();
//        } while (text.isEmpty());
//
//        Pattern pattern = null;
//        try {
//            pattern = Pattern.compile("\\w+\\.?\\w+@\\w+\\.\\w+");
//        } catch (PatternSyntaxException e) {
//            System.out.println("Error a l'expressió regular: " + e.getDescription() + "\nTorna-ho a provar.");
//        }
//
//        Matcher matcher = pattern.matcher(text);
//
//        boolean found = false;
//        while (matcher.find()) {
//            if (!found) {
//                found = true;
//                System.out.println("Adreces trobades:\n");
//            }
//            System.out.println(matcher.group());
//            
//        }
//        if (!found) {
//            System.out.format("No s'han trobat coincidències.%n");
//        }

//Exercici 9
//        Scanner entrada = new Scanner(System.in);
//        String text;
//        
//       System.out.println("Introduix un text. Acabat en INTRO:");
//        do {
//            text = entrada.nextLine().toLowerCase();
//        } while (text.isEmpty());
//        
//        text = Normalizer.normalize(text, Normalizer.Form.NFD);
//        text = text.replaceAll("\\p{M}", "");
//        
//        Pattern pattern = null;
//        try {
//            pattern = Pattern.compile("(^\\w+)\\W+(\\w+)\\W+(\\w+).+\\3\\W+\\2\\W+(\\1)$");
//        } catch (PatternSyntaxException e) {
//            System.out.println("Error a l'expressió regular: " + e.getDescription() + "\nTorna-ho a provar.");
//        }
//        Matcher matcher = pattern.matcher(text);
//        if(matcher.find()) System.out.println("El text complix el patró!");
//        else System.out.println("El text NO complix el patró!");

////Exercici 2. Col·leccions.
//
//        Scanner entrada = new Scanner(System.in);
//        String text = "";
//        
//        System.out.println("Introduix un text. Acabat en línia buida");
//        do {   
//            String linia = entrada.nextLine();
//            if(linia.isEmpty()) break;
//               text+= linia + " ";
//
//        } while (true);
////        System.out.println(text);
//
//        String[] paraules =text.split("\\s+");
//        
//        
//        TreeMap mapa = new TreeMap();
//        
//        for (int i = 0; i < paraules.length; i++) {
//            
//            if(mapa.containsKey(paraules[i])){
//                int valor = (Integer)mapa.get(paraules[i]);
//// No és necessari ->  mapa.remove(paraules[i]);
//                mapa.put(paraules[i], ++valor);
//            }else{
//                mapa.put(paraules[i], 1);
//            }
//        }
////        System.out.println(mapa);
//        System.out.println("Llistat de paraules i nº d'aparicions:");
//        mapa.forEach((key,value) -> System.out.println(key+": "+value));
////        És l'equivalent a això. Només funciona en Java 8!!
////        Iterator it = mapa.keySet().iterator();
////        while(it.hasNext()){
////            Object key = it.next();
////            System.out.println(key+": "+mapa.get(key));
////           
////        }

//Exercici 3 Collections

        List <Aliment> conj = new ArrayList<>();
        conj.add(new Aliment("pastanaga","verdura",100));
        conj.add(new Aliment("carn","carn",300));
        conj.add(new Aliment("formatge","lactic",250));
                
        System.out.println(conj);
        
        Collections.sort(conj);
        
        System.out.println(conj);
        
        Collections.sort(conj, Aliment.CAL_ORDER);
        
        Iterator<Aliment> it = conj.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(conj);
    }
        



//    public static String eliminaNoLletres(String text) {
//        StringBuilder textSense = new StringBuilder();
//        for (int i = 0; i < text.length(); i++) {
//            if (Character.isLetter(text.charAt(i)) || Character.isDigit(text.charAt(i))) {
//                textSense.append(text.charAt(i));
//            }
//        }
//        return textSense.toString();
//    }
}
