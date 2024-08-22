package com.game;

public class GameStore {
	private static GameStore instance;
    private int currentLevel;
    private String difficulty;

    private GameStore() {
        currentLevel = 1;
        difficulty = "Easy";
    }

    public static GameStore getInstance() {
        if (instance == null) {
            instance = new GameStore();
        }
        return instance;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}
