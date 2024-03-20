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
import business.UserAccount.UserAccount;

/**
 *
 * @author aditi
 */
public class EmergencyWorkRequest extends WorkRequest {

    private Organization senderOrganization;
    private Organization recieverOrganization;
    private Network senderNetwork;
    private Network recieverNetwork;
    private Patient patient;
    Doctor EmergencyDoctor;
    String emergencyRequestId;
    Ambulance ambulance;
    String Status;
    UserAccount acceptedUser;
    int min = 100;
    int max = 999;

    public EmergencyWorkRequest() {
        int randomNum = (int) (Math.random() * (max - min + 1) + min);
        emergencyRequestId = "ER" + randomNum;

    }

    public Ambulance getAmbulance() {
        return ambulance;
    }

    public void setAmbulance(Ambulance ambulance) {
        this.ambulance = ambulance;
    }

    public UserAccount getAcceptedUser() {
        return acceptedUser;
    }

    public void setAcceptedUser(UserAccount acceptedUser) {
        this.acceptedUser = acceptedUser;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getEmergencyDoctor() {
        return EmergencyDoctor;
    }

    public void setEmergencyDoctor(Doctor EmergencyDoctor) {
        this.EmergencyDoctor = EmergencyDoctor;
    }

    public String getEmergencyRequestId() {
        return emergencyRequestId;
    }

    public void setEmergencyRequestId(String emergencyRequestId) {
        this.emergencyRequestId = emergencyRequestId;
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

//    public String getPatientName() {
//        System.out.println(patient.getPatientName());
//        return patient.getPatientName();
//    }
//
//    public void setPatientName(String patientName) {
//        this.patientName = patientName;
//    }
//
//    public int getPatientId() {
//        System.out.println(patient.getPatientId());
//        return patient.getPatientId();
//    }
//
//    public void setPatientId(int patientId) {
//        this.patientId = patientId;
//    }
    @Override
    public String toString() {
        return emergencyRequestId;
    }

}
