
package Control;

import Model.deliveryMan;


public interface DeliverymanInformationInterface {
    
    public deliveryMan getDeliveryManInformation(String deliveryManId);
    public boolean updateToDatabase(deliveryMan d);
    
}
