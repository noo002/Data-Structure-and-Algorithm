
package Model;

import Control.myList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class AddDeliveryManDa {
    
    private String hostname = "jdbc:mysql://localhost:3306/delivery?zeroDateTimeBehavior=convertToNull";
    private String username = "root";
    private String password = "";
    private Connection conn;
    private Statement stmt;
    private PreparedStatement pstmt;
    private ResultSet rs;
    
    public AddDeliveryManDa(){
        Connection();
    }
    
    public int updateDeliveryManDetail(deliveryMan d){
        int result = 0;
           String sqlSelected = String.format("update deliveryman\n" +
"set address = '%s' ,\n" +
"`status` = '%s',\n" +
"emergencyContactNo = '%s',\n" +
"contactNo = '%s' where\n" +
"deliveryManId = '%s'", d.getAddress(),d.getStatus(),d.getEmergencyContactNo(),d.getContactNo(),d.getDeliveryManId());
        
           try{
               stmt = conn.createStatement();
               result = stmt.executeUpdate(sqlSelected);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString(),ex.toString(),JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }
    
    public deliveryMan getDeliveryMan(String deliveryManId){
        deliveryMan d = new deliveryMan();
        String sqlSelected = String.format("select * from deliveryman where deliverymanid ='%s'",deliveryManId);
        try{
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlSelected);
            if(rs.next()){
            d.setAddress(rs.getString("address"));
            d.setContactNo(rs.getString("contactNo"));
            d.setEmergencyContactNo(rs.getString("emergencyContactNo"));
            d.setIcNo(rs.getString("icNo"));
            d.setLevel(rs.getString("level"));
            d.setName(rs.getString("name"));
            d.setStatus(rs.getString("status"));
            d.setDeliveryManId(rs.getString("deliverymanid"));
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString(),ex.toString(),JOptionPane.ERROR_MESSAGE);
        }
        return d;
    }
    
    public myList<deliveryMan> getDeliveryMan(){
        myList<deliveryMan> d = new myList<>();
        deliveryMan deliveryMan ;
        String sqlSelected = "select * from deliveryman";
        
        try{
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlSelected);
            while(rs.next()){
                deliveryMan = new deliveryMan();
                deliveryMan.setDeliveryManId(rs.getString("deliveryManId"));
                deliveryMan.setName(rs.getString("name"));
                deliveryMan.setStatus(rs.getString("status"));
                deliveryMan.setLevel(rs.getString("level"));
                deliveryMan.setAddress(rs.getString("address"));
                deliveryMan.setContactNo(rs.getString("ContactNo"));
                deliveryMan.setEmergencyContactNo(rs.getString("emergencyContactNo"));
                deliveryMan.setIcNo(rs.getString("icNo"));
                d.add(deliveryMan);
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString(),ex.toString(),JOptionPane.ERROR_MESSAGE);
        }
        
        return d;
    }
    
    public int addDeliveryMan(deliveryMan d){
        String sqlInserted = String.format("insert into deliveryman values('%s','%s','%s','%s','%s','%s')",
                d.getDeliveryManId(),d.getName(),d.getIcNo(),d.getContactNo(),d.getAddress(),d.getStatus());
        int result =0;
        try{
            stmt = conn.createStatement();
            result = stmt.executeUpdate(sqlInserted);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString(),ex.toString(),JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }
    
    public String getBiggestDeliveryManId(){
        String sqlSelected = "select deliverymanid from deliveryman order by deliverymanid desc";
        String oldDeliveryManId = "";
        try{
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlSelected);
            if(rs.next())
                oldDeliveryManId = rs.getString("deliverymanId");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString(),ex.toString(),JOptionPane.ERROR_MESSAGE);
        }
        return oldDeliveryManId;
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
