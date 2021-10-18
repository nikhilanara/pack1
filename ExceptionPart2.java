package sample.sample;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import pack1.Vehicle;

public class ExceptionPart2 {

	public static void main(String[] args){
//		PrintWriter printWriter = new PrintWriter("abc.text"); 
	}
	
	public void m1() throws FileNotFoundException{
		// throws compile time error if we do not handle checked exceptions 
		// CheckedException need to be handled in the program otherwise it will throw compile Time Error
		PrintWriter printWriter = new PrintWriter("abc.text");
	}
	
	// to make the code work, you need to handle the exception like below 
	/*public void m1()throws Exception{
		PrintWriter printWriter = new PrintWriter("abc.text");
	}*/
	
	
	//DOES NOT throws compile time error if we do not handle UN checked exceptions but it will throw run Time Exception
	//Un checked exception are not re
	public void m2(){
		int i=10/0;
	}
	
	
	public void method1(){
		try {
			int i=10/0;
			System.out.println("try");
			// Since it is raising Arithmetic Exception Catch block wont gets executed
		} catch (NullPointerException e) {
			System.out.println("catch");
		}finally {
			System.err.println("finally");
		}
		
//Result: finally and then it prints ERROR since we are not handling Arithmetic Exception
		try {
			int i=10/0;
			System.out.println("try");
			// Since it is Arithmetic Exception Catch block  gets executed
		} catch (ArithmeticException e) {
			System.out.println("catch");
		}finally {
			System.err.println("finally");
		}
//	result: catch finally
	}
}


//Below class throws Run Time Exception. if the caller  method is not handling exception calling method has to do that
class Vehicle extends RuntimeException{
	//calling method
	public static void main(String... strings) {
		try {
			method();
		} catch (Exception e) {
			System.out.println("Parent");
		}
	}
	
	//caller method
	//Below method throws RunTime Exception
	public static void method(){
		try {
			throw Math.random() >0.5 ?new Vehicle() : new RuntimeException();
		} catch (NullPointerException e) {
			System.out.println("b");
		} 
	}
}

//Parent


// in the below case, we are handling exception in the parent class so calling method wont get a change 
class Vehicle1 extends RuntimeException{
	//calling method
	public static void main(String... strings) {
		try {
			method();
		} catch (Exception e) {
			System.out.println("Parent");
		}
	}
	
	//caller method
	public static void method(){
		try {
			throw Math.random() >0.5 ?new Vehicle() : new RuntimeException();
		} catch (Exception e) {
			System.out.println("b");
		} 
	}
}
//////////////////// *** Create custom exception **** //////////////////////
class createOwnException extends RuntimeException{
	public createOwnException() {
		System.out.println("");
	}
	
}

class UseCreatedRunTimeException{
	public void someMethod() {
		int i=1;
		if(i==1) {
			throw new createOwnException();
		}
	}
}