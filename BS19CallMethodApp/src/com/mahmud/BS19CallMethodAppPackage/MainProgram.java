/**
 * 
 */
package com.mahmud.BS19CallMethodAppPackage;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {
	
	/**
	 * @author Mahmudul Hasan Khan CSE
	 *
	 */
	public interface Animal {
	    default public String identifyMyself() {
	        return "I am an animal.";
	    }
	}

	/**
	 * @author Mahmudul Hasan Khan CSE
	 *
	 */
	public class Horse implements Animal {

		/* (non-Javadoc)
		 * @see com.mahmud.BS19CallMethodAppPackage.MainProgram.Animal#identifyMyself()
		 */
		@Override
		public String identifyMyself() {
			// TODO Auto-generated method stub
			return "I am a horse.";
		}
		
	}
	
	/**
	 * @author Mahmudul Hasan Khan CSE
	 *
	 */
	public interface Flyer {
	    default public String identifyMyself() {
	        return "I am able to fly.";
	    }
	}
	
	/**
	 * @author Mahmudul Hasan Khan CSE
	 *
	 */
	public interface Mythical {
	    default public String identifyMyself() {
	        return "I am a mythical creature.";
	    }
	}
	
	/**
	 * @author Mahmudul Hasan Khan CSE
	 *
	 */
	public class Pegasus extends Horse implements 
		Flyer, Mythical, Animal {
		
	}
	
	/**
	 * @author Mahmudul Hasan Khan CSE
	 *
	 */
	public interface EggLayer extends Animal {

		/* (non-Javadoc)
		 * @see com.mahmud.BS19CallMethodAppPackage.MainProgram.Animal#identifyMyself()
		 */
		@Override
		default String identifyMyself() {
			// TODO Auto-generated method stub
			return "I am able to lay eggs.";
		}
		
	}
	
	/**
	 * @author Mahmudul Hasan Khan CSE
	 *
	 */
	public interface FireBreather extends Animal {

//		/* (non-Javadoc)
//		 * @see com.mahmud.BS19CallMethodAppPackage.MainProgram.Animal#identifyMyself()
//		 */
//		@Override
//		default String identifyMyself() {
//			// TODO Auto-generated method stub
//			return "I breath Fire";
//		} 
		
		// Compiler Error
		// Duplicate default methods named 
		// identifyMyself with the parameters 
		// () and () are inherited from the 
		// types MainProgram.FireBreather and 
		// MainProgram.EggLayer
		
	}
	
	/**
	 * @author Mahmudul Hasan Khan CSE
	 *
	 */
	public class Dragon implements 
		EggLayer, FireBreather, Animal {

//		@Override
//		public String identifyMyself() {
//			// TODO Auto-generated method stub
//			return EggLayer.super.identifyMyself();
//		}
		
		// Must override
		// if both EggLayer and FireBreather
		// has the same method String identifyMyself()
	    
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
		Horse horse = x.new Pegasus();
		Flyer flyer = x.new Pegasus();
		Mythical mythical = x.new Pegasus();
		Pegasus pegasus = x.new Pegasus();
		
		Animal animal = x.new Dragon();
		
		System.out.println(
				"\t" + horse.identifyMyself());
		System.out.println(
				"\t" + flyer.identifyMyself());
		System.out.println(
				"\t" + mythical.identifyMyself());
		System.out.println(
				"\t" + pegasus.identifyMyself());
		
		System.out.println();
		System.out.println(
				"\t" + animal.identifyMyself());

	}

}
