/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author Wee Kian Huat
 */
public interface JobsListInterface<T> {
    
    public boolean add(T newEntry);
    public T getFront();
    public int getNumberOfNode();
    public T remove(int givenPosition);
    public int getNode(T id);
    public T returnNode(int position);
    
}