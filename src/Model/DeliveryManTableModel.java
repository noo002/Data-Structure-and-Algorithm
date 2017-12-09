/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import Control.myList;
import Control.myListInterface;
import View.HomePage;


import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Asus
 */
public class DeliveryManTableModel extends AbstractTableModel{

   
   String[] columnHeader = {"Delivery Man ID","Name","Level","Status"};
   AddDeliveryManDa da = new AddDeliveryManDa();
   
    public DeliveryManTableModel(){
        
    }
    @Override
    public int getRowCount() {
      return HomePage.d.size();
    }

    @Override
    public int getColumnCount() {
        return columnHeader.length;
    }
    
   @Override
    public String getColumnName(int column){
        return columnHeader[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object obj = null;
        deliveryMan man = HomePage.d.get((rowIndex+1));
        //  String[] columnHeader = {"Delivery Man ID","Name","Level","Status"};
        switch(columnIndex){
            case 0:
                obj = man.getDeliveryManId();
                break;
            case 1:
                obj = man.getName();
                break;
            case 2:
                obj = man.getLevel();
                break;
            case 3:
                obj = man.getStatus();
                break;
        }
        
        return obj;
    }
    
}
