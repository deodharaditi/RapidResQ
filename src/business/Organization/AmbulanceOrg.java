/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Role.AmbulanceRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aditi
 */
public class AmbulanceOrg extends Organization {

    public AmbulanceOrg(String name) {
        super(name);
    }

    public AmbulanceOrg() {
        super(Organization.Type.AmbulanceOrg.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AmbulanceRole());
        return roles;
    }

}
