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
public class deliveryMan {
    
    private String deliveryManId,name,icNo,contactNo,address,status,emergencyContactNo,level;

    public String getEmergencyContactNo() {
        return emergencyContactNo;
    }

    public deliveryMan() {
    }

    public deliveryMan(String deliveryManId, String name, String icNo, String contactNo, String address, String status, String emergencyContactNo, String level) {
        this.deliveryManId = deliveryManId;
        this.name = name;
        this.icNo = icNo;
        this.contactNo = contactNo;
        this.address = address;
        this.status = status;
        this.emergencyContactNo = emergencyContactNo;
        this.level = level;
    }
    
    

    public void setEmergencyContactNo(String emergencyContactNo) {
        this.emergencyContactNo = emergencyContactNo;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
    public String getDeliveryManId() {
        return deliveryManId;
    }

    public void setDeliveryManId(String deliveryManId) {
        this.deliveryManId = deliveryManId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcNo() {
        return icNo;
    }

    public void setIcNo(String icNo) {
        this.icNo = icNo;
    }
}
