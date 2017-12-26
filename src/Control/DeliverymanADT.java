
package ADT;


public interface DeliverymanADT <T> {
    public boolean addDeliveryman(T newEntry);
    public boolean replaceDeliveryman(int givenPosition, T newEntry);
    public T removeDeliveryman(int givenPosition);
    public boolean isEmpty();
    public int getLength();
    public T getEntry(int givenPosition);


    
}
