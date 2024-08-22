package com.game;

public class GoblinFactory extends EnemyFactory {

	@Override
	public Enemy createEnemy() {
		// TODO Auto-generated method stub
		return new Goblin();
	}

}
