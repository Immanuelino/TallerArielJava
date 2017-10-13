/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paralela;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author personal
 */
public class SimpleRunnable implements Runnable{ 
    Thread t;
    @Override
    
    public void run() {
        System.out.println("Nombre del hilo " + t.getName());
        System.out.println("el hilo " + t.getName() + " tiene prioridad  " + t.getPriority());
        System.out.println("el hilo " + t.getName() + " está esperando");
        try
        {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SimpleRunnable.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("el hilo " + t.getName() + " terminó");
    }

    public SimpleRunnable(String name) {
        t = new Thread(this, name);
        t.start();
    }
    
    public static void main(String[] args) {
        SimpleRunnable a = new SimpleRunnable("uno");
        SimpleRunnable b = new SimpleRunnable("dos");
        SimpleRunnable c = new SimpleRunnable("tres");
        SimpleRunnable d = new SimpleRunnable("cuatro");
        SimpleRunnable e = new SimpleRunnable("cinco");
    }
    
}
