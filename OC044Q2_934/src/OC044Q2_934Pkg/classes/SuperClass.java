/**
 * 
 */
package OC044Q2_934Pkg.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class SuperClass {

	private String textData;
	private int numData;
	
	/**
	 * @param textData
	 * @param numData
	 */
	public SuperClass(String textData, int numData) {
		super();
		this.textData = textData;
		this.numData = numData;
	}

	/**
	 * @param textData
	 */
	protected SuperClass(String textData) {
		super();
		this.textData = textData;
	}

	/**
	 * @param numData
	 */
	@SuppressWarnings("unused")
	private SuperClass(int numData) {
		super();
		this.numData = numData;
	}

	/**
	 * @return the textData
	 */
	public synchronized final String getTextData() {
		return textData;
	}

	/**
	 * @param textData the textData to set
	 */
	public synchronized final void setTextData(String textData) {
		this.textData = textData;
	}

	/**
	 * @return the numData
	 */
	public synchronized final int getNumData() {
		return numData;
	}

	/**
	 * @param numData the numData to set
	 */
	public synchronized final void setNumData(int numData) {
		this.numData = numData;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SuperClass [textData=").append(textData).append(", numData=").append(numData).append("]");
		return builder.toString();
	}

}
