/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuf5;

//import java.text.Normalizer;
import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//import java.util.Arrays;
//import java.util.Iterator;
//import java.util.Scanner;
//import java.util.TreeMap;
//import java.util.*;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//import java.util.regex.PatternSyntaxException;
//class Bicycle implements Comparable <Bicycle>{
//    
//    int cadence = 0;
//    int speed = 0;
//    int gear = 1;
//
//    void changeCadence(int newValue) {
//         cadence = newValue;
//    }
//
//    void changeGear(int newValue) {
//         gear = newValue;
//    }
//
//    void speedUp(int increment) {
//         speed = speed + increment;   
//    }
//
//    void applyBrakes(int decrement) {
//         speed = speed - decrement;
//    }
//
//    void printStates() {
//         System.out.println("cadence:" +
//             cadence + " speed:" + 
//             speed + " gear:" + gear);
//    }
//
//    @Override
//    public String toString() {
//        return "Bicycle{" + "cadence=" + cadence + ", speed=" + speed + ", gear=" + gear + '}';
//    }
//
//    
//    @Override
//    public int compareTo(Bicycle o) {
//        Bicycle b = (Bicycle) o;
//        return (cadence > b.cadence) ? 1 : (cadence < b.cadence) ? -1 : 0 ;
//    }
//    
//}
/**
 *
 * @author alumne
 */
public class ProjecteUF5 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
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
////Exercici 3 Collections
//
//        List <Aliment> conj = new ArrayList<>();
//        conj.add(new Aliment("pastanaga","verdura",100));
//        conj.add(new Aliment("carn","carn",300));
//        conj.add(new Aliment("formatge","lactic",250));
//                
////        System.out.println(conj);
//        ProjecteUF5.<Aliment>mostraConjunt(conj);
//        
//        Collections.sort(conj);
//        
//        ProjecteUF5.<Aliment>mostraConjunt(conj);
//        
//        Collections.sort(conj, Aliment.CAL_ORDER);
//        
//        ProjecteUF5.<Aliment>mostraConjunt(conj);
//        
//        Collections.sort(conj, Aliment.TYPE_ORDER);
//        
//        ProjecteUF5.<Aliment>mostraConjunt(conj);
//// Exercici 1 genèrics
//
//          UniCapsa <Integer> caixa = new UniCapsa<>();
//          boolean res;
//          
//          System.out.println(caixa.obtenir());
//          System.out.println(caixa.esPlena()?"no buida":"buida");
//          
//          res = caixa.afegir(8); 
//          System.out.println(res?"Afegida": "Ja està plena!!");
//          System.out.println(caixa.obtenir());
//          System.out.println(caixa.esPlena()?"no buida":"buida");
//          
//          res = caixa.afegir(7);
//          System.out.println(res?"Afegida": "Ja està plena!!");
//          System.out.println(caixa.obtenir());
//          System.out.println(caixa.esPlena()?"no buida":"buida");
//          
//          res = caixa.buidar();
//          System.out.println(res?"buidada":"Ja està buida!!");
//          System.out.println(caixa.obtenir());
//          System.out.println(caixa.esPlena()?"no buida":"buida");
//          
//          res = caixa.buidar();
//          System.out.println(res?"buidada":"Ja està buida!!");
//          System.out.println(caixa.obtenir());
//          System.out.println(caixa.esPlena()?"no buida":"buida");
////Exercici 2 i 3 Genèrics
//
//            MultiCapsa mc=new MultiCapsa(new ArrayList()); 
//
//
//            mc.afegir("Primer"); mc.afegir("Segon"); 
//
//            System.out.println((mc.esBuida()?"buida":"no buida")); 
//
//            System.out.println(mc.obtenir()); 
//
//            mc.eliminar(); 
//
//            System.out.println(mc.obtenir()); 
//
//            mc.eliminar(); 
//
//            System.out.println((mc.buidar()?"buidada":"no buidada")); 
//
//            System.out.println((mc.esBuida()?"buida":"no buida")); 
//
//
//            mc=new MultiCapsa(new HashSet()); 
//
//            mc.afegir("Primer"); 
//
//            mc.afegir("Segon"); 
//
//            System.out.println((mc.esBuida()?"buida":"no buida")); 
//
//            System.out.println(mc.obtenir()); 
//
//            mc.eliminar(); 
//
//            System.out.println(mc.obtenir()); 
//
//            mc.eliminar(); 
//
//            System.out.println((mc.buidar()?"buidada":"no buidada")); 
//
//            System.out.println((mc.esBuida()?"buida":"no buida")); 
//            
//            mc=new MultiCapsa(new ArrayList()); 
//            mc.afegir("Segon");
//            mc.afegir("Primer");
//            Collection col = mc.ordenat();
//            System.out.println(col);
//            
//            Bicycle b1 = new Bicycle();
//            b1.cadence=23;
//            Bicycle b2 = new Bicycle();
//            MultiCapsa <Bicycle> ma=new MultiCapsa <>(new ArrayList <> ()); 
//            ma.afegir(b1);
//            ma.afegir(b2);
//            System.out.println(ma.<Bicycle>ordenat().toString());
////Exercici 1. Excepcions
//
//        LlistaDeNumeros1 llista = new LlistaDeNumeros1();
////        llista.readList("filenotexist.txt");
//        llista.writeList("filename.txt");
//        llista.readList("filenumerical.txt");
////        llista.writeList("fileio.txt");
////        llista.readList("fileio.txt");
////Exercici 2 Excepcions
//            
//        LlistaDeNumeros2 llista = new LlistaDeNumeros2();
//        llista.readList("filename.txt");
//        llista.writeList("filefail.txt");
////Exercici 3 Excepcions
//        LlansaExcepcio5 ll = new LlansaExcepcio5();
//        try {
//            ll.metode1();
//        } catch (FileNotFoundException e) {
//            System.out.println("Fitxer no trobat. " + e.getMessage());
//        }
////Exercici 4 Excepcions
//
//            Fill f = new Fill();
//            f.method1();
//            Pare p = new Pare ();
//            p.method1();
//// Exercici 5 Excepcions
//    
//        try(AutoCloseableExample  ex = new AutoCloseableExample ()){
//            ex.method1();
//        }catch(IOException e){
//            System.out.println("Hi ha un error." + e.getMessage());
//            for (int i = 0; i < e.getSuppressed().length; i++) {
//                System.out.println(e.getSuppressed()[i]);
//            }
//            
//        }
////Exercici 1 Fitxers
//        
//    
//            try (
//                BufferedInputStream in1 = new BufferedInputStream (new FileInputStream("origen1.txt"));
//                BufferedInputStream in2 = new BufferedInputStream (new FileInputStream("origen2.txt"));
//                BufferedOutputStream out = new BufferedOutputStream (new FileOutputStream("fusiobytes.txt"));
//                ){
//
//            int c,d;
//            String salt = "\n";
//            
//            
//            while((c=in1.read()) != -1){
//                out.write(c);
//                
//                if('\n' == c){
//                   while((d=in2.read()) != -1){
//                       out.write(d);
//                       if('\n' == d) break;
//                   }  
//                }
//            }
//            while((d=in2.read()) != -1){
//                       out.write(d);
//            }
//            
//            
//        }catch(FileNotFoundException e) {
//            System.out.println("Fitxer not trobat. "+ e.getMessage());
//            
//        }
//// Exercici 2 fitxers
//        
//        try(
//                BufferedReader in1 = new BufferedReader (new FileReader("origen1.txt"));
//                BufferedReader in2 = new BufferedReader (new FileReader("origen2.txt"));
//                BufferedWriter out = new BufferedWriter (new FileWriter("fusiocaracters.txt"));
//            ){
//            
//            int c,d;          
//            
//            while((c=in1.read()) != -1){
//                out.write(c);
//                
//                if('\n' == c){
//                   while((d=in2.read()) != -1){
//                       out.write(d);
//                       if('\n' == d) break;
//                   }  
//                }
//            }
//            while((d=in2.read()) != -1){
//                       out.write(d);
//            }
//            
//            
//        }catch(FileNotFoundException e) {
//            System.out.println("Fitxer not trobat. "+ e.getMessage());
//            
//        }
////Exercici 3 fitxers
//
//            try(
//                BufferedReader in1 = new BufferedReader (new FileReader("origen1.txt"));
//                BufferedReader in2 = new BufferedReader (new FileReader("origen2.txt"));
//                PrintWriter out = new PrintWriter (new FileWriter("fusiolinies.txt"));
//            ){
//            
//            String c,d;          
//            
//            while((c=in1.readLine()) != null && (d=in2.readLine()) != null){
//                out.println(c);
//                out.println(d);
//
//            }
//            if((c=in1.readLine()) != null){
//                out.println(c);
//                while((c=in1.readLine()) != null){
//                    out.println(c);
//                }
//            }
//            if((d=in2.readLine()) != null){
//                out.println(d);
//                while((d=in2.readLine()) != null){
//                    out.println(d);
//                }
//            }
//            
//            
//        }catch(FileNotFoundException e) {
//            System.out.println("Fitxer not trobat. "+ e.getMessage());
//            
//        }
////Exercici 4 fitxers

        Scanner entrada = new Scanner(new File("notes.txt"));
        
        entrada.useDelimiter("\\s\\p{Punct}?\\s");
        
        int total_num = 0;
        int total = 0;
        String valor;
        int valorI;
        int aprovats = 0;
        int nDeus = 0;
        int nZeros = 0;
        int notes_totals = 0;
        
        while(entrada.hasNext()){
            if(!entrada.hasNextInt()){
                valor = entrada.next();
                System.out.println("Nota incorrecta : "+valor);
            }else{
                valor = entrada.next();
                valorI = Integer.valueOf(valor);
                if(valorI >= 5) aprovats++;
                if(valorI == 10) nDeus++;
                if(valorI == 0) nZeros++;
                notes_totals+=valorI;
                total_num++;
            }
            
        }
        double perApro = aprovats*100/(double)total_num;
        double perSusp = (total_num-aprovats)*100/(double)total_num;
        
        System.out.println("Total d'alumnes: "+total_num);
        System.out.format("Percentatge d'alumnes aprovats: %f\n",perApro);
        System.out.format("Percentatge d'alumnes suspesos: %f\n",perSusp);
        System.out.println("Total de deus: "+nDeus);
        System.out.println("Total de zeros: "+nZeros);
        System.out.format("Nota mitja: %f\n",(notes_totals/(double)total_num));
        
        
////Exercici 5 fitxers
//        Scanner entrada = new Scanner(System.in);
//
//        File fitxer = new File("alumnes.dat");
//
//        List<Alumne> alumnes = new ArrayList<>();
//        Iterator<Alumne> it;
//
//        Alumne alumne;
//
//        try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fitxer)));) {
//            try {
//                while (true) {
//                    alumne = (Alumne) in.readObject();
//                    alumnes.add(alumne);
//                }
//            } catch (EOFException e) {
//            } catch (ClassNotFoundException e) {
//                System.out.println("Error en la lectura del fitxer");
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("No existeix el fitxer. Es crea de nou al inserir dades.");
//        } finally {
//            int op = -1;
//            while (op != 0) {
//                System.out.println("\nMENU D'OPCIONS");
//                System.out.println("1. Llista els alumnes.");
//                System.out.println("2. Insertar un nou alumne.");
//                System.out.println("Apreta 0 per a sortir.\n");
//                try {
//                    op = Integer.valueOf(entrada.nextLine());
//                    if (op > 2 || op < 0) {
//                        throw new NumberFormatException();
//                    }
//                } catch (NumberFormatException e) {
//                    op = -1;
//                }
//
//                switch (op) {
//                    case 0:
//                        System.out.println("Adeu.");
//                        break;
//                    case 1:
//                        it = alumnes.iterator();
//                        int count = 0;
//                        while (it.hasNext()) {
//                            System.out.println(it.next().toString());
//                            count++;
//                        }
//                        if (count == 0) {
//                            System.out.println("No hi han alumnes.");
//                        }
//                        break;
//                    case 2:
//                        System.out.println("Introdueix les dades del alumne. (Linia en blanc per acabar)");
//                        System.out.print("Nom: ");
//                        String nom = entrada.nextLine();
//                        System.out.print("Primer Cognom: ");
//                        String cognom1 = entrada.nextLine();
//                        System.out.print("Segon Cognom: ");
//                        String cognom2 = entrada.nextLine();
//                        Date data = Calendar.getInstance().getTime();
//                        System.out.print("Email: ");
//                        String email = entrada.nextLine();
//                        alumne = new Alumne(nom, cognom1, cognom2, data, email);
//                        // Evitar problemes
//                        while (!entrada.nextLine().isEmpty()) {
//                            email = entrada.nextLine();
//                        }
//
//                        System.out.println("Introdueix els moduls cursats. (Linia en blanc per acabar)");
//                        while (true) {
//                            String next = entrada.nextLine();
//                            if (next.isEmpty()) {
//                                break;
//                            }
//                            alumne.setElement(next);
//                        }
//
//                        System.out.println("Vols que es guardi al final o que ho sobreescrigui tot ? ( F / S) NOTA: Si no existeix es sobreescriurà de totes maneres.");
//                        String format = null;
//                        do {
//                            format = entrada.nextLine();
//                            if (format.toUpperCase().charAt(0) != 'F' && format.toUpperCase().charAt(0) != 'S') {
//                                System.out.println("Opcio incorrecta (Final o Sobreescriptura).");
//                            }
//                        } while (format.toUpperCase().charAt(0) != 'F' && format.toUpperCase().charAt(0) != 'S');
//
//                        ObjectOutputStream out = null;
//
//                        try {
//
//                            if (format.charAt(0) == 'F' && fitxer.exists()) {
//                                out = new AppendingObjectOutputStream(new FileOutputStream(fitxer, true));
//                                System.out.println("Afegint...");
//                            } else {
//                                out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fitxer)));
//                                alumnes = new ArrayList<>();
//                                System.out.println("Sobreescrivint...");
//                            }
//                            out.writeObject(alumne);
//                            alumnes.add(alumne);
//
//                        } catch (IOException ex) {
//                            System.out.println(ex.getMessage());
//                        } finally {
//                            if (out != null) {
//                                try {
//                                    out.close();
//                                } catch (IOException ex) {
//                                    System.out.println(ex.getMessage());
//                                }
//                            }
//                        }
//                        break;
//
//                    default:
//                        System.out.println("Opcio invalida");
//                        break;
//                }
//            }
//
//        }

    }

//    public static <T> void mostraConjunt( List <T> conj){
//        Iterator<T> it = conj.iterator();
//        System.out.println("Conjunt : ");
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//    }
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

//class Pare{
//
//    public void method1() 
//            throws IOException
//    {}
//    
//    // Si només la té el pare, es pot llançar. Cal tractar-la als objectes del pare només.
//
//}
//
//
//class Fill extends Pare{
//
//    @Override
//
//    public void method1() 
//            throws EOFException
//    {}
//    
//    // Si només la té el fill, no es pot llançar.
//    
//    //Si tots dos la tenen, si es pot llançar. Cal tractar-la als objectes dels dos tipus. 
//    //Si no és la mateixa excepció. Si no tenen relacióno la pot llançar.  El fill pot llançar una excepció filla de la excepció del pare.
//
//
//}
class AppendingObjectOutputStream extends ObjectOutputStream {

    public AppendingObjectOutputStream(OutputStream out) throws IOException {

        super(out);

    }

    @Override

    protected void writeStreamHeader() throws IOException {
        reset();
    }

}
