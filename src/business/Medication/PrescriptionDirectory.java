/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Medication;

import java.util.ArrayList;

/**
 *
 * @author aditi
 */
public class PrescriptionDirectory {

    private ArrayList<Prescription> prescriptionList;

    public PrescriptionDirectory() {
        prescriptionList = new ArrayList<Prescription>();
    }

    public ArrayList<Prescription> getPrescriptionList() {
        return prescriptionList;
    }

    public void setPrescriptionList(ArrayList<Prescription> prescriptionList) {
        this.prescriptionList = prescriptionList;
    }

    public Prescription addPrescription(Prescription p) {
        Prescription prescription = new Prescription();
        prescriptionList.add(prescription);
        return prescription;

    }

}
