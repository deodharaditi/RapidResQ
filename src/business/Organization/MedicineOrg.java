/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Medication.Medicine;
import business.Role.MedicineAdminRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aditi
 */
public class MedicineOrg extends Organization {

    private ArrayList<Medicine> medList;

    public MedicineOrg(String name) {
        super(name);
        medList = new ArrayList<Medicine>();
    }

    public MedicineOrg() {
        super(Organization.Type.MedicineOrg.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MedicineAdminRole());
        return roles;
    }

    public ArrayList<Medicine> getMedList() {
        return medList;
    }

    public void setMedList(ArrayList<Medicine> medList) {
        this.medList = medList;
    }

    public void addMedicine(Medicine mi) {
        medList.add(mi);
    }

}
