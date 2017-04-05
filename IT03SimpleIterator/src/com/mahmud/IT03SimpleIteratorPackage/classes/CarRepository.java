/**
 * 
 */
package com.mahmud.IT03SimpleIteratorPackage.classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class CarRepository implements Container<com.mahmud.IT03SimpleIteratorPackage.classes.CarRepository.Car>  {

	private List<Car> carList;

	/**
	 * 
	 */
	public CarRepository() {
		// TODO Auto-generated constructor stub
		carList = new ArrayList<>();
		carList.add(new Car("Lamborghini", "Red", 100000));
		carList.add(new Car("Porshe", "Silver", 80000));
		carList.add(new Car("Toyota", "Blue", 5000));
	}

	@Override
	public Iterator<Car> getIterator() {
		// TODO Auto-generated method stub
		return new MyIterator<>(carList);
	}
	
	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	class Car {
		
		private String name;
		private String color;
		private double price;

		/**
		 * @param name
		 * @param color
		 * @param price
		 */
		public Car(String name, String color, double price) {
			this();
			this.name = name;
			this.color = color;
			this.price = price;
		}

		/**
		 * 
		 */
		public Car() {
			// TODO Auto-generated constructor stub
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Car [name=").append(name).append(", color=").append(color).append(", price=").append(price)
					.append("]");
			return builder.toString();
		}

	}

}
