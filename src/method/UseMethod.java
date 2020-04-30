package method;

public class UseMethod {
//Method:block of code which runs when it is called.Method is used to perform certain actions and they are known as function.
	//Method Type: 
	//return method without parameter:
	//return method with parameter:
	//non return method with parameter:
	
	//method syntax: AccessModifier ReturnType/MethodType MethodName(){ method body}
	//Return type/MethodType: Data Type/Class Type
	//MethodName: verb+Noun
	
	//Method Syntax:
	//AccessModifier ReturnType/MethodType MethodName(){Method body}
	
	//return types are: all data type, void, class and object.
	//method syntax: AccessModifier ReturnType/MethodType MethodName(){Method body}
	//AccessModifier ReturnType/MethodType MethodName(){Method body}
	
	int a = 25;
	int age = 25;
	String mango = "Apple";
	String mobileBrand = "Apple";
	
	//Non Return Type Method/ Non Parameterized Non Return Type Method:/Static type
	//method
	public void doSummation() {
		int number1 = 45;
		int number2 = 55;
		int summation = number1+number2;
		System.out.println("Summation value is" + summation);
	}
	
	//Dynamic Non Return Type Parameterized Method:
	public void doSummation(int num1, int num2) {
		int number1 = num1;
		int number2 = num2;
		int summation = number1 + number2;
		System.out.println("Summation value is" + summation);
	}
	
	public void doSummation(int num1, int num2, int num3) {
		int number1 = num1;
		int number2 = num2;
		int number3 = num3;
		int summation = number1+number2+number3;
		System.out.println("Summation value is" + summation);
	}
	
	
	
	public static void main(String[]args) {
		
		UseMethod obj = new UseMethod();
		obj.doSummation();//call by object name
		
		//UseMethod.doSummation();//call by class Name
		//doSummation();//without class name which is not industry practice
		obj.doSummation(500,600);
		obj.doSummation(20,34,44);
		
	}	
	
}
