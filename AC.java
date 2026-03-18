package com.gla.interfaces.DefiningAndImplementingInterfaces.SmartDeviceControlInterfaces;

public class AC implements SmartDevice{
    @Override
    public void turnOn(){
        System.out.println("AC is Cooling");
    }
    @Override
    public void turnOff(){
        System.out.println("AC turned OFF");
    }
}