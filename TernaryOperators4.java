package sample.sample;

public class TernaryOperators4 {

	// TernaryOperators symbol is  ''' ?:''''
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Increment or Decrement Rule can be applicable for all primitive dataTypes except ''boolean''
		// When the variable is declared as ''final'' it is NOT applicable for Incrementing or Decrementing operator 
		
		
		//Ex:1
		int x=10;
		int i = x++;//post increment.. Incremented Value does not assign to variable. 
		System.out.println(x);//11
		System.out.println(i);//10
		
		
		//Ex:2
		int y=10;
		int j = ++x;//Pre-increment.. Increment and assignment to the value happens at the same time
		System.out.println(x);//11
		System.out.println(j);//11
		
		double x11=10.0;
		double i1 = x11++;//post increment.. First Assigning value to the variable and then incrementing value
		System.out.println(x11);//11.0
		System.out.println(i1);//10.0
		

		char ch='a';
		char ch1 =ch++;//post increment.. First Assigning value to the variable and then incrementing value
		System.out.println(ch);//b
		System.out.println(ch1);//a
		
		//:: Same applicable for decrement
		
		//Ex:3
		int z=10;
		//int k = ++10;//Compiler Error; We cannot use variable in Ternary operator. only values are allowed  
		
		//Ex:3
		int p=10;
		//int k = ++(++p);//Compiler Error; We cannot use variable in Ternary operator. only values are allowed
		
		
		final int f=0;
		//f++;// Compile time error: Inc OR Dec Operators are not applicable for final operators
		
		
		//How many objects & Refernce Variables we have.?
		
		Thread thread1 = new Thread();//1 Object
		Thread thread2 = new Thread();//2 Object
		Thread thread3 =thread1;
		
		//2 Objects and 3 Reference variable ;; Objects will get created when we use ''new'' keyword 

		//:: == operator for comparing 2 same Objects. Compile Time error occurs when you are comparing 2 different object Types
		
		
		System.out.println(thread1==thread3);//Return true since we are comparing 2 IDENTICAL objects
		System.out.println(thread1==thread2);//Return false since we are comparing 2 DIFFERENT object
		
		String str =new String("Bharath");
		String str1 =new String("Bharath");
		System.out.println(str==str1);// False --> since we are comparing 2 diff objects
		
		
		//Ex1 
		Object object = new Object();
		String string= new String("Kumar");
		Thread thread = new Thread();
		
		System.out.println(object	==	string);//Return false since we are comparing 2 DIFFERENT object
		System.out.println(object	==	thread);//Return false since we are comparing 2 DIFFERENT object
//		System.out.println(thread	==	string);// Compilation Error; Bad comparison; In comparable types String and Thread
//		System.out.println(string	==	thread);// Compilation Error; Bad comparison; In comparable types String and Thread
		
		//Ex2
		String string2 = new String("bharth");
		StringBuffer stringBuffer = new StringBuffer("bharath");
		//System.out.println(string2==stringBuffer);// Compilation Error; Bad comparision; In comparable types String and StringBuffer
		
		
		//:: .equals for content comparsions. IMP -- Content should be compared from SAME dataType other wise it will return false
		//Ex1:
		System.out.println(string2.equals(stringBuffer));//false; Since we are comparing content in 2 different objects types
		String str01 =new String("Bharath");
		String str02 =new String("Bharath");
		System.out.println(str01.equals(02));//true as we are comparing content from 2 same object types
		
		
		
		String abc ="bhh";
		String abc1 ="bhh";
		System.out.println(abc==abc1);//true
		
		System.out.println("abcc"=="abcc");//true
		
		
		
		
		
		
		
		//;; Difference b/w && And &
		
		//; x && y ;; y will be evaluated only if x is true
		//; x || y ;; y will be evaluated only if x is false
		
		//; x & y ;; x and y both will be evaluated even if x is false
		//; x | y ;; x and y both will be evaluated even if x is true
		
//Ex1		
		int x1=10;
		int y1=15;
		if(++x1<10 && ++y1>15){
			x1++;
		}else{
			y1++;
		}
		System.out.println(x1+" "+y1);// 11, 16
//Ex2
		int x001=10;
		int y001=15;
		if(++x001<10 & ++y001>15){
			x001++;
		}else{
			y001++;
		}
		System.out.println(x001+" "+y001);// 11, 17
//Ex3
		int x021=10;
		int y021=15;
//		if( ++x021 < 10 || ++y021 > 15){
		if( ++x021 < 10 | ++y021 > 15){
			x021++;
		}else{
			y021++;
		}
		System.out.println(x021+" "+y021);// 12, 16
		
		
		
		
		int con=(10>20)?30:40;
		System.out.println(con);//40
		
		int con1=(10>20)?30:((40>50))?60:70;
		
		System.out.println(con1);//70
		
		
		
		
				
	}

}


class Student{
	String class_name;
	int class_rollNo;
	Student(String name, int rollNo){
		this.class_name=name;
		this.class_rollNo=rollNo;
	}
	
	public static void main(String...strings){
		// .equals --> Content comparison  ;;;; == --> for reference comparison 
		
		Student student1 = new Student("Bharath" , 12);
		Student student2 = new Student("Ranbir" , 122);
		Student student3 = new Student("Bharath" , 12);
		Student student44 = student1;
		
		// it returns true as we are comparing 2 same objects
		System.out.println(student44==student1);// true
		System.out.println(student44.equals(student1)); // false
		
		//Ex 1
		System.out.println(student1==student2);;//false Since we are comparing 2 different objects
		System.out.println(student1==student3);;//false Since we are comparing 2 different objects
		
		
		//It returns failure as we are comparing 2 different objects. 
		//When you are comparing 2 objects using EQUALS operator content does not matter, it ONLY checks the object refernces  
		System.out.println(student1.equals(student2));//false
		System.out.println(student1.equals(student3));//false
		
		
		//ex 2
		String str1 = new String("Bharath");
		String str2 = new String("Kumar");
		String str3 = new String("Bharath");
		
		System.out.println(str1==str2);//fail
		System.out.println(str1==str3);//fail
		
		System.out.println(str1.equals(str2));//fail
		System.out.println(str1.equals(str3));//pass
		
		
		

		String string9="bharath";
		String string19="bharath";
		System.out.println(string9==string19);//true
		
		

		String string09="bharath";
		String string019="bharath";
		System.out.println(string09==string019);//true
		
	}
}




class some{
	
	//Ex1::
	int x=100;
	int a=x++;//100
	int b=++x;//102
	int c=x++;//102
	
	int b1=10;
	//	  ++(11)  so you cannot use numbers in inc or dec operators	
	int h= ++(++b1);// 
	

	//int d=(a<b)?(a<c)?a:(b<c)?b:c;// compilation failure need on more expression
	int d=(a<b)?	(a<c)?a:(b<c)?b:c:x;//100
	
	//Ex2::
	int q=1;
	int w=0;
	if(++q > ++w){
		System.out.println("Hello");
	}else{
		System.out.println("Hi");
	}
	System.out.println("Durga "+q+" "+w);//Hello Durga 2 1
	
	//Ex3::
	int p=9;
	if(p++<10){
		System.out.println(p+ " Hello India");
	}else{
		System.out.println(x+" Hello Durga Soft");
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
}