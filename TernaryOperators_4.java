package sample.sample;

public class TernaryOperators_4 {

	public static void main(String[] args) {
		

//		Example
		//***Adding can be done ONLY it is having 2 numbers starting i.e 4+5, 6+8
		//while adding/subs, when it contains a string at the beginning you wont be able to achieve add/operation. To achieve add/subs operation you must use '()' 
		String a ="durga";
		int b=10;
		int c=20;
		int d=30;
		System.out.println(a+b+c+d);//durga102030   ;;; since it contains String before you perform add operation, you can't be able to achieve add operation
		System.out.println(b+a+c+d);//10durga2030
		System.out.println(b+c+a+d);//30durga30
		System.out.println(b+c+d+a);//60durga
		System.out.println(a+b+(c+d));//durga1050
		
		
		//IMP
		System.out.println(	1+2	);//3
		System.out.println( (1+2) );//3  Need to use () for addition other wise it will treat as String
		
		
		System.out.println("Result is "+ 4+5);//Result is 45 // since it is having sting as starting, it wont be eligible for addition 
		System.out.println("Result is "+ (4+5) );//Result is 9 // since we are using parenthesis, it adds number even it is having string
		System.out.println("Result is "+ (4)+(5));//Result is 45// it becomes like this .. Result is "+ (4)+(5) -->Result is "+ 4+5  
		
		
		int z=10;
		System.out.println(++z);//11
		
		char ch ='a';
		double dob =10.5;
		System.out.println(dob++);//10.5
		System.out.println(ch++);//a
		
		//:: Anything divided by ZERO(0) return Arithmetic Exception.. i.e  0/0, 1/0, 2/0
		//:: if the division(UpperValue) contains floating point number(0.0)  It Retuns NAN  i.e  0.0/0.0, 0.0/0, 0/0.0, 1/0.0, 2/0.0
		//:: Result is 'Infinity' when you are dividing like this  1/0.0, 2/0.0,  
		//:: If Zero is diving number other than Zero then it gives '0' as Result i.e 0/1, 0/2, 0/3..
		//
		
		int x1=10/0; //retuns Run Tyme Exception Anything divided by 0 returns exception-- > Arithmetic Exception  
//		System.out.println(x1);// Arithmetic Exception
		
//		int x123=10.0/0;// compile time error as you cannot store double type in int 
		
		int q=10/0;
		System.out.println(q);//retuns Run Tyme Exception -- > Arithmetic Exception
		
		int w= 0/0;
		System.out.println(w);//retuns Run Tyme Exception -- > Arithmetic Exception
		
		//int e= 0/0.0;// compile time error : cannot store int in double
		
		int r=0/10;
		System.out.println(r);// 0
		
		int t=0/2;
		System.out.println(t);// 0
		
		double d0 =0.0/0;
		System.out.println(d0);//NAN
		
		double d1 =0/0.0;
		System.out.println(d1);//NAN
		
		
		double d2 =0.0/0.0;
		System.out.println(d2);//NAN

		
		// In valid cases : Compile time error -- bad operators
		System.out.println("bha"<"bharath");
		System.out.println(true<false);
		System.out.println(10<20<30);
		System.out.println((10<20)<30);
		
		//Arithmetic Exception ==>
			//possible only in integral Arithmetic but not in floating point arithmetic
			// /, % --> It occurs only if we use  the operators incorrectly.

		System.out.println(10>10);//false
		System.out.println(10<10.0);//false
		System.out.println(10<'a');//true
		//System.out.println(true<false);//compile time error
//		System.out.println(	10<20<30);//compile time error --> Bad comparsion 
//							true<30   Bad comparision; cannot compare boolean and integer 
		
		
		
		
		//System.out.println(true<true);
		
		// in switch, following are allowed							NOT allowed in Switch
		//Byte,short,int, Enum, Char, String						boolean, double, float, long
		

		// in Arrays, following are allowed to specify size			NOT allowed in Arrays
		// Byte, short, int, Char									boolean, double, float, long, String, Enum, 
		
		
		int abc=10;
		switch(abc){
		case 10:
			System.out.println("1st Case");
			break;
			
		case 20:
			System.out.println("2nd Case");
			break;
			
		case 40:
			System.out.println("3rd Case");
			break;
					
		/*
		 //We can use variable's in the case statement only if it is marked as ''final'' 
		  case abc://variable is not allowed to take inside SwitchCase; Compile tyme error
			System.out.println("firstconsition");
			break;*/
			
		default:
			System.out.println("default case");
			break;
		}	
	//ANS: 1st Case 
	//PS: jvm executes DEFAULT case only if it does NOT find any matching case.
			
			

			int def=30;
			switch(def){
			case 10:
				System.out.println("1st Case");
				break;
				
			case 20:
				System.out.println("2nd Case");
				break;
				
			case 40:
				System.out.println("3rd Case");
				break;
				
			default:
				System.out.println("default case");
				break;
			}	
		//ANS: 		default case
		// It executes default case because it didn't find any matching case statement
				
				

			int ghi=10;
			switch(ghi){
			case 10:
				System.out.println("1st Case");
			// No break so it executes next statement as well	
			case 20:
				System.out.println("2nd Case");
				break;
				
			case ghi:
				System.out.println("3rd Case");
				
			default:
				System.out.println("default case");
				break;
			}
			
		//ANS: 		1st Case 2nd Case
			
			String s ="A";
			switch (s) {
			
			case "A":
				System.out.println("Hey");
				break;
			default:
				System.out.println("Mu");
				
			case "a":	
				System.out.println("Hellow");
				
			}
		
		//Ans Hey
			
		/*	String s ="A";
			switch (s) {
			
			case "A":
				System.out.println("Hey");
			default:
				System.out.println("Mu");
				
			case "a":	
				System.out.println("Hellow");
				
			}
		
		//Ans Hey Mu Hellow
*/	
			
		int x = 2;
		switch (x) {
		default:
			System.out.println("def");
			
		case 0:
			System.out.println(0);
			break;
			
		case 1:
			System.out.println(1);

		case 2:
			System.out.println(2);
		}
		
//		Ans: 2
		

//** IMP Case Datatype should be matched with Switch DataType otherwise it will throw compile time error
		
		int integ = 2;
		switch (x) {
		default:
			System.out.println("def");
			
		case "Strin"://Since the Switch type is 'int' you are not allowed to use other dataTypes
			System.out.println(0);
			break;
			
		case 1:
			System.out.println(1);

		case 2:
			System.out.println(2);
		}
		
		
			
			//Ex1::
			int m=100;
			int a1=m++;//100
			int b1=++m;//102
			int c1=m++;//102
			

			//int d=(a1<b1)?	(a1<c1)?a1:(b1<c1)?b1:c1;// compilation failure need on more expression
			
			
			
			int d11=(a1<b1)?	(a1<c1)?a1:(b1<c1)?b1:c1:m;//100
			
			//Ex2::
			int q1=1;
			int w1=0;
			if(++q1 > ++w1){
				System.out.println("Hello");
			}else{
				System.out.println("Hi");
			}
			System.out.println("Durga "+q1+" "+w1);//Hello Durga 2 1
			
			
			
			//Ex3::
			int p=9;
			if(p++<10){
				System.out.println(p+ " Hello India");
			}else{
				System.out.println(p+" Hello Durga Soft");
			}
			//10 Hello India
			
			
			
			//Ex4::
			int i=20;
			int j=30;
			int k = j+=  i/5;
			//  k = j=j+i/5
			//  k = j=30+20/5 
			//  k = j=34
			System.out.println(i+" "+j+" "+k);//20, 30 m 34
				
			
			//compile time error since it is missing 2 argument
			/*for(int i=0; i++){
				System.out.println("This will run infinite tymes");
			}*/


			System.out.println("This will run infinite tymes");
			for(int ijk=0; ;ijk++){// it compiles fine as we have provided ';' in place of second argument
			}
	
			
				
	}
}


class Ter{
	public static void main(String...strings){
//	Ex 1:
		
		String str = "OCJA";
		String result = null;
		if (str.equals("JAVA")) {
			result="First Level";
		}else{
			result="Second Level";
		}
		System.out.println(result);//Second Level
		result =str.equals("OCJA")?"First Level":"Second Level";
		System.out.println(result);//First Level
		
		
//Ex2: Convert if condition into Ternary operator
		
		String color="White";
		String resultStmt=null;
		if(color.equals("Red")){
			resultStmt="Red";
		}else if (color.equals("Blue")) {
			resultStmt="Blue";
		}else if (color.equals("White")) {
			resultStmt="White";
		}
		System.out.println(resultStmt);//White
		
		resultStmt=color.equals("White")?"White":color.equals("Blue")?"Blue":color.equals("White")?"White":"No result";
		System.out.println(resultStmt);//White
	}
	
	
}