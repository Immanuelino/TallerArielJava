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
public abstract class Hamburger {
    public abstract void getHambType();

    public void setBread(Bread bread) {
        this.bread = bread;
    }

    public void setTomatoe(Tomatoe tomatoe) {
        this.tomatoe = tomatoe;
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    public void setPineapple(Pineapple pineapple) {
        this.pineapple = pineapple;
    }
    protected Bread bread;
    protected Tomatoe tomatoe;
    protected Meat meat;
    protected Pineapple pineapple;
}
