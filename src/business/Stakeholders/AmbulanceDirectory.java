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
public class AmbulanceDirectory {

    private ArrayList<Ambulance> ambulanceList;

    public AmbulanceDirectory() {
        this.ambulanceList = new ArrayList<Ambulance>();
    }

    public ArrayList<Ambulance> getAmbulanceList() {
        return ambulanceList;
    }

    public void setAmbulanceList(ArrayList<Ambulance> ambulanceList) {
        this.ambulanceList = ambulanceList;
    }

    public Ambulance addNewAmbulance(String name, String number, String homeAddress) {
        Ambulance ambulance = new Ambulance(name, number, homeAddress);
        ambulanceList.add(ambulance);
        return ambulance;
    }

}
