/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

import business.Network.Network;
import business.Organization.Organization;
import business.Stakeholders.Doctor;
import business.Stakeholders.Patient;
import java.util.Date;

/**
 *
 * @author aditi
 */
public class LabTestWorkRequest extends WorkRequest {

    private Organization senderOrganization;
    private Organization recieverOrganization;
    private Network senderNetwork;
    private Network recieverNetwork;
    private String LabTestRequestId;
    private Patient patient;
    private Doctor doctor;
    private String patientId;
    private String labTestName;
    private String labTestAdminFeedback;
    Date requestdate;
    Date acknowledgeDate;
    Date resolveDate;
    String status;
    int min = 100;
    int max = 999;

    public LabTestWorkRequest() {
        int randomNum = (int) (Math.random() * (max - min + 1) + min);
        LabTestRequestId = "LR" + randomNum;
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

    public String getLabTestRequestId() {
        return LabTestRequestId;
    }

    public void setLabTestRequestId(String LabTestRequestId) {
        this.LabTestRequestId = LabTestRequestId;
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

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getLabTestName() {
        return labTestName;
    }

    public void setLabTestName(String labTestName) {
        this.labTestName = labTestName;
    }

    public String getLabTestAdminFeedback() {
        return labTestAdminFeedback;
    }

    public void setLabTestAdminFeedback(String labTestAdminFeedback) {
        this.labTestAdminFeedback = labTestAdminFeedback;
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
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
