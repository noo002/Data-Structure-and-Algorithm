
package Model;

import Control.myList;
import javax.swing.table.AbstractTableModel;

public class PendingDeliveriesTableModel extends AbstractTableModel{
    
    myList<order> order = new myList<>();
    myList<customer> customer = new myList<>();
    String[] columnHeader = {"Order ID","Customer ID","Order Date","Order Time","Address"};
    CustomerDa customerDa = new CustomerDa();
    OrderDa orderDa = new OrderDa();
    
    public PendingDeliveriesTableModel(){
       order = orderDa.getPendingDeliveries();
       customer = customerDa.getPendingDeliveriesAddress();
    }
    @Override
    public int getRowCount() {
        return order.size();
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
        order o = order.get(rowIndex+1);
        customer c = customer.get(rowIndex+1);
        // String[] columnHeader = {"Order ID","Customer ID","Order Date","Order Time","Address"};
        switch(columnIndex){
            case 0:
                obj = o.getOrderId();
                break;
            case 1:
                obj = o.getCustomerId();
                break;
            case 2:
                obj = o.getOrderDate();
                break;
            case 3:
                obj = o.getOrderTime();
                break;
            case 4:
                obj = c.getAddress();
                
        }
        return obj;
    }
    
}
