package LicensePlate;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class LicensePlate {
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber){
        this.country = country;
        this.liNumber = liNumber;
    }

    @Override
    public String toString(){
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object object){
        if(object == null || this.getClass() != object.getClass()){
            return false;
        }

        if(object == this){
            return true;
        }

        LicensePlate compared = (LicensePlate) object;

        return (this.liNumber.equals(compared.liNumber) &&
                this.country.equals(compared.country));
    }

    @Override
    public int hashCode(){
        if(this.liNumber == null){
            return this.country.hashCode();
        }

        return this.liNumber.hashCode();
    }

    public static void main(String[] args){
        LicensePlate li1 = new LicensePlate("FI" , "ABC-123");
        LicensePlate li2 = new LicensePlate("FI" , "UXE-456");
        LicensePlate li3 = new LicensePlate("D" , "B WQ-431");

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if(!finnishPlates.contains(newLi)){
            finnishPlates.add(newLi);
        }

        System.out.println("Finish: " + finnishPlates);

        HashMap<LicensePlate, String> owners = new HashMap<>();
        owners.put(li1, "Arto");
        owners.put(li3, "Jurgen");

        System.out.println("Owners: ");
        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));

    }
}
