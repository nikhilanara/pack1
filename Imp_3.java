package sample.sample;

public class Imp_3 {

	// PS: Till java 6, It Executes Static block first and then it checks whether program is having main method or not whereas in Java 7 or above version it checks in the begining it self
	
    // PS: from java 7 7onwards, It Executes Static block first and then it starts the Main Method Exceution
	
	
	// PS: from java 7 7onwards, JVM checks wheather program having main method or not. if program is having main method THEN it starts the Execution else Run Time error 'NO Main Method'
	
	
	static{
		System.out.println("Hey");
	}
	public static void main(String[] args) {
		System.out.println("String");
		
		
		System.out.println(args.length);
		
		// if you don't provide any arguments value would be '0'
		for (int i = 0; i <args.length; i++) {
			System.out.println(args[i]);
		}
		// No o/p
		
		
		//**** IMP if the array size is '0' then it results AIOOB exception when we are performing any kind of operation
		for (int i = 0; i <= args.length; i++) {
			System.out.println(args[i]);
		}
		// Array Index Out of bound Exception occurs if we dont provide any value
		
		
	}
/*	public static void main(String... args) {
	}
	//compile time error :: Should not contain 2 main methods
	*/
	
	public static void main(int[] args) {
		System.out.println("int");
	}

	public static void main(double[] args) {
		System.out.println("double");
	}
	
	
	
	// JVM will ONLY consider String Array as Main Method. If you run the above program it print the '''String''' as result
	
	// stuff.equals("A") ? "b" :
	
	
	
	
}

class xyz extends Imp_3{
	public static void main(String []args){
		System.out.println("Bharath");
	}
}
