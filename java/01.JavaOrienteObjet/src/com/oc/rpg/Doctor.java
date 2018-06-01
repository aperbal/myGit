package com.oc.rpg;

public class Doctor extends Character {
	
	public Doctor () {
		this.movingStyle = new Walk();
		this.fightingStyle = new PacifistFight();
	}

	public Doctor (MovingStyle movingStyle, FightingStyle fightingStyle, String name) {
		super(movingStyle, fightingStyle, name);
	}

}
