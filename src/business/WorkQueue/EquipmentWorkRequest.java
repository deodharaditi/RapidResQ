/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

import business.Network.Network;
import business.Organization.Organization;
import java.util.Date;

/**
 *
 * @author aditi
 */
public class EquipmentWorkRequest extends WorkRequest {

    private Organization senderOrganization;
    private Organization recieverOrganization;
    private Network senderNetwork;
    private Network recieverNetwork;
    private String EquipmentRequestId;
    private String EquipmentId;
    private String EquipmentName;
    private String Reason;
    private int noOfUnits;
    private double equipmentPrice;
    private String status;
    Date requestdate;
    Date acknowledgeDate;
    Date resolveDate;
    int min = 100;
    int max = 999;

    public EquipmentWorkRequest() {
        int randomNum = (int) (Math.random() * (max - min + 1) + min);
        EquipmentRequestId = "EQUIP" + randomNum;
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

    public String getEquipmentRequestId() {
        return EquipmentRequestId;
    }

    public void setEquipmentRequestId(String EquipmentRequestId) {
        this.EquipmentRequestId = EquipmentRequestId;
    }

    public String getEquipmentId() {
        return EquipmentId;
    }

    public void setEquipmentId(String EquipmentId) {
        this.EquipmentId = EquipmentId;
    }

    public String getEquipmentName() {
        return EquipmentName;
    }

    public void setEquipmentName(String EquipmentName) {
        this.EquipmentName = EquipmentName;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public int getNoOfUnits() {
        return noOfUnits;
    }

    public void setNoOfUnits(int noOfUnits) {
        this.noOfUnits = noOfUnits;
    }

    public double getEquipmentPrice() {
        return equipmentPrice;
    }

    public void setEquipmentPrice(double equipmentPrice) {
        this.equipmentPrice = equipmentPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestdate() {
        return requestdate;
    }

    public void setRequestdate(Date requestdate) {
        this.requestdate = requestdate;
    }

    public Date getAcknowledgeDate() {
        return acknowledgeDate;
    }

    public void setAcknowledgeDate(Date acknowledgeDate) {
        this.acknowledgeDate = acknowledgeDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

}
