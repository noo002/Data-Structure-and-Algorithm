package Control;


import Model.order;


public class LinkedQueue<T> implements QueueInterface<T> {

  private Node firstNode; // references node at front of queue
  private Node lastNode;  // references node at back of queue
  
int count =0;
  
  
  public static int lastOrderId = 1; 
    
    

  public LinkedQueue() {
      firstNode = null;
    lastNode = null;
    
  } // end default constructor
  
  
      public int LastOrderId()
    {
        return lastOrderId;
    }
    
        public void IncreaseorderId()
    {
        lastOrderId++;
    }

  public void enqueue(T newEntry) {
    Node newNode = new Node(newEntry, null);

    if(firstNode == null)
        {
            
            newNode.setNodeContent(newEntry);
            firstNode = newNode;
            lastNode = newNode;
            count++;
        }
        else
        {
           
            newNode.setNodeContent(newEntry);
            
            lastNode.next = newNode;
            count++;
        }  // end enqueue

  }
  
  public T getFront() {
    T front = null;

    if (!isEmpty()) {
      front = firstNode.data;
    }

    return front;
  } // end getFront

  public T dequeue() {
    T front = null;

    if (!isEmpty()) {
      front = firstNode.data;
      firstNode = firstNode.next;

      if (firstNode == null) {
        lastNode = null;
      }
    } // end if

    return front;
  } // end dequeue

  @Override
  public boolean isEmpty() {
    return (firstNode == null) && (lastNode == null);
  } // end isEmpty

  @Override
  public void clear() {
    firstNode = null;
    lastNode = null;
  } // end clear
  
  @Override
  public Object[][] returnQueue()
      {
          Node newNode = firstNode;
          order o;
          Object[][] temp = new Object[count][5];
          if(firstNode != null)
          {
          
          for(int i = 0; i<count; i++)
          {
           o = (order)newNode.getNodeContent();
           temp[i][0]=o.getCustomerId();
           temp[i][1]=o.getOrderId();
           temp[i][2]=o.getOrderDate();
           temp[i][3]=o.getOrderTime();
           temp[i][4]=o.getTotalAmount();
          
          // return 1(T)f;
                newNode = newNode.next;
          }
     
          return temp;
          }
          else
              return null;
          
      }
 

  private class Node {

    private T data; // entry in queue
    private Node next; // link to next node
    T nodeContent = null;

    private Node(T dataPortion) {
      data = dataPortion;
      next = null;
    } // end constructor

    private Node(T dataPortion, Node linkPortion) {
      data = dataPortion;
      next = linkPortion;
    } // end constructor
    
    public void setNodeContent(T nodeContent)
     {
         this.nodeContent = nodeContent;
     }
     
    
     public T getNodeContent()
     {
         return nodeContent;
     }
    
    
  } // end Node
} // end Linkedqueue
