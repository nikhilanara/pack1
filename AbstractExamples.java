
package sample.sample;


abstract class AbstractExamples {
	// Abstract methods are by  default having 'default'  access modifiers
	//Abstract class CAN contains WITHOUT abstract methods
	// in the abstract class, There is NO such rule that it must contains at least one abstract method
	
	// Normal method - Should contains body eg: void m2(){}  				 ;;;;;; Abstract method - Should NOT contain body eg:  abstract void m2();   
	
	
	//A method which has been declared as abstract should not contains implementation for it
	// abstract methods can have return type int or string or etc AND it can aslo contains parameters inside method
	abstract void some();
	
	public abstract void m2();
	
	public abstract void mParam(String param);
	
	public abstract int m3();
	
	//A method which is NOT declared as abstract should contain body for it
	void some1(){
		System.out.println("Body");
	}
	
	strictfp void some1111(){
		System.out.println(10/3); // this will give you different result when you run it in different env's. Ex 3.33333 in 32 bit OS;;;;;3.3333333333333333333333 in 64 bit OS
		//so to get a same reult everywhere we need to use ''strictfp''' Strictfloatingpoint
	}
	
	 void m1(){
		System.out.println("Hellow");
	}
	
	 
	 String m12(){
		 System.out.println("Hello it is having String as return type");
		 return "s";
	 }
}



// which of the following code fragments are invalid
/*
Ex 1

1. 
public abstract abc{
	
	public void m1();//invalid; a method which is NOT declared as abstract SHOULD contain body
	public void m2();//invalid; a method which is NOT declared as abstract SHOULD contain body
}

2. 
abstract class abc{
	
	public abstract void m1();// valid ; Here method is declared as abstract and we did not provided implementation for it
	public void m2();// invalid; a method which is not declared as abstract should contain body
}

3. 
abstract class abc{
	
	public abstract void m1();// valid ; Here method is declared as abstract and we did not provided implementation for it
	public void m2(){
		
	};//Valid; Since we have provided body for it
}

4. 
abstract class abc{
	
	public abstract void m1(){// invalid ;A which is not declared as abstract should NOT contain body for it 
		
	}
	public abstract void m2(){//invalid ;A which is not declared as abstract should NOT contain body for it
		
	};
}

*/

/*

interface ABC{
	public void m1();
	public void m2();
}

class SOME implemets ABC{
	public void m1(){
	}
}

which of the following changes individually wll compile the code successfully.?
1. insert public void m2(){} inside class SOME
2. declare class SOME as Asbtract
3. insert public void m2(); inside class SOME
4. No changes are required

Ans 1 & 2

*/
/*

interface Writable{
	public void writeBook();
	public void setBookMark();
}

abstract class Book implements Writable{ // Line 1

	public abstract void writeBook() {//CE; user is NOT allowed to use abstract while implementing interface methods
	// Line 2
	}
	public void writeBook() {
	// Line 2
	}
}

class EBook extends Book{// Line 3
	public void writebook() {
	}
	// Line 4
}

which of the following changes individually will compile the code successfully.?

1. Replace Line 3 with abstract class EBook extends Book
2. Replace Line 1 with class Book implements Writable
3. At Line 2, public void setBookMark();
4. Line 4, insert  public void setBookMark(){}

   Ans : 1 and 3
*/



/*

Ex1: 
package pack1;
public class A{
	int p;
	private int q;
	protected int r;
	public int s;
}

package pack2;
import pack1.A;
public class B extends A{
	 A a=new B();
}


which statements are true.?
1. By using objects we can access p and s
2. By using objects we can only s
3. By using objects we can access r and s
4. By using objects we can access p, r and s

Ans  : 2

*/



/*
package pack1;
public class A{
	
}
package pack1.pack2;
//Line 1
public class B{
	public void m1(){
		A a = new A();
	}
}

package pack3;
//Line 2
public class C{
	A a = new A();
	B b = new B();
}

which of the following changes individually will compile the code successfully.?
1.  Line 1 with 
 	import pack1.A;
 	
 	Line 2 with
 	import pack1.A;
 	import pack1.pack2.B;
 	
2.  Line 1 with 
 	import pack1; // invalid .* is missing
 	
 	Line 2 with
 	import pack1;// invalid .* or . class name  is missing
 	import pack1.pack2; //invalid .* or . class name  is missing
 	
 		
3. 	Line 1 with 
 	import pack1.A;// valid
 	
 	Line 2 with
 	import pack1.*;//invalid; we must need to provide sub class package name

4. 	Line 1 with 
 	import pack1.A;
 	
 	Line 2 with
 	import pack1.pack2.*; //invalid; we must need to provide parent class package name

ANS 1 is only valid

*/





