package sample.sample;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

import org.apache.tools.ant.taskdefs.Exec;

public class ThreadingBrief {

	String fname;
	String lname;
	private static ExecutorService newSingleThreadExecutor2;
	
	ThreadingBrief(String fname, String lname){
		this.fname=fname;
		this.lname=lname;
	}
	
	public static void main(String[] args) throws Exception {
		
		//Using functional interface concept to run Threads
		Runnable runnable = ()->System.out.println("");
		Thread thread2 = new Thread(runnable);
		
		new Thread(()->{
			System.out.println("");
		});
		
		//Create a new thread & implement Runnable() interface in it.
		Thread thread = new Thread(new Runnable(){
			public void run(){
				System.out.println("Hellow");
			}
		});
		
		thread.start();
		
		ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10);
		ExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(20);
		
		newSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
		
		Future future=newSingleThreadExecutor2.submit(new Runnable(){
			public void run(){
				System.out.println("Hellow");
			}
		});
		future.get();//It return null if it completes the execution
		
	
	//One point to note down here is, when we use Callable() interface we should override ''call()'' method & that should return string  
	Future f1=newSingleThreadExecutor2.submit(new Callable(){
		public String call(){
			return "HellowRonda";
		}
	});
	f1.get();//It return you the string //HellowRonda
	}
	
}

class ABC{
	
	public void Hum(){
		Thread thread = new Thread(new Runnable(){
			public void run(){
				System.out.println("hello");
			}
		});
		thread.start();
		
		new Thread(new Veg());
		Veg veg = new Veg();
		veg.run();
		
		
	}
}

