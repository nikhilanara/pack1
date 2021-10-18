package sample.sample;

import pack1.Calc;
import sun.security.jca.GetInstance.Instance;

public class Array2 {

	String studName;
	int rollNo;
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int array[]={};
		for (int i : array) {
			System.out.println(i);
		}
		//It does not print anything since array  is empty
		
		System.out.println(array instanceof Object);//true
		

		int arryp[]=new int[5];
		arryp[0]=null;//null cannot be stored since its a primtive type int
		
		Integer arryp1[]=new Integer[5];
		arryp1[0]=null;// null cannot be stored since its a Wrapper type Integer
		
		
		//int [] args={1,2,4,4};//Cannot have same name for different variables/arrays
		//int hello=(int)args[0];//Cannot store string in int ; compile time error
		 
		
		// Arrays are fixed in size and can store only same data Type(Homogeneous)
		// Array is an indexed collection of fixed number of Homogeneous dataType
		// various ways of declaring 1 D array
		 
		
		
		int x0[]; 
		int[] x2;
		int []x3;
		int x4[];
		
		// various ways of declaring 2 D array
		int y[][];
		int []y1[];
		int[] y2[];
		int[][] y3;
		int [][]y4;
		int y6[][];
		
		//Various ways of declaring arrays
		int a[][], b;
		int[] a12, b1[];// a1- 1D; b1 2D array
		int[][] a123, b123; //both are2D array
//		int[]a123,[]b123; //compile tyme error. Dimension [] is not allowed to declare before every variable.  dimension '[]' is allowed to declare only before 1st variable
		
//		int x[4];// compile time error, Syntax is incorrect, while declaring an array we should not allowed to specify the size of an array
		int[] xs=	new int [4];
		System.out.println(xs.length);//4
		
		
		int[] neg=	new int [-4];//Run time error --> Negative Array Exception
//		
		int [][]x56 = new int[2][]; // no error since we have defined base size
//		int [][]x34 = new int[][]; //it will throw compile tyme error. Reason : We  have to define base level size
//		int [][][]x562224 = new int[2][][3];//it will throw compile time error. Reason :without specifying second dimension we are not allowed to define 3D size
		int [][][]x564 = new int[2][4][];
		int [][][]x5646 = new int[2][][];
		
		int aHello[][]=new int[2];//Error since you are initializing array with 1D
		
		
		//Array Size :: The only allowed types to specify size of an array are  '''' int size are byte, short, int and char''''
		//Array Type :: can be of any Type
		int io=4; short so=4; char ch='c'; long ng=123;; 
		int[] type=	new int [io];// Array Type; Array Size
		int[] type1=	new int [so];// Array Type; Short Size
		int[] type2=	new int [ch];// Array Type; Char Size
//		int[] type3=	new int [ng];// Arry Type ; Long size is not allowed to specify. Compile Time error
		
		
		double db []= new double [io];// double type; ;int size
		
		
				
		// Below are the 2 ways using which we can initialize arrays
		int way1[]= new int[] {1,2,3};
		int way2[]= {1,2,3};
		
		// 2D Example
		int way10[][]= new int[][] {{1,2,3},{1,2}};
		int way22[][]= {{1,2,3},{}};
		int way24[][]= {1,2,3};//compilation error as we have specified 1D array
		
				
		
//		initialization of array 2D ::: while declaring variables in the MultiDimensional array, you need to separate array values using '''{}'''
		int abcd[][] = { {1,2,3},{1,2,3} };
		System.out.println(abcd.length);//2
		System.out.println(abcd[0].length);//3
		System.out.println(abcd[1].length);//3
		//length() function does not going to work for int ; it will throw compile time error if you use it
//		System.out.println(abcd[0][1].length());//2
		System.out.println(abcd[0][1]);//2
		System.out.println(abcd[1][1]);//2
		
		
		
		
		String Re[][] = new String [][] { {"Hellow","Hai"},{"Hello"} };
		System.out.println(Re[0][0].length());//6
		
		String [] str ={"A", "abc", "abcd"};
		System.out.println(str.length);//3 valid
		System.out.println(str[1].length());// valid Result --> 3 length count starts from 1
//		System.out.println(str[0].length);//in valid compile tyme error  --> ''length'' function CANNOT be used for inner elements of an array
		
		
		int xyz[][] = new int [3][2];
		System.out.println(xyz.length);// 3
		System.out.println(xyz[0].length);// 2
		System.out.println(xyz[1].length);//2
		System.out.println(xyz[2].length);//2
		
		System.out.println(xyz[0][0]);//0
		
		System.out.println(xyz);// [[I@659e0bfd ; Address varies from system to system and run by run
		System.out.println(xyz[0]);// [I@689e0bfu
		
		
		
		
//		int ghi[][]= new int[2];// compile time error as we are specifying single dimension in the right side
		
		int g[]= new int[2];
		System.out.println(g);//[I@659e0bfd  some hash code
		System.out.println(g[0]);//0	since we didn't not initialized it will take default value for int
		System.out.println(g[1]);//0 	since we didn't not initialized it will take default value for int
		System.out.println(g[2]);//Run time error -->Array Index out of bound Exception
		
		int h[]= new int[3];
		h[0]=1;h[1]=16;h[2]=18;
		System.out.println(h[0]);//1 Since we initialized value with '1'
		System.out.println(h[1]);//16 Since we initialized value with '16'
		System.out.println(h[2]);//18 Since we initialized value with '18'
		
		int xt[][] =
				new int [3][2];
		xt[0][0]=12;
		System.out.println(xt[0].length);//2
		System.out.println(xt);// O/P --> [[I@659e0bfd  (2 Dimensional Array)
		System.out.println(xt[0]);//	O/P --> [I@659e0bfd (1 Dimensional Array
		
		System.out.println(xt[0][1]);//12; Since we have defined array size to 12
		System.out.println(xt[0][1]);// O/P --> 0 since we didn't not initialized it will take default value for int
		
		
		
		// explanition to the above answer:::
//		Here int xyz[][] = new int [3][2]; base size is 3 : this is array of arrays concept i.ee       | 1	| 	2	|	3 	| --> Base size x holds 3 length
//																										 |      |       | 
//																									   |1 |2|  |1 |2|  |1 |2|  --> second DimensionalArray  holds 2 length
//			                                                                                            x[0]     x[1]    x[2]
		// Anonymous Arrays : Nameless arrays can be defined as anonymous: array without name
		System.out.println(new int[] {10, 20, 30});;// Single Dimension
		System.out.println(new int[][] {{2,3,},{4,5}});//2 Dimension
		
		
		
		// ******** IMP ******** //
		/*int[] -->System.out.println(ab.getClass().getName()); Result --> [I
		int[][] --> [[I
		byte[] --> [b
		long[] --> [l
		boolean[] --> [z*/
		
		
		// only allowed type's to specify array size are byte, char, short, int only
		     int inte=12; byte bte =12; short srt = 12; long lnge=12; 
//			 int []IJK= new int [int];// Valid
//		     int []IJK= new int [b];// Valid
//		     int []IJK= new int [srt];// Valid
//		     int []IJK= new int [lnge];// IN VALID AS WE CANNOT SPECIFY LONG SIZE
		     double []dble = new double[10];// valid
		     
		     int hey[];
		     	hey=new int[2]; // valid
		      /** while specifying elements in an array, you must need to specify everything in one line
		     int hey[];
		     	hey={1,2,3,};
		     	**/

		     /**valid as we have defined everything in one line
		     int hey[]={1,2,3,};;
		     	**/
		     
		     
     
 	// if we want to execute loop body at least once then we go with Do While
		int i = 100;
		do {
			System.out.println(i);
			i++;//100<=10
		} while (i <= 10);
		
		//Result 100
		//IN the above case condition is not satisfying but still it is printing loop body atleast once
		
		int j = 5;
		do {
			System.out.println(j);
			j++;
		} while (j <= 10);
		//if while condition is not TRUE then exit from loop 
		//Result 5, 6, 7, 8, 9, 10
		//While condition has been satisfied and it has printed 5 to 10 digits
		
		
		
		
		
		//EXAMPLE IMP ***
		int[][] x=new int[2][4];                       // x	  1 		 2
		x[0]=new int[]{2,4,6,8};                       //   2,4,6,8     2,4 
		x[1]=new int[]{2,4};                           //     x[0]      x[1]
		x[0]=new int[]{2,4,6,8};
		for (int[] x1 : x) {
			for (int x22 : x1) {
				System.out.println(x22+" ");
			}
			System.out.println();
		}
		//Result 2468 24
		
		
		//EXAMPLE IMP1 ***
		int[] n1=new int[3]; 
		int[] n2={10, 20, 30, 40, 50};
		n1=n2;// 
		for (int k : n2) {
			System.out.println(k+" : ");
		}
		//10: 20 : 30 : 40 : 50
		
		
		
		//when you are Re-assigning arrays SIZES does not required only data Types and dimensions must match
		int a122[] = {1,2,3,4};
		int b122[] = {1,2};
		
		b122=a122;
		System.out.println(b122.length);//4
		
		a122=b122;
		System.out.println(a122.length);//2
		
		
		int[] g1= new int[6];
		int[]  h1= new int[1];
		
		g1=h1;
		System.out.println(g1.length);//1
		
		/*
	
	Sizes are NOT required to match
	Data types MUST match
	Dimensions MUST match
	
	*/
	
		int[][] hate1 = new int[1][3];
		for(int i1=0; i1<hate1.length; i1++){
			for(int j1=0; j1<hate1[i1].length; j1++){
				hate1[i1][j1]=10;
				System.out.println(" "+ hate1[i1][j1]);
			}
			System.out.println("");
		}
		//10 10 10; n1[0][0] =10; n1[0][1] =10; n1[0][2]=10
		
		//below one is wrapper type. In the Integer we are allowed to store ''null'' since it accepts String and int values.  This rule is not applicable for primitive types 'int' 
		Integer arrInt[]={1,2,3,4};
		arrInt[0]=null;
		for (Integer integer : arrInt) {
			System.out.println(integer);
		}
		
		int string[]={1,2,3};
		for (int l=0; ++l<4; l++) {
			System.out.println(string[l]);
		}
		//AIOOBE
		
		// We are not allowed to perform any such action on Null 
		//The below code with throw ''Null pointer exception'' in the runTime as we are initializing 	array2s[0] and we are trying to get the name which has been set to null	
		
		Array2[] array2s = new Array2[3];
		array2s[1]=new Array2("dontTrust", 444);
		array2s[2]=new Array2("anyOne", 888);
		
		for (Array2 array2 : array2s) {
			System.out.println(array2.studName);
		}
		
		// the below code also throws null pointer exception as your perform ''toString()'' operation on null
		for (Array2 array2 : array2s) {
			System.out.println(array2.toString());
		}
		
		//Infinite loop - since we didn't specified how many times to iterate
		for(;;){
			System.out.println("hhh");
		}
		
		
		
	
	}
	Array2(String name, int rollNo) {
		this.studName=name;
		this.rollNo=rollNo;
	}
	
}




class ArraysIMP{
	public static void main(String...strings){
		Integer arr[] ={1,2,3,4};
		arr[1]=null;
		//Throws null pointer exception since int cannot store null values
		for (int aa : arr) {
			System.out.println(aa);
		}
		
		//No issues since Integer can store null values
		for (Integer aa : arr) {
			System.out.println(aa);
		}
	}
}

class Calc {

	int x;
	int y;
	Calc(int x, int y){
		init(x,y);
	}
	
	public void init(int x, int y){
		this.x=x*x;
		this.y=y*y;
	}
	public static void main(String[] args) {
//		green, red, yellow, cyan
		int x=3; int y=5;
		Calc calc = new Calc(x, y);
		System.out.println("x : "+ x + " y "+y);//x : 3 y 5
		
		System.out.println(calc.x);//9
		System.out.println(calc.y);//25
		
		
		//Null pointer Exception
		int arr[]=null;
		for (int i : arr) {
			System.out.println(i);
		}
		

	}

}



class RepresentationOfArray{
	public static void RPA(){
		Number[] number=new Number[10];
		number[0]=new Integer(0);
		number[0]=new Double(0);
		number[1]=new String("in compatable type");//in compatable type
		
		
		//In in runnable interface only its implementation class are allowed to use
		Runnable runnable[]=new Runnable[8];
		runnable[0]=new Thread();
		runnable[1]=new Integer();
		
	}
}

//2D array cannot be stored in 1D array
class SomeEx{
	public static void Broh(){
		int p[][]= new int[6][];
		p[0]=new int[2][2];// Error as we are NOT allowed to store 2D array in 1D
	}
}


class ObjectCreation001{
	public static void Brew(){                                                                                              //      _________________________________
		int [][]a = new int[4][3];//Total -> 5																								|1|    |2|    	  |3|          |4|   --> 1 object
//		                                                                                                                            _________________________________
		a[0]=new int[4];//1																										    |1,2,3|	 |1,2,3|  |1,2,3| 	 |1,2,3| --> 4 objects	
		a[1]=new int[2];//1																										     a[0]	   a[1]     a[2]       a[3]
		a=new int[3][2];//4                                                                                                            |
//		                                                                                                                               |
//		                                                                                                                              a[0], a[1] again re initialized with 4 & 2 values --> 2 objects       
		 //Total how many objects created.? 11
		
		
		//Total how many objects eligible for GC.?7
		//ANS since we are re initializing array with new sizes, previous one is eligible for GC
		
	}
},l