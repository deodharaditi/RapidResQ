/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Medication;

import java.util.Date;

/**
 *
 * @author aditi
 */
public class Prescription {

    private int NoofTimesInaday;
    private int totalDays;
    private String daignosis;
    private String medicineName;
    private Date prescriptionDate;
    private String networkName;

    public int getNoofTimesInaday() {
        return NoofTimesInaday;
    }

    public void setNoofTimesInaday(int NoofTimesInaday) {
        this.NoofTimesInaday = NoofTimesInaday;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }

    public String getDaignosis() {
        return daignosis;
    }

    public void setDaignosis(String daignosis) {
        this.daignosis = daignosis;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public Date getPrescriptionDate() {
        return prescriptionDate;
    }

    public void setPrescriptionDate(Date prescriptionDate) {
        this.prescriptionDate = prescriptionDate;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

}
