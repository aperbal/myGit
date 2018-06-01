package com.oc.rpg;

public class Warrior extends Character {
	
	public Warrior () {
		this.movingStyle = new Run();
		this.fightingStyle = new KnifeFight();
	}
	
	public Warrior (MovingStyle movingStyle, FightingStyle fightingStyle, String name) {
		super(movingStyle, fightingStyle, name);
	}
}
