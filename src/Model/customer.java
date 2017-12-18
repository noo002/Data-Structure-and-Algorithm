/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Asus
 */
public class customer {
    
    private String customerId,address,contactNo,icNo,email,name;
    
    public customer(String customerId,String name, String ICNo, String ContactNo,String email, String Address ) {
        this.customerId = customerId;
        this.name = name;
        this.icNo =  ICNo; 
        this.contactNo = ContactNo;
       this.email = email; 
        this.address = Address;
        
    }

    

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getIcNo() {
        return icNo;
    }

    public void setIcNo(String icNo) {
        this.icNo = icNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
     public String toString(){
        return String.format("ID : %s \n Name : %s \n IC no : %s \n Contact No: %s \n Email: %s \n Address: %s \n",customerId,name,icNo,contactNo,email,address);
    }
}
