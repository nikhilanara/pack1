package sample.sample;

import pack1.s;

public class IntegralDataTypes1 {
	public static int ij;
	public int hej;

	public static void main(String[] args) {
		//Total 8 Primitive DataTypes
//												NUMERIC DATA TYPE
//			Integral Data Types(default value =0)						Floating Data Types(default value =0.0)											
//			1. Byte 2. Short(Outdated) 3. Int(default) 4. Long . 								5. float 6. Double(default)
		
//		                              NON NUMERIC DATA TYPES(default value =false)
//			7.char 	8 boolean
		
		
		// Integeral Data Types : Decimal(Base 10 : 0 to 9), Octal(Base 8 :: 0 to 7, starts with 0), Hexa Decimal(Base 16 :: 0 to 9, a to f(not case sensitive) starts with 0x or oX )
		int x=12;//Base -10 : DECIMAL allows 0 to 9
		int y=010;//Base -8 : Octal should start with '0'. It allows 0 to 7. if the number starts with  '0' then we can consider it as OCTAL 
		int z =0x10Fd;//Base -16 : Hexa Decimal. It allows 0 to 9, a to f(not case sensitive)). Hexa Decimal Should either starts with ''0x'' or ''0X''
		int z1 =0x10;
//		System.out.println(x+"//"+y+"//"+z1);//	12//8//16
		float f = 012.123f;
		System.out.println(f);
		
		
		long ong =12656756576576L;
		System.out.println("long " +ong);
		//Byte b = 129 --> compile tyme error. Out of range. in the byte we can store value from -128 to 127
		System.out.println(x+y+z);
		
		//INTEGRAL DATA TYPE
		//Byte 1byte(8 bits) size -128 to +127;;;; short 2 bytes(16 bits;;) int 4 bytes;;; long 8 bytes
		
		//Floating Data types
		// Float 4 bytes ;;;; Double 8 Bytes
		
		//Char Bytes char ch ='a' 2 Bytes(16 Bites) --> char can be represented only by using ''single'' quotes but NOT ''double'' quotes
//		*****LONG************
		// if the number is too long then it has to be assigned with 'l' or 'L' other wise it will throw compile tyme error 
		// ex : long l =12;(Valid) long l =12l;(Valid) long l =12L;(Valid) long l =12222222222;(IN Valid) long l =12222222222l;(Valid)		
		// if the number ends with ''l'' then that is considered as Long ex int i =(int) 12L; long l =12L
		
		// there is no need to specify b or s for byte and short. we can directly assign  number with it. ex : short s = 12; byte b =127;
		// Integral DataTypes are : int, byte(-128 to +127), short, long
		// By default floating point literal  is Double type if we want to explicity specify we need to use f/F with the value 
		//double cannot be assigned to the float Ex : float f = 123.455 --> This gives compilation error as we are not suffixing with f/F with the value
		// We need to be specify like this :: float f=123.456F ,,if we don't assign f to the value it will consider the value as double

		//Explanition --> Since Octal base is 8 so, (8)1  (8)0 --> 8
		
		// if the number is suffixed with small or large L then it is considered as LongType Ex: int x=12L
		// we can store octal value in float ex: float f = 0123.3456f
		
		
		// 1 Byte --> 8 Bits i.e.. Range -128 to 127
		//Byte b = 129 --> compile tyme error. Out of range. in the byte we can store value from -128 to 127
		//Short dataType is used in 16 bit processors only 
		//java 9 does not provide support for 32 bit
		
		// old languages are ASCII code based. in java we can represent ASCII code using 'char'
		// c, c++ ASCII based where as Java is unicode(world wise any alphabets it  can support)
		
		// Octal & Hexa decimal values are allowed in floating point dataTypes
		
		
			
		/***********************IMP***************************************/
		
		// integer or long CAN BE stored in float/double. if you execute, it will give you the result in decimal format
		// Similarly char can be stored in 'INT, FLOAT, DOUBLE'
		
		float flong=10L;
		System.out.println(flong);
		
		float fint=10;
		System.out.println(fint);
		
		double d=10L;
		System.out.println(d); 
		

		double dint=10L;
		System.out.println(dint);
		
		//Cannot store String in primitive data Types
		String someStr="Bharath";
		int someVar=(int)someStr;
		Float floatVar =(float) someStr;	
		
		//float or double CANNOT be stored in integer. it will throw compile time error
		
		//int x=10.0d;// compile time error. double or float cannot be stored in integer
		
		
		// byte can be stored in 'short', short can be stored in 'int', int can be stored in 'long', long can be stored in 'float nd double'  
		//byte-> short -> int -> long -> float -> double 
		////byte-> short -> char --> int -> long -> float -> double
		
		/*
		 *Pictorial diagram of storing data types

				byte --- short \ 
				                \
					             \
								 / int  -- long  -- float -- double
		                        / 
		       char_ _ _ _ _ _ /
							
		*/
		
		
		//Explicit type casting'
		
		
		double dExp=12.0;
		float fExp=(float) dExp; // Since we cannot store bigger data type into smaller data type we need to do explicit type casting
		// 8 bytes cannot be stored into 4 bytes some explicit type casting
		
		//Exponential forms are allowed in floating point literals.. IN the below ''e'' is nothing but 10 
		double dexp=1.2e0;//1.2  * 10(0)
		double dexp1=1.2e1;//1.2 * 10(1) => 1.2 * 10 =>12
		double dexp2=1.2e2;//1.2 * 10(2) => 1.2 * 100 =>120
		double dexp3=1.2e3;//1.2 * 10(3) => 1.2 * 1000 =>1200
		double dexp4=1.2e4;//1.2 * 10(4) => 1.2 * 10000 =>12000
		
		
		//compile time error since we you cannot store float in ''double''
		//To resolve this, we should prefix with f(or)F
		//float fexp =1.2e0;
		
		float fexp1 =1.2e0f;// Valid since we are prefixing float value with 'f' 
		
		
		//HexaDecimals are not allowed in floating point literals
		
		
		//default values for below data Type's
		//int --> 0 ;;; 		String, Object --> null;;;;		boolean ---> false

		
		int i, j=0;
		i = (3 * 2 +4+5);
		System.out.println(i);//15
		j=(3 * (2+4) +5);
		System.out.println(j);//23
		
		
		//which are the valid identifier's
		/* Allowed --> an identifier can start with '$ (OR) _ (OR) numbers, alphabets'
		 * Not Allowed -->an identifier should NOT Contains keywords, Primtive dateTypes, @,#,%..etc except @, _
		total_number (Valid)
		total# 		 (In Valid) --> should not contain '#'	
		123total	 (In Valid)	--> should not start with 'NUMBERS'
		total123	(Valid)
		cas$H		(Valid)
		_$_$_$_$	(Valid)
		all@cash	(In Valid) --> should not contain '@'
		java2Share	(Valid) 	
		
		
		Integer, Long (Valid) --> wrapper class objects are allowed
		INT
		int
		
		if, else, switch, new,  --> these keywords are not allowed
		
		*/
		// we can use underscore(_) symbol only b/w digits
		double dble =_12_12.10; //Error; Starting//ending we should not use '_'
		//double dble01 =12_12._10;//Error; after/before dot we are not allowed to use '_' 
		//double dble02 =12_12.10_;//Error; Starting//ending we should not use '_'
		
		//Default type 'null' can be used only for String & objects. if you use null for primitive dataType  it will throw compile time error 
	
		//int can be stored in char,, similarly char can be stored in int 
		int inType='a';
		char ch =97;
		
		//The above promotion is NOT applicable for Arrays Types
		int inType1[]=new int[4];
		char chType2[]={'a','b','c','d'};
		
		int promType00[]=inType1;
		int promType02[]=chType2;// Compile time error; This type of promotion is not applicable for arrayTypes
		
		
		
		//Escape Characters in java 
		
		/*
		
		Escape Character 			Description
		-------------------			-------------
		\n 							newLine
		\t 							Tab space
		\r 							return
		\b							Back space
		\f 							form feed
		\'							Single quote
		\''							Double quote
		\\							Back slash
		
		*/
		System.out.println("bharath\'s car");//bharath's car
		System.out.println("bharath\"s car");//bharath's car
		System.out.println("bharath"s car");//Error since we have not used Escape character ''\''
		System.out.println("bharath\\s car");//bharath\s car
		
		char ch001='\uabc0';
		char ch002='\uabcd';
		char ch004='\u1234';
		char ch005='\uabc';//In valid; as we must need to specify 4 digit number
		char ch006='\u001';//In valid; as we must need to specify 4 digit number
		char ch008='\t1234';//In valid; as we should not use Other escape characters Except ''\u'' ALSO when you are representing 4 digits you must need to use '\u' as starting
		char ch04='1234';//when you are representing 4 digits you must need to use '\u' as starting
		
		
		

		
	}
}
 	