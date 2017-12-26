package Model;

import ADT.DeliverymanInterface;

public class Deliveryman1 implements DeliverymanInterface {

    String name;
    String phNumber;
    String Status;
    String address;
    String workStatus;
    String CustOrder;

    public Deliveryman1() {

    }

    public Deliveryman1(String name, String phNumber, String Status, String address, String workStatus, String CustOrder) {
        this.name = name;
        this.phNumber = phNumber;
        this.Status = Status;
        this.address = address;
        this.workStatus = workStatus;
        this.CustOrder = CustOrder;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPhNumber() {
        return phNumber;
    }

    @Override
    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }

    @Override
    public String getStatus() {
        return Status;
    }

    @Override
    public void setStatus(String Status) {
        this.Status = Status;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-15s %-7s %-22s %-20s %-12s", name, phNumber, Status, address, workStatus, CustOrder);
    }

    @Override
    public int compareTo(DeliverymanInterface d) {
        return this.getName().compareTo(d.getName());
    }

    @Override
    public void setCustOrder(String CustOrder) {
        this.CustOrder=CustOrder;
    }

    @Override
    public String getCustOrder() {

        return CustOrder;
    }

}
