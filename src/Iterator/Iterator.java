/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author administrador1
 */
public class Iterator<T> {
    protected Collection<T> collection;
    int cont;
    
    public Iterator(Collection<T> collection)
    {
        this.collection = collection;
        cont = 0;
    }
    
    boolean hasNext()
    {
        if(cont < collection.length())        
            return true;
        return false;        
    }
    public T next()
    {
        return collection.at(cont++);
    }
}
