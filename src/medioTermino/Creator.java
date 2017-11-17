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
public abstract class Creator {
    
    public abstract void create(String typeCracker, Dictionary dictionary, String typeHost, String typeIp);
    public  PasswordCracker factoryMethod(String typeCracker, Dictionary dictionary, String typeHost, String typeIp)
    {        
        create(typeCracker, dictionary, typeHost, typeIp);
        return cracker;
    }
    protected PasswordCracker cracker;

    

    
}

