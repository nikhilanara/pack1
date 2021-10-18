package sample.sample;


public class ConstructorPart2 {
	//Constructor is used to intialize the variables
	int rollName;
	String name;
	
	ConstructorPart2(int rollName, String name){
		this.rollName = rollName;
		this.name = name;
	}
	public static void main(String []args) {
		ConstructorPart2 pa=new ConstructorPart2(12, "Bharath");
		System.out.println(pa);//this prints name as we are overriding toString Object
	}
	
	public String toString() {
		return this.name;
	}
	
	
	
	// No Args Constructor
	 ConstructorPart2(){
		this();//compile time as it should contains super()
	}
	
	// Constructor overloading; A class can have multiple constructors
	ConstructorPart2(int i){
		
	}
	
	ConstructorPart2(String i){
	}
	

	
	ConstructorPart2(String str, int i) {
		try {
			super();//Error since we need to define this in 1st line
		} catch (Exception e) {
		}
	}
	
	
	
	//not a constructor since we have used void as return type
	void ConstructorPart2(){
	}
	

	/*
			*** RULES TO DEFINE CONSTRUCTOR ***
			
	1. constructor name should be same as class name
	2. constructor should not contain any return type even ''void'' too. By mistake, if you provide return type for constructor compiler will treat it as method
	3. Method overloading & inheritance can be done in constructor overloading
		with in a class, you can take multiple constructors but with different args and data types --> Method over loading
		
	4. Only allowed access modifiers for constructors are.. public, private, default
	
	5. Even if you DO NOT provide any constructor for class, compiler will generate one constructor implicitly --> Default constructor
	5. First line in the constructor should be 'super(); or this();'. if you DO NOT provide that line compiler will generate one for you.
		if you give super() or this in the 2nd or 3rd line,  it will throw compile time error as we need to provide that in 1st line.
	6. Constructor should not be declared as static, final & abstract
	7. Super() or this() cannot be surrounded with try - catch blocks. Reasons: super should be declared first in the constructor.
	 
	
	*/
	
	/*
		Below are the 3 important cases in constructor
		
		:::valid
		 
		class A{
		}
		class B extends A{
		}
		 
		 ;;in the above case, compiler will generate 2 default constructors which are A(){super();} ;;; B(){super();} Below is the sample code for that
		 
		 JVM generates 2 default constructors explicitly like below: As said, first line JVM adds super() as first line in the constructor
		   
		 class A{
		 	A(){
		 		super()
		 	}
		 }
		class B extends A{
			B(){
				super();
			}
		}
		 
		 
		:::In-valid; Incompatible constructors in the both child and parent classes 
		class A{
			A(int i){
				// if you don't provide any statement, compiler will automatically provide you the super(); 
			}
		}
		class B extends A{
			B(){
				super();// compile time error as the parent constructor is having arguments in it but the child constructor doesNOT
			// if you don't provide any statement, compiler will automatically provide you the super(); 
			}
		}
		
		//IMP :;;; To make the above condition true/correct we need to do below change : Code as shown below
		 * 
		 * pass integer in the super() keyword under child class constructor
		 *  						(OR)
		 * pass integer argument in the child class constructor and use that refernce in the super() keyword  
		
		::valid --> it gives you compile time since we need to 
		class A{
			A(int i){
				// if you dont provide any statement, compiler will automatically provide you the super(); 
			}
		}
		
		class B extends A{
			B(){
				super(10);
			// if you dont provide any statement, compiler will automatically provide you the super(); 
			}
		}
		
		class A{
			A(int i){
				// if you dont provide any statement, compiler will automatically provide you the super(); 
			}
		}
		class B extends A{
			B(int i){
				super(i);
			// if you dont provide any statement, compiler will automatically provide you the super(); 
			}
		}
	
	*/

}


class A{
	A(int i){
	}
}
class B extends A{
	B(){
		//super() ;; incorrect because parent class constructor is having arguments. so to make it correct we need to provide like below
		super(10);
		
		//(OR) you need to define one NO ARGS constructor in parent class
		
		
	}
}

/*class ABC{
	ABC(int i){
		
	}

//	NO ARGS Constructor
	ABC(){
		
	}
}
class DEF extends ABC{
	
	DEF(){
//		super() ;; incorrect because parent class constructor is having arguments. so to make it correct we need to provide no args constructor in the parent class
		super();
	}
}
*/

//While overriding Constructors,  if the parent class throws any checked exception then the child class throws same or the parent Exception
// The above rule is completely opposite to the normal Method Overriding concept 

class Parent001{
	Parent001()throws Exception{
		
	}
}
//compile time error as WE need to implement the child class constructor with handling exception 
class Child001 extends Parent001{
}

//To make the above code work we need to implement child class constructor like below

/*class Parent001{
	Parent001()throws Exception{
		
	}
}
//compile time error as WE need to implement the child class constructor with handling exception 
class Child001 extends Parent001{
	Child()throws Exception{
		
	}
}*/



//Below program will throw compile Time error -- Recursive function call : Reason --> 

class Test888{
	Test888(){
		this(10);
	}
	Test888(int i){
		this();
	}
	public static void main(String...strings){
		System.out.println("Hellow How are you.?");
	}
}



class Apple{
	Apple(){
		this(10);
		System.out.println("1st");	
	}
	Apple(int i){
		super();
		System.out.println("2nd");	
	}
	
	public static void main(String...strings){
		Apple apple = new Apple();
	}
}

//Result 2nd 1st



class Some{
	
	Some(){
		this();// Error; first line in constructor should be super()
	}
}

class SomeXYZ{
	SomeXYZ() {
		super();
	}
	
	SomeXYZ(int x) {
		this();//No Error since this is pointing to default/No Args constructor
	}
	
}



//Extends--> when you extend constructor, parent class constructor methods executes first 
class ParentCons00{
	ParentCons00(){
		System.out.println("ParentCons00 ");
	}
}
class ParentCons01 extends Parent{
	ParentCons01(){
		System.out.println("ParentCons01 ");
	}
}

class ChildCons extends ParentCons01{
	ChildCons(){
		System.out.println("ChildCons");
	}
}
//ParentCons00 ParentCons00 ChildCons

m



class Vehicle {
	int x;
	Vehicle() {
		this(10);
	}
	
	Vehicle(int x) {
		this.x=x;
	}
	public static void main(String... strings) {
		Vehicle car = new Car();
		System.out.println(car);
		
	}
}

class Car extends Vehicle{
	int y;
	Car(){
		super();
		this(20);
	}
	Car(int y){
		this.y=y;
	}
	
	public String toString(){
		return super.x + " : " + this.y;
	}
}


