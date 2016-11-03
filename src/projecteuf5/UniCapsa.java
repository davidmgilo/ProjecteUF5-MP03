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
public class UniCapsa <T>{
    private T obj = null;
    
    public boolean afegir ( T obj){
        if(esPlena()) return false;
        this.obj = obj;
        return true;
    }
    
    public boolean esPlena(){
        if(this.obj == null) return false;
        return true;
    }
    
    public T obtenir(){
        if(esPlena()) return obj;
        return null;
    }
    
    public boolean buidar(){
        if(!esPlena()) return false;
        this.obj = null;
        return true;
    }
}
