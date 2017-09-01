/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DriverDBMongo;

/**
 *
 * @author personal
 */
public class Test {
    public static void main(String[] args) {
        Creator c = new Concrete();
        
        Driver p = c.factoryMethod("Producto1");
        
        
    }
}
