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
public class DoubleBuilder extends Builder{
    @Override
    public Hamburger buildHamburger() {
        return new DoubleBurger();
    }

    @Override
    public void buildBread() {
        Bread b = new Bread();
        h.setBread(b);
    }

    @Override
    public void buildMeat() {
        System.out.println("tiene doble carne");
    }

    
    @Override
    public void buildTomatoe() {
        h.setTomatoe(new Tomatoe());
    }

    
    public void buildPineapple() {
        System.out.println("no tiene piña");
    }
}
