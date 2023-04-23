package application;

import java.util.List;

import entities.Animal;
import entities.Giraffe;
import entities.Lion;
import entities.NoahArk;
import entities.Pig;
import entities.enums.Gender;
import entities.enums.TypeOfAnimal;

public class Program {

	public static void main(String[] args) {
		
		Animal g1 = new Giraffe("Georgina", Gender.FAMALE, TypeOfAnimal.HERBIVORE);
		Animal g2 = new Giraffe("Gluglu", Gender.MALE, TypeOfAnimal.HERBIVORE);
		
		Animal l1 = new Lion("Nala", Gender.FAMALE, TypeOfAnimal.CARNIVORE, 12);
		Animal l2 = new Lion("Simba", Gender.MALE, TypeOfAnimal.CARNIVORE, 14);
		
		Animal p1 = new Pig("Miss Piggy", Gender.FAMALE, TypeOfAnimal.OMNIVORE);
		Animal p2 = new Pig("Porky ", Gender.MALE, TypeOfAnimal.OMNIVORE);
		
		NoahArk noarArk = new NoahArk();
		noarArk.addAnimal(g1);
		noarArk.addAnimal(g2);
		noarArk.addAnimal(l1);
		noarArk.addAnimal(l2);
		noarArk.addAnimal(p1);
		noarArk.addAnimal(p2);
		
		noarArk.listOfAnimals();
	}
}
