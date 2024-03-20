/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Stakeholders;

import java.util.Date;

/**
 *
 * @author aditi
 */
public class Doctor {

    private String patientName;
    private int age;
    private String Gender;
    private String qualification;
    private Date practicingfrom;
    private String specilizationName;
    private String DocName;
    private Boolean emergencyDoctor;
    private String username;

    public Doctor(String DocName, String qualification, String specilizationName, Boolean emergencyDoctor, String username) {
        this.qualification = qualification;
        this.specilizationName = specilizationName;
        this.DocName = DocName;
        this.emergencyDoctor = emergencyDoctor;
        this.username = username;
    }

    public Doctor(String doctorName, String specialization, int age, String qualification, String bloodGroup, boolean emergencyDoctor) {
        //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Date getPracticingfrom() {
        return practicingfrom;
    }

    public void setPracticingfrom(Date practicingfrom) {
        this.practicingfrom = practicingfrom;
    }

    public String getSpecilizationName() {
        return specilizationName;
    }

    public void setSpecilizationName(String specilizationName) {
        this.specilizationName = specilizationName;
    }

    public String getDocName() {
        return DocName;
    }

    public void setDocName(String DocName) {
        this.DocName = DocName;
    }

    public Boolean getEmergencyDoctor() {
        return emergencyDoctor;
    }

    public void setEmergencyDoctor(Boolean emergencyDoctor) {
        this.emergencyDoctor = emergencyDoctor;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
