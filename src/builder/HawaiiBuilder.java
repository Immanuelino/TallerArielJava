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
public class HawaiiBuilder extends Builder {

    @Override
    public Hamburger buildHamburger() {
        return new Hawaiian();
    }

    @Override
    public void buildBread() {
        Bread b = new Bread();
        h.setBread(b);
    }

    @Override
    public void buildMeat() {
        h.setMeat(new Meat());
    }

    
    @Override
    public void buildTomatoe() {
        h.setTomatoe(new Tomatoe());
    }

    
    public void buildPineapple() {
        h.setPineapple(new Pineapple());
    }
    
    
}
