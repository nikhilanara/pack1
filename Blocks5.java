package sample.sample;
import javax.swing.*;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class Blocks5 {
	// Break : Break the entire Loop
	// Continue : Continues to the Next iteration; Continue cannot be used outside of loop 
	

	
	//Whenever you create an object for class, instance block will get invoke automatically
	//instance block --> can be declared only inside a class; This will get invoked when you create an object for class
	{
		System.out.println("instance block");
	}
	
	//static block will be invoked at the time of class invoking; This invokes first and then it invokes main method 
	static
	{
		System.out.println("static");
	}
	public static void main(String[] args) {
		Blocks5 block = new Blocks5();
		
		//labeled Block --> Has to be created only inside a method
		//ex1:
		int m=10;
		System.out.println("Hello ");
		l1:{
			System.out.println("Begin ");
			if(m==10)
				break l1;
			System.out.println("End ");
		}
		System.out.println("Hi ");
		
		//Result --> Hello Begin Hi  
		
		//ex2:
		int i=10;
		abc:{
			System.out.println("Labeled Block");
			if(i==10)
				break abc;
		}
		
		//Result Labeled Block
		
//		*********BREAK*************
	/*	Breaks the loop. 
	 * // we can use break statement only in loops NOT in if blocks. If you are trying to use it will throw compile time errors		*/
//		ex:
		for(int j=0; j<10; j++){
			System.out.println(j+",");
			if(j==1){
				System.out.println("Breaking loop");
				break;
			}
		}
		//Result : 0,1 Breaking loop
		
//		*******Continue************
//		continues the next iteration
		
		// Ex1
		for(int k=0; k<4; k++){
			if(k==1){
				continue;
			}
			System.out.println("Continuing loop "+k);
			//Result : 0, 2, 3, 4
			//When the k value is 1 it break the execution till that point and move's on to the next iteration
			
		}
		
		// Ex2
		int abc=10;
		if(abc==10){
			//continue;// compilation error; cannot be used outside of loop i..e continue or break cannot be us inside if loop it should be surrounded with For loop
		}
		
		for (int j = 0; j < 10; j++) {
			if(j%2	==	0){
				continue;
			}
			System.out.println(j);
		}
		//Result 1,3,5,7,9
		
		//it increments the loop by 2 i.e j value 0, 2, 4
		// j+=2 is j = j+2 ;;;  
		
		for (int j = 0; j <=4; j+=2) {
//			System.out.println("inc "+j);
			//Result : inc 0, inc 2, inc 4
		}
		
		//it increments the loop by 3 i.e j value 0, 3, 6, 9  
		for (int j = 0; j <=9; j+=3) {
			System.out.println("inc "+j);
			//Result : inc 0, inc 3, inc 6, inc 9
		}
				

		//it increments the loop by 3 i.e j value 0, 3, 6  
		for (int j = 0; j <9; j+=3) {
			System.out.println("inc "+j);
			//Result : inc 0, inc 3, inc 6
		}
		
		//it decrements the loop by 2 i.e j value 0, 2, 4  
				
	}
	
	public void hello(){
		System.out.println("Hello");
		
		int x=5;
		int y=5;
		for (int i = 0; i < 4; i++) {
			System.out.println("Pre decrement " + --x);
			System.out.println("Post decrement "+ y--);
			/*
			x= Pre increment 4, Pre increment 3, Pre increment 2, Pre increment 1 
			y =Pre increment 5, Pre increment 4, Pre increment 3, Pre increment 2
			*/
		}
		
		// After you use Break/Return keyword you are NOT allowed to specify any statement, if you do, it will throw compile time error
		
		int data[] ={10,20,30,40,50,30};
		int k=30;
		int count=0;
			
		for (int i : data) {
//			   ( !=30)	
			if(i!=k){
				continue;
			}
			count++;
		}
		System.out.println(count);
		//Result 2
		
		int data10[] ={10,20,30,40,50,30};
		int k10=30;
		int count10=0;
		for (int i10 : data10) {
			if(i10==k10){
				continue;
			}
			count10++;
		}
		System.out.println(count10);
		//Result 4

		// Ex2
		int data1[] = { 10, 20, 30, 40, 50, 30 };
		int k1 = 30;
		int count1 = 0;
		for (int i : data1) {
			if (i != k1) {
				continue;
			}
			System.out.println(count1++);
		}
		//Here the count would be one 1 because you not Re- using the variable
		//Result: 0, 1
		
		//Ex 3 IMP
		int abc[] ={1,2,3,4,5};
		for(int i=0; i<5; i+=2){
			// i value starts with 0 and then increments by 2
			//i value will be 0, 2, 4 i.e 0 , 0+2=2, 2+2=4;
			System.out.println(abc[i]);
		}
		//Result 1, 3, 5
		
		//Ex 4 IMP
		int def[] ={1,2,3,4,5};
		for(int i=1; i<5; i+=2){
			// i value starts with 1 and then increments by 2
			//i value will be 2, 4 i.e 1 , 1+2=3
			System.out.println(def[i]);
		}
		//Result 2, 4
		
		System.out.println(5>5);//false
		System.out.println(4>4);//false
		System.out.println(4<4);//false	
	}

}

// VERY IMP BIT

class sep{
	public static void main(String...strings){
		int num=5;
		
		//this while loop will run until the condition is true
		while(isAvailability(num)){
			System.out.println(num);
			num--;
		}
	}
	
	public static boolean isAvailability(int num){
		return num>0 ?true:false;
	}
	
	
}

//Result 5,4,3,2,1




