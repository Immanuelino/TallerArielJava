/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforos;


import java.util.concurrent.Semaphore;

/**
 *
 * @author personal
 */
public class CenaDeChinos implements Runnable
{
    String c;
    Semaphore cu;
    Semaphore t;
    Semaphore s;
    
    public CenaDeChinos(String c, Semaphore cu, Semaphore t, Semaphore s)
    {
        this.c= c;
        this.cu= cu;
        this.t = t;
        this.s = s;
    }
    
    public void run() {
        
        try {
            
            s.acquire();
            t.acquire();
            cu.acquire();
            
            System.out.println(c + " comiendo");
            
            Thread.sleep(5000);
            
            cu.release();
            t.release();
            s.release();
            
            
            
        } catch (InterruptedException ex) {
            
        }
    }
    
    
    public static void main(String[] args) { 
        Semaphore cu = new Semaphore(6);
        Semaphore t = new Semaphore(5);
        Semaphore s = new Semaphore(4);
        
        
        
        Thread th1 = new Thread(new CenaDeChinos("hilo 1", cu, t, s));
        Thread th2 = new Thread(new CenaDeChinos("hilo 2", cu, t, s));
        Thread th3 = new Thread(new CenaDeChinos("hilo 3", cu, t, s));
        Thread th4 = new Thread(new CenaDeChinos("hilo 4", cu, t, s));
        Thread th5 = new Thread(new CenaDeChinos("hilo 5", cu, t, s));
        Thread th6 = new Thread(new CenaDeChinos("hilo 6", cu, t, s));
        Thread th7 = new Thread(new CenaDeChinos("hilo 7", cu, t, s));
        Thread th8 = new Thread(new CenaDeChinos("hilo 8", cu, t, s));
        Thread th9 = new Thread(new CenaDeChinos("hilo 9", cu, t, s));
        Thread th10 = new Thread(new CenaDeChinos("hilo 10", cu, t ,s));
        Thread th11 = new Thread(new CenaDeChinos("hilo 11", cu, t, s));
        Thread th12 = new Thread(new CenaDeChinos("hilo 12", cu, t, s));
        Thread th13 = new Thread(new CenaDeChinos("hilo 13", cu, t, s));
        Thread th14 = new Thread(new CenaDeChinos("hilo 14", cu, t, s));
        Thread th15 = new Thread(new CenaDeChinos("hilo 15", cu, t, s));
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        th6.start();
        th7.start();
        th8.start();
        th9.start();
        th10.start();
        th11.start();
        th12.start();
        th13.start();
        th14.start();
        th15.start();
        
        
    }
}
