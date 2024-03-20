/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Equipment;

/**
 *
 * @author aditi
 */
public class Equipment {

    private String equipmentID;
    private String equipmentReqId;
    private String equipmetName;
    private String availableQuant;
    private String desc;
    private double cost;
    private double TotalCost;
    int min = 100;
    int max = 999;

    public Equipment(String equipmetName, String desc, String availableQuant, double cost, double totalcost) {
        this.equipmentID = equipmentID;
        this.equipmetName = equipmetName;
        this.availableQuant = availableQuant;
        this.cost = cost;
        this.desc = desc;
        this.TotalCost = totalcost;
        int randomNum = (int) (Math.random() * (max - min + 1) + min);
        equipmentID = "EQ-" + randomNum;
    }

    public Equipment(String equipmentId, String equipmentName, String equipmentReqID, double equipmentPrice, String totalQuantity) {
        this.equipmentID = equipmentId;
        int randomNum = (int) (Math.random() * (max - min + 1) + min);
        this.equipmentID = "EQ-" + randomNum;
        this.equipmetName = equipmentName;
        this.cost = equipmentPrice;
        this.availableQuant = totalQuantity;
    }

    public String getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(String equipmentID) {
        this.equipmentID = equipmentID;
    }

    public String getEquipmetName() {
        return equipmetName;
    }

    public void setEquipmetName(String equipmetName) {
        this.equipmetName = equipmetName;
    }

    public String getAvailableQuant() {
        return availableQuant;
    }

    public void setAvailableQuant(String availableQuant) {
        this.availableQuant = availableQuant;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getTotalCost() {
        return TotalCost;
    }

    public void setTotalCost(double TotalCost) {
        this.TotalCost = TotalCost;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "Equipment{" + "equipmentID=" + equipmentID + ", equipmentReqId=" + equipmentReqId + ", equipmetName=" + equipmetName + ", availableQuant=" + availableQuant + ", desc=" + desc + ", cost=" + cost + ", TotalCost=" + TotalCost + ", min=" + min + ", max=" + max + '}';
    }

}
