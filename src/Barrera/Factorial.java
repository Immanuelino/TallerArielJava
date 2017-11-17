/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barrera;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Factorial extends Thread {
    int num;
    CyclicBarrier barrera;
    int resultado;

    Factorial() {

    }
    
    public int getResultado(){
        return resultado;
    }
    
    public Factorial(int num, CyclicBarrier barrera) 
    {
        this.num = num;
        this.barrera = barrera;
    }
    
    public void run() {
        factorial(num);
        try {
            System.out.println("Calculando el factorial de " + num);
            resultado = factorial(num);
            barrera.await();
            System.out.println("Terminé la operación");
        } catch (InterruptedException ex) {
            
        } catch (BrokenBarrierException ex) {
            
        }
    }
    int factorial(int n){
        int accum = 1;
        for(int i = n; i < 10; i--){
            accum *= i;
        }
        return accum;
    }
}
