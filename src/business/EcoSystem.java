/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import business.Network.Network;
import business.Enterprise.Enterprise;
import business.Enterprise.EnterpriseDirectory;
import business.Equipment.EquipmentDirectory;
import business.Medication.MedicineDirectory;
import business.Organization.Organization;
import business.Organization.OrganizationDirectory;
import business.Role.Role;
import business.Role.SystemAdminRole;
import business.Stakeholders.AmbulanceDirectory;
import business.Stakeholders.DoctorDirectory;
import business.Stakeholders.PatientDirectory;
import business.UserAccount.UserAccount;
import business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author aditi
 */
public class EcoSystem extends Organization {

    private static EcoSystem system;
    private ArrayList<Network> networkList;
    private UserAccountDirectory userAccountDirectory;
    private EnterpriseDirectory enterpriseDirectory;
    private OrganizationDirectory organizationDirectory;
    private PatientDirectory patientDirectory;
    private DoctorDirectory doctorDirectory;
    private AmbulanceDirectory ambulanceDirectory;
    private EquipmentDirectory equipmentList;
    private MedicineDirectory medicineDirectory;

    public static EcoSystem getInstance() {
        if (system == null) {
            system = new EcoSystem();
        }
        return system;
    }

    public EcoSystem() {
        super(null);
        networkList = new ArrayList<Network>();
        userAccountDirectory = new UserAccountDirectory();
        enterpriseDirectory = new EnterpriseDirectory();
        organizationDirectory = new OrganizationDirectory();
        patientDirectory = new PatientDirectory();
        doctorDirectory = new DoctorDirectory();
        ambulanceDirectory = new AmbulanceDirectory();
        equipmentList = new EquipmentDirectory();
        medicineDirectory = new MedicineDirectory();
    }

    public static EcoSystem getEcoSystem() {
        return system;
    }

    public static void setEcoSystem(EcoSystem system) {
        EcoSystem.system = system;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public Network addNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctroDirectory) {
        this.doctorDirectory = doctroDirectory;
    }

    public AmbulanceDirectory getAmbulanceDirectory() {
        return ambulanceDirectory;
    }

    public void setAmbulanceDirectory(AmbulanceDirectory ambulanceDirectory) {
        this.ambulanceDirectory = ambulanceDirectory;
    }

    public EquipmentDirectory getEquipmentList() {
        return equipmentList;
    }

    public void setEquipmentList(EquipmentDirectory equipmentList) {
        this.equipmentList = equipmentList;
    }

    public MedicineDirectory getMedicineDirectory() {
        return medicineDirectory;
    }

    public void setMedicineDirectory(MedicineDirectory medicineDirectory) {
        this.medicineDirectory = medicineDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public boolean checkIfUserIsUnique(String userName) {
        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
            return false;
        }

        for (Network network : this.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if (ua.getUsername().equalsIgnoreCase(userName)) {
                        return false;
                    }
                }
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getUsername().equalsIgnoreCase(userName)) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SystemAdminRole());
        return roles;
    }

    @Override
    public String toString() {
        return "EcoSystem{" + "networkList=" + networkList + ", enterpriseDirectory=" + enterpriseDirectory + ", organizationDirectory=" + organizationDirectory + ", patientDirectory=" + patientDirectory + ", doctorDirectory=" + doctorDirectory + ", ambulanceDirectory=" + ambulanceDirectory + ", equipmentList=" + equipmentList + '}';
    }

}
