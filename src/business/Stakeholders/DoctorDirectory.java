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
public class DoctorDirectory {

    private ArrayList<Doctor> doctorList;

    public DoctorDirectory() {
        this.doctorList = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    public Doctor addNewDoctor(String fullName, String qualification, String specilization, Boolean emeDoc, String username) {
        Doctor doctor = new Doctor(fullName, qualification, specilization, emeDoc, username);
        doctorList.add(doctor);
        return doctor;
    }

    public void deleteDoctor(Doctor doctor) {
        doctorList.remove(doctor);
    }

    public void addDoctor(Doctor newDoctor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
