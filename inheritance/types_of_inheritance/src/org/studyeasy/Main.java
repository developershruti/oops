package org.studyeasy;

import animal.reptile.Reptile ;
import animal.reptile.Crocodile;
import animal.fish.Eel;
import animal.bird.Eagle;

public class Main {

	public static void main(String[] args) {
		//Animal animal = new Animal();
		//System.out.println(animal.toString());
		Reptile reptile = new Reptile();
		System.out.println(reptile.showinfo());
		Crocodile croc = new Crocodile();
		System.out.println(croc.showinfo());
		Eel eel = new Eel();
		System.out.println(eel.showinfo());
		Eagle eagle = new Eagle();
		System.out.println(eagle.showinfo());
		
		
	}

}
