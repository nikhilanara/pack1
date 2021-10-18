package sample.sample;

import java.lang.reflect.*;

public class Notes {

	public static void main(String[] args) throws Exception {
		int count =0;
		Class<?> c = Class.forName("SBC");
		Method[] declaredMethods = c.getDeclaredMethods();
		for (Method method : declaredMethods) {
			count++;
			System.out.println(method.getName()+",");//getName,getMarks
		}
		System.out.println(count);;//2

	}

}

class SBC {
	public String getName() {

		return null;
	}

	public int getMarks() {

		return 10;
	}
}
