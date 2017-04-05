/**
 * 
 */
package com.mahmud.OC007PolymorphismPkg;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	private class Animal {
		
		private String name;

		/**
		 * @param name;
		 * 
		 */
		public Animal(String name) {
			// TODO Auto-generated constructor stub
			
			this.name = name;
		}
		
		protected void eat() throws Exception{
			System.out.println("\tGenecric Animal Eating Generically .");
			throw new Exception("Exception from Animal.eat()");
		}
		
		public void sleep(){
			System.out.println("\tAnimal Sleeping .....");
		}
		
//		public String sleep(){
//			System.out.println("\tAnimal Sleeping .....");
//			return "\tAnimal Sleeping .....";
//		}
		// Compiler Error
		// Duplicate method sleep() in type MainProgram.Animal
		
		public Animal getInstance(){
			return new Animal("Animal");
		}

		/**
		 * @return the name
		 */
		public synchronized final String getName() {
			return name;
		}

	}

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	private class Dog extends Animal {

		/**
		 * 
		 */
		public Dog() {
			// TODO Auto-generated constructor stub
			super("Dog");
		}
		
//		public String eat(){
//			System.out.println("\tDog is eating meat ");
//			return "\tDog is eating meat ";
//		}
		// Compiler Error
		// The return type is incompatible with 
		// MainProgram.Animal.eat()
		
		public void eat(String food){
			System.out.println("\tDog is eating " + food);
		}

		/* (non-Javadoc)
		 * @see com.mahmud.OC007PolymorphismPkg.MainProgram.Animal#getInstance()
		 */
		@Override
		public Dog getInstance() {
			// TODO Auto-generated method stub
			return new Dog();
		}

		/* (non-Javadoc)
		 * @see com.mahmud.OC007PolymorphismPkg.MainProgram.Animal#sleep()
		 */
		@Override
		public void sleep() throws RuntimeException {
			// TODO Auto-generated method stub
			
			int test = 1000;
			if(test < 100) {
				throw new RuntimeException();
			}
			
			super.sleep();
		}
		// Valid

//		/* (non-Javadoc)
//		 * @see com.mahmud.OC007PolymorphismPkg.MainProgram.Animal#sleep()
//		 */
//		@Override
//		public void sleep() throws Exception {
//			// TODO Auto-generated method stub
//			throw new Exception();
//		}
		// Compiler Error
		// Exception Exception is not compatible 
		// with throws clause in MainProgram.Animal.sleep()

	}

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	private class Horse extends Animal {

		/**
		 * 
		 */
		public Horse() {
			// TODO Auto-generated constructor stub
			super("Horse");
		}

		/* (non-Javadoc)
		 * @see com.mahmud.OC007PolymorphismPkg.MainProgram.Animal#eat()
		 */
		@Override
		public void eat() {
			// TODO Auto-generated method stub
			System.out.println(
					"\tHorse eating hay, oats, "
					+ "and horse treats .");
		}
		
//		/* (non-Javadoc)
//		 * @see com.mahmud.OC007PolymorphismPkg.MainProgram.Animal#eat()
//		 */
//		private void eat() {
//			// TODO Auto-generated method stub
//			System.out.println(
//					"\tHorse eating hay, oats, "
//					+ "and horse treats .");
//		}
		// Compiler Error
		// Cannot reduce the visibility of the inherited 
		// method from MainProgram.Animal

		public void jump(){
			System.out.println("\tHorse is jumping .....");
		}

		/* (non-Javadoc)
		 * @see com.mahmud.OC007PolymorphismPkg.MainProgram.Animal#getInstance()
		 */
		@Override
		public Animal getInstance() {
			// TODO Auto-generated method stub
			return new Horse();
		}
	}

	/**
	 * 
	 */
	public MainProgram() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n\n");
		
		MainProgram x = new MainProgram();
		
		Animal animal = x.new Horse();
		
		if(animal instanceof Horse){
			// animal.jump(); Illegal
			((Horse) animal).jump();
		}
		
		showEating(animal);
		
		// Reference is Animal
		// Object is Horse
		// showEating(Animal animal) will be called
		// It is called by reference
		
		Horse horse = (Horse) animal;
		
		showEating(horse);
		
		System.out.println();
		
		Animal animalDog = x.new Dog();
		Dog dog = (Dog) animalDog.getInstance();
		
		try {
			dog.eat();
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			System.err.println("\t" + ex.getMessage());
		}
		
		dog.eat("Meat");
		System.out.println(
				"\tdog.getName() = " + dog.getName());
//		
//		Animal anotherAnimal = dog;
//		try {
//			
//			anotherAnimal.eat("Meat"); // Compiler Error
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println();
		
		Dog[] dogs = {dog, 
				(Dog) animalDog.getInstance(), 
				x.new Dog()};
		Animal[] animals = dogs;
		
		int counter = 0;
		for (Animal anm : animals) {
			if(anm instanceof Dog){
				System.out.printf("\t[%d] ",
						counter);
				((Dog)anm).eat(" Biscuits");
			}
			counter++;
		}
		
//		Animal[] animals2 = new Animal[3];
//		dogs = animals2;
		
		// Compiler Error
		// Type mismatch: cannot convert from 
		// MainProgram.Animal[] to MainProgram.Dog[]
		
		System.out.println();
		
		System.out.printf("\tx.main(10, 15, 12) = \'%c\'", 
				x.main(10, 14, 12));
		
		System.out.println();
		
		Animal testAnimal = x.new Animal("Test");
		try{
			Dog testDog = (Dog) testAnimal;
			testDog.sleep();
		} catch (ClassCastException ex) {
			// TODO: handle exception
			
			System.err.println("\t" + ex.getMessage());
		}
		
		// for (Dog d : animals) { }
		
		// Compiler Error
		// Type mismatch: cannot convert from element 
		// type MainProgram.Animal to MainProgram.Dog
		
		// for (animal : animals) { }
		
		// Compiler Error
		// animal cannot be resolved to a type
		
		// for (Animal animal : animals) { }
		
		// Compiler Error
		// Duplicate local variable animal
	}

	private int main(int... intigers) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		char ch = 'o';
		
		for (int i : intigers) {
			sum += i;
		}
		
		if(sum % 2 == 0){
			ch = 'e';
		}
		
		return ch;
	}

	private static void showEating(Animal animal) {
		// TODO Auto-generated method stub
		
		System.out.println(
				"\tInside method : showEating(Animal animal)");
		
		try {
			animal.eat();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(animal instanceof Horse){
			((Horse)animal).eat();
		}
	}

	private static void showEating(Horse horse) {
		// TODO Auto-generated method stub

		System.out.println(
				"\tInside method : showEating(Horse horse)");
		
		horse.eat();
	}

}
