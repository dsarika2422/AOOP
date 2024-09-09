package com.pro;

public class SchedulingDecorator extends DeviceDecorator {
	public SchedulingDecorator(Device decoratedDevice) {
        super(decoratedDevice);
    }

    public void schedule(String time) {
        System.out.println("Scheduling device to turn ON at " + time);
    }
}

