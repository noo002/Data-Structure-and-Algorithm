/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Control.myList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class CustomerDa {
    
    private String hostname = "jdbc:mysql://localhost:3306/delivery?zeroDateTimeBehavior=convertToNull";
    private String username = "root";
    private String password = "";
    private Connection conn;
    private Statement stmt;
    private PreparedStatement pstmt;
    private ResultSet rs;
    
        public CustomerDa(){
        Connection();
    }
        
        public myList<customer> getPendingDeliveriesAddress(){
            String sqlSelected = String.format("select orderid,`order`.customerid,orderdate,ordertime,address from `order`,customer where\n" +
"customer.customerid = `order`.customerid\n" +
"and `order`.orderstatus = 'pending'");
            myList<customer> c = new myList<>();
            customer customer;
            try{
                stmt = conn.createStatement();
                rs = stmt.executeQuery(sqlSelected);
                while(rs.next()){
                    customer = new customer();
                    customer.setAddress(rs.getString("address"));
                    c.add(customer);
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
