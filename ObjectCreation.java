package sample.sample;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class ObjectCreation {

	private static final Object String = null;
	static int count = 0;

	ObjectCreation() {
		count ++;
	}
	
	public static void main(String[] args) {
		
		int args=1;//compile time error since we are same variable name
		System.out.println(args[0]);//AIOOB Exception
		
		String str ="bharathkumar ";
		String trim = str.trim();
		System.out.println(trim);
		System.out.println(trim.split(" ")[0]);
		
		LocalDate date = LocalDate.parse("2014-12-30");
		System.out.println(date.plusDays(2));;//
		System.out.println(date.plusMonths(2));
		System.out.println(date);//2015-02-02
		
		
		Object integer = new Integer(1);
		String s=(String)integer;
		System.out.println(s);// java.lang.ClassCastException
		
		
		LocalDate date01 = LocalDate.of(2014, 02, 12);
		Period ofDays = Period.ofDays(2);
		System.out.println(date01.plus(ofDays));
		
		
		//An Object gets created only when we use ''new'' keyword 
		ObjectCreation calc = new ObjectCreation();//1 object
		ObjectCreation calc1 = new ObjectCreation();//2 object
		ObjectCreation calc2 = null;// This wont create any new object as we are making it to null
		ObjectCreation calc3 = calc1;// This wont create any new object as we are pointing it to the calc
		new ObjectCreation();//3 object ;	this will create a new object as we have used new keyword
		

		
		String str01 = new String("bharath ");// this will create 2 objects. 1 in heap and another one in String pool
		String str02=" kumar";// 1 object
		String str03 ="P"+str02;// this will again create 2 objects. 1 for storing P and the other is for storing ''str02''
		
		
	}

}
m