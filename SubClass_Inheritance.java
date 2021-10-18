package sample.sample;

import java.util.Random;




p class SubClass_Inheritance {
	public static void main(String args[]){
		
		System.out.println( args[0]  )  ;//AIOOB Exception as we not passing any argument
		
		if(args.length>0){
			System.out.println("Passing some arg");
			
		}else{
			System.out.println("not passing any argument");
		}
		//Result : 	not passing any argument
	}

	// The method which has been declared as ''default'' cannot be used 'Object' as method param. 
	//The below rule is applicable only when method name is ''equals''. Same rule is applicable for interface methods too
	boolean equals(Object object){
		return true;
	}
}

// In one java file, you are NOT allowed to use 2 public classes. The name which we use for java class file creation only that class is allowed to have public modifier
// Only allowed modifiers for top level/or main level class are :::  public, <default>, abstract, StrictFP, final        NOT ALLOWED : protected, private, static
// Only allowed modifiers for inner classes :::  					 public, <default>, abstract, StrictFP, final   ++    private, protected & static


// if the class is declared as FINAL you areE not allowed to create SUBCLASS,
//if the class is declared as ABSTRACT/Interface you are not allowed to create OBJECT for class,


//Since the class is declared you are NOT allowed to inherit the parent class in the child class

final class JavaCert {
}

class OCJA extends JavaCert {

}

//Since the class is declared as abstract you are not allowed to create an object for it. Sample applicable for interface

abstract class AbsRE{
	
	AbsRE abs =new AbsRE();
}



//Assume that you have one Durga.java file in which below B,R,O,W  classes you have
//in the below example we are not declaring Durga class due to this we are NOT allowed to use 'public' modifier for class. ONLY Durga class is eligible for having public modifier since we have Durga.java file name
//If you try to use try to use public modifier for any other classes it will throw compile time error
//Durga.java
class B{
	public static void main(String...strings){
		System.out.println("B- main method");
	}
}
class R{
	public static void main(String...strings){
		System.out.println("R- nmain method");
	}
}
class O{
	public static void main(String...strings){
		System.out.println("O- main method");
	}
}
class W{
}

//Execution begins
/*
	javac Durga.java
	java B  		B- main method
	java R 			R- nmain method
	java O 			O- nmain method
	java W 			NosuchMethodError:main// This error is because we dont have main method init
	java Durga; Run time error - NoClassdef Found error


*/


//Thuvanam.java
//Since we have declared Thuvanam class in this .java file, we are allowed to use ''public'' modifier to ONLY that particular class 
class T{
	public static void main(String...strings){
		System.out.println("B- main method");
	}
}
class H{
	public static void main(String...strings){
		System.out.println("R- nmain method");
	}
}
class U{
	public static void main(String...strings){
		System.out.println("O- main method");
	}
}
class V{
}

public class Thuvanam{
	public static void main(String...strings){
		System.out.println("Thuvanam- main method");
	}
}

//Execution begins
/*
	javac Thuvanam.java
	java T  		B- main method
	java H 			R- nmain method
	java U 			O- nmain method
	java V 			NosuchMethodError:main// This error is because we dont have main method init
	java Thuvanam;  Thuvanam- main method


*/


//Package name should be declared in the first line otherwise it will throw compile time error

/*
 * public --> a class or method or variable which is declared as public it can be accessible from anywhere 
 * 
 * default --> can be accessible with in the package // Package level access
 * 
 * private  -->  can be accessible only with in the class // class level access
 * 
 * protected -->  with in the current package we can access protected method either by parent or child reference
 *  
 * 												&&
 * 				  in the other packages only child refernce's can be used to access protected method	
 * 
 * 
 */
m


//ex1; with in the current package we can access protected method either by parent or child reference

/*package pack1	;
public class A{
	protected void m1(){
		System.out.println("Hello this is protected method.!");
	}
}

class c extends A{
	public static void main(String []args){
		 //with in the current package we can access protected method either by parent or child reference
		A a = new A();// A is parent class
		a.m1();
		
		c c = new c();
		c.m1();// c is the child class
		
		A c2 = new c();
		c2.m1();
	}
}
*/


//ex2: in the other packages only child refernce's can be used to access protected method 
/*package pack2	;
import  pack1.A;

class B extends A{
	
}

class D extends B{
	public static void main(String...args){
		//in the other packages only child refernce's can be used to access protected method
		B b = new B();// B is parent class and we should not use parent ref to call protected method
		b.m1();
		
		D d = new D();
		d.m1();
		
		B b1 = new D();// compile time error as it is having Parenet reference
		b1.m1();
	}
}*/




//ex3: in the other packages only child refernce's can be used to access protected method
// in the below example ''B'' is the parent class AND D, E, F are child classed to B

/*package pack2	;
import  pack1.A;

class B extends A{
	
}

class D extends B{
	public static void main(String...args){
		//in the other packages only child refernce's can be used to access protected method
		B b = new B();// B is parent class and we should not use parent ref to call protected method
		b.m1();
		
		D d = new D();// No error  beacuse its a child class
		d.m1();
		
		B b1 = new D();// compile time error as it is having Parent reference
		b1.m1();
		
		E e=new E();// No error  beacuse its a child class
		e.m1();
		

		F f=new F();// No error  beacuse its a child class
		f.m1();
		
	}
	
class E extends B{
	
}
class F extends B{
	
}
}
*/


//***************** INHERTINACE *************************
//Parent class reference CANNOT be used to call child class method's whereas child class reference CAN be used to call parent class methods
// Child class can call/utilize Parent and Child class specific methods using child class refernce


class P{
	public void m1(){
		System.out.println("Parent method");
	}
}

class C extends P{
	public void m2(){
		System.out.println("Child method");
	}
	public static void main(String []args){
		C c = new C();
		c.m1();
		c.m2();
		
		P p = new P();
		p.m1();
		//p.m2();// Parent class ref cannot be used to call child class methods
		
		// Parent class reference CAN BE used to hold child class OBJECTS BUT it is NOT allowed to call child class specific methods
		P parent = new C();
		parent.m1();
		//parent.m2();//Parent class ref cannot be used to call child class methods
	}
}
