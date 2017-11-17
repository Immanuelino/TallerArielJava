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
public class ConcreteCreator extends Creator {

    public void create(String typeCracker, Dictionary dictionary, String typeHost, String typeIp) {
        {          
            cracker = new Cracker();
            cracker.setIp(typeIp);
            
            cracker = new Cracker();
            cracker.setDictionary(dictionary);
           
            cracker = new Cracker();
            cracker.setHost(typeHost);
            
            
            
        }
        
        
    }

   
}
