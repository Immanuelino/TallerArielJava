/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author personal
 */
public abstract class Builder {
    protected Hamburger h;
    public abstract Hamburger buildHamburger();
    public abstract void buildBread();
    public abstract void buildMeat();
    public abstract void buildTomatoe();
    public abstract void buildPineapple();
    
    public Hamburger getHamburger(){
        return h;
    }
    public void createHamburger(){
        h = buildHamburger();
        buildBread();
        buildTomatoe();
        buildPineapple();
        buildMeat();
                
    }
}
