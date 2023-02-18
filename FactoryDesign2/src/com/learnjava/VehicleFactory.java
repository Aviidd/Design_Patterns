package com.learnjava;

public class VehicleFactory {
    public Vehicle getVehicle(String VehicleName){
        if(VehicleName == null){
            return null;
        }
        if(VehicleName.equalsIgnoreCase("two wheeler")){
            return new Twowheeler();
        }
        if(VehicleName.equalsIgnoreCase("three wheeler")){
            return new Threewheeler();
        }
        if(VehicleName.equalsIgnoreCase("four wheeler")){
            return new Fourwheeler();
        }
        return null;
    }

}
