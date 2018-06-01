package com.oc.test;

abstract class Animal {
	
	protected String animalName;
	protected double animalWeigth;
	protected String animalColor;
	
	public void drink() {System.out.println(this.animalName + " drinks water.");}
	public void eat() {System.out.println(this.animalName + " eats meat.");}
	abstract String shout();
	abstract String move(String place);	
	
	protected Animal() {
		this.animalName = "Unknown";
		this.animalColor = "Unknown";
		this.animalWeigth = -1;
	}
	
	
	public String toString() {
		return "I am a object of " + this.getClass() + ", my name is " + this.animalName;
	}

}
