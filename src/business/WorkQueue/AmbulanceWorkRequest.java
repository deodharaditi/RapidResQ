/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

import business.Network.Network;
import business.Organization.Organization;
import business.Stakeholders.Ambulance;
import business.Stakeholders.Doctor;
import business.Stakeholders.Patient;
import java.util.Date;

/**
 *
 * @author aditi
 */
public class AmbulanceWorkRequest extends WorkRequest {

    private Organization senderOrganization;
    private Organization recieverOrganization;
    private Network senderNetwork;
    private Network recieverNetwork;
    private Patient patient;
    private String criticalityLevel; //low, medium, high
    Doctor EmergencyDoctor;
    Doctor patientLastDoctor;
    String emergencyRequestId;
    Ambulance ambulance;
    EmergencyWorkRequest emergencyPatientRequest;
    Date requestdate;
    Date acknowledgeDate;
    Date resolveDate;
    String Status;
    int min = 100;
    int max = 999;

    public AmbulanceWorkRequest() {
        int randomNum = (int) (Math.random() * (max - min + 1) + min);
        emergencyRequestId = "AM" + randomNum;

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

    public String getCriticalityLevel() {
        return criticalityLevel;
    }

    public void setCriticalityLevel(String criticalityLevel) {
        this.criticalityLevel = criticalityLevel;
    }

    public Doctor getEmergencyDoctor() {
        return EmergencyDoctor;
    }

    public void setEmergencyDoctor(Doctor EmergencyDoctor) {
        this.EmergencyDoctor = EmergencyDoctor;
    }

    public Doctor getPatientLastDoctor() {
        return patientLastDoctor;
    }

    public void setPatientLastDoctor(Doctor patientLastDoctor) {
        this.patientLastDoctor = patientLastDoctor;
    }

    public String getEmergencyRequestId() {
        return emergencyRequestId;
    }

    public void setEmergencyRequestId(String emergencyRequestId) {
        this.emergencyRequestId = emergencyRequestId;
    }

    public Ambulance getAmbulance() {
        return ambulance;
    }

    public void setAmbulance(Ambulance ambulance) {
        this.ambulance = ambulance;
    }

    public EmergencyWorkRequest getEmergencyPatientRequest() {
        return emergencyPatientRequest;
    }

    public void setEmergencyPatientRequest(EmergencyWorkRequest emergencyPatientRequest) {
        this.emergencyPatientRequest = emergencyPatientRequest;
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
}
