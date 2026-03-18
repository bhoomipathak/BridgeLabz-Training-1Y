package com.gla.Inheritance.SingleInheritance.SmartHomeDevices;
class Main {
    public static void main(String[] args) {
        Thermostat t = new Thermostat();
        t.deviceId=1;
        t.status="On";
        t.temperatureSetting=24.5;
        t.displayStatus();
    }
}
