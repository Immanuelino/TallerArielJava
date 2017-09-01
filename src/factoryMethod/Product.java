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
public class Product extends ProductFather
{
    void construirParteUno()
    {
        System.out.println("Estoy construyendo la primera parte");
    }
    void construirParteDos()
    {
        System.out.println("Construyento parte compleja 2");
    }
}
