package sample.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.TreeSet;


public class ListLambdaExpression {
	
	/*
    Comparable: It compares 2 different objects. It implements compare(obj1, obj2) method
	Comparator: It compares 1 Object i..e itself with the other object. it Implemets compareTo(obj1) method
	
	both the method returns ''int'' value
	
	
	*/

	public static void main(String[] args) {
		//Comparable ; default natural sorting order. 1 arg we need to pass in compareTo() method; Comparator -> customized sorting order. 2 args we need to pass in compareTo() method
		//List --> Maintains insertion order, allows duplicate values; List implementation's are linkedList, ArrayList
		//Set --> Does not allow duplicate value, if you use duplicate value it will override the values. Set implementations are Hashset, linkedHashset,
//		TreeMap10();
		TreeMap();
	}
	
	public static void Method1(){
		ArrayList<Integer> arrayList= new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(6);
		arrayList.add(2);
		arrayList.add(9);
		System.out.println("Before sorting "+arrayList);
		// To sort array in order, we must need to use ''Collections''' interface. i.e Collections.sort(arrayList);
		 Collections.sort(arrayList);
		System.out.println("After sorting "+arrayList);
	}
	
	public static void HashMap(){
		
		HashMap<String, String> hashMap = new HashMap<String, String>( );
		hashMap.put("A", "Apple");
		hashMap.put("D", "Dry fruit");
		hashMap.put("C", "Carror");
		hashMap.put("B", "Banana");
		System.out.println("Before sorting "+hashMap);
	}
	
	public static void TreeMap10(){
//		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(	new Comparable_Comparator()	);
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(	(i,j) -> (i>j)?1 :	(i<j)?-1 :0	);
		treeMap.put(1, "Apple");
		treeMap.put(2, "Dry fruit");
		treeMap.put(3, "Carror");
		treeMap.put(4, "Banana");
		System.out.println("Before sorting "+treeMap);
	}
	
	public static void TreeMap(){
		
		
//		TreeSet<Integer> treeSet = new TreeSet<Integer>( new Comparable_Comparator());
		TreeSet<Integer> treeSet = new TreeSet<Integer>( (i,j) -> (i<j)? 1	:	(i>j)?-1	:	0);
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(0);
		treeSet.add(9);
		treeSet.add(6);
		System.out.println(treeSet);
		
	}
	
	public static void Remove(){
		ArrayList<Integer> p = new ArrayList<Integer>();
		 p.add(7);
		 p.add(1);
		 p.add(5);
		 p.add(1);
		 p.remove(1);
		 System.out.println(p);//7,5,1
	}
	
	
//ex 0	
	public void TreeSet(){
		TreeSet treeSet=new TreeSet(new MyComparator());
		treeSet.add("A");
		treeSet.add(new StringBuffer("ABC"));
		treeSet.add(new StringBuffer("AA"));
		treeSet.add("XX");
		treeSet.add("ABCD");
		treeSet.add("A");
		System.out.println(treeSet);
		//[A, AA, XX, ABC, ABCD]
		
	}

}    

class MyComparator implements Comparator{

	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		System.out.println(s1+"(obj1)" +",,,"+s2+"(obj2)");
		/*
				A(obj1),,,A(obj2
				ABC(obj1),,,A(obj2), here ABC>A, so it moves to the next condition 
				AA(obj1),,,A(obj2),  here AA>A, so it moves to the next condition
				AA(obj1),,,ABC(obj2)
				XX(obj1),,,AA(obj2)
				XX(obj1),,,ABC(obj2)
				ABCD(obj1),,,AA(obj2)
				ABCD(obj1),,,ABC(obj2)
				A(obj1),,,AA(obj2)
				A(obj1),,,A(obj2)
	*/
		
		int l1 = s1.length();
		int l2 = s2.length();
		if(l1<l2){
			return -1;	
		}else if (l1>l2) {
			return 1;
		}else{
			return s1.compareTo(s2);
		}
	}
	
}



//ex1:

class StringImpl{
	public static void main(String[] args) {
			
		
		
			TreeSet treeSet=new TreeSet(new MyComparator());
			treeSet.add("A");
			treeSet.add("XX");
			treeSet.add("ZBCY");
	//		treeSet.add(new StringBuffer("AA"));//RE: classCastException; StringBuffer cannot cast to String. 
			/*treeSet.add("A");*/
			System.out.println(treeSet);
	
		}
}

class MyComparator01 implements Comparator<Object>{

	public int compare(Object obj1, Object obj2) {
		String s1 = (String)obj1;//StringBuffer cannot cast to String. We must need to use toString() in order to cast it
		String s2 = (String)obj2;
		System.out.println(s1+"(obj1)"+",,,,"+s2+"(obj2)");
/*		A(obj1),,,,A(obj2)
		XX(obj1),,,,A(obj2); here X comes after A so, moved to next condition
		ABCD(obj1),,,,A(obj2); ; 
		ABCD(obj1),,,,XX(obj2)
		ZETR(obj1),,,,ABCD(obj2)
		ZETR(obj1),,,,XX(obj2)
		
		[ZETR, XX, ABCD, A]
*/
		//compareTo ; it is used to comparing alphabets and displays in sorting order 
//		return  -s2.compareTo(s1);//[A, XX, ZBCY]
		return  s2.compareTo(s1);//[ZBCY, XX, A]
	}
	
}


//ex3:
//====================================================================================================================================//
class Employee implements Comparable<Object>{
	String name;
	int eid;
	Employee(String name, int eid){
		this.name=name;
		this.eid=eid;
	}
	public String toString(){
		return name+"--"+eid;
	}

	public int compareTo(Object obj) {
		int eid1 = this.eid;
		Employee e=(Employee)obj;
		int eid2 = e.eid;
		
		if(eid<eid2){
			return -1;
		}else if (eid1>eid2) {
			return 1;
		}else{
			return 0;
		}
	}
}
class MyComparator011 implements Comparator<Object>{

	public int compare(Object o1, Object o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		String s1 = e1.name;
		String s2 = e2.name;
		return s1.compareTo(s2);
	}
}

class CompComp{
	public static void main(String...strings){
		
		Employee e1 = new Employee("nag", 100);
		Employee e2 = new Employee("balayya", 200);
		
		Employee e3 = new Employee("chiru", 50);
		Employee e4 = new Employee("venki", 150);
		Employee e5 = new Employee("nag", 100);
		
		TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		
		System.out.println(t);
		//[it prints in ascending order]
//		[chiru--50, nag--100, venki--150, balayya--200]
				
		TreeSet t1=new TreeSet(new MyComparator011());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println(t1);
//		[balayya--200, chiru--50, nag--100, venki--150]
		//[it prints in descending order]

	}
}

//====================================================================================================================================//