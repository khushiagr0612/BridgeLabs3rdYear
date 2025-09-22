package com.gla.singleinheritance;

class Device {
    private String deviceId;
    private String status; // e.g., ON or OFF

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getStatus() {
        return status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}

// Subclass Thermostat
class Thermostat extends Device {
    private int temperatureSetting;

    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Test Class
public class SmartHomeTest {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("T1001", "ON", 24);
        thermostat.displayStatus();
    }
}