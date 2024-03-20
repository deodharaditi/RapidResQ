/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.JSONUtil;

import business.EcoSystem;

/**
 *
 * @author aditi
 */
public class Store {

    private static String filename = "rapid-resq.json";
    private static JsonSerializer serializer = new JsonSerializer("business");

    public static void setFilename(String filename) {
        Store.filename = filename;
    }

    public static void save(EcoSystem ecoSystem) {
        serializer.serialize(ecoSystem, filename);
    }

    public static EcoSystem load() {
        var ecoSystem = (EcoSystem) serializer.deserialize(filename);
        if (ecoSystem == null) {
            ecoSystem = EcoSystem.getInstance();
        } else {
            // Reinitialize code if needed
        }
        return ecoSystem;
    }

    public static void update(EcoSystem ecoSystem) {
        serializer.delete_file(filename);
        save(ecoSystem);
    }

    public static void delete() {
        serializer.delete_file(filename);
    }

}
