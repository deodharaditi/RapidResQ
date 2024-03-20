/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Role.EquipmentAdminRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aditi
 */
public class EquipmentOrg extends Organization {

    public EquipmentOrg(String name) {
        super(name);
    }

    public EquipmentOrg() {
        super(Organization.Type.EquipmentOrg.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EquipmentAdminRole());
        return roles;
    }

}
