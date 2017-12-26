
package Model;

import View.HomePage;
import javax.swing.table.AbstractTableModel;

public class PendingDeliveriesTableModel extends AbstractTableModel{
    

    String[] columnHeader = {"No","Order ID","Customer ID","Order Date","Order Time","Address","Order Status"};
 
    
    public PendingDeliveriesTableModel(){
       
    }
    
    @Override
    public int getRowCount() {
        return HomePage.order.size();
    }

    @Override
    public int getColumnCount() {
        return columnHeader.length;
    }
    @Override
    public String getColumnName(int i){
        return columnHeader[i];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object obj = null;
        String customer = "";
        String address = "";
        // String[] columnHeader = {"No","Order ID","Customer ID","Order Date","Order Time","Address","Order Status"};
        switch(columnIndex){
            case 0:
                obj = String.format("%d", rowIndex+1);
                break;
            case 1:
                obj = HomePage.order.get(rowIndex+1).getOrderId();
                break;
            case 2:
               if(rowIndex+1>=HomePage.customer.size()){
                   for(int i=1;i<=HomePage.customer.size();i++){
                       if(HomePage.customer.get(i).getCustomerId().equals(HomePage.order.get(rowIndex+1).getCustomerId())){
                           customer = HomePage.customer.get(i).getCustomerId();
                           break;
                       }
                   }obj = customer;
               }
               else 
                obj = HomePage.customer.get(rowIndex+1).getCustomerId();
               
                break;
            case 3:
                obj = HomePage.order.get(rowIndex+1).getOrderDate();
                break;
            case 4:
                obj = HomePage.order.get(rowIndex+1).getOrderTime();
                break;
            case 5:
                 if(rowIndex+1>=HomePage.customer.size()){
                   for(int i=1;i<=HomePage.customer.size();i++){
                       if(HomePage.customer.get(i).getCustomerId().equals(HomePage.order.get(rowIndex+1).getCustomerId())){
                           address = HomePage.customer.get(i).getAddress();
                            break;
                        }
                    }
                    obj = address;
                }
                else{
                obj = HomePage.customer.get(rowIndex+1).getAddress();
                 }
                break;
            case 6:
                obj = "Pending";
        }
        
       return obj;
    }
    
}
