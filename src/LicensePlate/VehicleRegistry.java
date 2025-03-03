package LicensePlate;

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registered;

    public VehicleRegistry(){
        this.registered = new HashMap<>();
    }

    public boolean add(LicensePlate liPlate, String owner){
        for(LicensePlate plate : registered.keySet()){
            if(plate.equals(liPlate)){
                return false;
            }
        }
        registered.put(liPlate,owner);

        return true;
    }

    public String get(LicensePlate liPlate){
        return registered.getOrDefault(liPlate, null);
    }

    public boolean remove(LicensePlate liPlate){
        if(!registered.containsKey(liPlate)) {
            return false;
        }

        registered.remove(liPlate);
        return true;
    }

    public void printLicensePlates(){
        for(LicensePlate plates: registered.keySet()){
            System.out.println(plates);
        }
    }

    public void printOwners(){
        ArrayList<String> owners = new ArrayList<>();

        for(String owner : registered.values()){
            if(!owners.contains(owner)){
                owners.add(owner);
            }
        }
        for (String owner: owners){
            System.out.println(owner);
        }
    }
}
