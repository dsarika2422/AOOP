package com.pro;

public class RemoteAccessDecorator extends DeviceDecorator{
	 public RemoteAccessDecorator(Device decoratedDevice) {
	        super(decoratedDevice);
	    }

	    public void enableRemoteAccess() {
	        System.out.println("Remote access enabled for the device");
	    }
	}

