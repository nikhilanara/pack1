yepackage sample.sample;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class LambaExpression {

	public static void main(String[] args) {
		
		//Lambda Expressions are nothing but anonymous function. it is represented by '()->'
		//Lambda Expressions can be used only in Functional interface. 
		//Functional interface is an interface which has only single abstract method
		
		/*
		 *	To enable functional programming language, we must need to use Lambda Expression. 
		 *	In Java 8, Lambda Expression has been introduced
		 * 	Lambda expression is nothing but anonymous function. It should be not having '''function name, no return type, no modifier
		 	Lambda Expression was first introduced in ''LISP'' and later below technologies have started including it 
		 	LISP, C, C++, Objective C, C#, .net., SCALA, Ruby, Python and Java
		
		*/
		
		/*
		
		Anonymous inner classes are more powerful than Lambda Expression
		
		In only one particular case, Anonymous inner class usage is going to be replaced by lambda expression
		
		*/
		
		/*
		()	->System.out.println("dd");
		n->n*n;*/
	}
	
	
		
		

}


//Functional interface is an interface which has only single abstract method. It should never contain more than 1 abstract method;
//when you use @FunctionalInterface we MUST need to follow the rules of @FunctionalInterface otherwise it will throw compile time error 
//FunctionalInterface can ALSO contains ''default()'' and ''static()'' methods
@FunctionalInterface
interface Interf{
	
	void m1();
	default void desf(){
		System.out.println("default method");
	}
	static void stat(){
		System.out.println("Static method");
	}
}

// Since we are not using lambda expressions, we are relying on implementation class to implement abstract class methods 
class Test implements Interf{
	public void m1(){
		System.out.println("hello bharath");
	}
}

class Impe {
	public static void main(String...strings){
		Test test = new Test();
		test.m1();
	}
}

//in the below ex, we are going to use LAMBDA expression and hence we don't need implementation class to implement functional interface methods
//Type 1
interface Interf1{
	void method1();
}

class LambdaClass {
	public static void main(String...strings){
		Interf1 interf1 = () ->	System.out.println("bharath");
		interf1.method1();
		
	}
}

//Type 2 --> Using parameters in Lambda Expressions

interface ParamsUsage{
	 void params(int a, int b);
}

class ImplementsParamsConcept{
	
	public static void main(String...strings){
		//In the lambda expression, when you have more than 1 statement you must need to use open and close flower braces "{"
		ParamsUsage implementsParamsConcept = (a,b) -> { System.out.println(""); System.out.println("");};
		implementsParamsConcept.params(2, 1);
	}
}

//Type 3 --> No need of using 'return' statement when using lambda expression. Compiler can automatically detect the method params and return type

interface ParamsUsageType2{
	 int params(int a, int b);
}

class ImplementsParamsConceptType2{
	
	public static void main(String...strings){
		//In the lambda expression, when you have more than 1 statement you must need to use open and close flower braces "{"
		
		//ParamsUsageType2 implementsParamsConcept = (a, b) -> {return  a *b; };//valid
		//ParamsUsageType2 implementsParamsConcept = (int a, int b) -> {return  a *b; };//valid
		ParamsUsageType2 implementsParamsConcept = (a, b) ->	 a *b; ;
		implementsParamsConcept.params(2, 1);
	}
}


//Runnable Interface concept --> its an functional interface since it is having only one abstract method that is run() 

class MyRunnable implements Runnable{
	
	public void run(){
		for(int i=0; i>4; i++){
			System.out.println("Child Thread");
		}
	}
}

class SomeThread{
	public static void main(String...strings){
		
		// in the below program, we have 2 thread 1 is 'Main()' thread and the other 1 is MyRunnnable class thread
		MyRunnable myRunnable = new MyRunnable();
		Thread thread= new Thread(myRunnable);
		thread.start();
		for(int i=0; i>4; i++){
			System.out.println("Main Thread");
		}
	}
}
// Since we know we are going to implement Runnable interface we could take it directly instead of having it in a implementation class
class OtherWay{
	public static void main(String...strings){
		// in the below program, we have 2 thread 1 is 'Main()' thread and the other 1 is MyRunnnable class thread
		
		Runnable myRunnable = () -> {
			for(int i=0; i>4; i++){
				System.out.println("Main Thread");
			}	
		};
		Thread thread= new Thread(myRunnable);
		
		/*		
		//Second Approach
		 Thread thread= new Thread(   () -> {
			for(int i=0; i>4; i++){
				System.out.println("Main Thread");
			}	
		});
		
		*/
		thread.start();
		for(int i=0; i>4; i++){
			System.out.println("Main Thread");
		}
	}
}
//
//Result -- The above program will give you mixed output
// Here, to implement runnable interface we don't actually need implementation class we can directly call the runnable interface method inside thread since it accepts runnable interface
class DirectImpl{
	public static void main(String...strings){
		Thread thread= new Thread(new Runnable() {
			
			public void run() {
				for(int i=0; i>4; i++){
					System.out.println("child Thread");
				}		
			}
		});
		thread.start();
		for(int i=0; i>4; i++){
			System.out.println("Main Thread");
		}
	}
}

//Result -- The above program will give you mixed output

class DirectImplWithNoRunnable{
	public static void main(String...strings){
		
		//since thread accepts runnable interface we no need to specify 'runnable interface ' explicitly as JVM has the capability to recognize those methods
		// In the below approach we are  using lambda expressions
		Thread thread= new Thread( () -> {
			for(int i=0; i>4; i++){
				System.out.println("child Thread");
			}	
		});
		thread.start();
		for(int i=0; i>4; i++){
			System.out.println("Main Thread");
		}
	}
}


//Below ways we can declare Implement Interface in class
//1. using new keyword; 2. By using Anonymous function 2. By using class

interface Nalini{
	void Varun();
}


class Gopi implements Nalini{
	public void Varun(){
		
	}
}

class Jhansi{
	public static void main(String []args){
		new Nalini(){
			public void Varun(){
			}
		};
	}
}


class Harika{
	public static void main(String []args){
		Nalini na=()->System.out.println("");
		na.Varun();
	}
}