package sample.sample;

import cucumber.runtime.java.Java8HookDefinition;
import ontime.BrohCode;
import ontime.I1_TajMahal;
import ontime.I2_TajMahal;

public interface Interf_6  {
	
// an interface CANNOT extend classes BUT it can extend single or multiple interfaces
//interface METHODS are by default ''public abstract'' ;;; interface VARIABLES are by default ''public static final'' and variable MUST be initialized with some value

//We are NOT allowed to use other access modifiers for interface methods except public 	
//We are NOT allowed to use other access modifiers for variable as it is by default 'public static final' similar rule is applicable for Interface methods 	
	
//When a class implementing interface, it MUST provide implementation for all the interface methods otherwise it should be declared as Abstract class  

// * why interface methods are declared as public.? to make it available to the implementation class
	
//Till java7, interface should contains only declared method but from java8 onwards interface can also contains defined methods
// using default & public static we can define methods in interface
	
//when to use extend and implement
// class can extend class 
	//interface can extend interface
	
// MARKER interface --> an interface which does not contains any methods then it is considered as Marker interface; Ex Serializable(I), cloneable(I), RandomAccess(I), SingleThreadModel(I)	
	
// Ex: class A extends B ;;;; interface A extends B ;;;;  interface A extends B, C, D, ;;;;   class A extends B implements C
// Ex: class A implements B ;;;;  class A implements B, C, D, ;;;; B, C, D are interfaces 	
	
// if a class is implementing interface then it must have to provide implementation for all the methods otherwise it will throw compile time error
	
//ex1:	
//when a normal class implementing interface it must and should provide implementation for all the interface method's
	 interface C extends Cloneable{
		void m1();

		void m2();
		void mm2();
		void mm1();
		final void m3();// final is not allowed to use in interface
	}

	class A implements C {
		// when you are implementing interface, methods should be explicitly declared as public since interface methods are by default ''public abstract''
		public final void m1() {
		}

		public void m2() {
		}
	}

//ex1:
// when an ABSTRACT class implementing INTERFACE, the it is not mandatory to implements all the methods	
	//BUT 
//if a CLASS is implementing INTERFACE then it MUST provide implementation for all the Methods which are declared in interface
	abstract interface X{
		void m1();
		void m2();
	}
	
	
	abstract class ABC implements X{
		// When you are declaring interface methods in the implementation class then we must USE ''public'' access modifier
		 public void m1(){
			System.out.println("Implementing parent class method");
		}
	}
	
	// Imp ** Here, when you are extending abstract we must and should provide implementation for all the remained (or)left over methods
	// and here remained method is m2()
	class Some extends ABC{
		public void m2() {
		}
		
	}

//ex1:
// interface can extend any number of interfaces i.e.. interface A extends B,C,D
	interface R{
		void m1();
		void m2();
	}
	
	public abstract interface A1{
    }
    
    interface J1{
    	
    }
    interface I1 extends J1,A1, R{
    	void m3();
    }
    
    class some implements I1{

		public void m1() {
		}

		public void m2() {
		}
		public void m3() {
		}
    	
    }
	
//ex 3: interface contains static and default defined methods from java8 onwards
	interface X1{
// interface variables are by default public static final. the variable which are declared inside the interface  MUST NEED to be initialized otherwise it will throw compile time error
// since interface variables are public static final we cannot use private, protected, transient and volatile
//since interface variables are public static final, we need to initialize values explicitly
//Since variable is declared as final we are not allowed to override the value, if we try to do it will give CE		
		int x=0;
		void m1();
		void m2();
		
		static void H1(){
			System.out.println("Body");
		}
		
		default void H2(){
			System.out.println("Body");
		}
		
	}
	
	
//	when to use extend and implement
/*
	1. A class can extend only one class at a time i.e ..class A extends B
	2. An interface can extend any number of interfaces i.e.. interface A extends B,C,D 
	3. A class can implement any number of interfaces (Multiple Inheritance)  i.e.. class A implements interf1, interf2 
	4. A class can extend another class and can implements any no of interfaces i.e class A extends B implements interf1, interf2 
	
	*/
	
	
	// 1.8 version contains 2 new enhancements
	//1. default method 2. static method
	

// default method usage
	interface java8{
		
		default void req1(){
			System.out.println("new requirement");
		}
	}
	
	class java8Conc implements java8{
		
		public static void main(String []args){
			// we can access default method in the interface by creating an object of class
			java8 java8Conc = new java8Conc();
			java8Conc.req1();
			//Result: new requirement
		}
		
	}

// difference b/w default & static method
//	1. default method can ONLY be accessed using Class Ref whereas Static method can be accessed only by using interface reference.
//	2. static methods cannot be overridden whereas interface methods can be overridden 
	
	
// overriding default method
// you can override default method in the implementation class but you need to use public keyword in order to override	
interface java88{
		default void req1(){
			System.out.println("new requirement");
		}
	}
	
	class java8Concc implements java8{
		
		//we should have to use public keyword while overriding interface default method
		public final void requ1(){
			System.out.println("overriding default method");
		}
		public static void main(String []args){
			// we can access default method in the interface by creating an object of class
			java8Conc java8Conc = new java8Conc();
			java8Conc.req1();
			//Result: overriding default method 

		}
		
	}

// Not recommended to override ''static methods'' in the implementation class as we use 'interface' name to call static methods
interface helios{
	static void hel(){
		System.out.println("Hjkhjkh");
	}
}

class He implements helios{
	static void hel(){
		System.out.println("jhjk");
	}
	public static void main(String...strings){
		He he = new He();
		He.hel();
	}
}
	
	
// static method in interface 
	interface java8Static{
		
		public static void req1(){
			System.out.println("new requirement - static method usage");
		}
	}
	
	class classABC implements java8Static{
		public static void main(String []args){
			// we can access static method in the interface only by using interface reference
			java8Static.req1();
			
			
			 //req1();// invalid as we are not using interface reference to call interface static method
			// we CANNOT use class reference to call the interface static method, it will throw compile time error if you try to call it
			classABC classABC = new classABC();
//			classABC.req1();//invalid;; Compile time  error as we are not using interface reference to call interface static method
		}
		
	}
	
//in Java 8 we can run interface using main method	
	interface mainMethod{
		
		public static void main(String...strings){
			System.out.println("in Java 8 we can run interface using main method");
		}
	}
}

// EX1: Ambiguity problem arises since we are not telling JRE which interface method to run; Run time error it throws
//since we have 2 different methods in the 2 interfaces there wont be any compile time error while implementing interface methods
interface Gun{
	default void mm1(){
		System.out.println("jhgjhgjh");
	}
}

interface Gun1{
	default void mm1(){
		System.out.println("jhgjhgjh");
	}
}

class Hello implements Gun, Gun1{
	
	public static void main(String [] args){
		//Ambuguity problem arises since we are not telling JRE which interface method to runl
		Hello hello = new Hello();
		hello.mm1();
	}

}

 


//EX 2: No ambiguity error since we are telling JRE to run which method by using proper naming convention i.e className.SuperKyword.MethodName
//Left.super.m1()


interface Left{
	int x=100;
	default void m1(){
		System.out.println("Left default method");
	}
}

interface Right{
	int x=102;
	default void m1(){
		System.out.println("Right Default Method");
	}
}

class Test1 implements Left,Right{
	//overriding interface default method; you need to provide public keyword while overriding
	public void m1(){
		Left.super.m1();// calling left method using super keyword
		Right.super.m1();
		System.out.println(Left.x);//100
		System.out.println(Right.x);//102
		
	}
	
	public static void main(String...strings){
		Test1 test1 = new Test1();
		test1.m1();//invokes left & right super methods
		
	}
}


//since we have 2 different methods in the 2 interfaces there wont be any compile time error while implementing interface methods
interface Hellow{
	default void mm1(){
		System.out.println("Hellow mm1 method");
	}
}

interface Hellow1{
	default void mm12(){
		System.out.println("Hellow1 mm1 method");
	}
}
class HelloMM implements Hellow, Hellow1{
	
	
	public static void main(String...strings){
	}
}


// IMP ::: BELOW RULE IS APPLICABLE ONLY FOR DECLARED METHODS
//Rule : 2 Interface should NOT contains same method signature(method Name) for 2 DIFFERENT return type as it will throw compile time error when you are implementing it



// we cannot have 2 different return types for same method signature
// it can have same method signature only if it is having same return TYPE
interface Ranbir{
	void m1();
}
 
interface Ranvir{
	int m1();
}

//Interface concept CANNOT be applicable when both the interface having SAME method signature BUT different return types
class RanbirRanvir implements Ranbir, Ranvir{

	// Compile time error since 2 interface contains same method signature with different return types.
	public int m1() {
		return 0;
	}
}


// Since we are using static methods, there is NO issue of ambiguity as we are using Interface name to call the methods 
interface rondaRousey{
	
	static void helllow(){
		System.out.println("Hey");
	}
}

interface kurtAngle{
	
	static void helllow(){
		System.out.println("Hey");
	}
}

class TeraZikar implements kurtAngle, rondaRousey{
	
	public static void helllow(){
		System.out.println("Heyloow");
	}
	public static void main(String[]args){
		rondaRousey.helllow();
	}
}


interface honey{
	int a=10;
}

class honeyC implements honey{
	public static void main(String...strings){
		System.out.println(a);//10
	}
}


// when interface and implementation class is having same variable name declared what's going to happen.?

interface Bunny{
	int a=10;
}

class honeyCA implements Bunny{
	public static void main(String...strings){
		int a=11;
		System.out.println(a);//11 ;; Nearest variable value is going to get more preference
	}
}






//======================================================================================================================
// A class when implementing interface methods, it must provide the implemetatraion for it
interface I1_TajMahal{
	void love();
}

interface I2_TajMahal{
	void love();
}


class BrohCode implements I1_TajMahal, I2_TajMahal{

	public void love() {
		System.out.println("Always loves for no reason");
	}
	
	public static void main(String []args){
		BrohCode implementInterfaceTeajMahal = new BrohCode();
		implementInterfaceTeajMahal.love();
		
		((I2_TajMahal)implementInterfaceTeajMahal).love();
		((I1_TajMahal)implementInterfaceTeajMahal).love();//2 Type of classin
		
		I1_TajMahal i1_TajMahal= new BrohCode();
		i1_TajMahal.love();
	}
}

//====================== Default methods in interface================================================================================================

interface II1_TajMahal{
	
	default void Hate(){
		System.out.println("Always hates for no reason");
	}
}

interface II2_TajMahal{
	
	default void Hate(){
		System.out.println("Always hates for no reason");
	}
}

//Since both the interface is having same methods(	Hate();	), So while implementing these interface methods in class we must have to specify the Method otherwise it will throw compile time error
//This rule does not applicable for static methods in intercae. The reason why is Static method can only be accessed by using Class Name
class BrohCode001 implements II1_TajMahal, II2_TajMahal{

	//Since there is an abiguity in methods compile time errors occurs. IN order to avoid this, we must implement it & use '''super'' keyword to refer parent class object
	/*public void Hate() {
		//So, in here when overriding methods, we must have to specify which method we are calling
		System.out.println("Always loves for no reason");
	}*/
	
	public static void main(String []args){
		//Here compile time occurs only when calling method
		BrohCode001 brohCode001 = new BrohCode001();
		brohCode001.Hate();
		
		
	}
}
//==========================================================================Static Methods======================================================================================================================
//================================================================================================================================================================================================