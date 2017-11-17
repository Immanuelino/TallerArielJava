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
public abstract class PasswordCracker {
    protected String host;
    protected String ip;
    protected Dictionary dictionary;
    
    public abstract void setHost(String host);
    public abstract void setDictionary(Dictionary dictionary);
    public abstract void setIp(String ip);
    public abstract String crackPWD();
    
    
    
}
