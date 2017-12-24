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
public interface DeliverymanListInterface<T> {
    
    public boolean clockIn(T newEntry);
    public T getFront();
    public int getNumberOfNode();
    public T clockOut(int givenPosition);
    public int getNode(T id);
     
   
}
