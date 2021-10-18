package sample.sample;

public class BlocksExample_50 {

	public static void main(String[] args) {
		//ex1:
		String[][] colors = new String[2][2];
		System.out.println(colors.length);//2
		//Since Array length is 2, Allowable array indexes should be less than 2 i.e 1
		colors[m0][0]="red";
		colors[0][1]="blue";
		colors[1][0]="green";
		colors[1][1]="yellow";
//		colors[0][2]="yellow"; --> if you use this, it will throw Array index out of bound exception
		
		
		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++){
				System.out.println(colors[i][j]);
			}
			System.out.println("");
		}
		
		// JVM executes ''do'' condition first and then it checks for '' while'' statement. if the ''while '' condition is returning ''true'' then it again executes ''do'' condition until ''while'' condition return ''failure''
		
		//ex2
		int[] s={10,20,30};
		int size=3;
		int i=0;
		do{
			i++;//
		}while(i<size-1);
		//while(i<2) 1<2 satisfied and i value increments to 2; 2<2 not satisfied comes out of the loop;; i value =2 
		System.out.println("The top Element:"+ s[i]);//30
		
		int xyz=5;
		do{
			System.out.println(xyz-- +"");//5
		}while(xyz==0);
		
//		result 5

		//ex3 --> IMP
		int[] s1={10,20,30};
		int size1=3;
		int i1=0;
		do{
			i1++;
			//1, 1<2 
			//2, 2<3
			//3  3<3  // Break loop and i value is 3
		}while(i1<size1);
		//s1[3]
		System.out.println("The top Element:"+ s1[i1]);// array index out of bound exception
		

		//Assigning values in the ''if'' can be done only to ''while'' 
		//Ex:  
		boolean boolean1=false;
		//since we are assigning value true, ''if'' block going to execute
		if(boolean1=true){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
		
		//Ex:
		//Result :True
		//since we are assigning value false, else block going to execute
		if(boolean1=false){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
		//Result : fasle
		
		//Ex: Below is  applicable for int and string 
		int assInt=10;
		//Invalid since it is missing second condition
		if(assInt=12){
		}
		//Invalid since we need to add 'parenthesis' to first condition
		if(assInt=12 ==12){
		}
		if((assInt=12) ==12){
			System.out.println("Valid case");
		}
		
		if((assInt=12) !=12){
			System.out.println("Valid case");
		}
		
		//Ex
		
		int bharathInt=1;
		if((bharathInt=12) !=12){
			System.out.println("Valid case");
		}else{
			System.out.println("Condition isn't matching : ");
		}{
			//Executes compulsory even if condtion is satisfied or not
			System.out.println("Broh");
		}
		//Result : Condition isn't matching : Broh 
		
		
		//ex4
		int n[];
		n=new int[2];
		n[0]=100;
		n[1]=200;
		
		//Here we are re initializing array so, previous values will get disregarded 
		n=new int[4];
		n[0]=300;
		n[1]=400;
		
		for (int j : n) {
			System.out.println(" "+j);//300, ,400, 0, 0
			//since we did not defined  first 2 value it takes by defaault value
		}
		
		
		//ex4
		int[][] m={{1,2}, {3,4}};// Here base size is 2
//		for(int j=2-1; j>=0; j--){
//		for(int j=1; j>=0; j--){
		for(int j=m.length-1; j>=0; j--){                          //m 		1   	2
			for (int x:m[j]) {                                    //m[0]   1,2     3,4  m[1]
				System.out.println(x);
				//j value is 1 and then it decrements to 0 
				//Result 3,4 1,2
			}
		}
		//for(int j=2-1; j>=0; j--){
		//for(int j=1; j>=0; j--){
		// so ''j'' value is 1 and then it decre,ents
		
		
		
		//Enhanced loops will return only VALUES whereas as standard loops returns INDEXED values of Array
		//given below the differences: Enhanced loop is value based
		//ex5
		int x[] ={10,20,40,50};
		for (int j : x) {
			System.out.println(j);
			//10,20,40,50
		}
		//ex6
		//Standard loop is index based
		int x1[] ={10,20,40,50};
		for (int j = 0; j < x1.length; j++) {
			System.out.println(x1[j]);
//			10,20,40,50
		}
		
		//ex7
		String[] str={"A", "B", "C", "D"};
		for (int j = 0; j < str.length; j++) {
			System.out.println(str[j]+" ");
			if(str[j].equals("C")){
				continue;
			}
			System.out.println("Done");
			break;
		}
		//Result Done
		
		//ex7_1
		String[] str01={"A", "B", "C", "D"};
		for (int j = 0; j < str01.length; j++) {
			System.out.println(str01[j]+" ");
			if(str[j].equals("C")){
				continue;
			}
		}
		//Result  A, B, C, D
		
		//ex8
																								//str1       1       2            String length is 2
										                                           		  		//			A B C	D E										
		String[][] str1={	{"A", "B", "C"},	{"D","E"}	};									//		  str[0]    str[1]
		for (int j = 0; j < str1.length; j++) {
			for (int j2 = 0; j2 < str1[j].length; j2++) {
				System.out.println(str1[j][j2]+" ");
				if(str1[j][j2].equals("B")){
					break;
				}
			}
			continue;
		}
		//Result A, B, D, E
		
//===========================================================================================================//		
		String[][] stringArg={	{"A", "B"},	{"D","E"}	};
		
		// Approach 1 --In the below example we don't need to specify indexes
		for(String[] strs :stringArg){
			for(String stringDim:strs){
				System.out.println(stringDim);
			}
			System.out.println("");
		}
		
		//Approach 2 -- Using Indexes to display String arrays
		for (int j = 0; j < stringArg.length; j++) {
			for (int j2 = 0; j2 < stringArg[j].length; j2++) {
				System.out.println(str1[j][j2]+" ");
			}
			System.out.println("");
		}
		
		//Approach3 is recommended when it is having equal no of elements in an array
		for(int a=0; a<stringArg.length; a++){
			for(int b=0; b<stringArg.length; b++){
				System.out.println(stringArg[a][b]);
			}
		}
//===========================================================================================================//	
		
		//IMP
		//ex9
		int abc=0;
		int def=7;
		//Here everyTime j value is incremented by 2
		//for (int j = 0; j < 6-1; j=j+2) {
		for (int j = 0; j < def-1; j=j+2) {
			System.out.println(j+"");//0, 2, 4
			
		}
		
	
		//ex10
		String[][] string = new String[2][];
		string[0]=new String[2];
		string[1]=new String[5];
		int ijk=97;
		for(int a=0; a<string.length; a++){
			for(int b=0; b<string.length; b++){
				string[a][b]=""+i;
				ijk++;
			}
		}
		for (String[] strings : string) {
			for (String string2 : strings) {
				System.out.println(string2+"");
			}
			System.out.println("");
		}
		
		//Result 97, 98
		//		99, 100, null, null, null
		
		
		//ex11
		int[][] p = new int[2][4];                                         //p         1    		2
		p[0]=new int[]{1,2,3,4};                                           //p[0]    1,2,3,4       1,2	p[1]
		p[1]=new int[]{1,2};
		
		//Way 1
		for(int m1=0; m1<p.length; m1++){
			for(int j=0; j<p[i].length; j++){
				System.out.println(p[m1][j]);
			}
			System.out.println("");
		}
			
		//way 2
		
		for (int[] js : p) {
			for (int j : js) {
				System.out.println(j+" ");
			}
			System.out.println();
		}
		//Result
		//1,2,3,4
		//1,2
		

		String[] stringA =new String[2];
		int p1=0;
		for(String strA	:	stringA){
			
			stringA[p1].concat("Element "+p1);// Since array values has not been defined, you are not allowed to perform any actions(concat/append...etc)
			i++;
		}
			for(int j=0;i<stringA.length; j++){
				System.out.println(stringA[j]);
			}
		}
		//the above program throws null pointer exception, as you performing concat operation on Null values
	
	}
	


class DoExample{
	public static void main(String...strings){

		//ex3 --> IMP
		int[] s1={10,20,30};
		int size1=3;
		int i1=0;
		
		/*Line 1*/
		
		/*do{
			i1++;
			//1, 1<2 
			//2, 2<3
			//3  3<3  // Break loop and i value is 3
		}while(i1<size1);
		//s1[3]
*/		System.out.println("The top Element:"+ s1[i1]);// array index out of bound exception
/*
Q) Which code fragment inserted at line 1, prints the Top Element :30
	A) 
	do{
		i++;
	}while(i>=size)
	
	B)
	while(i<size)
	{
		i++;
	}
	C)
	do{
		i++;
	}while(i<size-1);
	
	D)
	do{
		i++;
	}while(i<=size);
	
	E)
	while(i<=size-1){
	i++'
	}
	
	C is the correct answer

*/
}
	
//
}