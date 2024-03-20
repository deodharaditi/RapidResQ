/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import java.util.ArrayList;

/**
 *
 * @author aditi
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }

    public Organization createOrganization(Organization.Type type, String name) {
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.EmergencyOrg.getValue())) {
            organization = new EmergencyOrg(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.LabOrg.getValue())) {
            organization = new LabOrg(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.DoctorOrg.getValue())) {
            organization = new DoctorOrg(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.BillingOrg.getValue())) {
            organization = new BillingOrg(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.AmbulanceOrg.getValue())) {
            organization = new AmbulanceOrg(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.MedicineOrg.getValue())) {
            organization = new MedicineOrg(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.PatientOrg.getValue())) {
            organization = new PatientOrg(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.EquipmentOrg.getValue())) {
            organization = new EquipmentOrg(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.ReceptionistOrg.getValue())) {
            organization = new ReceptionistOrg(name);
            organizationList.add(organization);
        }
        return organization;
    }

}
