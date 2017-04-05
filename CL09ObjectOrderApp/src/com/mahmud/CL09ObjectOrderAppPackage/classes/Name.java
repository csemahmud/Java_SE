/**
 * 
 */
package com.mahmud.CL09ObjectOrderAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Name implements Comparable<Name> {
	
	private final String firstName, lastName;

	/**
	 * @param firstName
	 * @param lastName
	 */
	public Name(String firstName, String lastName) {
		if(firstName == null){
			firstName = "";
		}
		if(lastName == null){
			lastName = "";
		}
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * 
	 */
	public Name() {
		// TODO Auto-generated constructor stub
		this("", "");
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 31*firstName.hashCode() + lastName.hashCode();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (!(obj instanceof Name)) {
            return false;
		}
        Name name = (Name) obj;
        return name.firstName.equals(firstName) && name.lastName.equals(lastName);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return firstName + " " + lastName;
	}

	@Override
	public int compareTo(Name name) {
		// TODO Auto-generated method stub
		
		int lastCmp = lastName.compareTo(name.lastName);
        return (lastCmp != 0 ? lastCmp : firstName.compareTo(name.firstName));
	}

}
