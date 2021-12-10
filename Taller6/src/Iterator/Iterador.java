/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author Eliot
 * @param <E>
 */
public interface Iterador<E> {
    public boolean hasNext();
    public E next();
}
