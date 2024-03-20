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
import ui.ManagementUnit.ManagementMainJPanel;

/**
 *
 * @author aditi
 */
public class ReceptionistRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, EcoSystem ecoSystem, Network network, Enterprise enterprise, Organization organization, UserAccount account) {
        //System.out.println(ecoSystem.getDoctorDirectory().getDoctorList());
        return new ManagementMainJPanel(userProcessContainer, ecoSystem, network, enterprise, organization, account);
    }

}
