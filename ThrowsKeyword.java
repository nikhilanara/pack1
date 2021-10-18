package sample.sample;


//if you are defining your own exception then it must be extended from class which should extend RunTimeException

//Handling Checked Exception


import java.io.IOException;
public class ThrowsKeyword {
	//since you are using m1() method of X class you MUST need to handle its Exception either by using ''throws'' or by using try-catch block
	 public static void main(String...strings){
	 //public static void main(String...strings)throws Exception{
		X x = new X();
		x.m1();// sin
		
	}
}

class X{
	
	public void m1(){// Error since you are handling checked Exception
	//public void m1()throws Exception{
		//As you throwing CHECKED exception you must need to handle it at the current method and the calling method signature 
		//since you are throwing CHECKED exception you must handle it using ''throws'' or by using ''try-catch''. In here we are handling it by using ;throws; keyword at method level
		throw new IOException();
		
	}
}




/*
// handling RunTime Exception
import java.io.IOException;
public class ThrowsKeyword {
	 public static void main(String...strings){
		X x = new X();
		x.m1();// 
	}
}

class X{
	public void m1(){
		//since you are throwing RunTimeException, you no need to specify '''throws''' in the method signature And also calling method is not required to handle the Exception   
		throw new  NullPointerException();
		
	}
}*/

/*// checked Exception are required to handle it where ever we use
public class ThrowsKeyword{
	
	void checkedExecption(int cardNo)throws Exception{
		System.out.println("checkedExecption");
	}
	
	//when we are using method which has checked exception in the method signature then we me MUST have to handle it in the used method
	public static void main(String...strings){
//	public static void main(String...strings)throws Exception{
		ThrowsKeyword throwsKeyword = new ThrowsKeyword();
		throwsKeyword.checkedExecption(11);
	}
}*/

/*//Un Checked Exception are NOT required to handle it where ever we use
public class ThrowsKeyword{
	
	void runTimeException(int cardNo)throws RuntimeException{
		System.out.println("checking card");
	}
	
	// no need of handling RuntimeException exception  
	public static void main(String...strings){
		ThrowsKeyword throwsKeyword = new ThrowsKeyword();
		throwsKeyword.runTimeException(11);
	}
}*/


/*
public class ThrowsKeyword{
	
	public static void main(String...strings){
		m1();
	}
	
	public static void m1(){

		try {
			throw new Exception();
		} catch (RuntimeException e) {// in the catch you need to pass Exception class as argument since you are using Exception in the try block
		}catch (Exception e) {
		}
		
	}
}*/


 class ThrowsKeywords{
	public static void main(String...strings){
		String [] names={"Thomas", "Bunny", "inny"};
		String [] pwds =new String[3];
		int i=0;
		
		try {
			for (String name : names) {
				pwds[i] = name.substring(2, 6);
				i++;
				// (starting, ending-1)
			}
		} catch (Exception e) {
			System.out.println(" Invalid Name");
		}
		for(String pwd :pwds){
			System.out.println(pwd);
		}
	}
}
// Result : Invalid Name omas null null
 


/*
//NOT all errors we can handle using exception,, below one is not an exception it's an error and we cannot handle it
public class ThrowsKeyword{
	
	public static void main(String... strings) {
		ArrayList al = new ArrayList();

		try {
			while (true) {// this condition will return true always. it will throw stack overflow error and these can NOT be handled using exception or RuntimeException
				al.add("some");
			}
		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}*/

/*

Which statements are true about Exceptional handling

1. Improves the program structure because the error handling code is separated from the normal program function :YES
2. Provides a set of standard exceptions that covers all possible errors ;; NO, Exception's CANNOT cover all the errors
3. Improves the program structure because exception must be handled in the method in which they occurred ;; NO we can distribute it to calling method
4. Improves the program structure because programmer can choose where to handle exception :: YES programmer can choose either try catch or throws or throw new exception
5. Allows the creation of new exceptions that are tailored to the particular program being created :: YES we can create a new/customized exception   

Which 3 statements are true about Exceptional handling
	1. Only checked exception can be re thrown(Meaning : inside catch block you are allowed to throw another exception again like below)
		The above statement is incorrect as we are allowed to re throw un-checked exception too
	2. All subclasses of the Runtime Exception are recoverable : NO
	  	Not only the runtime exceptions, checked exception(basically all exceptions) can also be recoverable
	3. The parameter in catch block is of throwable type  :: Yes
	4. All subclasses of Runtime Exception must be  caught or declared to be thrown : NO this rule is applicable only for checked exception
	5. All subclasses of Exception except Runtime exception are known as CHECKED EXCEPTION : YES
	6. All subclasses of Error class are checked exception and are recoverable: NO 
	:   
		
Which statements are true about Error
	1. Error class is unExtendable : NO
	2. Error class is Extendable :YES
	3. Error is Throwable : YES 
	4. Error is Exception : NO
	5. Error is RunTimeException: NO
	

*/

/*Re throwing exception
public class ThrowsKeyword{
	
	public static void main(String... strings) {
		try {
		} catch (RuntimeException e) {
//			Re throwing RuntimeException AS NullPointerException
			throw new NullPointerException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}*/


// Various ways of defining extends : Recommended way is RuntimeException

//public class ThrowsKeyword extends  Error{
//public class ThrowsKeyword extends  Exception{
//public class ThrowsKeyword extends  RuntimeException{
/*public class ThrowsKeyword extends  Throwable{
	public static void main(String...strings){
		
	}
	
}
*/

class xys extends RuntimeException{
}

public class ThrowsKeyword  {
	public static void main(String... strings) {
		int age=Integer.parseInt(strings[0]);
		
		if(age>20){
			throw new xys();
		}
	}
}


class MyException extends RuntimeException{
}

class CustomizedException{
	int i=0;
	public void Hellow(){
		if(i==0){
		 throw new MyException();	
		}
	}
	
}
//Since the below code is throwing Arithmetic Exception & catch block is handling it directly so it goes high priority, Exception block will not execute
class IMPTopic{
	public static void main(String...strings){
		try {
			int i=10/0;
		} catch (ArithmeticException e) {
			System.out.println("Null");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Normal");
		}
	}
}
// Result  : NUll 

//Since it is not Null pointer Exception. Exception block will print
class IMPTopic1{
	public static void main(String...strings){
		try {
			int i=10/0;
		} catch (NullPointerException e) {
			System.out.println("Null");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Normal");
		}
	}
}

//Result  : Normal



//In the catch block, you are not allowed to add any statement after using throw; if you use, it will throw compile time error

class IMPTopic3{
	public static void main(String...strings){
		try {
			int i=10/0;
		} catch (NullPointerException e) {
			System.out.println("Null");
		} catch (Exception e) {
			throw new ArithmeticException();
			System.out.println("Normal");
		}
	}
}