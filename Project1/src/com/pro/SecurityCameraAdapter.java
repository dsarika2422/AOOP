package com.pro;
class SecurityCameraAdapter implements Device{
	private SecurityCamera camera;
	public SecurityCameraAdapter(SecurityCamera camera) {
        this.camera = camera;
    }
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		camera.activate();
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		 camera.deactivate();
	}

}
