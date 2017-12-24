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
public class AssignJobList<T> implements AssignJobListInterface<T> {

    private Node firstNode; 
    private Node lastNode; 
    
    @Override
    public void enqueue(T newEntry) {
        Node newNode = new Node(newEntry, null);

    if (isEmpty()) {
      firstNode = newNode;
    } else {
      lastNode.next = newNode;
    }

    lastNode = newNode;
    }

    @Override
    public T dequeue() {
        
        T front = null;

    if (!isEmpty()) {
      front = firstNode.data;
      firstNode = firstNode.next;

      if (firstNode == null) {
        lastNode = null;
      }
    } 

    return front;
        
    }

    @Override
    public T getFront() {
        
        T front = null;

    if (!isEmpty()) {
      front = firstNode.data;
    }

    return front;
        
    }

    @Override
    public boolean isEmpty() {
       
        return (firstNode == null) && (lastNode == null);
    }
    
    private class Node {

    private T data; 
    private Node next; 

    private Node(T dataPortion) {
      data = dataPortion;
      next = null;
    } 

    private Node(T dataPortion, Node linkPortion) {
      data = dataPortion;
      next = linkPortion;
    } 
  }
    
}
