package com.gla.interfaces.DefiningAndImplementingInterfaces.SmartDeviceControlInterfaces;

public class Main {
    public static void main(String[] args) {
        SmartDevice light = new Light();
        SmartDevice ac = new AC();
        SmartDevice tv = new TV();
        light.turnOn();
        ac.turnOn();
        tv.turnOn();
        light.turnOff();
    }
}
