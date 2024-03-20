/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.VitalSigns;

import java.util.ArrayList;

/**
 *
 * @author aditi
 */
public class VitalSignsHistory {

    private ArrayList<VitalSigns> history;

    public VitalSignsHistory() {
        this.history = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }

    public VitalSigns addNewVitals(int respRate, int bp, int weight, int heartRate) {
        VitalSigns newVitals = new VitalSigns(respRate, bp, weight, heartRate);
        history.add(newVitals);
        return newVitals;

    }

    public void deleteVitals(VitalSigns vs) {
        history.remove(vs);

    }

}
