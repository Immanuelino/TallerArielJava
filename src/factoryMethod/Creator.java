/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod;

/**
 *
 * @author administrador1
 */
public abstract class Creator {
    public abstract void create(String typeProduct);
    public  ProductFather factoryMethod(String typeProduct)
    {        
        create(typeProduct);
        return product;
    }
    protected ProductFather product;
}
