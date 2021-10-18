package sample.sample;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import pack1.AppiumDriver;
import pack1.MobileElement;
public class ExamplePrograms {

/*
 * int nextInt = new Random().nextInt(12347)+12347;
 * int rand = (int)(Math.random() * 10000) + 10000; 
 How to run cucumber feature file from command line.?
 
 mvn test-Dcucumber.options="–-tags @Smoke"
 			[OR]
 mvn test -Dcucumber.options="--tags '@debug1 and @debug2'"

 classes in selenium --> Actions, Select, ChromeDriver, FirefoxDriver, WebDriverWait,Alert
 interfaces in selenium --> webElement, WebDriver, TakesScreenshot,JavascriptExecutor
 methods in selenoium --> getWindowHandle(), getWindowHandles(), getTitle(), getText(),quit(), close(), dismiss(), accept()
 
 */
//	driver.findElement(By.id("by-id")).getCssValue("font-size"); get the css Value()
public void windowHandling() {
	WebDriver driver;
	String parentWindow = driver.getWindowHandle();
	Set<String> windowHandles = driver.getWindowHandles(); // return type is set
	Iterator<String> iterator = windowHandles.iterator();
	while(iterator.hasNext()) {
		String childWindow = iterator.next();
		if(childWindow != parentWindow) {
			driver.switchTo().window(childWindow);//we can only pass 'String' as an argument
			driver.getTitle();
			driver.close();
		}
	}
	driver.switchTo().window(parentWindow);// after closing child windows we need to switch back to parent window
	
	//Below statement gives you window size
	int size=new ArrayList<String>(driver.getWindowHandles()).size();
}
	
	public static void findSecondHighest() {
	//	 {  H E L L O}  h e l 0 e
		// remove duplicates & find second alphabet
		char ch[] = { 'h', 'e', 'l', 'l', 'o' };
//		Character ch1[] = { 'h', 'e', 'l', 'l', 'o' };
		LinkedHashSet<Character> hashSet = new LinkedHashSet<Character>();
		for (Character ch1 : ch) {
			hashSet.add(ch1);
		}
		System.out.println(hashSet);

		Character ch2 = (Character) hashSet.toArray()[1];
		System.out.println(ch2);
	}

	public void MathSqrt() {
		int n = 2;
		int p = 5;
		int sum = n * n;
		for (int i = 3; i <=p; i++) {
//		for (int i = 1; i < p-1; i++) {
			sum = sum*n;
		}
		System.out.println(sum);
	}
	//Second highest number in array.?
	//1,2 JUMP, 4, RUN, HOP  
	
public void Multiplication() {
	int a[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 15, 20 };
	String str [] = new String [a.length];
	for (int i = 0; i < a.length; i++) {
		if (a[i] % 3 == 0 && a[i] % 5 == 0) {
			System.out.println("JUMP");
			str[i]= "JUMP";
		} else if (a[i] % 3 == 0) {
			System.out.println("RUN");
			str[i]= "RUN";
		} else if (a[i] % 5 == 0) {
			System.out.println("Hop");
			str[i]= "Hop";
		}else {
}
	}
	System.out.println(Arrays.toString(str));//[1, 2, RUN, 4, Hop, RUN, 7, JUMP, Hop]
}


//Drag nd Drop in selenium
//	Actions action = new Actions(driver);
//	action.dragAndDrop(driver.findElement(By.Xpath), Destinationlocator).build().perform();
	
	
//How to create new file.?
	
//Case 01	
//	File file=new File("path\\abc.txt");
//	file.createNewFile();

//Case 02
//	FileOutputStream file01=new FileOutputStream(new File(""));
	
//TestNG Latest versions 6.14.3 &&& 7.3.0

//if we have multiple methods annotated with @Test then it follows alphabetical order(method names) while executing test methods
//Though we defined the methods in a random manner (c, b, a, e, d), testNG executes the methods based on their method names by considering alphabetical order and the same was reflected in the output as well.

//	https://www.guru99.com/test-case-priority-testng.html	
	
	//	How to declare exceptions in TestNG
    //	@Test(expectedExceptions = ArithmeticException.class)
	public void testPrintMessage() {	
	   System.out.println("Inside testPrintMessage()");     
	}

//	@Test(enable=false)   testNG   @ignore --> JUNIT
//	@Test(timeout = 1000)
//	@Test(timeOut=1 00;	
//	@Test(priority=0)
//	@Test(dependsOnMethods = { "testTwo" })
//	@Test(groups={"group1"})
	public void testOne() {
		System.out.println("This method depends on testTwo");
	}

//	@Test
	public void testTwo() {
		System.out.println("This method should execute before testOne");
	}
	
	
//	@Parameters({"browser"})
//	@DataProvider(name = "data-provider"x`)
	public Object[][] dataProviderMethod() {
		return new Object[][] { { "data one","datatwo" }, { "data one","data two" } };
	}

//	@Test(dataProvider = "data-provider")
	public void testMethod(String data1, String data2) {
		System.out.println("Data is: " + data1);
		System.out.println("Data set 2nd "+data2);
	}
	
	
	public void ExceptionalHandling(){
		try {
			System.exit(0);//Since we are using System.Exit(0) it does not execute the Finally block
 			int a =1/0;
			System.out.println("try block");
		
		} catch (ArithmeticException e12) {
		
			System.out.println("catch block");
		}finally{
			System.out.println("Finally block");
		}
		//It does not print anything.
		
		//In the below case, finally block gets executed even it has return statement
		try {
			return;
		} catch (ArithmeticException e12) {
			System.out.println("catch block");
		}finally{
			System.out.println("Finally block");
		}
		//O/P : Finally block
	}
	
	//CE Error; Since the method return type is int, Finally block should be having return statement
	public int ExceptionHandlingType00ssss() {
		try {
			System.out.println("Try block");
			return 999;
		} catch (ArithmeticException e12) {
			System.out.println("catch block");
		}finally{
			System.out.println("Finally Block");
		}
	}
	//In the below case JVM consider finally block return statement/keyword
	public int ExceptionalHandling_Type1(){
		try {
			System.out.println("Try block");
			return 999;
		} catch (ArithmeticException e12) {
			System.out.println("catch block");
		}finally{
			System.out.println("Finally Block");
			return 1999;
		}
		
		//O/P: Try block  Finally Block 1999
	}
	
	//NEW : Extract pattern from string
	public void ExtractPatternFromString() {
		Pattern p = Pattern.compile("^([a-zA-Z]+)([0-9]+)(.*)");
//		Matcher m = p.matcher("Testing123Bharath");
//		if (m.find()) {
//			System.out.println(m.group());
//			System.out.println(m.group(0)); // whole matched expression
//			System.out.println(m.group(1)); // first expression from round brackets (Testing)
//			System.out.println(m.group(2)); // second one (123)
 //			System.out.println(m.group(3)); // third one (Testing)
//		}
		
		    Pattern p = Pattern.compile("[0-9]");
	        Matcher m = p.matcher("hello1234goodboy789very2345");
	        while(m.find()) {
	            System.out.println(m.group(0));
	        }
	}
	//NEW Split Array
	public void SplitArray() {
//		int[] inp = new int[] { 1, 2, 3, 4, 5,6,7,8 };
//					[OR]
	    int[] inp =  { 1, 2, 3, 4, 5,6,7 };
		
		int[] a = new int[(inp.length + 1)/2]; //size 4 (Greater part of array allocates to this 'a' array)
		int[] b = new int[inp.length - a.length]; // size 3
		for (int i = 0; i < inp.length; i++) 
		{
			if (i < a.length)
				a[i] = inp[i];
			else {
				System.out.println(i-a.length);
				b[i - a.length] = inp[i];
 			}
				
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
	
	//NEW : Find element in a sorted array whose frequency is greater than or equal to n/2.
	public void Program1() {
		int arr[] = {1, 1, 1, 2, 3};
		int i = arr[arr.length/2];
	}
	
	//NEW : Find Missing Number in an Array
	public static void MissingNumber() {
		int a[]= new int[] {1,2,3,4,5,6,9};
		for (int i = 0; i < a.length; i++) {
			if (a[i]!= i+1) {
				System.out.println("Missing number "+(i+1));
				break;
			}
		}
		//O/P : 5
	}
	
	
	//NEW: Sum All digits until it becomes single digit
		public static void SumAllDigits() {
			int n = 123456789;
			int sum = 0;
			while(n>0 || sum>9) {
				if (n == 0) {
					n = sum;
					sum = 0;
				}
				sum += n%10;//3, 2, 1  ;;;6 
				n = n/10;;//12, 1, 0
			}
			System.out.println(sum);
		}
		
	//NEW : Shifting elements to left in an array
	public static void LeftShiftArrya() {
		int[] array_nums = { 11, 15, 13, 10, 45, 20 };
		System.out.println("Original Array: " + Arrays.toString(array_nums));

		int first = array_nums[0];

		for (int i = 1; i < array_nums.length; i++) {
			array_nums[i - 1] = array_nums[i];
			
		array_nums[array_nums.length - 1] = first;
		System.out.p	rintln("New Array: " + Arrays.toString(array_nums));
	}
// O/P : Original Array: [11, 15, 13, 10, 45, 20] New Array: [15, 13, 10, 45, 20, 11]
	
		
	public static void ReplaceCharacter(){
		//Replace 'l' with 123
		String strRep = "hello";
		strRep=strRep.replaceAll("l", "1234");
		
		//replace o with u 
		String rep="broh";//length is 4
		for(int i=rep.length()-1; i>=0; i--){
			if(rep.charAt(i)=='o'){
				rep=rep.replace(rep.charAt(i), 'u');//SInce it is IM-MUTABLE we must need to store modified string into a ref
			}
		}
		System.out.println(rep);
		
		//Use StringBuilder to replace o with u
		StringBuilder sbrep=new StringBuilder("broh");
		for(int i=sbrep.length()-1; i>=0; i--){
			if(sbrep.charAt(i)=='o'){
				sbrep.setCharAt(i, 'u');//Since we are using StringBuilder we no need to store the modified string into Strinbuilder again
			}
		}
	}
	public static void javaInterviewQuestions(){
/*
 * 
 			Q. Compile Time/Static Polymorphism - Method Overloading  Run Time Polymorphism/Dynamic - Method Overriding
 			
 			Q. What is initElements in Page Object Model.
 				It initalizes all the webElements which has been declared in that class. Example is given below:
 				
 				public class ABC{
 				
 					@FindBy(how=How.XPATH, using="someXpath")
 					public WebElement ele0;
 					
 					@FindBy(how=How.Xpath, xpath="//div[@id='hellow']")
 					public WebElement ele;
 					
 					@FindBys({@FindBy(xpath = "CalendarMonth_caption_1")})
 					public List<WebElement> ele;
 					
 					public ABC(){
 						PageFactory.initElemnets(driver, this);
 					}
 				}
 				
			Q. What is finalize()
			Finalize is a method present in Object().DEF: finalize is a method, which is invoked by GC before destruction of an object to perform clean up activities 
			
			Q. Difference b/w String & StringBuffer, String Builder
			String : When there is any change in content, it creates new Object in String Pool(This is located in Heap Memory)
			StringBuffer & StringBuilder are classes.
			A. String is IM-Mutable whereas StringBuffer, String Builder are MUTABLE i.e when there is frequent changes in data we should go for StringBuffer, String Builder else we can go with string
				When there is change in data, it creates a new Object -->  IM Mutable def:
				It wont create any new object when there is any change in data -> Mutable Def
			  
			Q. Difference b/w StringBuffer & String Builder
			A. Both are almost same, they can be when there is mutable string. 
				Only diff is StringBuffer is synchronized like vector list where as String Builder is non sync 
			
			//Refer String Object Class Must
			
			
			Q. Difference b/w array list & linked list
			A. 	LinkedList is faster than ArrayList for deletion.su
			
			
			ArrayList: Dynamic Array
			---------
			Inserting a new element in an array of elements is expensive, because room has to be created for the new elements and to create room existing elements have to shifted.
			Stored in contiguous Memory Locations.
			>> Adding/Removing an element in b/w  elements is time consuming as it has to move all the elements
			>> Search is quicker
			
			
			
			Linked List::Double Linked list
			---------------
			It maintains information of 2 nodes for every insertion i.e it holds entry of previous & next indexes 
			>> Since it holds prev & next indexes, adding an element in B/W elements in quicker
			>> Search is slower as it maintains 2 indexes
			
			Array List :::: Adding an element in middle (OR) Removing items in an array is time consuming as it has to re arrange all the ArrayList Indexes
			Linked List :::: Adding an element in middle (OR) Removing items  is quicker as it maintains previous & next nodes
			
			
			Array List 	:::: Search is quicker as it maintains only node 
			Linked List :::: Search is very slow  as it maintains 2 nodes
			
				
			
		   Latent bugs are bugs which exist, but have not yet been discovered.
		   Masked defect is the defect which is hiding the other defect,

			1. Open the command prompt & run the below command
				java -jar jenkins.war
			2. Create a freeStyle Or maven project
			3. Click on Created Job -> Manage Jenkins -> Configure -> Goto JDK Section & give the below details
			 	JDK Name : JAVA_HOME;;;		JAVA_HOME = java path;
			 	Uncheck the 'install Automatically' checkbox.
			4. Goto SourceCode Management Section, Give repository url, credentials  branch name. Choose None if you want to give your local pom.xml location
				If you select 'NONE' here, you need to give your local pom.xml file location
			5. Goto ''Build Section'', Specify your Goal 	
			


			Schedule a freeStyle/Maven Project in Jenkins.
			
			Manage Jenkins -> Configure Jenkins -> Email Notifications. Configure it
			 

			Jenkins. How to trigger build in jenkins.?
			Minutes Hours DayOfMonth(1-31) Month(1-12) WeekOfMonth(1-7)
			
			Ex: H15 * * * *
			
			It executes job for every 15 mins in an hours, All days
			
			IMP : Jenkins periodically checks for any commit happened in SCM, if it finds any changes/commits in SCM(GitHub/SVN/TFS) it builds the application & deploys it in Test/dev servers
				  While building the application if it encounters any errors, it email that error.	
			 
		
		*/
	}
	/*
	*
	**
	***
	****
	******/
	
	public void PrintStars() {

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=6; i>=0; i--){
			for(int j=0; j<=i; j++){
				System.out.print("*");
			}	
			System.out.println();
		}
		
		/********
		****** 
		*****
		****
		***
		**
		**/
	}
	
	//A Number which is divisible by itself & 1 is said to be a prime number .. Ex: 29. 29/29= 1;;; 29/1 =29
	//Checking half of the factors is enough according to maths. ex: num/2
	public static int CheckIfNumberIsPrime(){

		int num=3;
		boolean flag=true;
		for(int i=2; i<num; i++){
//		for(int i=2; i<Math.sqrt(num); i++){
		//for(int i=2; i<num/2; i++){//Here we are starting from ''2'' b'z prime number divides with '1' we should check from '2'  
			if(num%i==0){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println("Prime no : "+num);
		}else{
			System.out.println("Not a prime no");
		}
		return num;
	}
	
	public static int nextPrime(int n) {
	      n++;
	      for (int i = 2; i < n; i++) {
	         if(n%i == 0) {
	            n++;
	            i=2;
	         } else {
	            continue;
	         }
	      }
	      return n;
	   }

	//hashSet vs LinkedHashSet diff --
	//LinkedHashSet maintains insertion order whereas HashSet DOESNOT maintain insertion order.
	
	//Write a program to remove duplicates
	public static void RemoveDuplicates(){
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));
		Set<Integer> linkedHashSet1 = new LinkedHashSet<Integer>();
		linkedHashSet1.addAll(list);
		System.out.println(linkedHashSet1);
		
		//Using Set
		int intArray[]={1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5};
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		for(int i=0; i<intArray.length; i++){
			linkedHashSet.add(intArray[i]);
		}
		System.out.println(linkedHashSet);
		Arrays.stream(intArray).distinct().forEach(System.out::print);
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int aList:intArray){
			arrayList.add(aList);
		}
		
		System.out.println(arrayList);
		arrayList.stream().sorted().forEach(System.out::print);
		
		
		//Using HashMap
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		int count=0;
		for(int i=0; i<intArray.length; i++){
			if(hashMap.get(intArray[i])==null){
				hashMap.put(count++, intArray[i]);
			}
		}
		
		System.out.println(hashMap);
	
		
		//Finding duplicates in String array
		String dupArray[]={"bharath", "kumar", "bharath"};
		ArrayList<String> arrayList2 = new ArrayList<String>(Arrays.asList(dupArray));
		Set<String> filterDup=new LinkedHashSet<String>(arrayList2);
		filterDup.addAll(arrayList2);
		System.out.println(filterDup);
		
		//Correct Way
		String dupArrays[]={"bharath", "kumar", "bharath"};
		Arrays.stream(dupArrays).distinct().forEach(System.out::print);
		Arrays.stream(dupArrays).distinct().forEach((n)->System.out.println(n+" "));
	
		System.out.println("******");
		
		int[] spam = new int[] { 1, 2, 3, 2, 1 };
		Arrays.stream(spam).distinct().forEach(System.out::print);
	}

	
	
	//Write program to remove 0's from array.
	public static void RemoveZeroFromArray(){
		int arr[] = new int[] { 1, 2, 3, 4, 0, 5, 0, 6 };
		for(int i=0; i<arr.length; i++){
			if(arr[i]==0){
				arr = ArrayUtils.removeElement(arr, arr[i]);
			}else{
				arr=ArrayUtils.add(arr, arr[i]);//Adding an element to an array
			}
		}
		System.out.println(arr.length);//1, 2, 3, 4, 5, 6
	}

	
	static void printPrimeNo_S(){
		 for(int i=2; i<100; i++){

			 for(int j=2 ; j<=100; j++){
				 
				 if(j==i){
					 System.out.println(i);// It's a prime number
				 }
				 if(i%j==0){
					 break;
				 }
			 }
		 }
	}
	
	
	
	//HashMap does not add duplicates keys. If it finds any duplicates it overrides
	static void findDuplicatesInAnArray(){
		int a[]={1,2,3,4,2,1};
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for(int i=0; i<a.length; i++){
			if(hashMap.containsKey(a[i])){
				hashMap.put(a[i], hashMap.get(a[i])+1);
			}
			if(!hashMap.containsKey(a[i])){
				hashMap.put(a[i], 1);
			}
		}
		System.out.println(hashMap);
		int firstKey =(int) hashMap.keySet().toArray()[0];
		int firstValue=(int) hashMap.values().toArray()[0];//Gets the firstValue
		
		//Get the keys from hashMap
		Set<Integer> keySet = hashMap.keySet();//as keys should be unique, it returns Set
		for (Integer integer : keySet) {
			System.out.println(integer);
		}
		
		//Get the values from HashMap. Values may or may not contains duplicates that is why it is returning collection
		Collection<Integer> values = hashMap.values();
		for (Integer integer : values) {

			System.out.println(intege r);
		}
		
		//Get the value based on Key
		for(Entry<Integer, Integer> entry:hashMap.entrySet()){
			 if (entry.getValue()==2) {
	                System.out.println(entry.getKey());
	            }
		}
	}
	//New: Find the Number which is not Repeating.
	public static void FindNonRepatingNumber() {
		int a[] = new int[] {1,2,2,1,3,4,4};
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (hashMap.containsKey(a[i])) {
				hashMap.put(a[i], hashMap.get(a[i])+1);
			}else {
				hashMap.put(a[i], 1);
			}
		}
		System.out.println(hashMap);
		for(Entry<Integer, Integer> h :hashMap.entrySet()) {
			if (h.getValue()==1) {
				System.out.println(h.getKey());
			}
		}
	}
	
	public static void SortingIntArray(){
	
		String str [] = new String [ ] {"test", "hi", "hellow", "test"};
		Arrays.sort(str, Collections.reverseOrder());;//Collections.reverseOrder()  --> CAN Be applied on ''String'' but NOT on int
		
		int a[] = { 1, 8, 7, 22, 4 };
		Arrays.sort(a);//sorting in asc order
		ArrayUtils.reverse(a);//Reversing array  --> 4, 22, 7, 8, 1
		
		ArrayUtils.sort(a, Collections.reverseOrder());//Reverse Order CAN ONLY applied on strings. CE--> if we use it on 'int'
		Arrays.sort(a);// Sorts array in ascending order
		Arrays.sort(a, Collections.reverseOrder());
		ArrayUtils.reverse(a);

		
//		convert 'int' to 'Integer' to make it desc order 
		Integer intArray[] = { 1, 8, 7, 22, 4 };
		Arrays.sort(intArray, Collections.reverseOrder());
		// Sorting int Array in descending order
		
	}

	
	static void listQuestions(){

		ArrayList<String> list = new ArrayList<String>();
	      list.add("JavaFx");
	      list.add("Java");
	      list.add("WebGL");
	      list.add("OpenCV");
	      list.add(2,"OpenCV");
	      list.set(3,"OpenCV");
	      
	      Collections.sort(list);//prints items in aesc
	      Collections.sort(list, Collections.reverseOrder());//Prints item in desc order
	      
	      list.get(0);//getting item based on index position
	      list.remove(0);
	      list.set(1,"bro");//overrides the value
	      list.removeAll(list);//removes all item in list
	      list.stream().filter(s->s.equals("")).collect(Collectors.toList());
	      list.stream().filter(s->s.equals("")).forEach(System.out::print);
	      System.out.println(list);
	      list.forEach(System.out::print);
	      list.forEach(n->System.out.println(n));
	}

	void findMaxValueInaNArray(){
		int[] a = new int[] { 2, 200, 50, 4, 71, 100};
		int max = a[0];
		System.out.println(max);
		for(int i = 0; i < a.length;i++)
		{
			System.out.println(a[i] +">"+ max);
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.println("From The Array Element Largest Number is:" + max);
	}
	
	void findSecondMaxNumberInAnArray() {
		int max;
		int a[] = new int[] {1900, 212, 99, 109};
		for(int i=0; i<a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					max = a[i];
					a[i]= a[j];
					a[j]= max;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));

		System.out.println("First second largest number is:: " + a[a.length - 1]);
		System.out.println("Second second largest number is:: " + a[a.length - 2]);
	}
	
	//sorting string/character in alphabetical order
	void sortString() {
		//sorting string in aesc order
		String[] a = { "Zimbabwe", "South-Africa", "India", "America" };
		String max;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if(a[i].compareTo(a[j])>0) {
					max = a[i];
					a[i] = a[j];
					a[j] = max;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		//o/p - [America, India, South-Africa, Zimbabwe]
		
		//sorting characters in aesc order
		String str = "helllo";
		String[] split = str.split("");//[[h, e, l, l, l, o]]
		System.out.println(Arrays.toString(split));//now, you can apply the above logic
	}
	
	public static void main(String[] args) {
//		palindromeInt(); 
		String str ="Hello hi how are you";
		String[] split = str.split("\\s");
		for(int i=split.length-1; i>=0; i--){
			System.out.println(split[i]);
		}
		
	}
	

	
	public static void ReverseString_Type2(){
		String str ="Hello";
		String finalOutPut="";
		char[] charArray = str.toCharArray();
			
		for(int i=charArray.length-1; i>=0; i--){
			finalOutPut+=charArray[i];
		}
		System.out.println(finalOutPut);
		
		//Type2
		
		String str1="Bharath Kumar";
		String fina="";
		for(int i=str1.length()-1; i>=0; i--){
			fina+=str.charAt(i);
		}
		System.out.println(fina);//ramuK htarahB

	}
	public static void ReverseAString(){
		
		String str ="Hello hi test";
		int length = str.split("\\s").length;//5<0
		System.out.println(length);
		for(int n=length-1; n>=0; n--){
			System.out.println(str.split("\\s")[n]);
		 }
		
		
	}
	
	public static void findMissingNosInAnArray(){
		int arr[]= {1,2,3,4,6};
		int sum = 0;
		
		int arr1[]={};
		for (int i=0; i<arr.length ; i++) {
			sum =sum+arr[i];
		}
//		System.out.println(sum);
		
		int sum1 = 0;
		for (int j=1; j<=6 ; j++) {
			sum1 =sum1+j;
		}
		System.out.println(sum1);
		
	}
	
	
	//palindromeInt --> Reversing int
	public static  void palindromeInt(){
 		int n=123;
		int r,s=0;
		while(n>0){
			r=n%10;
			System.out.println(r);//2
			n=n/10;
			System.out.println(n);//1
			s=s*10+r;
			System.out.println(s);
		}
		System.out.println(s);
		
		
		//Type 2; Here for loop iterates until num !=0
		int num = 1234567, re = 0;
		for (; num != 0;) {
			int digit = num % 10;
			num=num / 10;
			re = re * 10 + digit;
		}
		
		
		//Type 3		

		int number = 1234567, reve = 0;
		for (; num != 0;  num /= 10) {
		//for (; num != 0; num=num / 10) {
			int digit = num % 10;
			number=number / 10;
			reve = reve * 10 + digit;
		}
	}

	public static void swap2Nums(){
		int a=10;
		int b=20;
		
		//there is one formula using which we can achieve swaping
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void arraySort(){
		int a[]={1,2,12, 3,4,5,9};
		int[] sort = sort(a);
		for (int i : sort) {
			System.out.println(i);
		}
	}


	public static int [] sort(int[] a) {
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a.length; j++){
				if(a[i]>a[j]){
					int t;
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		return a;
	}
	
	public static void findDuplicates(){
		int count=0;
		int arr0[]={1,2};
		int arr[]={1,2,3,2, 2};
		for(int ar0 :arr0){
			for(int ar1:arr){
				if(ar0==ar1){
					count++;
				}
			}
			System.out.println(ar0+",,,"+count);
			count=0;
		}
	}
	
	
/*
  Following Dependency has been used for PDF validation
 	<!-- https://mvnrepository.com/artifact/org.apache.pdfbox/pdfbox -->
		<dependency>
		    <groupId>org.apache.pdfbox</groupId>
		    <artifactId>pdfbox</artifactId>
		    <version>2.0.14</version>
	z	</dependency>
		
*/
	static WebDriver driver;
	public static void PDFValidation(String[] args) throws Exception{
		
		URL url = new URL(driver.getCurrentUrl());
		InputStream openStream = url.openStream();
		
		
		BufferedInputStream bufferedInputStream = new BufferedInputStream(openStream);
		PDDocument pdDocument = new PDDocument();
		pdDocument.load(bufferedInputStream);
		String text = new PDFTextStripper().getText(pdDocument);
	}
	
	
//	fibanocciSeries --> adding no's
	public static void fibanocciSeries(){
		int n = 6, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");
//        First 6 terms: 0 , 1 , 1 , 2 , 3 , 5 ,

        for (int i = 1; i <= n; i++)
        {
            System.out.println(t1 + " , ");//o , 1

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            //t1; 1    
            //t2; 1
        }
	}
	
	public static void StringQuestions(){
		String str ="Hello bro how are you.?";
		String substring = str.substring(15);//it display's String from 15th index to till last
		
		String substring1 = str.substring(15, 20);;//it display's String from 15th index to till 20 th index
				
	}
	//First 6 terms: 0 , 1 , 1 , 2 , 3 , 5 ,
	
	void findLetters(){
		String str ="Hello123Kumar";
		char[] charArray = str.toCharArray();
		for(int i=0; i<charArray.length ; i++){
			//Character.isUpperCase(charArray[i])			
			if(Character.isLetter(charArray[i])){
				System.out.print(charArray[i]);
			}
		}
		for(int i=0; i<str.length()-1; i++){
			if(Character.isLetter(str.charAt(i))){
				System.out.println(str.charAt(i));//HelloKumar
			}
		}
	}
	
	void findNumbers(){
		String str ="Hello123Kumar";
		for(int i=0; i<str.length()-1; i++){
			
			if(Character.isDigit(str.charAt(i))){
				System.out.println(str.charAt(i));//123 
			}
		}
		
	}
	//Search for a character
	void CompareCharsAndPrintBeforB(){
		String str="ahjgabyababa";
		char ch[]=str.toCharArray();
		for(int i=0; i<ch.length; i++){
			if(str.charAt(i)=='b'){//str.charAt says, Character located at the index of string
				System.out.println(ch[i-1]);;
			}
		}
	} 
	
	
	public static void PrintDuplicateWords(){
		String str="Hello how are how you are how";
		HashMap<String, String> hashMap = new HashMap<String, String>();
		String[] split = str.split("\\s");
		for(int i=0; i<split.length; i++){
			if(hashMap.get(split[i])!=null){
				//prints the duplicates values
				System.out.println("Duplicate String/Word is "+split[i]);
			}if(hashMap.get(split[i])==null){
				hashMap.put(split[i], split[i]);
			}
		}
	}
	
	
	public static void PrintDuplicateWordCount() {
		String str="Hello how are how you are how";
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		String[] split = str.split("\\s");
		for(int i=0; i<split.length; i++){
			if(hashMap.get(split[i])!=null){
				hashMap.put(split[i], hashMap.get(split[i])+1);
				System.out.println("Duplicate String/Word is "+split[i]);
			}if(hashMap.get(split[i])==null){
				hashMap.put(split[i], 1);
			}
		}
		System.out.println(hashMap);//{how=3, Hello=1, are=2, you=1}
	}
	
	//Java 8 new features includes, forEach, Streams, LambdaExpression. DateTime, Static & default methods in interface.
	public void NewFunctionsInList(){
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.forEach(System.out::print);
		arrayList.forEach(n -> System.out.println(n));//It prints all numbers in a list
		arrayList.stream().filter(s->s==2).collect(Collectors.toList());
		arrayList.removeIf(s->s==2);
		arrayList.removeIf(s->s%10 == 0);
		
		arrayList.stream()
		.filter(s->s==1)
		.sorted()
		.forEach(System.out::println);
		
		arrayList.forEach(System.out::println);
		
		arrayList.stream().sorted().forEach(System.out::println);
	}
	
	public static void DBQuestion(){
		WebDriver driver;
		
		/*
		 
		SELECT COUNT(CustomerID), Country
		FROM Customers
		GROUP BY Country 
		ORDER BY CustomerID ASC; OR DESC
		
		SELECT CustomerID, Country
		FROM Customers
		GROUP BY Country
		HAVING COUNT(CustomerID) > 5;
		
		The above query give you result  :for ex, if the Country india has 2 records then USING count(Coun)
		
		SELECT CustomerID, Country FROM Customers
		
	
		CustomerID  Country
		1           China
		2 			India
		3           China
		4 			India
		5           China
		
		SELECT CustomerID, Country FROM Customers Group By Country ; Group By Sorts result in Asec order 
		
		CustomerID  Country
		1           China
		5           China
		3           China
		2 			India
		4 			India
		
		SELECT COUNT(CustomerID), Country FROM Customers Group By Country ; India repeated twice so it has given 2 as count similarly, china has repeated 3times so the count woud be 3 
		
		CustomerID  Country
		2           China
		3 			India
		
		
		
		SELECT COUNT(CustomerID), Country FROM Customers Group By Country HAVING COUNT(CustomerID) > 2; This says,  Having repeated more than 2 then display it. 
		
		CustomerID  Country
		3           China
		4 			India
		5           China
		
		
		
		
		*/
		
		//Between --> SELECT * FROM Products WHERE Price BETWEEN 10 AND 20;
		
		/*
		 * 
		
		Find Second Highest Salary From EMP table
		Select MAX(SALARY) from EMP WHERE SALARY NOT IN	(Select MAX(SALARY) from EMP)
		
		Find 3rd Highest Salary.?
			SELECT TOP 1 SALARY FROM (
			SELECT Top 3 SALARY  FROM Customers Order by SALARY DESC)
			AS BHARATH ORDER BY SALARY ASC;
			
			
		Find 4th Highest Salary.?
			SELECT TOP 1 SALARY FROM (
			SELECT Top 4 SALARY  FROM Customers Order by SALARY DESC)
			AS SOMETABLENAME ORDER BY SALARY ASC;
			
			
			Explanation to the above query
			SELECT Top 4 CustomerID  FROM Customers Order by CustomerID DESC ; 
						If we do not use DESC it will give you result like 1,2,3. Since We are using DESC it gives Highest Result First
						After executing above query, it gives you result like 
							98
							86
							46
							42
						Now, from the above result, you need to get 4th(Last). Use ASC order
						SELECT TOP 1 CustomerID FROM (
							SELECT Top 4 CustomerID  FROM Customers Order by CustomerID DESC)
			AS BHARATH ORDER BY CustomerID ASC			 
							
			
			
		In order to use join's concept we must have FORIEGN key column in Table 2. Foreign key column name can be anything
		
		The INNER JOIN keyword selects records that have matching values in both tables.
		
		SELECT Orders.OrderID, Customers.CustomerName
		FROM Orders
		INNER JOIN Customers ON Orders.CustomerID = Customers.CustomerID;
		
		
		The LEFT JOIN keyword returns all records from the left table (table1), and the matched records from the right table (table2). The result is NULL from the right side, if there is no match.
		
		SELECT Customers.CustomerName, Orders.OrderID
		FROM Customers
		LEFT JOIN Orders ON Customers.CustomerID = Orders.CustomerID
		ORDER BY Customers.CustomerName;
		
					(OR)in the below example, OUTER is an options
		
		SELECT Customers.CustomerName, Orders.OrderID
		FROM Customers
		LEFT OUTER JOIN Orders ON Customers.CustomerID = Orders.CustomerID
		ORDER BY Customers.CustomerName;
		
		The RIGHT JOIN keyword returns all records from the right table (table2), and the matched records from the left table (table1). The result is NULL from the left side, when there is no match.
		
		
		INSERT INTO table_name (column1, column2, column3, ...) VALUES (value1, value2, value3, ...);
		INSERT INTO table_name VALUES (value1, value2, value3, ...);
		
		
		SUM   --> SELECT SUM(Quantity) FROM OrderDetails;
		Count --> SELECT COUNT(Quantity) FROM OrderDetails;
		AVG, MAX
				
		The UNION operator is used to combine the result-set of two or more SELECT statements.
		â¢	Each SELECT statement within UNION must have the same number of columns
		â¢	The columns must also have similar data types
		â¢	The columns in each SELECT statement must also be in the same order
		
		UNION Syntax
		------------
		SELECT column_name(s) FROM table1
		UNION
		SELECT column_name(s) FROM table2;


		Thread life Cycle
		new -> Runnable -> Running -> Waiting -> Dead(End of Execution)
		 
		
		Mobile Automation
		//TouchAction().press(el0).moveTo(el1).release()
		
		TouchAction action = new TouchAction(driver);
		Action.longPress(webElm).perform();
		
		TouchAction action = new TouchAction (this.driver);
		action.press (startX, startY)
    	.moveTo (endX, endY)
    	.release ()
    	.perform ();
    	
    	

    	Appium::
    	Prerequisites for Appium
    		* NodeJS
    		* Appum for node JS
    		* Appium Server
    		* Andriod SDK or Andrio command line tools
    		* Eclipse IDE, Java
    	How to enable developer mode in mobile phone.? open settings, click on buildNumber for 7 times. done
    	
    	like WebElement'' we have to use 'MobileElement' in mobile applications
    	
    			 				 ------								                ------   	
    	----------------		|'json'| wire protocol converts webDriver script in to| 'REST'| based in order to make appium server to understand & work on native apps
    	WebDriver Script ------ -------- -------------------| AppiumServer|--------  ------- --------- ----| Native Applications|
    	----------------
    	Appium Inspector can be used to inspect both andriod & ios apps. It also works in both window & mac os
    	UiAutomator only works for andriod apps --> it captures elements in terms of screenshots
    	
    	
    	'''UIAutomator/Selendriod'' is used to inspect element in andriod env(appium inspector only works in IOS env)
    	
    	
    	
    	Andriod --> UIAutomator OR Selendriod
    	IOS --->UI Automation OR XCUITest
    	Windows --> winAppDriver
    	
    	install node js for windows, after installing it, install appium for node js -- cmd ''npm install -g appium'' 
    	other commands 'where appium' says location 'appium -v or appium --version' tells version of appium
    	starting appium 'appium'
    	
    	appium port number -4723 ip address 127.0.0.1
    	appium works on android & IOS app but it doesnot works andriod version lower than 4.2 & apk level 17
    	adb devices; It displays the list of devices which has currently Activated or connected. you can get deviceID/udid using this cmd
    	
    	Note: Please make sure that you open the app before going to the next step, because command in the next step would provide the
    	// details only for the app which is currently in focus.
    	
    	dumpsys window windows | grep -E 'mCurrentFocus' --> To read appActivity & packageName
    	
    	
    	full reset vs no reset
    	no reset --> clears the app data
    	full reset --> un installs the app & installs the latest version of app
    	**********************************************
    	******************** CODE ********************
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Micromax HS2");
		
		//udid is device id. you can get it by running adb devices command in the command promt
		capabilities.setCapability("udid", "76567af");
		capabilities.setCapability("platformName", "");
		capabilities.setCapability("platformVersion", "");
		
		//you can get appPackage & appActivity form apk.info info
		capabilities.setCapability("appPackage", "com.myos.calculatorZ");
		capabilities.setCapability("appActivity", "com.myos.calculator2.Calculator");
		
		WebDriver driver=new AppiumDriver<MobileElement>(new URL("https://127.0.0.1:4723/wd/hub"), capabilities);
		**********************************************
    	http://www.automationtestinghub.com/apppackage-and-appactivity-name/
    	https://www.toolsqa.com/mobile-automation/appium/how-to-find-apppackage-and-appactivity-for-apk-file/
    	
    	How to check whether page contains frame or not.?
    	
    	driver.getPageSource().contains("iframe");
    	driver.findElements(By.tagName("iframe")).size();
    	
    	
    	What are the libraries used in Cucumber.?
    	
			cucumber-core-1.2.2.jar
			cucumber-java-1.2.2.jar
			cucumber-junit-1.2.2.jar

			cucumber-jvm-deps-1.0.3.jar
			cucumber-reporting-0.1.0.jar

			gherkin-2.12.2.jar
    	
    	
    	//////////////////////////////////////////////////////////////////////	Git Commands //////////////////////////////////////////////////////////////////////////////
    	
    
    	
    	Create Branch:    			 git branch feature/BranchName
    	Delete Branch from local :   git branch -d feature/BranchName 
    	Delete Branch from remote :  git push -d origin feature/BranchName
    	
    	Checkout Branch : git checkout feature/BranchName
    	
    	https://www.youtube.com/watch?v=A9AbyzUChEU
    	
    	git stash --> saving files in a temporary memory of git

    	git stash save "repo1"
    	git stash save "repo2"
    	git stash list  # this will display list of saved repo's in temp memory of git
    		stash@{0}: on Branch: repo1
    		stash@{1}: on Branch: repo2
    	
    	git stash apply ;.
    	 [OR]
    	git stash apply stash@{0} #this will apply/merge the repo1 changes to your existing code
    	git stash pop
    	git stash pop # applies the changes & removes the code
    	
    	git stash clear # cleans the entire repos in stash
    	git stash drop stash@{0} # deletes repo1 from stash
    	
    	
    	git status - To see what all files has been changes
    	
    	Staging file :
    		git add .
    		git add fileName.Java
    	
    	Committing file:
    		git comit -m "Git comit message"
    		
    	Pushing changes 
    		git push origin : feature/BranchName	 

    	
    	How to pull the latest code from GitHub without loosing your changes.?
    		git stash   	; Preserve your change
    		git pull 		; Pull the latest code
    		git stash pop	; Merge your changes with the latest code
    		
    		 							OR
    		 
    		git pull --rebase origin dev;;   git pull --rebase origin feature/featureBrachName
    		
    	//remove local changes & pull latest code from remote remo	
     	git reset --hard HEAD
		git clean -xffd
		git pull
    		
    		
    	Display all the branch	
    		git branch -a
    		
    	git status ; To see what all files have been modified / created newly	
		
		
		GitFetch vs Git pull
		GitFetch only pulls the latest code WHEREAS git pull it pull latest code from git AND It merges your changes too
		
		origin dev
		
		
		What is origin.?
		
		You're on the branch master. The upstream branch is master in origin
		origin is parent to all branches such as master, dev, etc
		
		
		How to resolve Git Conflicts.?
			git rebase --continue
			git config merge.conflictstyle diff3
			
		//////////////////////////////////////////////////////////////////////	Git Commands //////////////////////////////////////////////////////////////////////////////
		*/
		
		
	}
}
//================================================================Finding Duplicates in an Object================================================================//
//To find duplicates, we must override equals(), hashCode() method.  
//Using 'set' and 'streams()' we can find duplicates along with equals() & hashCode() method.   
class SisCode {

	public static void main(String[] args) {
		EmployeeInterview employee00 = new EmployeeInterview(1, "Kumar", "Hitech");
		EmployeeInterview employee01 = new EmployeeInterview(3, "bharath", "USA");
		EmployeeInterview employee02 = new EmployeeInterview(4, "Reigns", "USA");
		
		
		ArrayList<EmployeeInterview> arrayList=new ArrayList<EmployeeInterview>();
		arrayList.add(new EmployeeInterview(1,"bharath", "Hyderabad"));
		arrayList.add(employee00);
		arrayList.add(employee01);
		arrayList.add(employee02);
		
		//In the above arrayList, It shares same hashCode for Object 'bharath' since it is a duplicate
		
		//Type 1 Using LinkedHashSet
		LinkedHashSet<EmployeeInterview> linkedHashSet = new LinkedHashSet<EmployeeInterview>();
		linkedHashSet.addAll(arrayList);
		System.out.println(linkedHashSet);
		
		
		//Type2 Using Java8Streams
		arrayList.stream().distinct().forEach(System.out.println(a.Ename));
		
		arrayList.stream().distinct().filter(a1.Ename).forEach(System.out::print);//prints emp name
		
		
		//						(OR)
		List<EmployeeInterview> filteredArray=arrayList.stream().distinct().collect(Collectors.toList());
		System.out.println(filteredArray);
		
		
		
	 	
		//Print the EmpName whose Address is matching to USA
		arrayList.stream().filter(s->s.Eaddr.equals("USA")).forEach(System.out::print);
		arrayList.stream().filter(s->s.Eaddr.equals("USA")).collect(Collectors.toList());//If you use Collect, it returns you 'ArrayList Object'
		
		
		
		//find Average age of employees
		OptionalDouble average2 = arrayList.stream().mapToInt(a->a.Eid).average();
		System.out.println(average2+" average2");
		//						(OR)		
		Double average = arrayList.stream().mapToInt(a->a.Eid).average().orElse(0.0);//Using OrElse removes printing the Optional 
		System.out.println("average "+average);//10/4-->2.5
		//						(OR)
		arrayList.stream().mapToDouble(a->a.Eid).average().orElse(0.0);
		
		int sum = arrayList.stream().mapToInt(q->q.Eid).sum();
		
		OptionalInt min = arrayList.stream().mapToInt(a->10+a.Eid).min();
		OptionalInt max = arrayList.stream().mapToInt(a->a.Eid+a.Eid).max();
		arrayList.stream().mapToInt(a->a.Eid).count();
		
	}
}

class EmployeeInterview{
	int Eid;
	String Ename;
	String Eaddr;
	
	EmployeeInterview(int Eid, String Ename, String Eaddr){
		this.Eid=Eid;		this.Ename=Ename;		this.Eaddr=Eaddr;//initializing instance(class-level) variables
	}
	
	//To find the Duplicates in objects we must need to override the equals() & hashCode() methods
	//hashCode() -->Without overriding this method, it creates new 'hash code' for every single object created. 
					//It shares same HashCode when it finds same Object Instance
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//return prime * result + Eid;
		// OR
		return prime * result + (Ename==null?	0:	Ename.hashCode());
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof EmployeeInterview) {
			EmployeeInterview s=(EmployeeInterview) obj;
			if (s.Ename.equals(this.Ename)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return this.Ename;
	}
}
//================================================================Finding Duplicates in an Object================================================================//

//================================================================Sorting Object In AESC Order================================================================//
//Sorting Object In AESC Order
//public class SortingMech {
class SortingMech implements Comparator<Employee_Sort>{

	public static void main(String[] args) {
		Employee_Sort employee00 = new Employee_Sort(2, "Kumar");
		Employee_Sort employee01 = new Employee_Sort(3, "Zenith");
		Employee_Sort employee02 = new Employee_Sort(4, "Abc"); 
		
		
		ArrayList<Employee_Sort> arrayList=new ArrayList<Employee_Sort>();//This does NOT require implementation of Comparator Operator
//		TreeSet<Employee_Sort> arrayList=new TreeSet<Employee_Sort>(new SortingMech());// This requires implementation of Comparator Operator
		arrayList.add(employee00);
		arrayList.add(employee01);
		arrayList.add(employee02);
		System.out.println(arrayList);//Before sorting
		
		Collections.sort(arrayList);/// soring in aesc order
		Collections.reverse(arrayList); // reverse list order
		
		Collections.sort(arrayList, (s1,s2)->s1.Ename.compareTo(s2.Ename));
		
		Collections.sort(arrayList, new SortingMech()); //OR
		arrayList.sort((Employee_Sort e1, Employee_Sort e2)->e1.Ename.compareTo(e2.Ename));//In ASEC order. This does NOT require implementation of Comparator Operator
		arrayList.sort(new SortingMech());
		System.out.println(arrayList);//After Sorting
		
		//Using Java 8 Lambda Expression. Type 1
		arrayList.stream().sorted(new SortingMech()).forEach(n->System.out.println(n.Ename));
		//							(OR)
		
		arrayList.stream().sorted((s1,s2)->s1.Ename.compareTo(s2.Ename)).forEach(System.out::print);//Using Streams in ASEC. This does not require implementation of Comparator
		
		List<Employee_Sort> filterArray=arrayList.stream().sorted((e1,e2)->e1.Ename.compareTo(e2.Ename)).collect(Collectors.toList());
		System.out.println("----");
		System.out.println(filterArray);
		
		//Using Java 8 Lambda Expression. Type 2
		arrayList.stream().sorted(new SortingMech()).forEach(System.out::print);
		
		

	}

	@Override
	public int compare(Employee_Sort o1, Employee_Sort o2) {
		return o1.Ename.compareTo(o2.Ename);
//	                  (OR)
//		return o1.Ename.length() - o2.Ename.length();
	}
	
	//Use below method when comparting int's 
//	@Override
//	public int compare(BharathKarate b1, BharathKarate b2) {
//		return b1.price - b2.price;
//	}

}

class Employee_Sort{
	int Eid;
	String Ename;
	Employee_Sort(int Eid, String Ename){
		this.Eid=Eid;
		this.Ename=Ename;
	}
	public String toString(){
		return this.Ename;
	}
	
}

//================================================================Sorting Object In AESC Order================================================================//




//============================================================================LISTNERS IN TESNG=========================================================================================
/*
 	
 	What are Maven Pugins.?
 		Maven Compiler ;This Plug-in is used to compile the source code of Maven project. This is invoked by using mvn test or mvn compile
 		Maven SureFire ; This is used to execute TestNg.Xml file. Here we can specify TestNg.xml file;; The Surefire Plugin is used during the test phase of the build life cycle to execute the unit tests of an application. 
 						  It generates reports in two different file formats
 	<plugin>
		<groupId>org.apache.pdfbox</groupId>
		<artifactId>pdfbox</artifactId>
		<configuration>
			<source>1.8</source>
			<target>1.8</target>
		</configuration>
	</plugin><plugin>
		<groupId>org.apache.pdfbox</groupId>
		<artifactId>pdfbox</artifactId>
		<configuration>
			<source>1.8</source>
			<target>1.8</target>
		</configuration>
	</plugin>
	
 	Life-Cycle of Maven
 	Validate - Compile - Test - Package - Install - Deploy
 	
 	https://youtu.be/-a5aHd0gsGw

	For reporting, log functionality we generally use Listners in TestNG
	Few Listners in TestNG 
	ISuiteListner
	ITestListner
	ITestResult
	IReporter
	
	@ How to use ITestResult ? We use ITestResult to get the testStatus like below
	class UseItestResult{
	
	//If the methods which are annotated with @Test gets Pass/Fail ITestResult get's the result of it.
		@Test
		public void PassTC(){
		}
		
		@Test
		public void FailTC(){
		}
	
		public void SomeTest(ITestResult result){
			if(result.getStatus() == ITestResult.SUCCESS){
				//Do some thing
			}
			if(result.getStatus() == ITestResult.FAILURE){
				//Do some thing
			}
		}
	}
	
	Q. If a class is implementing ISuiteListner it has to override below methods
	public class ListNerClass implements ISuiteListner{
		@Override
		public void onFinish(ISuite arg0) {
		}
	
		@Override
		public void onStart(ISuite arg0) {
		}
	}
   Q. If a class is implementing ITestListner it has to override the below methods
   public class ListNerClass implements ITestListner{
	   @Override
			public void onFinish(ITestContext arg0) {
			}
		
			@Override
			public void onStart(ITestContext arg0) {
			} 
	}
	If you want to implement the listeners you must use below annotation on top of class
	
	Type 1: Simply create a class & include TestNG Listner by adding @Listners annotation
	
	@Listeners(pack1.ListNerClass.class)l
	Public class ActualTestcases{
	
		@Test
		public void Testcase1(){
		
		}
	}
	
	Type 2: Create XML File like below 
	TestNg.xml
	<suite name="Suite-Listeners" parallel="none">
	 <listeners>
	 	<listener class-name="utility.Listener"></listener>
	 </listeners>
	 <test name="Batch-Listeners">
	 <classes>
	 	<class name="automationFramework.TestListener" />
	 </classes>
	 </test> 
	</suite>
	

Group Based Testing in TestNG
-------------------------------

 @Test (groups = { "bonding", "strong_ties" })	
 public void M1(){}
 
 <suite name="Suite">	
		<test name="Guru 99 Smoke Test Demo">
			<groups>		
   				<run>		
    				<include name="bonding" />		
   				</run>		
			</groups>
		</test>
 </suite>
 
Priority Based TestNg
@Test(priority=0)


//SAMPLE TESTNG.XML
<suite name="Sample Test Suite" verbose="1" >
  <test name="Method Test Cases" >
    <classes>
       <class name="com.easy.entry.AddTestCase">
        <methods>
        <include name="addDepartmentTestCase" /> ; 'addDepartmentTestCase' is a method Name 
      </methods>
       </class>
    </classes>
  </test>
</suite>
	
	
	//////////////////////////////////////////////////XPATH WRITING//////////////////////////////////////////////////////////////
	 //div[contains(@class,'social4i')]
	 //div[starts-with(@class,'social4i')]
	 //a[contains(.,'someText')]
	 //a[contains(text(),'someText')]
	
	 //div[@id='someID']/div
	  * 
	  *
	  * 
	  * 
Timeouts in Selenium :
-------------------- 
Implicit Wait : Default wait time is '0'
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

Here 2nd Param can be: 
		SECONDS, MINUTES, MILISECOND, MICROSECONDS, NANOSECONDS, DAYS, HOURS, etc.

Explicit Wait
WebDriverWait wait = new WebDriverWait(driver, 40);
wait.until(ExpectedConditions.elementToBeClickable(By.Xpath(""))).click();
wait.until(ExpectedConditions.presenceOfElementLocated(By.Xpath(""))).set();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.Xpath(""))).set();

IMP 
---
Suppose we are trying to find an element which has some "ExpectedConditions "(Explicit Wait), If the element is not located within the time frame defined by the Explicit wait(10 Seconds), 
It will use the time frame defined by implicit wait(20 seconds) before throwing an "ElementNotVisibleException"



What are Maven Scopes.?
The <scope> element can take 6 values: compile, provided, runtime, test, system and import

What happens if we have same dependencies with different versions.?
	Conclusion ; It chooses the nearest one in Pom.xml
	Maven will only resolve one dependency in your module and will omit the other versions to avoid any conflict. 
*Even if multiple versions of the same dependency are used in the whole dependency hierarchy maven will pick one version using the "nearest in the dependency tree" strategy.
	
	
What is the difference B/W Get and Navigate methods in selenium.?
	driver.get("http://www.googl.com"); It does not maintains browser History & Cookies. You can perform Navigate(), Back() on this
	driver.navigate().To("http://www.googl.com"); It maintains browser History & Cookies. Here, we are allowed to do navigate() & Back().

	  	
	  	
Selendriod 
----------
Hud & Node should contain Selenium-Server-Standalone with same version. Register all nodes with hub

Hub : java -jar Selenium-Server-Standalone -role hub
node : java -Dwebdriver.chrome.driver="pathOfExeFile"  -jar Selenium-Server-Standalone -role node - hub ipAddressOfHub/grid/register
 

 java -jar Selenium-Server-
 

Assertion
---------
There are two types of assertions in Selenium
Hard Assertions   Hard assertions usually throw an Assertion Error whenever an assertion condition has not been met. 
Soft Assertions   A soft assertion continues with the next step of the test execution even if the assertion condition is not met.
				  Soft Assertions are the type of assertions that do not throw an exception automatically when an assertion fails unless it is asked for.

Ex of Soft Assertion
//Object of Class SoftAssert is created to use its methods
SoftAssert softassert = new SoftAssert();
softassert.assertEquals(ActualTitle, ExpectedTitle);



Assert Vs Verify
-----------------
When an assert fails, the test is aborted. When a verify fails, the test will continue execution, logging the failure.

asse
rtEquals; 			Assert.assertEquals("This assertion will pass","This assertion will pass");
assertNotEquals			Assert.assertNotEquals("","");
assertTrue				Assert.assertTrue(3<5);  assertTrue(isElementPresent(By.cssSelector("div.bbMargin")));
assertFalse				
assertNull				Assert.assertNull(null);
assertNotNull			Assert.assertNotNull("");

Exceptions in Selenium
-------------------------
NoSuchElementException. 	 ##When element is wrong. Xpath may be WRONG.
ElementNotVisibleException.  ##When we are interacting element whose attribute is set to HIDDEN
TimeoutException. 			 ##When time elapse. This issue offen occures when page load is taking too longer
NoSuchWindowException.
NoSuchFrameException.
NoAlertPresentException.
InvalidSelectorException. 		##When Xpath SYNTAX is IN-CORRECT
ElementNotSelectableException. 	##Element may be overlapped by other element. When the attribute of the element is set to DISABLED 
ConnectionClosedException
WebDriverException  ;When webdriver is executing its command on CLOSED BROWSER
Stale ElementReferenceException
https://www.softwaretestinghelp.com/exception-handling-framework-selenium-tutorial-19/




Protractor
---------
https://www.gangboard.com/blog/selenium-vs-protractor/

#Protractor is an end-to-end test framework for Angular and AngularJS applications. 

#	Most angular JS applications are embedded with HTML attributes such as ng-model and ng-controller. 
	Selenium locators do not include them and hence cannot trace such web elements through pure Selenium code. 
	Written as a wrapper on the top of Selenium code, Protractor can easily trace such Angular-specific locators and control such web application attributes.

npm install -g protractor   ## this will install protractor & web driver manager
webdriver-manager update    ## Use it to download the necessary binaries with:
webdriver-manager start     ## This will start up a Selenium Server and will output a bunch of info logs.


Protractor needs two files to run, a SPEC file and a CONFIGURATION file

todo-spec.js:
------------
describe('angularjs homepage todo list', function() {
  it('should add a todo', function() {
    browser.get('https://angularjs.org');
    element(by.model('todoList.todoText')).sendKeys('write first protractor test');
    element(by.css('[value="add"]')).click();
    var todoList = element.all(by.repeater('todo in todoList.todos'));
    expect(todoList.count()).toEqual(3);
    expect(todoList.get(2).getText()).toEqual('write first protractor test');
    // You wrote your first test, cross it off the list
    todoList.get(2).element(by.css('input')).click();
    var completedAmount = element.all(by.css('.done-true'));
    expect(completedAmount.count()).toEqual(2);
  });
});

conf.js:
--------
exports.config = {
  seleniumAddress: 'http://localhost:4444/wd/hub',
  specs: ['todo-spec.js'] #Spec file location need to be declared here
};


How to Run.?
protractor conf.js
-----------------------------------------------------------
Load testing Metrics
--------------------
Latency :: the term latency of a request is the travel time from client to server and server to client. Round trip time

SCALABILITY TESTING is a non functional testing, that measures performance of a network or system, when the number of user requests are scaled up or down.  
The purpose of Scalability testing is to ensure that an application can handle the projected increase in user traffic, data volume, transaction counts frequency, etc.
It tests the system, processes, and databases ability to meet a growing need.

Latency vs Throughput
---------------------
Latency is the time required to perform some action or to produce some result. Latency is measured in units of time--hours,minutes,seconds,nanoseconds or clock periods.
Throughput is the number of such actions executed or results produced per unit of time.
	Throughput should always be higher in order to result better performance

latency vs response time
------------------------
latency - time gap b/w request sent from client - server & server - client. It doesnt include wait time for response
response time -  time gap b/w request sent from client - server & server - client ++ it includes server wait time


Gradle vs Maven
--------------------------
Maven is xml based. It requires lengthy html code to define dependencies or plugins
Gradle is simple. It is Groovy based. Less verbose

Gradle: When you create a gradle project it comes with different files such as buld.gradle(pom.xml), settings.gradle(we can pull different project in here), gradlew(windows), gradlew.bat(linux)
Maven comes with only pom.xml

Gradle: it is task based. You can define custom tasks, override existing tasks. It also allows you to write java code it
Maven : Does not support this.



Junit Vs TestNG
-------------------------------
https://www.guru99.com/junit-vs-testng.html
	Both are same but few more functionalities are added to it that makes TestNG more powerful than JUnit.
	Dependency based testing is not possible in JUnit
	@BeforeSute, @AfterSuite, @BeforeTest, @AfterTest, @BeforeGroups, @AfterGroups Not in JUNIT


IMP

ClassNotFoundException is an exception that occurs when you try to load a class at run time using Class. forName() or loadClass() methods and mentioned classes are not found in the classpath.
NoClassDefFoundError is an error that occurs when a particular class is present at compile time, but was missing at run time.

Fluent Wait
------------
Fluent Wait looks for a web element repeatedly at regular intervals until timeout happens or until the object is found.

Wait wait = new FluentWait<WebDriver>(driver)
.withTimeout(50, TimeUnit.SECONDS)
.pollingevery(3, TimeUnit.SECONDS)
.ignoring(NoSuchElementException.class);

This command operates with two primary parameters: timeout value and polling frequency. Wait wait = new FluentWait<WebDriver>(driver)
.withTimeout(50, TimeUnit.SECONDS)
.pollingevery(3, TimeUnit.SECONDS)
.ignoring(NoSuchElementException.class);
This command operates with two primary parameters: timeout value and polling frequency. The above code defines time out value as 50 seconds and polling frequency as 3 seconds. It directs WebDriver to wait for a maximum of 50 seconds to verify a specific condition. If the condition occurs during those 50 seconds, it will perform the next step in the test script. If not, it will throw an “ElementNotVisibleException”.
x It directs WebDriver to wait for a maximum of 50 seconds to verify a specific condition. If the condition occurs during those 50 seconds, it will perform the next step in the test script. If not, it will throw an “ElementNotVisibleException”.



//Partial link text in java
List<WebElement> links = driver.findElements(By.tagName("a"));
Iterator<WebElement> it = links.iterator();
while (it.hasNext()) {
	String url = it.next().getAttribute("href");
	try {
		HttpURLConnection conn = (HttpURLConnection) (new URL(url).openConnection());
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respCode = conn.getResponseCode();
		if (respCode >= 400) {
			System.out.println(url + " is a broken link");
		} else {
			System.out.println(url + " is a valid link");
		}
	} catch (Exception e) {
		e.printStackTrace();
	} 
}

How to handle proxy authentication in Selenium.?

Step 1 --> By using AutoIT  ### command ### send("username"); send("password")
Step 2 --> Firefox & chrome
		Passing credentials through the url: http://username:password@url.com 
						driver.get("http://UserName:Password@Example.com");
		This works only when the authentication model is HTTP basic. Moreover use of this kind of url is deprecated and not advisable.

Step 3 --> Below method works only for IE

			WebDriverWait wait = new WebDriverWait(driver, 10);      
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());     
			alert.authenticateUsing(new UserAndPassword(username, password));

Step 4 Using alert

	driver.get('https://example.com/')
	driver.switchTo().alert().sendKeys("username" + Keys.TAB + "password");
	driver.switchTo().alert().accept(); //cicks ok button
	driver.switchTo().alert().dismiss(); //clicks cancel button

Methods in API.? get, post, put, delete
API status codes
-------------------
200 Ok
201 Created
400 Bad request --> when size is not matching, blank fields, invalid data(cuurency)
401 Un Authorized
403 forbidden -->you're not allowed to access.
500 internal server error --> mis spelt schema
503 Unservicable

Selenium latest version 4.0


Difference B/W hash map & hash table
Hash table - Hashtable is synchronized. Since it is sync, it doesnot allow all threads to act simulatenoulsly. So, performance is low. It is legacy class.	Hashtable is traversed by Enumerator and Iterator.

--------------------------------------------------						----------------------------------------------------------
1) HashMap is NON synchronized. 										Hash table is synchronized. 
2) HashMap allows one NULL key and multiple null values.				Hash table doesn't allow any null key or value.

3) HashMap is a new class introduced in JDK 1.2.						Hash table is a legacy class.
4) HashMap is fast.														Hash table is slow.
	
6) HashMap is traversed by Iterator.									Hash table is traversed by Enumerator and Iterator.
--------------------------------------------------						----------------------------------------------------------

HashMap DOES NOT allow duplicate keys however it allows to have duplicate values. 
HashMap permits SINGLE 'null' ''KEY'' and ANY number of null ''values''.
HashSet permits to have a SINGLE 'null' value. 

how to check if an element is present.?
	driver.findElements( By.id("...") ).size() != 0
	!driver.findElements(By.id("...")).isEmpty(); 

how to clear text.?
driver.findElement(By.Xpath("")).clear()
driver.findElement(By.Xpath("")).sendKeys(Keys.CONTROL + "a")
driver.findElement(By.Xpath("")).sendKeys(Keys.DELETE)

Encapsulation.?
   https://www.tutorialspoint.com/java/java_encapsulation.htm
	 The whole idea behind encapsulation is to hide the implementation details from users.
	 If a data member is private it means it can only be accessed within the same class. 
	 No outside class can access private data member (variable) of other class.

Internal Mechanism of HashMap.? does it allow duplicates.? Null keys, Null values.?

What access modifiers can be user for class.?
------------------------------------------------
	PRIVATE and PROTECTED keywords CANNOT be used for classes and interfaces
	PUBLIC, DEFAULT, final can be used




Generic Methods in java
------------------------------
same name ''Tea'' should be passed as a method argument
public static <Tea> void M1(Tea obj){
}
	
public static void some(){
	M1("can pass string");
	M1(1);//can pass integer
	M1(2.0);// can pass float
}


//TreeSet sorts elements in ASEC order
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(12);
		treeSet.add(10);
		treeSet.add(1);
		treeSet.add(99);
		System.out.println(treeSet);//[1, 10, 12, 99]
		
//TreeMap sorts keys in ASEC order		
		 TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		 treeMap.put(12, 10);
		 treeMap.put(10, 10);
		 treeMap.put(1, 10);
		 treeMap.put(99, 10);
		 System.out.println(treeMap); //{1=10, 10=10, 12=10, 99=10}
		 

		 
*
*
*/



//How to create a singleton design pattern .?
//Create a private static data member
//Create a private constructor
//create a public static method which should return SingleTonDesignPattern class ref
class SingleTonDesignPattern{
	
	private static SingleTonDesignPattern singleTonDesignPattern = new SingleTonDesignPattern();
	
	private SingleTonDesignPattern() {
		//Private cons
	}
	
	public static SingleTonDesignPattern getInstance() {
			return singleTonDesignPattern;
	}
}


class CallingSingleTon{
	public void main(String []args) {
		SingleTonDesignPattern instance = SingleTonDesignPattern.getInstance();
	}
	}
}


//webdriver vs chrome driver
//webdriver can be used for all drivers such as chrome, firefox, ie, safari whereas chrome driver can only be used for chrome driver
//webdriver is an interface, chrome, firefox,ie driver is a class. chrome, ff, ie implements webdriver interface.


/*
3 ways to print exceptions in java
------------------------------------------
e. printStackTrace() --> this will print error name, description & line no 
			java.lang.ArithmeticException: / by zero
				at pack1.Test123.main(Test123.java:16)
	
e.toString() -->  this will print name & description
			java.lang.ArithmeticException: / by zero
			
e.getMessage() --> this will print only description
			/ by zero

*/
 

/*
String str = "Hello World"; o/p  R 1D 1E 1W 1H 1O 2L 3
str=str.replace(" ", "");
HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
for(int i=0; i<str.length(); i++) {
	if(hashMap.containsKey(str.charAt(i))) {
		hashMap.put(str.charAt(i), hashMap.get(str.charAt(i))+1);
	}if(!hashMap.containsKey(str.charAt(i))) {
		hashMap.put(str.charAt(i), 1);
	}
}
 Set<Entry<Character, Integer>> entrySet = hashMap.entrySet();
 ArrayList<Entry<Character, Integer>> arrayList = new ArrayList<>(entrySet);
 Collections.sort(arrayList, new Comparator<Entry<Character, Integer>>() {

	@Override
	public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
		return o2.getValue().compareTo(o1.getValue());
	}
});
 
 arrayList.forEach(s->{
	 System.out.print(s.getKey()+",,,"+s.getValue());
 });
}

*/

/*
Hashmap vs Tree Map
-------------------
	Hash map allows single null key &  multiple null values WHERE AS '''TreeMap''' DOES NOT allows single null key but allows multiple null values
	Hash map does NOT sort keys in asec order whereas TreeMap does
	Both allows only unique keys
** HashMap is faster than TreeMap. Same like arrayList & LinkedList

HashMap class contains only basic functions like get(), put(), KeySet(), etc. .

TreeMap class is rich in functionality, because it contains functions like: tailMap(), firstKey(), lastKey(), pollFirstEntry(), pollLastEntry()
*/


//Sauce labs.?  how to run scripts in vm.?
/*
USERNAME = "chaya-Thilakumara";
ACCESS_KEY = "97763576-4590-45ba-8a36-a41fdde52359";
public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
public static final String URL = "https://chaya:97863576-4590-45ba-8a36-a41fdde52359@ondemand.saucelabs.com:443/wd/hub";

DesiredCapabilities caps = DesiredCapabilities.chrome();
caps.setCapability("platform", "Windows 10");
caps.setCapability("version", "latest");
caps.setCapability("name", "Test1");
caps.setCapability("extendedDebugging", "true");
caps.setCapability("buildNumber", "3.0");

WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);



********************************************************************
*********************************************************************
**********************************************************************
Click on element using X & Y CO-ordinated
---------------------------------------------
WebElement element = driver.findElement(By.linkText("Software Testing Material"));
//Used points class to get x and y coordinates of element.
Point point = element.getLocation();
int xcord = point.getX();
int Ycord = point.getY();		
Actions action = new Actions(driver);
action.moveToElement(element, xcord, ycord).click().build().perform();

Basic Authentication vs Bearer Token

Basic Auth is where we need to provide username & pwd(bases64), it generated base64 ecncoded format. it is very less secure.  It means encoding the username and password using base 64.
Bearer token is in the form of encrypted username & pwd. it works only on ''https''


************************************************************************************
***************************How to generate Auth tokens.?****************************
************************************************************************************

Bearer (oauth2)
---------
POST --> url : https://oauth2/token


Body -> form.urlencoded
	
	grant_type: client_credentials
	client_id: hgfh65456466fhgfg767
	client_secret: ghfhghgf56465465fhg

Above 'client_id' & 'client_secret' need to get it from application/product owner
Response:
--------
AuthToken : oiuiouoiuoiuoiuoiuoiuoihjbhjghjgj8768678687677678ghj
ExpiresOn : 876876


Basic(oauth1)
-----
POST --> url : https://oauth/token
Body -> form.urlencoded
	
	grant_type: client_credentials
Select Authentication type as basic & enter below username & pwd
	username: bharathbk
	password: kumar
	
	
Base64 encoded username & pwd	
Response : "basic 87897097987hgfgghjfgh767="	


SSL Stands for secure sockets layer. Protocol for web browsers and servers that allows for the authentication, encryption and decryption of data sent over the Internet.
SSL '''encrptys''' the data at ''client'' side which is sent over n/w & '''decrypts''' the data at ''server'' side

how to work on hidden elements.? use JavaScriptExecutor to do so
 JavascriptExecutor j = (JavascriptExecutor) driver;
 (JavascriptExecutor) driver.executeScript ("document.getElementById('displayed-text').value='Selenium';");


//		What To Do When There Isn’t Enough Time To Test?
		/*
		 * https://www.softwaretestingclass.com/what-if-there-isnt-enough-time-for-thorough-testing/
			Follow Risk Based/ADHOC/Requirements based testing strategy since we DONT have time
		  * go through all the test cases & identify all the high-priority test cases which covers core business func & put it in one cycle for execution. 
		  * Increase the testing team efficiency, ask team to NOT focus on other project. Need QA persons who works full-time on assigned project
		   			ex: if person executing 4 test cases per day, ask him to execute 6 to 7 cases per day
		  * extend hours, work on weekends if required
		  * 	
		*/

//Different versions of Linux OS are Ubuntu, Linux Mint, RedHat Enterprise Linux, Solaris, etc.
//Different version of Unix are AIS, HP-UX, BSD, Iris, etc.

//Linus => cmd line interface + GUI ############### UNIX --> only cmd line interface

*/