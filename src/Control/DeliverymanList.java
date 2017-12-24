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
public class DeliverymanList<T> implements DeliverymanListInterface<T> {

     Node firstNode;
     int numberOfNode;
     
     public T getFront(){
         T result=null;
         
         result = firstNode.data;
         
         return result;
     }
     
     public int getNumberOfNode(){
         
         return this.numberOfNode;
         
     }
     
    public boolean clockIn(T newEntry) {
        
        Node newNode = new Node(newEntry);
        
        if(isEmpty()==true){
            
            firstNode = newNode;
            
        }else{
            
            Node currentNode = firstNode;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
            
        numberOfNode++;
        return true;
        
    }
    
    public T clockOut(int givenPosition){
        
       
    T result = null;                 

    if ((givenPosition >= 1) && (givenPosition <= numberOfNode)) {
      if (givenPosition == 1) {      
        result = firstNode.data;     
        firstNode = firstNode.next;
      } else {                         
        Node nodeBefore = firstNode;
        for (int i = 1; i < givenPosition - 1; ++i) {
          nodeBefore = nodeBefore.next;		
        }
        result = nodeBefore.next.data;  
        nodeBefore.next = nodeBefore.next.next;
      } 																

      numberOfNode--;
    }

    return result;     
        
    }
    
    public boolean isEmpty() {
    boolean result=false;

    if(this.numberOfNode ==0){
        
        result = true;
    }
    
    return result;
  }

    @Override
    public int getNode(T id) {
        
        
       int count=0;
      
       Node nodeBefore = firstNode;
       
       for(int i=1; i<=numberOfNode; i++){
            T result = nodeBefore.data;
            
            if(result.equals(id)){
                count = i;
           }
               nodeBefore = nodeBefore.next;
        }


         
        return count;
    }

   
    
   private class Node {

    private T data;
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

