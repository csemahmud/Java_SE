/**
 * 
 */
package com.mahmud.BS15LamdaExpAppPackage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	public static class Person {

		/**
			 * @author Mahmudul Hasan Khan CSE
			 *
			 */
		private enum Sex {
			MALE, FEMALE
		}
	
	    private final String name;
	    private final LocalDate birthday;
	    private final Sex gender;
	    private final String emailAddress;

		/**
		 * @param name
		 * @param birthday
		 * @param gender
		 * @param emailAddress
		 */
		public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
			super();
			this.name = name;
			this.birthday = birthday;
			this.gender = gender;
			this.emailAddress = emailAddress;
		}

		/**
		 * 
		 */
		public Person() {
			// TODO Auto-generated constructor stub
			
			this("", LocalDate.now(), Sex.FEMALE, "");
		}
		
		/**
		 * @return the name
		 */
		public synchronized final String getName() {
			return name;
		}

		/**
		 * @return the gender
		 */
		public synchronized final Sex getGender() {
			return gender;
		}

		/**
		 * @return the emailAddress
		 */
		public synchronized final String getEmailAddress() {
			return emailAddress;
		}

		public int getAge() {
	        return  LocalDate.now().minusYears(
	        		birthday.getYear()).getYear();
	    }

	    /* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Person [name=").append(name).append(", birthday=").append(birthday).append(", gender=")
					.append(gender).append(", emailAddress=").append(emailAddress).append("]");
			return builder.toString();
		}

		public void printPerson() {
	        System.out.println("\t" + this);
	    }    

	    public static int compareByAge(Person a, Person b) {
	        return a.birthday.compareTo(b.birthday);
	    }

	}

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	private interface Predicate<T> {
		boolean test(T t);
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
		
		List<Person> roster = new ArrayList<>();
		roster.add(new Person("Mahmud", 
				LocalDate.of(1990, 3, 10), Person.Sex.MALE, 
				"asd@gmail.com"));
		roster.add(new Person());
		roster.add(new Person("Bruce", 
				LocalDate.of(2010, 12, 31), Person.Sex.MALE, 
				"iron.man@gmail.com"));
		roster.add(new Person("Alia", 
				LocalDate.of(1995, 10, 25), Person.Sex.FEMALE, 
				"alia@gmail.com"));
		roster.add(new Person("Clark", 
				LocalDate.of(1910, 12, 31), Person.Sex.MALE, 
				"super.man@gmail.com"));
		roster.add(new Person("Barry", 
				LocalDate.of(1997, 12, 31), Person.Sex.MALE, 
				"flash@gmail.com"));
		
		System.out.println("\tPrinting Eligible Persons : ");
		
		printPersons(roster, new Predicate<Person>(){

			@Override
			public boolean test(Person person) {
				// TODO Auto-generated method stub
				return person.getGender() == Person.Sex.MALE
		                && person.getAge() >= 18
		                && person.getAge() <= 60;
			}
			
		});
		

		
		System.out.println();
		System.out.println("\tPrinting Eligible Persons Using Lambda Expression : ");
		
		printPersons(roster, 
				person -> person.getGender() == Person.Sex.MALE
		        && person.getAge() >= 18
		        && person.getAge() <= 60);
		
		System.out.println();
		System.out.println("\tPrinting Emails of Eligible Persons : ");
		
		roster.stream().filter(
	        person -> person.getGender() == Person.Sex.MALE
	            && person.getAge() >= 18
	            && person.getAge() <= 60)
	    .map(person -> person.getEmailAddress())
	    .forEach(email -> System.out.println("\t" + email));
		
		Person[] rosterAsArray 
			= roster.toArray(new Person[roster.size()]);
		
		System.out.println();	
		System.out.println("\tSorted By Age : ");
		Arrays.sort(rosterAsArray,
			    (a, b) -> Person.compareByAge(a, b));
		for (Person person : rosterAsArray) {
			System.out.println("\t" + person);
		}
		
		System.out.println();	
		System.out.println("\tSorted By Name : ");
		Arrays.sort(rosterAsArray,
			    (Person a, Person b) -> {
			        return a.getName().compareTo(b.getName());
			        });
		for (Person person : rosterAsArray) {
			System.out.println("\t" + person);
		}

	}

	private static void printPersons(List<Person> roster, 
			Predicate<Person> predicate) {
		// TODO Auto-generated method stub
		
		for (Person person : roster) {
			if(predicate.test(person)) {
				person.printPerson();
			}
		}
		
	}

}
