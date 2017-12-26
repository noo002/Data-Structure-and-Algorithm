/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.AddDeliveryManDa;
import Model.deliveryMan;
import View.HomePage;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class AddDeliveryMan implements AddDeliveryManInterface{

    @Override
    public void Submit(deliveryMan deliveryMan) {
        if(!deliveryMan.getName().equals(""))
            JOptionPane.showMessageDialog(null, "Success added Delivery Man");
    }
    @Override
    public String generateDeliveryManId(){
        String newId = "";
        //AddDeliveryManDa addDeliveryManDa = new AddDeliveryManDa();
        //String oldId = addDeliveryManDa.getBiggestDeliveryManId();
        if(HomePage.deliveryMan.isEmpty()||HomePage.deliveryMan.size() == 0){
            newId = "D01";
        }
        else{
            String oldId = HomePage.deliveryMan.get(HomePage.deliveryMan.size()).getDeliveryManId();
            char ch = oldId.charAt(0);
            int value = Integer.parseInt(oldId.substring(1,3))+1;
            newId = String.format("%c%02d", ch,value);
        }
       // addDeliveryManDa.shutDown();
        return newId;
    }
}
