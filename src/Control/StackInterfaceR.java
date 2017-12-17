/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author Wei Kit
 */
public interface StackInterfaceR<T> {
    public void clear();
    public boolean replace(int givenPosition, T newEntry);
    public T remove(int givenPosition);
    public T displayStack(int givenPosition);
    public boolean isEmpty();
    public int getNumberOfEntries();
    public void push(T newEntry);
    public T pop();
    public T peek();
}
