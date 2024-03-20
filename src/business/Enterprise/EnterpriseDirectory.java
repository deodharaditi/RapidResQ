/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author aditi
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {

        enterpriseList = new ArrayList();
    }

    public ArrayList<Enterprise> getEnterpriseList() {

        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {

        this.enterpriseList = enterpriseList;
    }

    public Enterprise createEnterprise(String name, Enterprise.EnterpriseType enterpriseType) {
        Enterprise enterprise = null;
        if (enterpriseType.getValue().equals(Enterprise.EnterpriseType.EmergencyEnt.getValue())) {
            enterprise = new EmergencyEnt(name);
            enterpriseList.add(enterprise);
        } else if (enterpriseType.getValue().equals(Enterprise.EnterpriseType.AccountingEnt.getValue())) {
            enterprise = new AccountingEnt(name);
            enterpriseList.add(enterprise);
        } else if (enterpriseType.getValue().equals(Enterprise.EnterpriseType.EquipmentEnt.getValue())) {
            enterprise = new EquipmentEnt(name);
            enterpriseList.add(enterprise);
        } else if (enterpriseType.getValue().equals(Enterprise.EnterpriseType.ManagementEnt.getValue())) {
            enterprise = new ManagementEnt(name);
            enterpriseList.add(enterprise);
        } else if (enterpriseType.getValue().equals(Enterprise.EnterpriseType.MedicineEnt.getValue())) {
            enterprise = new MedicineEnt(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }

    @Override
    public String toString() {
        return "EnterpriseDirectory{" + "enterpriseList=" + enterpriseList + '}';
    }
}
