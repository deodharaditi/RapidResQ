/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Medication;

import java.util.ArrayList;

/**
 *
 * @author aditi
 */
public class MedicineDirectory {

    private ArrayList<Medicine> medicineList;

    public MedicineDirectory() {
        medicineList = new ArrayList<>();
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }

    public Medicine addMedicine(int productId, String medicineName, String expiryDate, int availQuantity, double sellingPrice) {
        Medicine mi = new Medicine(productId, medicineName, expiryDate, availQuantity, sellingPrice);
        medicineList.add(mi);
        return mi;
    }

    public void deleteMedicine(Medicine mi) {
        medicineList.remove(mi);
    }

}
