/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import business.JSONUtil.Store;

/**
 *
 * @author aditi
 */
public class RapidResQ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EcoSystem ecoSystem = ConfigureASystem.configure();

        Store.save(ecoSystem);
        ecoSystem = Store.load();
    }

}
