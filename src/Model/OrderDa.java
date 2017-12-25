
package Model;

import Control.myList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class OrderDa {
    
    private String hostname = "jdbc:mysql://localhost:3306/delivery?zeroDateTimeBehavior=convertToNull";
    private String username = "root";
    private String password = "";
    private Connection conn;
    private Statement stmt;
    private PreparedStatement pstmt;
    private ResultSet rs;
    
        public OrderDa(){
        Connection();
    }
        public myList<order> getPendingDeliveries(){
            String sqlSelected = String.format("select orderid,`order`.customerid,orderdate,ordertime,address from `order`,customer where\n" +
"customer.customerid = `order`.customerid\n" +
"and `order`.orderstatus = 'pending'");
            myList<order> c = new myList<>();
            order order;
            try{
                stmt = conn.createStatement();
                rs = stmt.executeQuery(sqlSelected);
                while(rs.next()){
                    order = new order();
                    order.setOrderId(rs.getString("orderId"));
                    order.setCustomerId(rs.getString("customerId"));
                    order.setOrderDate(rs.getString("orderDate"));
                    order.setOrderTime(rs.getString("orderTime"));
                    c.add(order);
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.toString(),"FAILURE",JOptionPane.ERROR_MESSAGE);
            }
            return c;
        }
        
        public void Connection(){
        try{
            conn = DriverManager.getConnection(hostname,username,password);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Cannot Connection to Database",ex.toString(),JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void shutDown(){
        try{
            conn.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Cannot Close Database",ex.toString(),JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
