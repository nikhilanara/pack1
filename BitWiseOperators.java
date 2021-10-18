package sample.sample;

public class BitWiseOperators {
	
	public static void main(String...strings){
		
//		Bitwise operators 
//		& ==> if both arguments are true
//		! ==> if at least one argument is true
//		^ ==> X-OR if both arguments are different
		 
		System.out.println(true & true);//true
		System.out.println(true | false);//true
		System.out.println(true ^ false);//true
		System.out.println(true ^ true);//false
		
//		~ only for integral types
		System.out.println(~4);//-5		
		System.out.println(~5);//-6
//		! only for boolean types
		System.out.println(!true);//false
//		!&^ only for boolean and integral types
		
		
		//Right associative
		int a,b,c,d;
		a=b=c=d=10;// Assignment is always from right to left
		a+=b-=c*=d/=2;
		System.out.println(a+b+c+d);//40
		System.out.println(a+""+b+""+c+""+d);//10101010
		
		
		// Compile time error; should not specify value when declaring multiple variables
//		int a=b=c=d=10;
//		& I ^
		
	}
}
