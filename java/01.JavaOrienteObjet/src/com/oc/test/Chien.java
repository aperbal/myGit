package com.oc.test;

public class Chien extends Animal {
	
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
	
	public void drink() {super.drink();}
	public void eat() {super.drink();}
}
