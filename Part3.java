package sample.sample;


 class Part3 {
	
	 public static void main(String []abc){
		 Short s1=200;
		 Integer s2=400;
		 // Since this is a wrapper object you are not allowed to store int into long. in order to store it,  you need to do explicit type casting 
		 Long s3=(long)s1+s2;
		 String s4=(String)(s3*s2);// Cannot type case long to string
		 System.out.println(s3);
		 
	 }

}

 /*
 
  1. Which 3 statements describe the object oriented features of the java language
  	a. Objects cannot be reused :::  False -- same object can be re used
  	b. A sub class can inherit from a super class  ::: Yes -- Method overriding
 	c. Objects can share behaviour with other objects :: Yes --> its just like passing parameters inside method and using that params/args inside method
 	d. Object is the root clause for all the other objects ::: Yes   
 	e. Main method must be declared inside every class. ::: NO -- Class can contain without main method only while running a class we need a main method
 	f. A Package must contain at least one class ::: NO --> Package can be without class   	 
 
 
 2.IMP 
 what is the name of java concept that uses access modifiers to protect variables and hide them inside a class.?
 
 	
  1. Encapsulation :: ex private void int ;;;; setter getter methods have to be implemented to achieve this
  2. Abstraction
  3. Inheritance
  4. Instantiation
  5. Polymorphism
  
  Ans : A
 
 3. Which statement best describes Encapsulation.?
 	
 	Encapsulation ensures that classes can be designed in such a way that only certain FIELDS  and METHODS of an object are accessible from other objects
 
 
 Polymorphism 
 -------------
  can be achieved by using overloading and overriding
  
   Benefits
   ---------
   code flexibility, Dynamic/different code can be passed during runtime
   
 4. Which 2 are benefits of Polymorphism.?
    a. Faster code at run time ;; NO
    b. More efficient code at run time;; NO
    c. More dynamic code at run time ;; YES -- same method with diff args can consist of dynamic code 
    d. More flexible and reusable code at run time ;; YES
    e. code that is protected from extension by other class ;; NO     
   
 
 5. Which statements are true about the structure of java class
 	a. public class should compulsory contains main method ;; No -- Class can contain without main method only while running a class we need a main method
 	b. a class can contain only 1 private constructor --> No ; it can have any no of constructors
 	c. a method can have same name as variable name :: YES -- method and variable can have same name
 	d. a class can have overloaded static methods :: Yes
 	e. methods are mandatory components of class : No
 	f, Fields(variables) need not to be initialized before you use :: YES 
 
 
 */
 
abstract class Parent12 {

	protected void resolve() {
	}

	abstract void rotate();// This method is by default uses 'default' access modifier
}

class Child13 extends Parent12 {

	 //Since the resolve() method is declared as protected in the parent method, you are NOT allowed to DECREASE the scope of access modifiers
	 // Protected to default is in correct since you are decreasing the scope. Either you need to use the same access modifier or you need to increase the scope of access modifier
	void resolve() {

	}

	protected void rotate() {
	}
}
 
 
 
 class Base{
	 public void test(){
		 System.out.println("Base");
	 }
 }
 
 class DerivedA extends Base{
	 public void test(){
		 System.out.println("DerivedA");
	 }
 }

 class DerivedB extends DerivedA{
	 public void test(){
		 System.out.println("DerivedB");
	 }
	 
	 public static void main(String []args){
		 Base b1=new DerivedB();
		 Base b2=new DerivedA();
		 Base b3=new DerivedB();
		 
		 // So in here, you are re assigning b1 to b3 
		 //Run time object(b3) method only gets considered while invoking methodss 	
		 b1=(Base)b3;
		 
		 //Run time object(b3) method only gets considered while invoking methodss
		 Base b4=(DerivedA)b3;
		 //		  (Parent)child/runTime Object		
		 b1.test();//DerivedB
		 b4.test();//DerivedB
	 }
 }
 
 
 class A12{
	 public void test(){
		 System.out.println("A12");
	 }
}
 
 class B12 extends A12{
	 public void test(){
		 System.out.println("B12");
	 }
 }
 

 class C12 extends B12{
	 public void test(){
		 System.out.println("C12");
	 }
	 
	 public static void main(String...strings){
		 
		 A12 a12 = new A12();//Run time object(A12) methods gets invoke
		 A12 a122 = new B12();//Run time object(B12) methods gets invoke
		 A12 a1222 = new C12();//Run time object(C12) methods gets invoke
		 
		 a12.test();//A12
		 a122.test();//B12
		 a1222.test();//C12
		 
	 }
 }
 
 
 class ParamsExp{
	 public static void Sum(Integer x, Integer y){
		 System.out.println("Integer");
	 }
	 public static void Sum(int x, int y){
		 System.out.println("int");
	 }
	 
	 public static void main(String...strings){
		 Sum(1,2);//int
	 }
 }
 
 
 