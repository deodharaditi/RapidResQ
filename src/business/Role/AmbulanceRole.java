/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.ambulance.ambulanceDetailsJPanel;

/**
 *
 * @author aditi
 */
public class AmbulanceRole extends Role {

    @Override
    public String toString() {
        return (RoleType.Ambulance.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel workArea, EcoSystem ecoSystem, Network network, Enterprise enterprise, Organization organization, UserAccount account) {
        return new ambulanceDetailsJPanel(workArea, ecoSystem, network, enterprise, organization, account);
    }

}
