package sample.sample;
public class Part3_PrimitiveDataTypes{
/*
 
Primitive type			Wrapper class			Constructor arguments
-------------			------------			--------------------
byte					Byte					byte or String
short					Short					short or String
int						Integer					int or String
long					Long					long or String
float					Float					float, double or String
double					Double					double or String
char					Character				char
boolean					Boolean					boolean or String
	
	
	*/ 
	public static void main(String... strings) {

		
		
/*
	    valueOf(); you can pass either String or int/boolean
		--------------
		valueOf(integer/String);valueOf(boolean/String)

		Integer.valueOf("10");
		Integer.valueOf(10);
		
		Integer.valueOf("abc");Number format Exception
		
		
		ParseXXX(); Parsing/Converting String into int
		---------------
		Integer.parseInt("10");
		Boolean.parseBoolean("true");
		
		
		invalid cases:
		-------------->
		Integer.parseInt(1);
		Boolean.parseBoolean(true);  
		
		toString(); Converts wrapper object into String
		-----------
		toString(int/boolean...);
		
		Ex: Integer.toString(10); //converting INT to String	
		    Boolean.toString(true); // converting Boolean to String
		    
		    invalid cases
            -------------->
		Ex: Integer.toString("10"); //converting INT to String	
		    Boolean.toString("true"); // String is not allowed since you are converting Wrapper  object into String 


*/
		
// We can use ''new'' keyword only for wrapper classes		
// we are allowed to specify integer or string as the constructor args
		
		//below one can be stored in 'int'
		int integerabc = new Integer(10);
		
		Integer integer = new Integer(10);		System.out.println(integer);//10
//									  (constructor arguments)				
		Integer integer1 = new Integer("10");	System.out.println(integer1);//10	
//									  (constructor arguments)
		
		int integer120 = new Integer("10");	System.out.println(integer120);//10	

		// if you pass other than number it will give you run Time Error -- Arithmetic exception
		Integer integer10 = new Integer("bharath"); 			//System.out.println(integer10);
		
		
		
		Double d = new Double("10.0");System.out.println(d);//10.0
		Double d2 = new Double("10");System.out.println(d2);//10.0
		
		
		//If we pass construct argument as string i.e.. True/TRUE etc JVM ignores case and gives us result ''true'' 
		
		boolean b = new Boolean(true);		System.out.println(b);//true
		Boolean b1 = new Boolean("true");	System.out.println(b1);//true
		Boolean b2 = new Boolean("TRUe");	System.out.println(b2);//true
		Boolean b3 = new Boolean("TRue");	System.out.println(b3);//true
		
		Boolean b4 = new Boolean("Bharath");System.out.println(b4);//false
		
		
		
		
		Integer valueOf2 = Integer.valueOf(10);		System.out.println(valueOf2);//10
//								(constructor arguments)			
		int valueOf = Integer.valueOf("10");	System.out.println(valueOf);//10
		
		
		
//		Parse*** allows user to specify only String, if you specify other primtive data type it will throw compile time erro
		Boolean.parseBoolean("true");
		Integer.parseInt("12");
//		Boolean.parseBoolean(true); //compile time error since we have NOT provided string as constructor argument

//		toString() is used to convert primitive type to string 
		Integer.toString(1);
//		Integer.toString("bh");// compile time error as you are allowed to specify only int
		Boolean.toString(true);
//		Boolean.toString(10);// compile time error as you are allowed to specify only booleab
		Double.toString(12.0);
		
	}

}

class Test{
	public static void main(String...strings){
		Boolean[] b= new Boolean[2];
		b[0]=new Boolean(Boolean.parseBoolean("true"));//true
		b[1]=new Boolean(null);//false
	}
}



class Test123{
	public static void main(String...strings){
		Boolean[] b= new Boolean[2];
		b[0]=new Boolean(Boolean.valueOf(strings[0]));//true
		b[1]=new Boolean(strings[1]);//null
		System.out.println(b[0]+" ,,, "+b[1]);
	}
}

/*
And the given commands
javac Test.java
java Test True null

what is the result.?
	true ,,, false


*/


class Sample{
	public static void main(String...strings){
		String s1="123";
		String s2="true";
		int parseInt = Integer.parseInt(s1);
		boolean parseBoolean = Boolean.parseBoolean(s2);
		System.out.println(parseInt +" ,,, "+parseBoolean);//123 ,,, true
		
		Integer valueOf = Integer.valueOf(s1);
		Boolean valueOf2 = Boolean.valueOf(s2);
		System.out.println(valueOf+" ,,, "+valueOf2);//123 ,,, true
		
	}
}


class Sample123{
	public static void main(String...strings){
		
		
		//Type 1
		Boolean boolean1 = new Boolean("bharath");// false
		Boolean boolean2 = new Boolean("true");//true
		
		System.out.println(boolean1 == boolean2);//false
		System.out.println(boolean1.equals(boolean2));//false ;; as it compares the content and the 2 boolean reference  returns result as false  
		
		//Type 2
		Boolean boolean10 = new Boolean("True");// true
		Boolean boolean20 = new Boolean("true");//true
		
		System.out.println(boolean10 == boolean20);//false
		System.out.println(boolean10.equals(boolean20));//true since both the content/result is true it has given result as true
	}
}
