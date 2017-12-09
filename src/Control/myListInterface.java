/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author Asus
 * @param <T>
 */
public interface myListInterface<T> {
    
    public boolean add(T newEntry);
    public boolean add(int position, T newEntry);
    public T get(int position);
    public boolean remove(int position);
    public boolean removeAll();
    public boolean isEmpty();
    public int size();
    public boolean replace(int position, T newData);
    
}
