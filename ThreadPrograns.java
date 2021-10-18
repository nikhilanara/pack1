package sample.sample;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPrograns {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//Type 1 == Below class extends Thread class
		ThreadImpl threadImpl = new ThreadImpl();
		threadImpl.start();
		
		//Type 2 -==> Here, In thread we can ONLY pass a class which is implementing Runnable interface 
		Thread thread = new Thread(new ThreadImpl_RunnableInterface());
		thread.start();
		
		//Here 3, we don't need seperate class to implement run() method in thread class 
		Thread thread01=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hello This is type 3");
				
			}
		});
		
		thread01.start();
		
		//Type 3. using this we can Define many Condition's
		ExecutorService executorService=Executors.newSingleThreadExecutor();//It executed only one thread
		executorService.submit(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Type 4 method");
				
			}
		}) ;
		
		
		//Using this, we can know whether thread completed its Execution or nor.?
		Future future=executorService.submit(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Type 4 method");
				
			}
		}) ;
		future.get();// Thread completes its execution only if returns null value;
		
	}

}

class ThreadImpl extends Thread{

	public void runThread(){
		System.out.println("Running thread.!");
	}
}

class ThreadImpl_RunnableInterface implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<100; i++){
			System.out.println("i value is "+i);
		}
	}
	
}

class PK{
	public static void main(String []args){
		
		Runnable run = ()->{
			System.out.println(); 
			System.out.println();
		 };
		 
		ThreadImpl_RunnableInterface i =()->{
			System.out.println("");
			
		};
		
		Thread thread = new Thread(new Runnable(){
			public void run(){
				System.out.println();
			}
		});
		thread.start();
		
	}
}

