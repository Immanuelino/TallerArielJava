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
public abstract class Creator{
    public abstract void create(String typeProduct);
    public  Driver factoryMethod(String typeProduct)
    {        
        create(typeProduct);
        return driver;
    }
    protected Driver driver;
}
