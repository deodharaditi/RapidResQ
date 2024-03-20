/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Equipment;

import java.util.ArrayList;

/**
 *
 * @author aditi
 */
public class EquipmentDirectory {

    private ArrayList<Equipment> equipmentList;

    public EquipmentDirectory() {
        this.equipmentList = new ArrayList();
    }

    public ArrayList<Equipment> getEquipmentList() {
        return equipmentList;
    }

    public void setEquipmentList(ArrayList<Equipment> equipmentList) {
        this.equipmentList = equipmentList;
    }

    public Equipment addEquipment(String equipmetName, String Desc, String availableQuant, double cost, double totalcost) {
        Equipment equipment = new Equipment(equipmetName, Desc, availableQuant, cost, totalcost);
        equipmentList.add(equipment);
        return equipment;

    }

    public Equipment addNewEquipment(String equipmentId, String equipmentName, String equipmentReqID, double equipmentPrice, String totalQuantity) {
        Equipment equipment = new Equipment(equipmentId, equipmentName, equipmentReqID, equipmentPrice, totalQuantity);
        equipmentList.add(equipment);
        return equipment;
    }

}
