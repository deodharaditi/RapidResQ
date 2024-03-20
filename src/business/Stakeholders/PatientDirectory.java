/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Stakeholders;

import java.util.ArrayList;

/**
 *
 * @author aditi
 */
public class PatientDirectory {

    private ArrayList<Patient> patientList;

    public PatientDirectory() {
        patientList = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public Patient addNewPatient(String fullName, String email, String phoneNumber, int age, String homeAddress,
            String userName, /*Date birthdate*/ String bloodGrp, String doctor, String gender, String location) {
        Patient patient = new Patient(fullName, email, phoneNumber, age, homeAddress, userName, bloodGrp, doctor, gender, location);
        patientList.add(patient);
        return patient;
    }

    public void addPatient(Patient patient) {
        this.patientList.add(patient);
    }

    public void deletePatient(Patient patient) {
        patientList.remove(patient);
    }

    public Patient addPatient(int patientId, String patientName, int age, String bloodGrp) {
        Patient patient = new Patient(patientId, patientName, age, bloodGrp);
        patientList.add(patient);
        return patient;
    }

}
