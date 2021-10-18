package sample.sample;

public class VariableDeclaration_3 {
	
	//volatile means keep on changing ;;;; ex : volatile int abc=12;
	//;instance variable --- The variables which are declared inside a class known as instance variables
	
	String name;//instance variable Jvm provides default value null , if we dont provide any value;; no need to initialize the value
	static int rollNum;//instance variable  --> Jvm provides default value '0', if we dont provide any value  ;;no need to initialize the value
	
	static int rollNum1;//Static Variable for memory mangement
	
	int au=0;
	final int x=0;// when the variable is declared as final it MUST BE  initialized otherwise it will throw compile time error. When the variable is declared as final its value MUST NOT be changed
	
	public static void main(String...args) {
		
		//  Instance variables are NOT allowed to access inside a static method. It'll throw compile time error if you are trying to call it. Below is the example for it:
		
		//To call instance variables inside a static method we need to create an object of class and then we have to access it.. below is the ex:
		VariableDeclaration_3 variableDeclaration=new VariableDeclaration_3();
		System.out.println(variableDeclaration.rollNum);
	
		// PS : To call non static method's or variables inside a static we must need to create an object of class and then we have to call it
		
		VariableDeclaration_3 variableDeclaration2=null;
				System.out.println(variableDeclaration2.name);// ERROR :: Object CANNOT be null to access INSTANCE variable's. It will throw null pointer exception if you are trying to call it
				System.out.println(variableDeclaration2.rollNum);// PASS :: Here, we can access the STATIC variables even when the object is null
		
		
		int x;
		if(args.length>0){
			x=10;
			System.out.println(x);
		}
		
//		variable types --> Local, instance or object level variable, Static variable
/*		
       	Instance variable's Explanation
       ::: variables which are declared inside the class defined as instance variable's
       ::: EveryTime when you create a new object then instance variables will get created automatically
       ::: instance variable are created at the tyme of object created  
		*/
		
		
//		! Identifiers can start with a letter, a dollar mark or an underscore. They can be any length
		/*
		
		Choose the three legal identifiers.
		
		 A. 1stName
		 B. _4_
		 C. @name
		 D. $
		 E. getSize
		 
		 ANS B,D, E
		
		
		*/

		
		// the variables which are declared inside the try-catch Block or if block CANNOT be accessed out side of class;
		//If you are trying to access, it will throw compile time error
		for (int i = 0; i < 4; i++) {
			System.out.println("Hello "+i);// i is local variable Here
		}
		//System.out.println(i);//Compile Time error ; ''i'' cannot be acessed ouside of Try block
		
		String str="Hey";
		if(str=="khj"){
			int j;// j is local variable Here
		}
		System.out.println(j);//Compile Time error ; ''i'' cannot be acessed ouside of Try block
		
		try {
			Integer.parseInt("Ten");
			int x1=110;
		} catch (NumberFormatException e) {
			System.out.println(x1);//Compile Time error ; ''x1'' cannot be acessed ouside of Try block
			e.printStackTrace();
		}
	}
	

	 
	 public void method1(){
		 //** variable which are declares inside method should NOT be declared with any modifiers except 'final'. it will throw compile time error if you use
		 //public int abc=0;// compile time error; should not use public
		 //private int abc1=0;// compile time error; should not use private
		 
		 
		  int z;// local variable : JVM Does not provide default values for local varibles. we explicitly need to specify values for it;; 
		 String str; // local variable : JVM Does not provide default values for local varibles. we explicitly need to specify values for it
		 //System.out.println(z);//PS : if we are trying to use local variables without initializing then it will throw COMPILE TIME ERROR
		 
		
		 
		 
		 //NOTE: Cannot declare 2 or more same main methods
		  
	 }
	 
	 public static void main1(String... args){
		 //String... refers 1-D array; ... indicates 1-D Array
		 //String[]... refers 2-D array
		 
	 }
	 
	 
	 // private; can be used only with in a class
	 // default; can be used only with in a package
	 // public;  can be used anywhere
	 // protected: can be used only with in a package AND in other package you can use only in child class
	 // local variable: can be used only with in a method and it should not be declared with any modifiers except 'final' 

}



//Method overriding rule is NOT applicable for variables
//variable resolution is always taken care by JVM based on object reference type
class Mark{
	int x=10;
}

class Henry extends Mark{
	int x=20;
}

class MarkHenry{
	public static void main(String...strings){
		Mark mark = new  Mark();
		System.out.println(mark.x);//10; 
		
		Henry henry = new Henry();
		System.out.println(henry.x);//20
		
		Mark mark1 = new Henry();
		System.out.println(mark1.x);//10: Since we've used ''Mark'' object reference so it is going to take that corresponding variable
		
	}
}


class Feline {
	public String type = "f ";

	public Feline() {
		System.out.print("feline ");
	}
}
 class Cougar extends Feline {
	public Cougar() {
		System.out.print("cougar ");
	}

	void go() {
		//Re initializing type 'f' to 'c'
		type = "c ";
		System.out.print(this.type + super.type);
	}

	public static void main(String[] args) {
		new Cougar().go();
		
	}
}
 //Result: feline cougar c c
 
 
 class StrictFP{
	 
	 /*
	 strictFP can be used only for class & methods but not for variables. it came in 1.2 version
	 usually the result of FP arithmetic varies from platform to platform. if we require platform independent result for FP arithmetic then we should go for strictFP modifier
	 System.out.println(10.0/3);//3.333333 5 to 6 decimals in  16 bit processor
	 System.out.println(10.0/3);//3.3333333 14 to 15 decimals in 32 bit processor
	 */
	 
	 public strictfp void he(){
		 
	 }
 }
 
//variable can be initialized inside instance block. this rule is applicable only for instance block.
//in the other cases we Must have to initialize it

class HelloBroh{
	final int x;
	{
		x=10;
	}
}

class staticBlock{
	//since it is declared as static, we are allowed to initialize the value in static block
	final static int x;
	static{
		x=10;
	}
}

//the variables which has been declared inside method must need be initialized
//inside method, we are allowed to use only final for variable declaration. access modifier's and other keyword are strictly NOT allowed 
