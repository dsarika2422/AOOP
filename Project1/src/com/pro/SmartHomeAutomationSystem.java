package com.pro;

public class SmartHomeAutomationSystem {
	public static void main(String[] args) {
        // Create devices
        Device light = new Light();
        Device thermostat = new Thermostat();
        Device securityCamera = new SecurityCameraAdapter(new SecurityCamera());

        // Create controller
        DeviceController controller = new BasicDeviceController();

        // Control devices
        System.out.println("Controlling devices:");
        controller.controlDevice(light);
        controller.controlDevice(thermostat);
        controller.controlDevice(securityCamera);

        // Add scheduling to light
        Device scheduledLight = new SchedulingDecorator(light);
        scheduledLight.turnOn();
        ((SchedulingDecorator) scheduledLight).schedule("08:00 AM");

        // Add remote access to thermostat
        Device remoteThermostat = new RemoteAccessDecorator(thermostat);
        remoteThermostat.turnOn();
        ((RemoteAccessDecorator) remoteThermostat).enableRemoteAccess();
    }
}

