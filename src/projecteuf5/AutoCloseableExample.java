/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuf5;

import java.io.IOException;

/**
 *
 * @author alumne
 */
public class AutoCloseableExample implements AutoCloseable {

    public AutoCloseableExample(){
        
    }
    
    public void method1 () throws IOException{
        throw new IOException("Exception from method");
    }

    @Override
    public void close() throws IOException {
        throw new IOException("An Exception During Close");
    }

}