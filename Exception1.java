package sample.sample;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

class Exception1 {

	// All the Exceptions(checked or unchecked) are recoverable.
	// Exception: This are caused due to mistake made by programmer AND these can be recoverable.
	// Error: This are caused due to lack of resources such as N/W related issue, Memory related, Stack-overflow, Linkage Error OutofMemoryErroy etc and these are not recoverable
			
	// CheckedException need to be handled in the program otherwise it will throw compile Time Error

	public void m1() throws Exception {
		
	}

	public static void main(String[] args) throws Exception {

		// while overriding methods, if the CHILD class is throwing an exception then
		// the parent class has to throw either same exception or parent exception
		// The reason is you cannot decrease the scope of Parent Class Exception in
		// Child Class
	}
	/*
	 
	  
	  EX 1: Valid class P{ public void m1()throws Exception{ } }
	  
	  class C extends P{ public void m1()throws IOException{ } }
	  
	  EX 2: Valid: same Exception in both parent and child classes
	  
	  class P{ public void m1()throws IOException{ } }
	  
	  class C extends P{ public void m1()throws IOException{ } }
	  
	  EX 3: In-valid since parent class is not throwing any exception
	  
	  class P{ public void m1(){ } }
	  
	  class C extends P{ public void m1()throws IOException{ } }
	  
	  2nd Rule :Valid - If the Parent class method is throwing some exception there
	  is no need to throw Exception in child class
	  
	  
	  class P{ public void m1()throws Exception{ } }
	  
	  class C{ public void m1(){ } }
	  
	  
	 */

	/*
	  which class acts as root clause for all the Exception/Error.? Throwable
	  
	 						 Throwable(Parent)
	  ----------------------------------------------------------------
	  					Exception(child) Error (child) -------------------------
	 * ------------------------- RE IOE SE SQE(Checked Exception) ------- -------
	 * AE, NPE FNF,EOF(Un-checked Exceptions)
	 * 
	 * 
	 */
}

//1.while overriding methods, if the PARENT class is throwing some exception then CHILD class is not required to throw any exception(Optional)
//2.  A ==> If the child class is throwing some exception then PARENT class must throw the same or the parent Exception
//															(OR)
//    B ==> Remove the exception from child class

// The above rules are applicable only to the Checked Exception. For Unchecked Exception there are no such rules to follow

//Case 1: Parent class can throw exception. No need of throwing exception in child class 

class ABCD {
	public void m1() throws Exception {
		System.out.println("Hello");
	}
}

class DEF extends ABCD {
	public void m1() {
	}
}

//Case 2: if the child class is throwing some exception then parent class must throw same or the parent exception

class ABCD1 {
	public void m1() throws Exception {
		System.out.println("Hello");
	}
}

class DEF1 extends ABCD1 {
	public void m1() throws Exception {
	}
}

//Case 3: if the child class is throwing some exception then parent class must throw same or the parent exception otherwise it will throw compile time error

class ABCD12 {
	public void m1() {
		System.out.println("Hello");
	}
}

class DEF21 extends ABCD12 {
	public void m1() throws IOException {
	}
}

//Case 3:For Un-checked excetion thereo 0rl are no such rules to follow

class ABCD2 {
	public void m1() {
		System.out.println("Hello");
	}
}

class DEF2 extends ABCD2 {
	public void m1() throws NullPointerException {
	}
}

/*
 * Methods to print exception information 
 * e.printStackTrace(); This will give complete information about exception 
 * e.toString(); This will give you only exception Name & description 
 * e.getMessage();This will give you only exceptionName
 * 
 * Exception in thread "main" java.lang.AE(Exception Name) / by Zero(Exception
 * Description) at Test.Main()
 */

// if you are using multiple catch CHILD exception must be thrown FIRST and then PARENT Exception has to be used otherwise it will throw compile time error
// In short, when we are using multiple catch blocks PARENT Exception has be declared LAST
class ABCDEF {
	public void m1(){
		try {
			int a =1/0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			int a =1/0;
		} catch (Exception e) {
			e.printStackTrace();
		}catch (ArithmeticException e) {// Compile time error since we are declaring child Exception after parent
			e.printStackTrace();
		}
		
		//statement cannot be inserted b/w try-catch block 
		try {
			int a =1/0;
		}
		System.out.println("test");
		catch (Exception e) {

		}
		 
	}
}

class Excep10{
	try {
		int a =1/0;
		System.out.println("try block");
	} catch (ArithmeticException e) {
		System.out.println("catch block");
	}finally{
		System.out.println("Finally block");
	}
	
	// catch block Finally block
	
//Since we have used system.exit(0), program will terminate from try block & it wont execute finally block	
	
	try {
		int a =1/0;
		System.out.println("try block");
		System.exit(0);
	} catch (ArithmeticException e1) {
		System.out.println("catch block");
	}finally{
		System.out.println("Finally block");
	}
	//catch block Finally block
	
	try {
		System.exit(0);
		int a =1/0;
		System.out.println("try block");
	
	} catch (ArithmeticException e12) {
		System.out.println("catch block");
	}finally{
		System.out.println("Finally block");
	}
	//No result
	
}

// when it is having 2 return statements in the try & finally block, finally block is having high priority over try block
class Example00 {
	public static void main(String[] args) {
		System.out.println(m1());
		;// 999
	}

	public static int m1() {
		try {
			return 777;// this will not execute, controller will going to execute finally block
		} catch (ArithmeticException e) {
			return 888;
		} finally {
			return 999;
		}

	}

}

//CheckedException need to be handled in the program otherwise it will throw compile Time Error

//=======================************OVER-RIDING*************==========================================================

//while overriding classes,  methods in it should be declared with same modifiers otherwise it will throw compile time error
// Case 1; No error since we have using same modifiers while overriding methods

class P {
	public void m1() {

	}
}

class C extends P {
	public void m1() {

	}
}

//Case 2; Compile time error since we have used 2 different modifiers in 2 classes while overriding

class P1 {
	public static void m1() {

	}

}

//in the below case, we are decreasing the scope of access modifier from public static  to public 
class C1 extends P1 {
	public void m1() {
	}
}

//Case 3; Compile time error since we have used 2 different modifiers in 2 classes while overriding

class P01 {
	public static void m1() {
		System.out.println("Parent class method");
	}
}

class C01 extends P01 {
	public static void m1() {
		System.out.println("child class method");
	}
}

class TestABC {
	public static void main(String[] args) {
		P01 p01 = new P01();
		P01.m1();// Parent class method

		C01 c01 = new C01();
		c01.m1();// child class method

		P01 p012 = new C01();
		p012.m1();// Parent class method

	}
}

// The above rule is not applicable for variable declaration 
class P11 {
	static int x = 100;

	public void m1() {

		// valid since we are comparing 2 un checked exception
		try {
			Float f[] = {};
		} catch (FileNotFoundException | NullPointerException e) {
			e.printStackTrace();
		}

		// IN valid since we are comparing parent and child
		try {
			Float f[] = {};
		} catch (Exception | ArithmeticException e1) {
			e1.printStackTrace();
		}

		// IN valid since we are comparing parent and child
		try {
			Float f[] = {};
		} catch (IOException | FileNotFoundException e12) {
			e12.printStackTrace();
		}
	}

}

/*
  
 Unchecked Exception List 
 
 -----------------------------------
	 * ArrayIndexOutOfBoundsException 
	 * NullPointerException 
	 * NumberFormatException
	 * ArithmeticException
	 * AssertionError
	 * 
	 * ClassCastException 
	 * IllegalArgumentException 
	 * IllegalStateException
	 * AssertionError
	 * ExceptionInInitializerError
	 * StackOverflowError
	 * NoClassDefFoundError
 
 Checked Exception List
 ----------------------------------- 
	 * Exception 
	 * InterruptedException
	 * FileNotFoundException
	 * IOException
	 * SQLException
	 * ClassNotFoundException
	  
	  
	 * ParseException
	 * CloneNotSupportedException 
	 * InstantiationException 
	 * NoSuchMethodException 
	 * NoSuchFieldException
 */

class ExcepTHand {
	public int Imp1() {
		// Try,, Finally,, 999
		try {
			System.out.println("Try");
			return 999;

		} catch (Exception e) {
			return 555;
		} finally {
			System.out.println("Finally");
		}
	}

	//
	public int Imp2() {
		// Try,, Finally,, 888
		// If the try & finally blocks has ''return'' statement, JVM Executes
		// ''finally'' block return statement
		try {
			System.out.println("Try");
			return 999;

		} catch (Exception e) {
			return 555;
		} finally {
			System.out.println("Finally");
			return 888;
		}
	}

	public int Imp3() {
		// Try,, catch,, 888
		// If the catch & finally blocks has ''return'' statement, JVM Executes
		// ''finally'' block return statement
		try {
			System.out.println("Try");
			throw new ArithmeticException();
			return 999;

		} catch (Exception e) {
			System.out.println("catch");
			return 555;
		} finally {
			System.out.println("Finally");
			return 888;
		}
	}
}}

}