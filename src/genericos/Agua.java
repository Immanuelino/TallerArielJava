/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

/**
 *
 * @author personal
 */
public class Agua extends Bebida implements Comparable{ //Extends van antes de implements.
    //Solo pueden haber un extends, pero ilimitadas implements.
    public int mililitros;
    
    public void tomar(){
        System.out.println("tomando agua");
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass().isInstance(new Refresco())){
            return (mililitros == ((Refresco)obj).mililitros);
        }
        return (mililitros == ((Agua)obj).mililitros);
    }

    
    
    @Override
    public int compareTo(Object o) {
        Agua temp =  (Agua)o;
        if(mililitros < temp.mililitros){
            return -1;
        }
        if(mililitros > temp.mililitros){
            return 1;
        }
        return 0;
    }
    
}
