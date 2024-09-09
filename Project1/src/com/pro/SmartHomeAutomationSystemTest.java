package com.pro;

import static org.junit.Assert.fail;

import org.junit.Test;

public class SmartHomeAutomationSystemTest {
	 @Test
	    public void testLightControl() {
	        Device light = new Light();
	        try {
	            light.turnOn();
	            light.turnOff();
	        } catch (Exception e) {
	            fail("Exception should not have been thrown");
	        }
	    }

	    @Test
	    public void testThermostatControl() {
	        Device thermostat = new Thermostat();
	        try {
	            thermostat.turnOn();
	            thermostat.turnOff();
	        } catch (Exception e) {
	            fail("Exception should not have been thrown");
	        }
	    }

	    @Test
	    public void testSecurityCameraAdapter() {
	        SecurityCamera camera = new SecurityCamera();
	        Device cameraAdapter = new SecurityCameraAdapter(camera);
	        try {
	            cameraAdapter.turnOn();
	            cameraAdapter.turnOff();
	        } catch (Exception e) {
	            fail("Exception should not have been thrown");
	        }
	    }

	    @Test
	    public void testBasicDeviceController() {
	        Device light = new Light();
	        DeviceController controller = new BasicDeviceController();
	        try {
	            controller.controlDevice(light);
	        } catch (Exception e) {
	            fail("Exception should not have been thrown");
	        }
	    }

	    @Test
	    public void testSchedulingDecorator() {
	        Device light = new Light();
	        Device scheduledLight = new SchedulingDecorator(light);
	        try {
	            scheduledLight.turnOn();
	            scheduledLight.turnOff();
	            ((SchedulingDecorator) scheduledLight).schedule("08:00 AM");
	        } catch (Exception e) {
	            fail("Exception should not have been thrown");
	        }
	    }

	    @Test
	    public void testRemoteAccessDecorator() {
	        Device thermostat = new Thermostat();
	        Device remoteThermostat = new RemoteAccessDecorator(thermostat);
	        try {
	            remoteThermostat.turnOn();
	            remoteThermostat.turnOff();
	            ((RemoteAccessDecorator) remoteThermostat).enableRemoteAccess();
	        } catch (Exception e) {
	            fail("Exception should not have been thrown");
	        }
	    }
	}