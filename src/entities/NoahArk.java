package entities;

import java.util.ArrayList;
import java.util.List;

public class NoahArk {
		
	List<Animal> animals = new ArrayList<>();
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public void removeAnimal(Animal animal) {
		animals.remove(animal);
	}
	
	public void listOfAnimals() {
		for (Animal a : animals) {
			System.out.println(a);
		}
	}
	
	

}
