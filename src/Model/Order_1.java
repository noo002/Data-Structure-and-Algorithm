/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Wee Kian Huat
 */
public class Order_1 {
    public String dManID, oID, fID, dManName, branch;  //deliveryman ID, order ID, food ID, customer ID
    Date time;

    public Order_1(String dManID, String oID, String dManName, String fID, String branch,Date time) {
        this.dManID = dManID;
        this.oID = oID;
        this.dManName = dManName;
        this.fID = fID;
        this.branch = branch;
        this.time = time; 
    }

    public String getBranch() {
        return branch;
    }

    public Date getTime() {
        return time;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getdManID() {
        return dManID;
    }

    public String getoID() {
        return oID;
    }

    public String getfID() {
        return fID;
    }

    public String getdManName() {
        return dManName;
    }

    public void setdManID(String dManID) {
        this.dManID = dManID;
    }

    public void setoID(String oID) {
        this.oID = oID;
    }

    public void setfID(String fID) {
        this.fID = fID;
    }
    
    public void dManName(String cID) {
        this.dManName = dManName;
    }
    
    @Override
    public String toString (){
        return dManID + "\t" + oID + "\t" + fID + "\t" + dManName + "\t" + branch + "\t" + time + "\t"; 
    }
    
}
