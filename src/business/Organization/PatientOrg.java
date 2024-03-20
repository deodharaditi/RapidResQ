/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Role.PatientRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aditi
 */
public class PatientOrg extends Organization {

    public PatientOrg(String name) {
        super(name);
    }

    public PatientOrg() {
        super(Organization.Type.PatientOrg.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PatientRole());
        return roles;
    }

}
