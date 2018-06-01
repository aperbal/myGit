package com.oc.test;

public class Chien extends Animal implements Rintintin{
	
	public String shout() {
		return "The dog " + this.animalName + " barks.";			
	}
	
	public String move(String place) {
		return "The dog " + this.animalName + " runs to " + place + ".";			
	}

	public Chien(String name, String color, int weight) {
		super.animalName = name;
		super.animalName = color;
		super.animalWeigth = weight;
	}	
	
	public void hug() {System.out.println("Please hug me ! ...");}
	public void lick() {System.out.println("Come here so I lick your face master :) !");}
	public void sitUpAndBeg() {System.out.println("Yes, I sit up and beg for you master...");}
}
