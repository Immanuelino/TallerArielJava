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
public class Test {
    public static void main(String[] args) {
        Creator c = new ConcreteCreator();
        
        ProductFather p = c.factoryMethod("Producto1");
        
        ProductFather pro2 = c.factoryMethod("Producto2");
    }
}
