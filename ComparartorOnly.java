package sample.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparartorOnly {

	String fname;
	String lname;
	ComparartorOnly(String fname, String lname){
		this.fname=fname;
		this.lname=lname;
	}
	public static void main(String[] args) throws Exception {
		ComparartorOnly someDele = new ComparartorOnly("Bharath", "Ronda");
		
		System.out.println(someDele);
		ArrayList<String> arrayList = new ArrayList<String>();
		Collections.sort(arrayList, new SomeThingBro());

	}
}



class SomeThingBro001 implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		return o1.compareTo(o2);
	}
	
	
}


//Since we have passes object as String argument
class SusheelList implements Comparator<String>{

	public int compare(String obj1, String obj2){
		
		return obj1.compareTo(obj2);
	}
}

//Since we have passed object param, we must need to compare only objects
class SatishList implements Comparator<Object>{
	
	public int compare(Object obj1, Object obj2){
		
		return obj1.toString().compareTo(obj2.toString());
	}
	
	public static void main(String [] args){
		ArrayList<Object> arrayList = new ArrayList<>();
		
		Collections.sort(arrayList, new SatishList());//We can sort array in AESC order.
	}
	
}

//In the below class, we are using Student object as an argument & hence we can compare ONLY student objects
class UsingStudentObject_SortByFirstName implements Comparator<Student>{
	
	public int compare(Student s1, Student s2){
		return s1.fname.compareTo(s2.fname);
	}
	
	public static void main(String []args){
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student("Bra", "Bri"));
		arrayList.add(new Student("class", "Some"));
		Collections.sort(arrayList, new UsingStudentObject_SortByFirstName());//It will give you result sortingby firstName
	}
	
}

class Student{
	String fname;
	String lname;
	Student(String fname, String lname){
		this.fname=fname;
		this.lname=lname;
	}
	//Override toString(); method so that we can return some string when we call Object
	
	public String toString(){
		return fname+",,,,"+lname;
	}
	public static void main(String []args){
		Student student = new Student("Bharath", "Ronda");
		System.out.println(student);//Bharath,,,Ronda
	}
	
}
