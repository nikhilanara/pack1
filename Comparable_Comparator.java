package sample.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

//When a class is implementing ''Comparator'' interface then it must provide the implementation for the ''compare()'' method
public class Comparable_Comparator  implements Comparator<Object>{
	/*

    Comparator : It compares 2 different objects. It implements compare(obj1, obj2) method
	Comparable : It compares 1 Object i..e itself with the other object. it Implements compareTo(obj1) method
	
	both the method returns ''int'' value
	
	*/
	
	//we need to compare 2 different objects
	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		System.out.println();
		return s1.compareTo(s2);
	}
	
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>(new Comparable_Comparator());
		treeSet.add("hello");
		treeSet.add("ronda");
		treeSet.add("bharath");
		treeSet.add("Kumar");
	}

	
}
///////////////////////////////////////////////////////////////// COMPARABLE INTERFACE IN LIST //////////////////////////////////////////////////////////////////////
//When a class is implementing Comparable interface then it must provide the implementation for the ''compareTo()'' method

//class ListImplementatioon implements Comparable<Student>{//here, if you pass Student you can use all the varaibles which has been declared in it..like fName, Lname.. tec
//class ListImplementatioon implements Comparable<String>{// Here, you can only use String object as you have used String as Object
class ListImplementatioon implements Comparable<Object>{//Here, you are allowed to use any kind of Object, as ObjectType is Object

	String str="hello_Ronda#";
	@Override
	public int compareTo(Object o) {
		String string = o.toString();
		if(str.length() >string.length()){
			return 1;
		}else if(str.length() <string.length()){
			return -1;
		}else{
			return 0;
		}
	}
	
}

//Here, we have used ObjectType as 'StudentObject_Type1' so we are allowed to compare only variable which has been declared in it...
class SortByFirstName implements Comparator<StudentObject_Type1>{
	
	public int compare(StudentObject_Type1 s1, StudentObject_Type1 s2){
		return s1.fname.compareTo(s2.fname);
	}
	
	public static void main(String []args){
		TreeMap hashMap = new TreeMap(new SortByFirstName());
		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.add("1");
		arrayList.add("bharath");
	}
}

// Other way of defining Class . Since Object type is string you can compare only Strings...
class SomeThingBro implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		return o1.compareTo(o2);
	}
	
	public static void main(String []args)
	{

	}
	
}



//================================================================================TYPE 2==================================================================================================================================================================================

class StudentObject{
	String fname;
	String lname;
	
	public StudentObject(String fname, String lname) {
		this.fname=fname;
		this.lname=lname;
	}
	
	public static void main(String []rags){
		StudentObject studentObject = new StudentObject("bharath", "Ronda");
		System.out.println(studentObject);//It gives object name in packageName.className followed by someRandom digits
		//It gives the object id as we are not overRiding ''toString()'' method.
		
		//O/P: sample.sample.StudentObject123478978
	}

	public String toString(){
		return this.fname+",,,"+this.lname;
	}	
}

//////////////////////////////////////////////////////////////OVERRIDING ToString() METHOD /////////////////////////////
//In the below case we are overrding ''toString()'' method.

class StudentObject_Type1{
	String fname;
	String lname;
	
	public StudentObject_Type1(String fname, String lname) {
		this.fname=fname;
		this.lname=lname;
	}
	
	public static void main(String []rags){
		StudentObject_Type1 studentObject = new StudentObject_Type1("bharath", "Ronda");
		System.out.println(studentObject);// in this case, it doesn't print the object id as we are overriding '''toString()'' method
		//o/p: bharath,,,Ronda
		 
	}

	public String toString(){
		return this.fname+",,,"+this.lname;
	}	
}


