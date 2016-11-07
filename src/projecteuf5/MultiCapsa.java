/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuf5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author alumne
 * 
 */
public class MultiCapsa <E> {
    private Collection<E> contingut;
    
    
    public MultiCapsa(Collection<E> implementacio){
        contingut = implementacio;
    }
    
    public boolean esBuida(){   
        return contingut.isEmpty();
    }
    
    public void afegir ( E elem){
        contingut.add(elem);
    }
    
    public E obtenir(){
        if(esBuida()) return null;
        Iterator<E> it = contingut.iterator();
        return it.next();
    }
    
    public boolean eliminar(){
        Iterator<E> it = contingut.iterator();
        return contingut.remove(it.next());
    }
    
    public boolean buidar(){
        try{
            contingut.clear();
            return true;
        } catch (Exception e){
            return false;
        }
    }
    
    public <E extends Comparable> Collection <E> ordenat (){
        List <E> col = new ArrayList (this.contingut);
        java.util.Collections.sort(col);
        return col;
    }


}
