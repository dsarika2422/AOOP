package com.pro;

public class BasicDeviceController implements DeviceController{

	@Override
	public void controlDevice(Device device) {
		// TODO Auto-generated method stub
		 device.turnOn();
	        device.turnOff();
	}

}
