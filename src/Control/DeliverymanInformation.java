/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.AddDeliveryManDa;
import Model.deliveryMan;

/**
 *
 * @author Asus
 */
public class DeliverymanInformation implements DeliverymanInformationInterface{

    @Override
    public deliveryMan getDeliveryManInformation(String deliveryManId) {
        AddDeliveryManDa da = new AddDeliveryManDa();
        deliveryMan d = da.getDeliveryMan(deliveryManId);
        da.shutDown();
        return d;
    }

    @Override
    public boolean updateToDatabase(deliveryMan d) {
        boolean result = false;
        AddDeliveryManDa da = new AddDeliveryManDa();
        int success = da.updateDeliveryManDetail(d);
        if(success>0)
            result = true;
        return result;
    }
    
}
