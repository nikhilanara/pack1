package sample.sample;


public class StaticAndInstanceVariables 
{
	
	// Instance Variable :::: when ever you create a new object 1 new instance variable is going to get create
	// Static Variable 	 :::: for ALL the objects same variable value is going to get shared 	
	int x=10;
	static int y=20;
	
	int x1;
	static int y1;
	
	
	
	public static void Main( String[] args ){
		
		//x is holding 88 && y is holding 99
		StaticAndInstanceVariables app2 = new StaticAndInstanceVariables();
		app2.x=88;
		app2.y=99;
		
		
		
		
		
		//Since we are creating new object again, instance variable(x) is going to be re created with the older value
		//Simple funda is, when ever you create an object, instance variable's  re-initializes with the older values
		//Static variable values is going to get SHARED among the objects
		StaticAndInstanceVariables app4 = new StaticAndInstanceVariables();
		System.out.println(app4.x);//10
		System.out.println(app4.y);//20
		
		
		
		
		StaticAndInstanceVariables app= null;
		System.out.println(app.x);// Throws null pointer exception in the runTime as you are accessing local varaible when the object is null 
		System.out.println(app.y);// No issues
		
    }
	
	
	// We can have multiple main methods with different arguments BUT jvm consider only the method which has ''String args'' in java 
	public static void main(int...is){
		System.out.println("int array");
	}

	public static void main(Double...is){
		System.out.println("Double array");
	}
	
	public static void main(Long...is){
		System.out.println("Long array");
	}
	
}

//Inheritance concept is applicable for main method

class P{
	public static void main(String...strings){
		System.out.println("Parent Main");
	}
}

class C extends P{
	//Since you are extending parent class, parent class main() method gets invoke implicitly
}

// javac P.java
// java P :: Result "Parent Main"
// java C :: Result "Parent Main"


//Method overloading concept is applicable for main method  but is not method overloading its a Method hiding
class Parent{
	public static void main(String...strings){
		System.out.println("Parent Main");
	}
}
class Child extends Parent{
	public static void main(String...strings){
		System.out.println("Child Main");
	}
}


//javac Parent.java
//java Parent :: Result "Parent Main"
//java Child :: Result "Child Main"	


//Static variable values shared among the objects. so the value which has been assigned finally that is going to take place
class Calc01{

	static int x;
	int y;
	public static void main(String... strings) {
		Calc01 calc = new Calc01();
		calc.x=10;
		calc.y=10;
		
		Calc01 calc1 = new Calc01();
		calc1.x=12;
		calc1.y=12;
		
		System.out.println(calc.x +" hey "+calc1.x);//12 hey 12
		System.out.println(calc.y +" hey "+calc1.y);//10 hey 12
	}
}
