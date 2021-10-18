package sample.sample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


//Sorting Object In AESC Order
//public class SortingMech {
public class SortingObjectInAESC implements Comparator<Employee_Sorter>{

	public static void main(String[] args) {
		Employee_Sorter employee00 = new Employee_Sorter(2, "Kumar");
		Employee_Sorter employee01 = new Employee_Sorter(3, "Zenith");
		Employee_Sorter employee02 = new Employee_Sorter(4, "Abc");
		
		
		ArrayList<Employee_Sorter> arrayList=new ArrayList<Employee_Sorter>();//This does NOT require implementation of Comparator Operator
//		TreeSet<Employee_Sorter> arrayList=new TreeSet<Employee_Sorter>(new SortingMech());// This requires implementation of Comparator Operator
		arrayList.add(employee00);
		arrayList.add(employee01);
		arrayList.add(employee02);
		System.out.println(arrayList);//Before sorting
		
		arrayList.sort((Employee_Sorter e1, Employee_Sorter e2)->e1.Ename.compareTo(e2.Ename));//In ASEC order. This does NOT require implementation of Comparator Operator
		System.out.println(arrayList);//After Sorting
		
		arrayList.sort((Employee_Sorter e1, Employee_Sorter e2)->-e1.Ename.compareTo(e2.Ename));//In DESC order. This does NOT require implementation of Comparator Operator
		
		//Using Java 8 Lambda Expression. Type 1
		arrayList.stream().sorted((s1,s2)->s1.Ename.compareTo(s2.Ename)).forEach(System.out::print);//Using Streams in ASEC. This does not require implementation of Comparator
		List<Employee_Sorter> filterArray=arrayList.stream().sorted((e1,e2)->e1.Ename.compareTo(e2.Ename)).collect(Collectors.toList());
		System.out.println("----");
		System.out.println(filterArray);
		
		//Using Java 8 Lambda Expression. Type 2
		arrayList.stream().sorted(new SortingObjectInAESC()).forEach(System.out::print);
		
		

	}

	@Override
	public int compare(Employee_Sorter o1, Employee_Sorter o2) {
		return o1.Ename.compareTo(o2.Ename);
	}

}

class Employee_Sorter{
	int Eid;
	String Ename;
	Employee_Sorter(int Eid, String Ename){
		this.Eid=Eid;
		this.Ename=Ename;
	}
	public String toString(){
		return this.Ename;
	}
	
}