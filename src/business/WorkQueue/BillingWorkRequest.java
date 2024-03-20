/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

import business.Equipment.Equipment;
import business.Network.Network;
import business.Organization.Organization;

/**
 *
 * @author aditi
 */
public class BillingWorkRequest extends WorkRequest {

    private Organization senderOrganization;
    private Organization recieverOrganization;
    private Network senderNetwork;
    private Network recieverNetwork;
    private String billingRequestId;
    Equipment equipment;
    private String status;
    String Status;
    int min = 100;
    int max = 999;

    public BillingWorkRequest() {
        int randomNum = (int) (Math.random() * (max - min + 1) + min);
        billingRequestId = "BR" + randomNum;

    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public String getBillingRequestId() {
        return billingRequestId;
    }

    public void setBillingRequestId(String billingRequestId) {
        this.billingRequestId = billingRequestId;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Organization getSenderOrganization() {
        return senderOrganization;
    }

    public void setSenderOrganization(Organization senderOrganization) {
        this.senderOrganization = senderOrganization;
    }

    public Organization getRecieverOrganization() {
        return recieverOrganization;
    }

    public void setRecieverOrganization(Organization recieverOrganization) {
        this.recieverOrganization = recieverOrganization;
    }

    public Network getSenderNetwork() {
        return senderNetwork;
    }

    public void setSenderNetwork(Network senderNetwork) {
        this.senderNetwork = senderNetwork;
    }

    public Network getRecieverNetwork() {
        return recieverNetwork;
    }

    public void setRecieverNetwork(Network recieverNetwork) {
        this.recieverNetwork = recieverNetwork;
    }

    @Override
    public String toString() {
        return billingRequestId;
    }

}
