package entities;

import entities.enums.Gender;
import entities.enums.TypeOfAnimal;

public class Lion extends Animal {

	private Integer age;

	public Lion() {
		super();
	}

	public Lion(String name, Gender gender, TypeOfAnimal typeOfAnimal, int age) {
		super(name, gender, typeOfAnimal);
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public void searchForFood() {
		System.out.println("Lion eats meat, go to the savanna to find some food!");

	}

	@Override
	public String toString() {
		return "Lion -> Name: " + getName()
				+ ", gender: " + getGender()
				+ ", type of animal: " + getTypeOfAnimal();
	}
	
	
	
	

}
