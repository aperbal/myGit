package com.oc.test;

public class Loup extends Animal {
	
	public String shout() {
		return "The wolf " + this.animalName + " howls.";			
	}
	
	public String move(String place) {
		return "The wolf " + this.animalName + " walks to " + place + ".";			
	}
	
	public Loup(String name, String color, int weight) {
		super.animalName = name;
		super.animalName = color;
		super.animalWeigth = weight;
	}
	
	public void drink() {super.drink();}
	public void eat() {super.drink();}
	
}
