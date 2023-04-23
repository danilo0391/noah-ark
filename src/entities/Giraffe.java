package entities;

import entities.enums.Gender;
import entities.enums.TypeOfAnimal;

public class Giraffe extends Animal{
	
	public Giraffe(){
		super();
	}

	public Giraffe(String name, Gender gender, TypeOfAnimal typeOfAnimal) {
		super(name, gender, typeOfAnimal);
	}


	@Override
	void searchForFood() {
		System.out.println("Giraffe eats plants, go to the fortest to find its food!");
	}
	
	@Override
	public String toString() {
		return "Giraffe -> Name: " + getName()
				+ ", gender: " + getGender()
				+ ", type of animal: " + getTypeOfAnimal();
	}
	
	
}
