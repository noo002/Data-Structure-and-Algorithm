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
public class LStackR<T> implements StackInterfaceR<T> {

         Node firstNode;
        int numberOfEntries;
        
        public LStackR(){
            clear();
        }
    

    @Override
    public void clear() {
    firstNode = null;
    numberOfEntries = 0;
    }

    @Override
    public boolean replace(int givenPosition, T newEntry) {
        boolean isSuccessful = true;

    if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
      Node currentNode = firstNode;
      for (int i = 0; i < givenPosition - 1; ++i) {
        // System.out.println("Trace| currentNode.data = " + currentNode.data + "\t, i = " + i);
        currentNode = currentNode.next;		// advance currentNode to next node
      }
      currentNode.data = newEntry;	// currentNode is pointing to the node at givenPosition
    } else {
      isSuccessful = false;
    }

    return isSuccessful;
    }
    
        
         @Override
    public T displayStack(int givenPosition){
        T data = null;
        Node currentNode = firstNode;
        if(givenPosition>0 && givenPosition<=numberOfEntries){
            for(int i=0;i<givenPosition-1;i++){
            currentNode = currentNode.next;
        }
            data  = currentNode.data;
        }
       return data;
    }
    
   //for testing
        /* LStack<Integer> a = new LStack();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        for(int i=1;i<=a.getNumberOfEntries();i++){
           System.out.println(a.displayStack(i));
        }*/
        
    
    public T remove(int givenPosition) {
        T result = null;                 // return value

        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            if (givenPosition == 1) {      // case 1: remove first entry
                result = firstNode.data;     // save entry to be removed
                firstNode = firstNode.next;
            } else {                         // case 2: givenPosition > 1
                Node nodeBefore = firstNode;
                for (int i = 1; i < givenPosition - 1; ++i) {
                    nodeBefore = nodeBefore.next;		// advance nodeBefore to its next node
                }
                result = nodeBefore.next.data;  // save entry to be removed
                nodeBefore.next = nodeBefore.next.next;	// make node before point to node after the
            } 																// one to be deleted (to disconnect node from chain)

            numberOfEntries--;
        }

        return result;                   // return removed entry, or
        // null if operation fails
    }

    @Override
    public boolean isEmpty() {
    boolean result;

    result = numberOfEntries == 0;

    return result;
    }

    @Override
    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    public void push(T newEntry) {
        if(isEmpty()){
            Node newNode = new Node(newEntry);
            firstNode = newNode;
            
        }
        else{
            Node newNode = new Node(newEntry,firstNode);
            firstNode = newNode;
            
        }
        numberOfEntries++;
    }

    @Override
    public T pop() {
        if(isEmpty())
        {
            return null;
        }
        else
        {
            T data = firstNode.data;
            firstNode = firstNode.next;
            return data;
        }
    }

    @Override
    public T peek() {
        return firstNode.data;
    }

    
    private class Node {

    public T data;
    private Node next;

    private Node(T data) {
      this.data = data;
      this.next = null;
    }

    private Node(T data, Node next) {
      this.data = data;
      this.next = next;
    }
  }
}
