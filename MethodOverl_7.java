package sample.sample;


public class MethodOverl_7 {
	
	public void m1(int i){
		System.out.println("--int args--");
	}

	public void m1(Long i){
		System.out.println("--long args--");
	}

	public void m1(Float i){
		System.out.println("--float args--");
	}
	
	public void m2(String strin){
		System.out.println("-- string args--");
	}
	
	public void m2(Object obj){
		System.out.println("--object args--");
	}
	
	public static void main(String[] args) {
		
		// in the method overloading, it tries to find the exact match while overloading if not it finds the nearest match
		MethodOverl_7 methodOverl_7 = new MethodOverl_7();
		methodOverl_7.m1(10);//		--int args--;;;
		methodOverl_7.m1(10L);//    --long args--;;;
		methodOverl_7.m1('m');//    --int args--;;; 	 	since it is not having matching argument type, it looks for the  nearest match which is nothing but	''int'''
		methodOverl_7.m2(null);//   --String args--;; 	 	Since object is parent & String is child, child argument is going to print here
		//Result ::--int args--, --long args--, --int args--, --String args-- 
		
	}
}

// it give high priority to int argument since it is a default type
// to pass integer we need to have a syntax defined like this Integer in = new Integer(10);
class IntegerOver{
	
	public  void M1(int integ){
		System.out.println("int arg"); 
	}
	public  void M1(Integer integ){
		System.out.println("integer arg"); 
	}
	
	
	public static void main(String...strings){
		IntegerOver integerOver = new IntegerOver();
		integerOver.M1(10);// int arg
	}
}

class methoOverLoad1{
	public void m1(String s){//                                                                                                       OBJECT(P)
		System.out.println("String version");//                                                                              STRING(C)            STRING BUFFER(C)
	}
	
	public void m1(Object s){
		System.out.println("Object version");
	}
	public static void main(String []args){
		methoOverLoad1 methoOverLoad1 = new methoOverLoad1();
		// null is the acceptable value for both String & Object; So in here Child method is going to take first chance to execute since it is child class to the object  
		methoOverLoad1.m1(null);//String version
	}
}

//Ambiguity problem arises since we have 2 child's that accepts null values
class methoOverLoad2{
	public void m1(String s){
		System.out.println("String version");
	}
	public void m1(StringBuffer s){
		System.out.println("StringBuffer version");
	}
	public void m1(Object s){
		System.out.println("Object version");
	}
	public static void main(String []args){
		methoOverLoad2 methoOverLoad2 = new methoOverLoad2();
		// Compile time error; JVM confuses which method to execute as both the method(String and String Buffer) accepts null value
		methoOverLoad2.m1(null);//
	}
}

// When parent & child access null arguments it gives highest preference to the child value and hence it prints child value String
class ABC1 {

	public void m2(String strin){
		System.out.println("-- string args--");
	}
	
	public void m2(Object strin){//                                                                                        OBJECT(Parent)
		System.out.println("-- object args--");//                                                                String(Child)      String Buffer(Child) 
	}

	public static void main(String []rags){
		ABC1 abc = new ABC1();
		abc.m2(null);
		//Resut -- string args--
	}
	
}


// String & string buffer are 2 different child classes of object & both accepts null arguments so compiler confuses to pick method
class ABC {
	
	public void m2(String strin){
		System.out.println("-- string args--");
	}
	
	public void m2(StringBuffer strin){//                                                                                        OBJECT(Parent)
		System.out.println("-- string args--");//                                                                          String(Child)      String Buffer(Child) 
	}

	public void m2(Object obj){
		System.out.println("--object args--");
	}
	
	public static void main(String []rags){
		ABC abc = new ABC();
		//abc.m2(null);// Compile time error; Ambiguity problem as String, String buffer both accepts null argument value
	}
	
}


/* In the method overloading concept, When a method is overloaded with the same name but with the diff args it take refernce's to pull  the objects/Methods/Variable */

class Animal{
	
}
class Monkey extends Animal{
	
}
class Test{
	public void m1(Animal A){
		System.out.println("Animal Method");
	}
	public void m1(Monkey mon){
		System.out.println("Monkey Method");
	}
	
	public static void main(String...strings){
		Test test = new Test();
		
		Animal animal = new Animal();
		test.m1(animal);//Animal Method;; It executes animal method as it takes animal reference in method overloading
		
		Monkey monkey = new Monkey();
		test.m1(monkey);//Monkey Method;; It executes monkey method as it takes monkey reference in method overloading 
		
		Animal animal1 = new Monkey();
		test.m1(animal1);//Animal Method;; It executes animal method as it takes animal reference even though it contains monkey object created 
		
	}
}

//The method which has declared as '''final''  cannot be overridden in the child class
class monkey{
	public final void m1(){
		System.out.println("The method which has declared as '''final''  cannot be overriden in the child class");	
	}
	
	public final void minute(){
		System.out.println("final methods CAN ONLY be overriden only if it is having, differnt data type");	
	}
	
	
	
}

class Men extends monkey{
	//pare
	public final void m1(){
		System.out.println();	
	}
	
	public final void minute(String str){
	}
	
	
	
}

//Child methods can be declared as ''final''
class monkeyABC{
	public  void m12(){
		System.out.println("");
	}
}

class Human extends monkeyABC{
	
	//pare
	public final void m12(){
			System.out.println("Child methods can be declared as ''final''" );	
		}
	
}

// we can overload the final method in the child class only if we change dataType. this is applicable only for method overloading
//We can also decrease the scope of method when we change data Type but this rule is only applicable for method overloading
//Ex 1
class FakePeople{
	public final void FakePeopleMethod(int intType){
		
	}
	
	public void BroBrew(String str){
		
	}
}
class FakePeople1 extends FakePeople{
	//Decreasing method scope from public to default allowed ONLY if we have different data Type
	  void BroBrew(int n){
	  }
	  //CE; NOT allowed to decrease the scope of variable when using same dataType
	  void BroBrew(String n){
	  }
	//Overloading final method  
	public void FakePeopleMethod(String str){
		
	}
}

//Ex 2

class HateHumans{
	public final void HateHumansMethod(){
		
	}
}
class HateHumans1 extends HateHumans{
	public void HateHumansMethod(String str){
		
	}
}


/*  IMP 
 * 	//final;;; The methods which has been declared as ''final'' are NOT allowed to use in child class, if you use it will throw compile time error
 * //  The methods which has been declared as ''private'' are not allowed to use in child class, as it life stays only with in a class.
 * 	 while calling ''parent'' class ''private'' method in the ''child'' class it will throw compile time error
 * */

class privatMethodOverParent{
	private void m1(){// Since the method is declared as private you are NOT allowed to use it in child class
	}
}

class privatMethodOverChild extends privatMethodOverParent{
	
}

// Overriding Rules ::: Method overriding is ONLY applicable for methods but NOT for variable
//1. Method Names must be same 		2. Argument Types must be same including order		3. we cannot decrease the scope of access modifiers	
//4. static/private/final cannot be overridden
//5. Method Signature(i.e  It's the combination of the method name and the parameter list) must be same.
//6. When overriding methods, dataType should be Same

// parent class CANNOT have access to the child class methods BUT Child class CAN access Parent class methods
// Parent Reference is NOT allowed to hold the child specific methods


//In the below case, Parent and child classes are having 2 different methods and hence Parent is not allowed to use Child class methods 
class Parent{
	public void mqa1(){
		System.out.println("Parent class method");
	}
}
class Child extends Parent{
	private void mqa2(){
		System.out.println("child class method");
	}
}


//Since above class having 2 different methods so it takes object reference
class Main{
	public static void main(String...strings){
		
		Main main = new Main();
		
		Child child = new Child();
		child.mqa1();//Parent class method
		child.mqa2();//child class method
		//Result
		//
		
		Parent parent =new Child();
		parent.mqa1();//Parent class method
		parent.mqa2();//Compile Time Error:  PARENT class CANNOT have access to the child class methods
		
		
		
		// we should NOT use Parent class reference to hold child class methods
		Parent parent01 = new Child();
		parent.mqa1();//Parent class method
//		parent.m2();//Compile Time Error: We should NOT use Parent class reference to hold child class methods; PARENT class CANNOT have access to the child class methods
		
	}
}

// While overriding same method in the child class, we need to consider RUN Time Objects when we are Executing it
// Since it is having 2 same methods in both the classes, we have to consider Runtime Objects 
class Parent1{
	public void m1(){
		System.out.println("Parent  Method");
	}
}
class Child1 extends Parent1{
	public void m1(){
		System.out.println("Parent class Method overriding in the child class method");
	}
}

class TestParentChild{
	public static void main(String...strings){
		Parent1 parent1 = new Parent1();
		parent1.m1();//Parent  Method
		
		Child1 child1 = new Child1();
		child1.m1();//Parent class Method overriding in the child class method

		Parent1 parent2 = new Child1();
		parent2.m1();//Parent class Method overriding in the child class method
		
	}
}

//Method : You can decrease the scope of access modifier only if it is having different param's   
class ParentClass{
	public void Hello(int value){
		
	}
}
class ChildClass extends ParentClass{
	//This is in-valid as we are using SAME param type
	private void Hello(int value){
	}
	//This is valid as we are using different param type
	private void Hello(String str){
	}
}
//Below overriding rule is applicable for ONLY static method 
//While using static methods in the both parent and child classes , we need to consider ''Object Reference'' rather than Run time objects
class Parent2{
	public static void m1(){
		System.out.println("Parent  Method");
	}
}
class Child2 extends Parent2{
	public static void m1(){
		System.out.println("Parent class Method overriding in the child class method");
	}
}

class TestParentChild2{
	public static void main(String...strings){
		
		Parent2 parent2 = new Parent2();
		parent2.m1();//Parent method
		
		Child2 child1 = new Child2();
		child1.m1();//child method
		
		Parent2 parent22 = new Child2();
		//Since we are using parent class Object Reference so it is going to give us parent class result
		parent22.m1();//Parent method
	}
}

//Method overriding rule is NOT applicable for variables
//variable resolution is always taken care by JVM based on object reference type
class Mark{
	int x=10;
}

class Henry extends Mark{
	int x=20;
}

class MarkHenry{
	public static void main(String...strings){
		Mark mark = new  Mark();
		System.out.println(mark.x);//10; 
		
		Henry henry = new Henry();
		System.out.println(henry.x);//20
		
		Mark mark1 = new Henry();
		System.out.println(mark1.x);//10: Since we've used ''Mark'' object reference so it is going to take that corresponding variable
		
	}
}




//Polymorphism -->Method overriding Concept : Def: if an object contains many forms then it is said to be polymorphism: EX: parent object reference can be used to hold child & parent objects

//Another example would be, a list can hold ArrayList, LinkedList, Hashset etc




//JAVA CERTIFICATION QUESTION
//IN inheritance, you are not allowed to store child objects in parent
abstract class Writer {
	public static void write() {
		System.out.println("Writing...");
	}
}

class Author extends Writer {
	public static void write() {
		System.out.println("Writing book");
	}
}

class Programmer extends Writer {
	public static void write() {
		System.out.println("Writing code");
	}

	public static void main(String[] args) {
		//Since we are overriding static methods, it takes object reference rather than run time objects 
		Writer w = new Programmer();
		w.write();//Writing...
		
		
		//Child objects cannot be stored in Parent objects
		Programmer programmer = new Writer();
		Author author= new Writer();
		Programmer programmer1 =new Author();
		
	}
}
/*

Writer(P)
Author(C)
Programmer(C)

*/


//Based on reference
//result;;; Writing...
