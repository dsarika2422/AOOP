package com.pro;

class Thermostat implements Device{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Thermostat is set to heating mode");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Thermostat is turned OFF");
	}

}
