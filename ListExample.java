package sample.sample;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;

public class ListExample {

	public static void main(String[] args) {
		//In the objectArray you are allowed to store different dataTypes:
		Object o=1;
		Object object[]=new Object[2];
		object[0]=new Integer("2");
		object[1]=new String("Bharath");
		
		for (int i = 0; i < object.length; i++) {
			System.out.println(" object " +object[i]);
		}
		
		//object 2; object Bharath
		
		/*
		Collection and collections difference
		
		Collection : collection is an ''interface'' can be used to represent a group of individual objects as a single entity
		Collections :": its an ''utility'' class present in the ''java.util'' package to represent a group of individual objects as a single entity
		
		List -- Preserves insertion order : Allows duplicates and null values
		Set -- Does not allows duplicates and  insertion order is not preserved
		Map -- Represent array objects in key value basis
														
																			Collection(INTERFACE)
			------------------------------------------------------------------------------------------------------------------------------------------------------------
			List(I)										Set(I)																			Map(I)
			-----                                       ----- 																		    ----- 					 																						
			ArrayList									HashSet																			HashMap, Identity HashMap, WeakHashMap			
			LinkedList									SortedSet(its a child interface of set. it represents 
																  arrays in sorting order)
			VectorList --> Stack                        NavigableSet(child interface of sorted set, provides
																	 several methods for navigation purpose) 
			
			
			Available methods in  list(I)
			
			void addFirst(Object);
			void addLast(Object)
			removeFirst()
			removeLast()
			getFirst()
			getLast()
			
			
			
			
			
														
		
		
		
		*/
		
		
		ArrayList list11 = new ArrayList(1);
		list11.add(1);
		
		list11.add("hello");
		list11.add(new Integer(2));
		
		System.out.println(list11);//[1, hello, 2]

		
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(21);
		arrayList.add(13);
		arrayList.add(30);
		
		
		arrayList.add(11);
		arrayList.add(2);
//		arrayList.removeAll(arrayList);
		arrayList.add(0, 1233);
		
		arrayList.removeIf(h->h%2!=0);
		arrayList.removeIf(e-> e%2 == 0); // Removing if %2 ==0 
		
		System.out.println(arrayList);//[21, 13, 11]
		
		
		ArrayList<Integer> arrayList1 = new ArrayList<>();
		arrayList1.add(21);
		arrayList1.add(13);
		arrayList1.add(30);
		arrayList1.add(11);
		arrayList1.add(2);
		
		arrayList1.removeIf(e-> e%2 != 0); // Removing if %2 ==0 
		
		System.out.println(arrayList1);//[30, 2]
		
		// ArrayList<Primtive dataTypes are not allowed to use in it>
		//ArrayList<int> arrayList2 = new ArrayList<>();
		
		
//Q :Which of the following statements can be used to determine if cat can be found in the list?

	     ArrayList<String> list = new ArrayList<>(); 
	     list.add("dog"); 
	     list.add("cat"); 
	     list.add("frog"); 
	     /*
		list.contains("cat");// Valid
		list.hasObject("cat")
		list.indexOf("cat");// Valid
		list.indexOf(1)*/
	     
	     //you must need to have parentheses enclosed with it other wise it will throw compile time error
	     
	     int i = 5; 
	     int j = 10;
	     while((i = 12)==5) {
	    	 
	     }
	     while((i = 12) !=5) {
	    	 
	     }
	     
	     String str ="Bharath";
	     while(	(str="bharath")	=="bha" ){
	     }
	     while(	(str="bharath")	!="bha" ){
	     }
	     
	     boolean b = true;
	     if(b=false){
	    	 
	     }
	     
	     
	    List<String> arrayList01 = new ArrayList<>();
	    arrayList01.add("Robb");
	    arrayList01.add("Bran");
	    arrayList01.add("Rick");
	    arrayList01.add("Bran");
		
//			System.out.println(arrayList.remove("Bran"));
		if(arrayList.remove("Bran")){
			arrayList.remove("Jon");
		}
		System.out.println(arrayList);//[Robb, Rick, Bran]
		
		
		List<> arrayList02 = new ArrayList<>();
		arrayList02.add("Robb");
		arrayList02.add("Bran");
		arrayList02.add("Rick");
		arrayList02.add("Bran");
		
		System.out.println(arrayList02.remove("Bran"));
		if(arrayList02.remove("Bran")){
			arrayList02.remove("Jon");
		}
		System.out.println(arrayList02);//[Robb, Rick]
		
		
		
		ArrayList<Integer> arrayList00 = new ArrayList<Integer>();
		arrayList00.add(1);
		arrayList00.add(2);
		arrayList00.add(3);
		arrayList00.add(4);
		arrayList00.add(null);
		//Removes element by an index/position --> Array elements stores in an order wise
		arrayList00.remove(2);
		arrayList00.remove(null);
		System.out.println(arrayList);
		
		
		ArrayList<Object> arrayList000 = new ArrayList<String>();
		ArrayList<String> arrayList000 = new ArrayList<Object>();
	     
	        
	}

}

class HenryMark{
	
	/*void m1(ArrayList<String> al){
		al.add("String");
	}*/
	
	//NUll is only allowed beacuse it is accepatble for anyType; Since we dont the what type of Parameter we are not allowed to use int/string/double.. etc
	void m12(ArrayList<?> al){
		al.add("Stump");
		al.add(1);
		al.add(null);
	}
	
	void be(){
		ArrayList<?> arrayList = new ArrayList<T extends String>();
	}
	public void Hellow(){
		
		
		List arrayList = new ArrayList();
		arrayList.add("green");
		arrayList.add("red");
		arrayList.add("blue");
		arrayList.add("yellow");
		arrayList.remove(2);
		arrayList.add(3, "cyan");
		System.out.println(arrayList);//[green, red, yellow, cyan]
		
		//By default it reurns object type, if we want to convert it into String we need to do Typecasting
		Object object2 = arrayList.get(0);
		
		String object =(String) arrayList.get(0);
		
		
		
		

//		ArrayList arrayLis = new ArrayList<Integer>();
		ArrayList arrayLis = new ArrayList<String>();
		arrayLis.add(true);
		arrayLis.add("true");
		arrayLis.add(1);
		arrayLis.add(10.5);
		System.out.println(arrayLis);
		
		
		ArrayList<String> arrayLi = new ArrayList();
		arrayLi.add(true);
		arrayLi.add("true");
		arrayLi.add(1);
		arrayLi.add(10.5);
		System.out.println(arrayLis);
		//[true, true, 1, 10.5]
	}
}

/*
============================================================================================================================================================================================
=================================================================================******* SCJP ******* ============================================================================================================
=============================================================================================================================================================================================*/

//concurrent modification problem
//while one thread is iterating other thread is NOT allowed to perform updation. if you do so, it will throw runTime error(concurrent modification)
//This rule is applicable for normal list/map but NOT for concurrent hashMap
class ConcurrentMod extends Thread{
	private static final String String = null;
	static ArrayList l = new ArrayList();
	public void run(){
		
		try{Thread.sleep(2000);}catch(Exception e){}
		
		l.add("Bharath");
	}
	
	//we are starting 2 threads. one is main thread and the other one is child thread 
	public static void main(String...strings){

		l.add("kumar");
		l.add("deepak");
		l.add("zoya");
		l.add("ronda");
		
		ConcurrentMod concurrentMod = new ConcurrentMod();
		concurrentMod.start();
		Iterator iterator = l.iterator();
		while(iterator.hasNext()){
			String s1=(String)iterator.next();
			System.out.println("current thread object is "+s1);
		}
		
	}
}

//concurrent Hash Map Thread safe
//while one thread is iterating the records and the other thread is updating records then in this case updated records may or may not reflect in the iterating records  
class concurrentHashMap extends Thread{
	static ConcurrentHashMap cmg = new ConcurrentHashMap();
	public void run(){
		try{Thread.sleep(2000);}catch(Exception e){}
		
		System.out.println("child thread updating map");
		
		cmg.put(103, "C");
	}
	
	//we are starting 2 threads. one is main thread and the other one is child thread 
	public static void main(String...strings){
		cmg.put(101, "A");
		cmg.put(102, "B");
		
		concurrentHashMap concurrentMod = new concurrentHashMap();
		concurrentMod.start();
		
		KeySetView keySet = cmg.keySet();//This method is available only in ConcurrentHashMap
		
		Iterator iterator = keySet.iterator();
		
		while(iterator.hasNext()){
			Integer s1=(Integer)iterator.next();
			System.out.println("main thread object is "+s1 + " ,,, "+cmg.get(s1));
		}
		System.out.println(cmg);
		
	}
}
//why the child threads are not displaying while main thread iterating records.?
//Ans : Since child thread updating records while main thread iterating records, so child thread updation performed on separate cloned object so, it does not reflect while iterating records
//


/*
 * while main thread iterating records, child thread record may or may not get displayed
Durga O/P
----
main thread object is : 102 ,,, B
child thread updating map
main thread object is : 101 ,,, A
{103=C, 102 =B , 101=A}

console o/p
-----------
main thread object is 101 ,,, A
main thread object is 102 ,,, B
{101=A, 102=B}
child thread updating map

In the above o/p, while main thread is iterating child thread can perform updation BUT those record may or MAY not displayed during run time execution.

BUT at the end, it will display all the child and parent records 



*/



//Hash Map. No Thread safe
//This results concurrent modification error during run time since it is NOT from concurrent interface
////while one thread is iterating other thread is NOT allowed to perform updation. if you do so, it will throw runTime error(concurrent modification)
class HashMap extends Thread{
	static HashMap cmg = new HashMap();
	public void run(){
		try{Thread.sleep(2000);}catch(Exception e){}
		System.out.println("child thread updating map");
		cmg.put(103, "C");
	}
	
	//we are starting 2 threads. one is main thread and the other one is child thread 
	public static void main(String...strings){
		cmg.put(101, "A");
		cmg.put(102, "B");
		
		concurrentHashMap concurrentMod = new concurrentHashMap();
		concurrentMod.start();
		KeySetView keySet = cmg.keySet();
		Iterator iterator = keySet.iterator();
		while(iterator.hasNext()){
			Integer s1=(Integer)iterator.next();
			System.out.println("main thread object is "+s1 + " ,,, "+cmg.get(s1));
		}
		System.out.println(cmg);
		
	}
}

//Explanation on Map interface
/*
								Map(I)
								|
								|
							ConcurrentMap(I)
									----putIfAbsent(), remove(), replace()
								|
								|
							concurrentHashMap(I)		




*/

class MapExp{

	//putIfAbsent()--> this will add the record if the given key does not exist
	//syntax: Object putIfAbsent(Object key, Object value)
	public void putIfAbsent(){
		ConcurrentHashMap c=new ConcurrentHashMap();
		c.put(101, "Naveen");
		c.put(102, "chandu");
		c.putIfAbsent(103, "Bharath");
		c.putIfAbsent(101, "Kumar");// 101 key exists so it wont add
		
		System.out.println(c);//[101 = Naveen, 102 = chandu, 103 = Bharath ]
	}
	//Remove(Object key, String value)
	public void Remove(){
		ConcurrentHashMap c=new ConcurrentHashMap();
		c.put(101, "Naveen");
		c.put(102, "chandu");
		c.remove(101);
		c.remove(102,"broh");//No matching record with that key and value
		System.out.println(c);//[102 = chandu]
	}
	
	//Replace(Object key, String Oldvalue, String new Value)
	public void Replace(){
		ConcurrentHashMap c=new ConcurrentHashMap();
		c.put(101, "Naveen");
		c.put(102, "chandu");
		c.put(103, "bharath");
		c.replace(102, "chandu", "sai");//replacing chandu with naveen
		System.out.println(c);//[101 = Naveen, 102 = chandu, 103 = bharath ]
	}
	
}
//CopyOnWriteArrayList is a thread safe
//CopyOnWriteArrayList is from concurrent class and hence it does not raise any error when one thread is iterating and other thread is perfoming updation
//It results run time when you replace CopyOnWriteArrayList with normal array list
class CopyOnWriteArrayList01 extends Thread{
	static CopyOnWriteArrayList cpwa = new CopyOnWriteArrayList();
	public void run(){
		try{Thread.sleep(2000);}catch(Exception e){}
		System.out.println("child thread updating map");
		cpwa.add("C");
	}
	
	//we are starting 2 threads. one is main thread and the other one is child thread 
	public static void main(String...strings){
		cpwa.add("A");
		cpwa.add("B");
		
		
		concurrentHashMap concurrentMod = new concurrentHashMap();
		concurrentMod.start();
		Iterator iterator = cpwa.iterator();
		while(iterator.hasNext()){
			Integer s1=(Integer)iterator.next();
			System.out.println("main thread object is "+s1 + " ,,, "+cpwa.get(s1));
		}
		System.out.println(cpwa);
		
	}
}
/*
main thread object is A ,,, 
main thread object is B ,,, 
[A, B]
child thread updating map*/
class AddIfAbsent{
	
	public static void main(String...strings){
		ArrayList l =new ArrayList();
		l.add("A");
		l.add("B");
		
		CopyOnWriteArrayList l1 = new CopyOnWriteArrayList();
		l1.addIfAbsent("A");
		l1.addIfAbsent("C");
		
		l1.addAll(l);
		
		ArrayList l2=new ArrayList();
		l2.add("A");
		l2.add("E");
		
		l1.addAllAbsent(l2);
		
		System.out.println(l1);//A, C, A, B, E
	}
	
}

//IMP
//It adds items before we run iteration and hence A, B & C gets added to the CopyOnWriteArrayList
class copyOnwritType3{
	public static void main(String...strings){
		CopyOnWriteArrayList l = new CopyOnWriteArrayList();
		l.add("A");
		l.add("B");
		l.add("C");
		
		Iterator iterator = l.iterator();
		l.add("D");
		while(iterator.hasNext()){
			String next = (String)iterator.next();
			System.out.println(next);//A, B, C but not D
		}
		
	}
}


//IMP
//Run time error; 2 threads cant act simultaneoulsly
class copyOnwritType4{
	public static void main(String...strings){
		ArrayList l = new ArrayList();
		l.add("A");
		l.add("B");
		l.add("C");
		
		Iterator iterator = l.iterator();
		l.add("D");
		while(iterator.hasNext()){
			String next = (String)iterator.next();
			System.out.println(next);
		}
	}
	//o.p --? A,B, C
	
	public void CopyOnReadArraySetMethod(){
		CopyOnWriteArraySet copyOnWriteArraySet=new CopyOnWriteArraySet();
		copyOnWriteArraySet.add("D");
		copyOnWriteArraySet.add("B");
		copyOnWriteArraySet.add("C");
		copyOnWriteArraySet.add("A");
		copyOnWriteArraySet.add(null);
		copyOnWriteArraySet.add(10);//hetrogenous as it accepts all data types
		copyOnWriteArraySet.add("D");//does not allow duplicates
		System.out.println(copyOnWriteArraySet);//[D,B,C,A,null,10]
		
	}
	
}


/*
CopyOnWriteArrayList & CopyOnWriteArraySet introduced in java 1.5 version

Recommended to go when there are more no of read operations and less no of write operations

Iterator on CopyOnWrite object cannot perform remove() operation it can only perform read operation. if we try to perform it'll throw run time error
insertionOrder, hetrogenous, null
does not allow duplicates
 
  
Synchronized Set can perform both read and remove operations while iterating records whereas  CopyOnWriteArraySet CAN do only read operations



*/