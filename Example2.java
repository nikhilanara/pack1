package sample.sample;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Example2 {

	public static void main(String[] args) {

		StringBuilder s1 = new StringBuilder("JavaBEGIN");
		String s2 = "Love";
		
		s1.append(s2);//JavaBEGLove
		System.out.println(s1);
		s1.substring(4);
		System.out.println(s1.substring(4));//BEGLove
		int foundAt = JavaBEGIN.indexOf(Love);
		System.out.println(foundAt);
	}
}

class Bharath implements Comparator<T> {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("My runnable");
		}
	}

	@Override
	public int compare(T o1, T o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}

class Kumar {
	public static void main(String[] args) {
		/*
		 * Kumar kumar=()->{for(int i=0; i<10; i++){
		 * System.out.println("My runnable"); }};
		 */

		new Runnable() {
			public void run() {

			}
		};
		Bharath bharath = new Bharath();
		Thread thread = new Thread();
		thread.start();
	}
}