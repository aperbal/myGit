package com.oc.rpg;

public abstract class Character {
	
	protected MovingStyle movingStyle;
	protected String characterName;
	protected FightingStyle fightingStyle;

	public Character() {
		this.movingStyle = new Walk();
		this.characterName = "Unknown";
	}
	
	public Character (MovingStyle movingStyle, FightingStyle fightingStyle, String name) {
		this.movingStyle = movingStyle;
		this.fightingStyle = fightingStyle;
		this.characterName = name;
	}
	
	public void LearnMovingStyle (MovingStyle movingStyle) {
		this.movingStyle = movingStyle;
	}
	
	public void LearnFightingStyle (FightingStyle fightingStyle) {
		this.fightingStyle = fightingStyle;
	}
	
	public void setCharacterName (String name) {
		this.characterName = name;
	}
	
	public void Move() {
		this.movingStyle.HowToMove();
	}
	
	public void Fight() {
		this.fightingStyle.HowToFight();
	}
	
	public String toString () {
		return "I'm a character of " + this.getClass() + " and my name is : " + this.characterName + ".";
	}
	
}
