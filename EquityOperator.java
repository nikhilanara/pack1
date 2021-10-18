sypackage sample.sample;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class EquityOperator {

	String studentName;
	int rollNum;
	EquityOperator(String studName, int rollNo){
		this.studentName=studName;
		this.rollNum=rollNo;
	}
	public static void main(String[] ags) {
		
		// == Operator returns FALSE when you are comparing 2 different objects
		// ''''== Rules''' 1. cannot compare 2 different dataTypes but can compare parent(object) and child 	2. Only for Reference comparison
		// StringBuilder, StringBuffer, Object is only for Reference Comparison even when we use it for '.equals()' operation 
		// we can == operator for all primitive data Types
		
		
		//Following cases results true;
		System.out.println(10 == 10);
		System.out.println('a' == 'a');
		System.out.println(10.0 == 10.0);
		System.out.println(true == true);
		
		
		String str =new String("bharath");
		String str1 =new String("bharath");
		
		
		System.out.println(str.equals(str1));//true ####  comparing same data type with 
		System.out.println(str==str1);//false
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		
		System.out.println(t1==t2);//false
		
		
	   // == Operator returns FALSE when you are comparing 2 different objects
		
		
		
		System.out.println(str==str);//true
		System.out.println(t1==t1);//true
		
	 //== Operator returns TRUE only when you are comparing 2 SAME objects
		
		String x1="bharath";
		String y="bharath";
		
		System.out.println(x1==y);// true
		
	// Above statement return  true because you are not creating any new objects

		
		
		
		
//		 										object(Parent)
//		-------------------------------------------------------------------------------------------------
//	String(child)   			StringBuffer(child) 				StringBuilder 			Thread(Child)
		

		Object o = new Object();
		String s= new String("jkh");
		Thread t = new Thread();
		StringBuffer sb = new StringBuffer("bharath");
		
//		== Operator Examples
//		In the ==operator, if you compare 2 different dataTypes it will throw compile time error
		
		System.out.println(o==t);//false; No Error as we are comparing parent and child
		System.out.println(o==s);//false; No Error as we are comparing parent and child
		System.out.println(o==sb);//false; No Error as we are comparing parent and child
		System.out.println(sb==s);//error; Compile time error since we are comparing 2 different object types
		System.out.println(t==sb);//error; Compile time error since we are comparing 2 different object types
		
//		.equals() operator Examples
//		in the .equals operator if we compare 2 different dataTypes this will give you ''false'' as your result
		System.out.println(o.equals(s));//false;
		System.out.println(o.equals(sb));//false;
		System.out.println(s.equals(sb));//false;
		System.out.println(t.equals(s));//false
		
		
		
	
		
		
		/* == for Reference comparison. Cannot compare 2 different objects(thread == string, String ==StringBuffer). if you compare, it will throw compile tyme error
		 * .equals() for content comparison. CAN compare 2 different objects but return false
		 * 
		 */
		
		
		//.equals() method usage in below areas:
		// StringBuffer, StringBuilder, Object --> Reference Comparison
		// WrapperClasses --> Content Comparison
		// Collection classes -> Content Comparison
		
		
		Integer integer = new Integer(10);
		System.out.println(integer);
		
		
		//Object Comparison
		EquityOperator example1 = new EquityOperator("bharath", 101);
		EquityOperator example2 = new EquityOperator("bharathKumar", 1012);
		EquityOperator example3 = new EquityOperator("bharath", 101);
		System.out.println(example1.equals(example3));
		
		//StringBufferComparison
		StringBuffer stringBuffer = new StringBuffer("bharath"); 
		StringBuffer stringBuffer2 = new StringBuffer("bharathKuma");
		StringBuffer stringBuffer3 = new StringBuffer("bharathKuma");
		
		System.out.println(stringBuffer.equals(stringBuffer2));//false
		System.out.println(stringBuffer3.equals(stringBuffer2));;//false
		
		
		
		//String Builder Comparison
		StringBuilder stringBuilder1 = new StringBuilder("bharath");
		StringBuilder stringBuilder2= new StringBuilder("bharath");
		StringBuilder stringBuilder3 = new StringBuilder("bharath");
		
		System.out.println(stringBuilder1.equals(stringBuilder2));//false
		System.out.println(stringBuilder1==stringBuilder2);//false
		
		System.out.println(stringBuffer3==stringBuilder3);// compile time error since you are comparing 2 diff data Types
		
		String string2="123";
		String string1="123";
		System.out.println(string2.equals(string1));//true
		
		
		String str1 ="hello";
		StringBuffer stringBuffer4 = new StringBuffer("hello");
		
		String string = stringBuffer4.toString();// This becomes string as you are converting it into String
		System.out.println(str1.equals(string));//true
		
		
		
		//In the below example, we are trying to comare RunTimeObject vs Object and hence this result ''false'''
		String str01="Bharath";
		String str2[]={"B","h","a","r","a","t"};
		String str3="";
		for (String stringer : str2) {
			
			str3=str3+stringer;//RunTime Object Creation --> Here we are concatenating  
		}
		
		System.out.println(str3);//Bharath
		System.out.println(str01==str3);//false
	
		
		System.out.println(4&5&6);
		System.out.println(43|5|4);
		System.out.println(4^5);
		
		
		
		
		
		
		
	}
	
	public void Hello(){
		String str ="Java";
		str.concat("Hell0 6");
		str.replace('6', '7');
		System.out.println(str);//Java
		
//		Since you are not storing concated/Replaced string into variable, value remains same
		
		String str1 ="Java";
		str1=str1.concat(" Hell0 6");
		str1=str1.replace('6', '7');
		System.out.println(str1);//Java Hello 7
		
		
		
		// Correct! Line 3 creates a new String object and gives it the value 'Java'. At line 4, two more String objects are created ('SE 6' and
		// 'Java SE 6'). At line 5, a another new String object is created ('java'). So four objects are created. Keep in mind, however, that 's' only refers to 'Java'
		//  because the other strings that were created were not specifically assigned to 's'.
		
		 String s = "Java";
		 s.concat(" SE 6");
		 s.toLowerCase();
		 System.out.print(s);//4
		 
		 
		
	}
	
	public void StringExp(){
		//''StringBuilder'' has the capability to store its value wihout being assigned its value to StringBuilder
		StringBuilder stringBuilder = new StringBuilder("Bharath");
		//stringBuilder.concat();//Compile time error since stringBuilder doesn't having concat method in it
		stringBuilder.append("Kumar");//
		System.out.println(stringBuilder);//BharathKumar
		
		//Only 'subSequence(start, end)' method in the string does not have the capability of storing its value
		
		
		// ''String'' does not have capability to store value until and unless it has been stored in a string
		String str = "Bharath";
		str.concat(" Kumar");
		str.replace("B", "R");
		System.out.println(str);//Bharath
		
		
		//Trim usage

		String str01 = new String(" bharath ");
		System.out.println(str01);// bharath 
		//removes the before and after space of string
		String trim = str01.trim();
		System.out.println(trim);;//bharath;
		
		String string = trim.split(" ")[0];
		System.out.println(string);//bharath
		
		String string2 = trim.split(" ")[1];//AIOB Exception as we dont have space to split 
		System.out.println(string2);
		
		
		String ta ="A ";
		ta = ta.concat("B ");
		String tb="C ";
		ta=ta.concat(tb);
		ta.replace('C', 'D');
		ta=ta.concat(tb);
		System.out.println(ta);//A B C C
		
		
		//equals is for content comparison but in here we are comparing space
		StringBuilder stringBuilderEquity = new StringBuilder(5);//
		String strEquity="";
		if(strEquity.contains(stringBuilderEquity)){
			System.out.println("Match");
		}else{
			System.out.println("No Match");
		}
		//Result: No Match
		
		String strEquals=" ";
		String trim2 = strEquals.trim();
		System.out.println(trim2.equals(""));//true
		

		String strEquals01=" ";
		strEquals01.trim();//since you are not storing trimmed string in a variable this wont trim
		System.out.println(strEquals01.equals(""));//false
		System.out.println(strEquals01.equals(" "));//true
		
		
		Boolean b[] =new Boolean[2];
		b[0]=new Boolean(Boolean.parseBoolean("true"));
		b[1]=new Boolean(null);
		System.out.println(b[0]);//true
		System.out.println(b[1]);//false
		
	}

}

class Hum{
	public static void main(String...strings){

		String str1 ="Hello67 world6789";
		str1.trim();
		int i1=str1.indexOf(" ");
		System.out.println(i1);//7
		int lastIndexOf = str1.lastIndexOf(" ");
		System.out.println(lastIndexOf);//7
		
		boolean boolean1 = new Boolean("true");
		

		//find out class Names of below
		StringBuilder s1 = new StringBuilder("Hello Java!");
		String s2 = s1.toString();
		List<String> lst = new ArrayList<String>();
		lst.add(s2);
		System.out.println(s1.getClass());//class java.lang.StringBuilder
		System.out.println(s2.getClass());//class java.lang.String
		System.out.println(lst.getClass());//class java.util.ArrayList
		

		System.out.println(28 + 5 <= 4+ 29);//true
		System.out.println((28 + 5) <= (4 + 29));//true
	}
}




//
/*
stringBuilder Has below methods

append
delete(start, end)
deleteCharAt(index)
toString
replace(start, end)
reverse
indexOf
subSequence(start, end) --> it does not change the value of string until and unless you store it in a variable
subString(start, end) --> it does not change the value of string until and unless you store it in a variable

String Has below methods

concat
charAT
indexOf
replace   --> it does not change the value of string until and unless you store it in a variable
substring --> it does not change the value of string until and unless you store it in a variable


StringBuilder or string does not have deleteAll(), removeAll()



*/

