package com.game;

public class Main {
	public static void main(String[] args) {
       
        GameStore gameStore = GameStore.getInstance();
        gameStore.setDifficulty("Hard");
        System.out.println("Current Level: " + gameStore.getCurrentLevel());
        System.out.println("Difficulty: " + gameStore.getDifficulty());

        
        EnemyFactory goblinFactory = new GoblinFactory();
        Enemy goblin = goblinFactory.createEnemy();
        goblin.attack();

        EnemyFactory abcFactory = new abcFactory();
        Enemy abc = abcFactory.createEnemy();
        abc.attack();

        
        WeaponFactory swordFactory = new SwordFactory();
        Weapon sword = swordFactory.createWeapon();
        PowerUp healthPotion = swordFactory.createPowerUp();

        sword.use();
        healthPotion.activate();
    }
}
