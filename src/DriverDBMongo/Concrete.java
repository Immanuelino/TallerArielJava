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
public class Concrete extends Creator{
    @Override
    public void create(String typeProduct) {
        if(typeProduct.compareTo("Producto1") == 0)
        {          
            driver = new DriverDBMongo();
            ((DriverDBMongo)driver).construirParteOne();
            ((DriverDBMongo)driver).construirParteTwo();
            ((DriverDBMongo)driver).construirParteThree();

        }
    }
}
