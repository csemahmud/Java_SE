/**
 * 
 */
package com.mahmud.BS16InterfaceExAppPackage;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Mainrogram {

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	private interface Relatable {
		
		// this (object calling isLargerThan)
	    // and other must be instances of 
	    // the same class returns 1, 0, -1 
	    // if this is greater than, 
	    // equal to, or less than other
	    public int isLargerThan(Relatable other);

	}

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	private final class RectanglePlus implements Relatable {
	    
		private final int width;
	    private final int height;
	    private final Point origin;

		/**
		 * @param width
		 * @param height
		 * @param origin
		 */
		public RectanglePlus(int width, int height, Point origin) {
			super();
			this.width = width;
			this.height = height;
			this.origin = origin;
		}

		/**
		 * @param width
		 * @param height
		 */
		public RectanglePlus(int width, int height) {
			this(width, height, new Point(0, 0));
		}

		/**
		 * @param origin
		 */
		public RectanglePlus(Point origin) {
			this(0, 0, origin);
		}

		/**
		 * 
		 */
		public RectanglePlus() {
			// TODO Auto-generated constructor stub
			
			this(new Point(0, 0));
		}

	    // a method for moving the rectangle
	    public void move(int x, int y) {
	        origin.x = x;
	        origin.y = y;
	    }

	    // a method for computing
	    // the area of the rectangle
	    public int getArea() {
	        return width * height;
	    }

		/* (non-Javadoc)
		 * @see com.mahmud.BS16InterfaceExAppPackage.Mainrogram.Relatable#isLargerThan(com.mahmud.BS16InterfaceExAppPackage.Mainrogram.Relatable)
		 */
		@Override
		public int isLargerThan(Relatable other) {
			// TODO Auto-generated method stub
	        
			System.out.println("\tisLargerThan(Relatable other)");
			
			if(other instanceof RectanglePlus) {
		        if (getArea() < 
		        		((RectanglePlus) other).getArea()) {
		            return -1;
		        }
		        else if (getArea() > 
		        	((RectanglePlus) other).getArea()) {
		            return 1;
		        }
		        else {
		            return 0;
		        }
			}
			return 0;
		}
		
		public int isLargerThan(RectanglePlus otherRect) {
			// TODO Auto-generated method stub
			
			System.out.println("\tisLargerThan(RectanglePlus otherRect)");
			
	        if (getArea() < otherRect.getArea()) {
	            return -1;
	        }
	        else if (getArea() > otherRect.getArea()) {
	            return 1;
	        }
	        else {
	            return 0;
	        }
		}
        
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("ABCD Rectangle [\n\tA=(")
				.append(origin.x).append(",")
				.append(origin.y).append(")")
				.append(", B=(").append(origin.x + width)
				.append(",").append(origin.y).append(")")
				.append(",\n\tD=(").append(origin.x)
				.append(",").append(origin.y + height).append(")")
				.append(", C=(").append(origin.x + width)
				.append(",").append(origin.y + height)
				.append(")\n\t]").append("\tArea = ")
				.append(getArea());
			return builder.toString();
		}

	}
	
	public Object findLargest(Object object1, Object object2) {
		   
		if(object1 == null) {
			return object2;
		}
		if(object2 == null) {
			return object1;
		}
		Relatable relatable1, relatable2; 
		
		if(object1 instanceof RectanglePlus) {
			relatable1 = (RectanglePlus)object1;	
		} else {
			return object2;
		} 
		
		if(object2 instanceof RectanglePlus) {
			relatable2 = (RectanglePlus)object2;	
		} else {
			return object1;
		}
		if ((relatable1).isLargerThan(relatable2) > 0) {
			return object1;
		} else {
			return object2;
		}
	}
	
	public Object findSmallest(Object object1, Object object2) {
		
		if(object1 == null) {
			return object2;
		}
		if(object2 == null) {
			return object1;
		}
		RectanglePlus relatable1, relatable2; 
		
		if(object1 instanceof RectanglePlus) {
			relatable1 = (RectanglePlus)object1;	
		} else {
			return object2;
		} 
		
		if(object2 instanceof RectanglePlus) {
			relatable2 = (RectanglePlus)object2;	
		} else {
			return object1;
		}
		
		relatable2 = (RectanglePlus)object2;
		if ((relatable1).isLargerThan(relatable2) < 0) {
			return object1;
		} else {
			return object2;
		}
	}

	/**
	 * 
	 */
	public Mainrogram() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n\n");

		List<Relatable> list = new ArrayList<>();
		Mainrogram x = new Mainrogram();
		list.add(x.new RectanglePlus(200, 100));
		((RectanglePlus)list.get(0)).move(30, 60);
		list.add(x.new RectanglePlus(50, 100));
		list.add(x.new RectanglePlus());
		list.add(x.new RectanglePlus(70, 150));
		
		Relatable smallest = null, largest = null;
		
		for (Relatable relatable : list) {
			largest = (Relatable) x.findLargest(
					largest, relatable);
			smallest = (Relatable) x.findSmallest(
					smallest, relatable);
		}
		
		System.out.println();
		
		System.out.println("\tLargest = " + largest);
		
		System.out.println();
		
		System.out.println("\tSmallest = " + smallest);
 	}

}
