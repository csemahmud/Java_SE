/**
 * 
 */
package DefaultValueApp.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class DefaultValue {
	
	private String string;
	private Integer integer;
	private int Int;
	private Double aDoubleObj;
	private double dbl;
	private Boolean aBooleanObj;
	private boolean bl;
	private static int staticInt;
	private static Integer staticInteger;

	/**
	 * 
	 */
	public DefaultValue() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n\tDefaultValue [");
		
		if(string == ""){
			builder.append("\n\tString = ").append(string).append(",");
		} else{
			builder.append("\n\tString = ").append(string).append(" ( No Exception ),");
		} 
		
		try {
			if(string.equals("")){
				builder.append("\n\tString = ").append(string).append(",");
			}
		} catch (NullPointerException ex) {
			System.err.println("\n\tString Object must be initialized .");
		}
		
		try {
			if(integer == 0) {
				builder.append("\n\tInteger = ").append(integer).append(",");
			} 
		} catch (NullPointerException ex) {
			System.err.println("\n\tInteger Object must be initialized .");
			builder.append("\n\tInteger = ").append(integer).append(",");
		}
		
		if(Int == 0){
			builder.append("\n\tint = ").append(Int).append(",");
		}
		
		try {
			if(aDoubleObj == 0){
				builder.append("\n\tDouble = ").append(aDoubleObj).append(",");
			} 
		} catch (NullPointerException ex) {
			System.err.println("\n\tDouble Object must be initialized .");
			builder.append("\n\tDouble = ").append(aDoubleObj).append(",");
		}
		
		if(dbl == 0){
			builder.append("\n\tdouble = ").append(dbl).append(",");
		}
		
		try {
			if(!aBooleanObj){
				builder.append("\n\tBoolean = ").append(aBooleanObj).append(",");
			} 
		} catch (NullPointerException ex) {
			System.err.println("\n\tBoolean Object must be initialized .");
			builder.append("\n\tBoolean = ").append(aBooleanObj).append(",");
		}
		
		if(!bl){
			builder.append("\n\tboolean = ").append(bl);
		}
		
		try {
			if(staticInteger == 0) {
				builder.append("\n\tstatic Integer = ")
				.append(staticInteger).append(",");
			} 
		} catch (NullPointerException ex) {
			System.err.println(
					"\n\tstatic Integer Object must be initialized .");
			builder.append("\n\tstatic Integer = ")
			.append(staticInteger).append(",");
		}
		
		if(staticInt == 0){
			builder.append("\n\tstatic int = ")
			.append(staticInt).append(",");
		}
		
		builder.append("\n\t];");
		
		return builder.toString();
	}

}
