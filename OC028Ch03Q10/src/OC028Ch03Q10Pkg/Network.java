/**
 * 
 */
package OC028Ch03Q10Pkg;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Network {
	
	int id;
	Network p;

	/**
	 * @param id
	 * @param n
	 */
	public Network(int id, Network n) {
		super();
		this.id = id;
		p = this;
		
		if(n != null) {
			p = n;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n\n");
		Network n1 = new Network(1, null);
		n1.go(n1);
	}

	private void go(Network n1) {
		// TODO Auto-generated method stub
		
		Network n2 = new Network(2, n1);
		Network n3 = new Network(2, n2);
		System.out.println("\tn3.p.p.id = " + n3.p.p.id);
	}

}
