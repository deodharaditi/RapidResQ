/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

import business.Network.Network;
import business.Organization.Organization;
import business.Stakeholders.Doctor;
import business.Stakeholders.Patient;
import business.VitalSigns.VitalSigns;
import java.util.Date;

/**
 *
 * @author aditi
 */
public class GeneralDoctorWorkRequest extends WorkRequest {

    private Organization senderOrganization;
    private Organization recieverOrganization;
    private Network senderNetwork;
    private Network recieverNetwork;
    private Patient patient;
    private Doctor doctor;
    Date requestdate;
    Date acknowledgeDate;
    Date resolveDate;
    String Status;
    private VitalSigns checkUp;
    String checkupRequestId;
    int min = 100;
    int max = 999;

    public GeneralDoctorWorkRequest() {
        checkUp = new VitalSigns(min, min, min, max);
        int randomNum = (int) (Math.random() * (max - min + 1) + min);
        checkupRequestId = "CHK" + randomNum;
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

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
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

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public VitalSigns getCheckUp() {
        return checkUp;
    }

    public void setCheckUp(VitalSigns checkUp) {
        this.checkUp = checkUp;
    }

    public String getCheckupRequestId() {
        return checkupRequestId;
    }

    public void setCheckupRequestId(String checkupRequestId) {
        this.checkupRequestId = checkupRequestId;
    }

}
