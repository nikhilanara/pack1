package sample.sample;

public class VarArgs {

	public static void main(String[] args) {
		//var args methods accepts values ranging from 0 to n
		StringVarArgumentsType1();
		StringVarArgumentsType1("Bharath");
		StringVarArgumentsType1("Bharath", "Kumar");
		StringVarArgumentsType1(new String[]{"bharath", "kumar"});
		
		
		//Normal Array method accepts Array of value i.e it does not accepts value null/0 values
		//we MUST need to provide values in an array format
		
		StringVarArgumentsType2(new String[]{"bharath", "kumar"});
	}

	
	public static void StringVarArgumentsType1(String... strings) {

	}

	public static void StringVarArgumentsType2(String[] strings) {

	}

}
