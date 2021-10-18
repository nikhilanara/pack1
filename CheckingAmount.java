kupackage sample.sample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CheckingAmount {
	public int amount;
	
	public CheckingAmount(int amount){
		this.amount=amount;
	}
	
	public int getAmount(){
		return amount;
	}
	
	public void changeAmount(int x){
		amount +=x;
	}
	CheckingAmount(){
		
	}
	public static void main(String... a) {
		
		/*List list=new ArrayList();
		Patient patient = new Patient("Mike");
		list.add(patient);
		
		int indexOf2 = list.indexOf(patient);
		System.out.println("index "+indexOf2);
		if(indexOf2>=0){
			System.out.println("Mike found");
		}
		
		String str ="   Hi Hello world";
		int indexOf = str.indexOf(" ");
		System.out.println(indexOf);
		
		StringBuilder stringBuilder = new StringBuilder("Hello");
		stringBuilder.substring(0,1);
		System.out.println(stringBuilder);*/
		
		new CheckingAmount().displaySeries();
		
		
	}

	private boolean flag=true;

	public void displaySeries() {
		
		int num = 2;
		while (flag) {
			if (num % 7 == 0)
				flag = false;
			System.out.print(num);
			num += 2;
		}
	}

}


class Patient{
	String name;
	public Patient(String name){
		this.name=name;
	}
	
}