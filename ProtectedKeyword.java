package sample.sample;

public class ProtectedKeyword {

	protected void M1(){
		
	}
	public static void main(String[] args) {
	}
}
//Same Package
//When it is with in a package, Protected methods can be called either by using Parent or Child Reference.
class D extends ProtectedKeyword{
	// Here B is a child class D is a Parent Class
		public static void main(String...strings){
			//Valid -> Since we are using child reference to call Protected Method
			D d =new D();
			d.M1();
			
			//Valid --> Protected method can be called using Parent Reference when it is in same package
			ProtectedKeyword b =new ProtectedKeyword();
			b.M1();
			
			//Valid --> Protected method can be called using Parent Reference when it is in same package
			ProtectedKeyword b1 =new D();
			b1.M1();
			
		}
	}

//Different Package
//Below rule applies when you are calling protected method from other packages 
// Rule 1::: Protected methods can be accessed from other Packages only By using Child Class Reference
//Example 1
/*
package p1;
import sample.sample.*;
class ChildClass extends ProtectedKeyword{
	
	//Valid -> Since we are using child reference to call Protected Method
	ChildClass cs =new ChildClass();
	cs.M1();
	
	//Invalid --> Parent Reference cannot be used to call Protected Method 
	ProtectedKeyword pkeyword=new ProtectedKeyword();
	pkeyword.M1();
	
	//Invalid --> Parent Reference cannot be used to call Protected Method
	ProtectedKeyword pkeyword1= new ChildClass();
	pkeyword.M1();
	
}
*/


/*
Example 2
package p1;
import sample.sample.*;

class B extends ProtectedKeyword{
	
}

class D extends B{
// Here B is a child class D is a Parent Class
	public static void main(String...strings){
		//Valid -> Since we are using child reference to call Protected Method
		D d =new D();
		d.M1();
		
		//Invalid --> Parent Reference cannot be used to call Protected Method
		B b =new B();
		b.M1();
		
		//Invalid --> Parent Reference cannot be used to call Protected Method
		B b1 =new D();
		b1.M1();
		
	}
}*/