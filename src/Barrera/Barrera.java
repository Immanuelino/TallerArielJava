/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barrera;

import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author personal
 */
public class Barrera {
    public static void main(String[] args) {
        Runnable saludo = new Runnable() {
            
            public void run() {
                System.out.println("Todos los hilos terminaron");
            }
        };
        CyclicBarrier barrera = new CyclicBarrier(10, saludo);
        Thread[]arreglo = new Thread[10];
        for(int i = 0; i < 10; i++)
        {   
            
            arreglo[i] = new Thread(new Factorial(i+1, barrera));
            arreglo[i].start();
            
        }    
    }
}
