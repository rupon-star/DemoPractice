package basic;
public class UseConstructor {
	// constructor name will be same as Class name
	// constructor Has no return type.
	// before creating parameterize constructor we must have to create Default
	//constructor
	//Default/ non Parameterized Constructor
	//Parameterized Constructor
	//AccessModifier ClassName() {}
	//Declare Variable
	
	String name;
	String address;
	int id;
	
	public UseConstructor() {
		//default constructor
		System.out.println("Hello World");
	}
	
	public UseConstructor(String name) {
		//Signature pattern/ Parameter:Single Parameterized constructor
		this.name = name;
		System.out.println("Name is" +this.name);
	}
	
	public UseConstructor(String newName, String address) {
		//Signature pattern/ Parameter:Multiple Parameterized constructor
		this.name = newName;//assign value by calling local variable
		this.address = address;
		System.out.println("Name is " +this.name+"Address is"+this.address);
		}
	
	public static void main(String[]args) {
		//create a object of UseConstructor class
		//className objectName = new constructorOfClass
		UseConstructor obj = new UseConstructor();
		UseConstructor samirObj = new UseConstructor("Samir");
		
		UseConstructor aghilesobj = new UseConstructor("Aghiles", "Queens,NY");//Argument passing
	}
	
}
