package com.game;

public class SwordFactory implements WeaponFactory {

	@Override
	public Weapon createWeapon() {
		// TODO Auto-generated method stub
		return new Sword();
	}

	@Override
	public PowerUp createPowerUp() {
		// TODO Auto-generated method stub
		return new HealthPotion();
	}

}
