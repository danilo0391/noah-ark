package entities;

import entities.enums.*;

public abstract class Animal {

	private String name;
	private Gender gender;
	private TypeOfAnimal typeOfAnimal;

	public Animal() {
	}

	public Animal(String name, Gender gender, TypeOfAnimal typeOfAnimal) {
		this.name = name;
		this.gender = gender;
		this.typeOfAnimal = typeOfAnimal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public TypeOfAnimal getTypeOfAnimal() {
		return typeOfAnimal;
	}

	public void setTypeOfAnimal(TypeOfAnimal typeOfAnimal) {
		this.typeOfAnimal = typeOfAnimal;
	}

	abstract void searchForFood();

}
