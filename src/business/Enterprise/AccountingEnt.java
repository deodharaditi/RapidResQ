/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aditi
 */
public class AccountingEnt extends Enterprise {

    public AccountingEnt(String name) {
        super(name, Enterprise.EnterpriseType.AccountingEnt);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();

        return roles;
    }

}
