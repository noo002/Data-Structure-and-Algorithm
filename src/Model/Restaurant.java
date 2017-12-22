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
public class Restaurant {
    
    String resName,resAddress,ownerName,ownerEmail,password,area;
    int ownerContactNum,resContactNum;
    
    public Restaurant(){
        
    }
    public Restaurant(String resName, String resAddress, String ownerName, String ownerEmail, int ownerContactNum,int resContactNum,String password,String area){
        this.resName=resName;
        this.resAddress= resAddress;
        this.ownerName = ownerName;
        this.ownerEmail=ownerEmail;
        this.ownerContactNum=ownerContactNum;
        this.resContactNum = resContactNum;
        this.password=password;
        this.area=area;
    }

    public int getOwnerContactNum() {
        return ownerContactNum;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getResAddress() {
        return resAddress;
    }

    public String getResName() {
        return resName;
    }

    public int getResContactNum() {
        return resContactNum;
    }

    public String getPassword() {
        return password;
    }
    

    public void setOwnerContactNum(int ownerContactNum) {
        this.ownerContactNum = ownerContactNum;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setResAddress(String resAddress) {
        this.resAddress = resAddress;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public void setResContactNum(int resContactNum) {
        this.resContactNum = resContactNum;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }
    
}
