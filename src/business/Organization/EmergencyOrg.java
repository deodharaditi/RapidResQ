/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Role.EmergencyAdminRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aditi
 */
public class EmergencyOrg extends Organization {

    public EmergencyOrg(String name) {
        super(name);
    }

    public EmergencyOrg() {
        super(Organization.Type.EmergencyOrg.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EmergencyAdminRole());
        return roles;
    }

}
