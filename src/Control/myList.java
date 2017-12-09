
package Control;

public class myList<T> implements myListInterface<T>{
    
    private Node firstNode;
    private int currentNo = 0;
    
    public myList(){
        clear();
    }

    @Override
    public boolean add(T newEntry) {
        boolean result = false;
        Node newNode = new Node(newEntry);
        if(isEmpty()){
          firstNode = newNode;
          result = true;
        }
        else{
           Node tempNode = firstNode;
           while(tempNode.next!=null){
               tempNode = tempNode.next;
           }
           tempNode.next = newNode;
           result = true;
        }
        currentNo++;
        return result;
    }
    
  

    @Override
    public boolean add(int position, T newEntry) {
       boolean result = false;
       if(position>=1 && position <=currentNo+1){
           Node newNode = new Node(newEntry);
           if(isEmpty()|| position ==1){
               newNode.next = firstNode;
               firstNode = newNode;
           }
           else{
               Node tempNode = firstNode;
               for(int i=1; i<position-1;i++){
                   tempNode = tempNode.next;
               }
               newNode.next = tempNode.next;
               tempNode.next = newNode;
           }
           currentNo++;
       }
       else result = false;
       
       return result;
    }

    @Override
    public T get(int position) {
        T getData;
       
        if(position>=1 && position<=currentNo){
             Node tempNode = firstNode;
            for(int i=0;i<(position - 1) ; i++){
                tempNode = tempNode.next;
            }
            getData = tempNode.data;
        }
        else return null;
        return getData;
    }

    @Override
    public boolean remove(int position) {
      boolean result = false;
      if(position >=1 && position<=currentNo){
          if(position ==1){
              firstNode = firstNode.next;
          }
          else{
              Node tempNode = firstNode;
              for(int i=1;i<position-1;i++){
                  tempNode = tempNode.next;
              }
              tempNode.next = tempNode.next.next;
          }
          currentNo--;
      }
      
      
      return result;
    }

    @Override
    public boolean removeAll() {
       clear();
       return true;
    }

    @Override
    public boolean isEmpty() {
        boolean result;
        return result = currentNo == 0;
    }

    @Override
    public int size() {
        return currentNo;
    }
    private void clear(){
        firstNode = null;
        currentNo = 0;
    }

    @Override
    public boolean replace(int position, T newData) {
        boolean result = false;
        if(position>=1 && position <=currentNo){
            Node tempNode = firstNode;
            for(int i=0;i<position-1;i++){
                tempNode = tempNode.next;
            }
            tempNode.data = newData;
            result = true;
        }
        return result;
    }

    private class Node{
        private T data;
        private Node next;
        public Node(T data){
            this.data = data;
            this.next = null;
        }
        public Node(T data,Node next){
            this.data = data;
            this.next = next;
        }
    }
    
}
