/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

/**
 *
 * @author Jing
 * @param <T>
 */
public class DeliverymanList<T extends Comparable<? super T>> implements DeliverymanADT<T> {

    private Node firstNode;
    private int length;

    @Override
    public boolean addDeliveryman(T newEntry) {

        Node newNode = new Node(newEntry);

        Node lastNode = null;
        Node Node = firstNode;

        while (Node != null && newEntry.compareTo(Node.data) > 0) { 
            lastNode = Node;
            Node = Node.next;
        }

       
        if (isEmpty() || (lastNode == null)) {
            newNode.next = firstNode;
            firstNode = newNode;
        } else { 
            newNode.next = Node;
            lastNode.next = newNode;
        }
        length++;
        return true;
    }

    @Override
    public boolean replaceDeliveryman(int givenPosition, T newEntry) {
        boolean successful = true;
        Node Node;

        if (givenPosition >= 1 && givenPosition <= length) {
            Node = firstNode;
            for (int i = 0; i < givenPosition - 1; ++i) //Node to next node
            {
                Node = Node.next;
            }
            //Node is pointing to node at the givenPosition
            Node.data = newEntry;
        } else {
            successful = false;
        }

        return successful;
    }

    public T removeDeliveryman(int givenPosition) {
        T result = null;
        Node lastNode;

        if ((givenPosition >= 1) && (givenPosition <= length)) {
            //remove first entry
            if (givenPosition == 1) {
                //save entry has to remove
                result = firstNode.data;
                //update the firstNode to the next node
                firstNode = firstNode.next;
            } else {
                lastNode = firstNode;
                for (int i = 1; i < givenPosition - 1; ++i) {
                    //lastNode to next node
                    lastNode = lastNode.next;
                }
                //save entry has to remove
                result = lastNode.next.data;
                lastNode.next = lastNode.next.next;
            }
            length--;
        }
        return result;
    }

    @Override
    public boolean isEmpty() {
        return (length == 0);
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public T getEntry(int givenPosition) {
      T result = null;

        if ((givenPosition >= 1) && (givenPosition <= length)) {
            //Node to the firstNode
            Node Node = firstNode;
            for (int i = 0; i < givenPosition - 1; ++i) {
                //advance Node to next node
                Node = Node.next;
            }
            //current is pointing to the Node at givenPosition
            result = Node.data;
        }

        return result;   }




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
