/**
 * 
 */
package com.mahmud.Simple_VirtualPackage;

import java.util.LinkedList;
import java.util.List;

import com.mahmud.Simple_VirtualPackage.classes.Animal;
import com.mahmud.Simple_VirtualPackage.classes.Dog;
import com.mahmud.Simple_VirtualPackage.classes.Fish;
import com.mahmud.Simple_VirtualPackage.classes.Goldfish;
import com.mahmud.Simple_VirtualPackage.classes.IAnimal;
import com.mahmud.Simple_VirtualPackage.classes.MyDog;
import com.mahmud.Simple_VirtualPackage.classes.OtherAnimal;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {

	/**
	 * 
	 */
	public MainProgram() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Animal> animals = new LinkedList<>();
		
		animals.add(new Animal());
		animals.add(new Fish());
		animals.add(new Goldfish());
		animals.add(new OtherAnimal());
		
		System.out.println("\n\n");
		
        animals.stream().forEach((currentAnimal) -> {
            currentAnimal.eat();
            if(currentAnimal instanceof Fish) {
            	if(currentAnimal instanceof Goldfish) {
                    currentAnimal.breathe("Goldfish");
            		IAnimal.sleep("Goldfish");
            	} else {
                    currentAnimal.breathe();
            		((Fish) currentAnimal).sleep();
            		
            		// currentAnimal.sleep();
            		// Compiler Error
            		// The method sleep() is undefined 
            		// for the type Animal
            		
                    // IAnimal iAnimal = currentAnimal;
                    // iAnimal.sleep();
                    // Compiler Error
                    // This static method of interface 
                    // IAnimal can only be accessed as 
                    // IAnimal.sleep
                    
            	}
            } else {
            	currentAnimal.breathe();
        		IAnimal.sleep();
        	}
        });

		Dog dog = new MyDog();       // Create a MyDog and assign to plain Dog variable
        dog.bark();
		dog.jump();
	}

}
