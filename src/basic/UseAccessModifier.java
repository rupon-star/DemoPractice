package basic;

public class UseAccessModifier {
	
	//Access Modifier/Access Specifier: class,variable,method
	//Private: Only we can call or use within the class where it is located.
	//Public: we can call or use within the class where it is located and from any other class.
	//Protected: only accessible from all the class of that particular package.
	
	//Access modifier:
	
	//public
	//private
	//protected
	//Default
	
	//AccessModier DataType variableName = variableValue
	public String name = "James William";
	private static String ssn = "567-232-437";
	protected int mobileNumber = 466856988;
	
	String fName ="James";
	public static void main(String[] args) {
		//ctrl+space>>hit enter
		
		System.out.println(UseAccessModifier.ssn);
	}
}
