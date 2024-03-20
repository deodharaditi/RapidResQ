/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.VitalSigns;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author aditi
 */
public class VitalSigns {

    private int respiratoryRate;
    private int bloodPressure;
    private int weight;
    private int heartRate;
    private Date date;

    public VitalSigns(int respiratoryRate, int bloodPressure, int weight, int heartRate) {
        this.respiratoryRate = respiratoryRate;
        this.bloodPressure = bloodPressure;
        this.weight = weight;
        this.heartRate = heartRate;
    }

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public Date getDate() {
        SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yyyy 'at' hh:mm:ss a");
        return date;
    }

    public void setDate(Date date) {
        SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yyyy 'at' hh:mm:ss a");
        this.date = date;
    }

}
