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

/**
 *
 * @author aditi
 */
public abstract class Role {

    public enum RoleType {
        SystemAdmin("System Admin"),
        AccountingAdmin("Accounting Admin"),
        Patient("Patient"),
        Receptionist("Receptionist"),
        Doctor("Doctor"),
        EmergencyAdmin("Emergency Admin"),
        EmergencyDoctor("Emergency Doctor"),
        EquipmentAdmin("Equipment Admin"),
        Ambulance("Ambulance"),
        LabAssistant("Lab Assistant"),
        ManagementAdmin("Management Admin"),
        MedicineAdmin("Medicine Admin"),
        MedicineUser("Medicine User");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public RoleType type;

    public abstract JPanel createWorkArea(JPanel userProcessContainer, EcoSystem ecoSystem, Network network, Enterprise enterprise, Organization organization, UserAccount account);

    @Override
    public String toString() {
        return (type != null) ? this.type.getValue() : this.getClass().getName();
    }

}
