package com.pro;

public abstract class DeviceDecorator implements Device{
	 protected Device decoratedDevice;

	    public DeviceDecorator(Device decoratedDevice) {
	        this.decoratedDevice = decoratedDevice;
	    }

	    public void turnOn() {
	        decoratedDevice.turnOn();
	    }

	    public void turnOff() {
	        decoratedDevice.turnOff();
	    }
	}

