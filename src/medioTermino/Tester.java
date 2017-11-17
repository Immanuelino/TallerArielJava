/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medioTermino;

/**
 *
 * @author personal
 */
public class Tester {
    public static void main(String[] args) {
        Creator c = new ConcreteCreator();
        
        PasswordCracker p = c.factoryMethod("Cracker", new Dictionary(), "200",  "192.168.10.0");
        
    }
}
