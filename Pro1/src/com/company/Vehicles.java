
package com.company;

import com.company.Sort;

public class Vehicles implements Comparable {

    private String plate;
    private String activationDate;
    private int ownerId;

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(String activationDate) {
        this.activationDate = activationDate;
    }

    /*public int compareTo(Vehicles v) {
        int result = Sort.compare(this.plate, v.getPlate());
        return result;
    }*/

    @Override
    public int compareTo(Object o) {
        int result = 0;
        try {
            Vehicles v = (Vehicles) o;
            result = Sort.compare(this.plate, v.getPlate());
        }catch (ClassCastException e)
        {e.printStackTrace();}
        return result;
    }
}
