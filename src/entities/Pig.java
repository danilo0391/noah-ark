package entities;

import entities.enums.Gender;
import entities.enums.TypeOfAnimal;

public class Pig extends Animal{
	
	public Pig() {
		super();
	}

	public Pig(String name, Gender gender, TypeOfAnimal typeOfAnimal) {
		super(name, gender, typeOfAnimal);
		// TODO Auto-generated constructor stub
	}

	@Override
	void searchForFood() {
		System.out.println("Pig eats everything!");
		
	}
	
	@Override
	public String toString() {
		return "Pig -> Name: " + getName()
				+ ", gender: " + getGender()
				+ ", type of animal: " + getTypeOfAnimal();
	}
	
	

}
