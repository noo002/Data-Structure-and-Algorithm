/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Wee Kian Huat
 */
public class Deliveryman_1 {
    String id, name, branch, breakTimeOut, breakTimeIn, clockInTime, clockOutTime;
    boolean status;
    int noOfDeliveryman;
    
    public Deliveryman_1(){
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.status = status;
        this.clockInTime = clockInTime;
        this.clockOutTime = clockOutTime;
    }

    public Deliveryman_1(String id, String name, String branch, String breakTimeOut, String breakTimeIn, boolean status, String clockInTime, String clockOutTime) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.breakTimeOut = breakTimeOut;
        this.breakTimeIn = breakTimeIn;
        this.status = status;
        this.clockInTime = clockInTime;
        this.clockOutTime = clockOutTime;
        noOfDeliveryman++;
    }

    public Deliveryman_1(String id, String name, String branch, boolean status){
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.status = status;
        this.clockInTime = clockInTime;
        this.clockOutTime = clockOutTime;
        this.noOfDeliveryman++;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public String getBreakTimeOut() {
        return breakTimeOut;
    }

    public String getBreakTimeIn() {
        return breakTimeIn;
    }

    public boolean status() {
        return status;
    }

    public String getClockInTime() {
        return clockInTime;
    }

    public String getClockOutTime() {
        return clockOutTime;
    }

    public int getNoOfDeliveryman() {
        return noOfDeliveryman;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setBreakTimeOut(String breakTimeOut) {
        this.breakTimeOut = breakTimeOut;
    }

    public void setBreakTimeOIn(String breakTimeIn) {
        this.breakTimeIn = breakTimeIn;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setClockInTime(String clockInTime) {
        this.clockInTime = clockInTime;
    }

    public void setClockOutTime(String clockOutTime) {
        this.clockOutTime = clockOutTime;
    }

    public void setNoOfDeliveryman(int noOfDeliveryman) {
        this.noOfDeliveryman = noOfDeliveryman;
    }
   
    @Override
    public String toString (){
        return id + "\t" + name + "\t" + branch + "\t" + clockInTime + "\t" + clockOutTime + "\t" + status + "\t" + breakTimeOut + "\t" + breakTimeIn + "\t"; 
    }
    
}