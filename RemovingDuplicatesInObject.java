package sample.sample;

import java.util.ArrayList;


public class RemovingDuplicatesInObject {

	public static void main(String[] args) {
		ArrayList<EmployeeR> arrayList = new ArrayList<EmployeeR>();
		arrayList.add(new EmployeeR(1, "bharath"));
		arrayList.add(new EmployeeR(2, "bharath"));
		arrayList.add(new EmployeeR(3, "kumar"));
		arrayList.add(new EmployeeR(4, "Roman"));
		
		arrayList.stream().distinct().forEach(System.out::print);//This removes the duplicates. O/P :  bharath  kumar  Roman
		
		for (EmployeeR employeeR : arrayList) {
			System.out.println("name : "+employeeR.ename+" "+employeeR.ename.hashCode());
			
/*			name : bharath -148446146
			name : kumar 102410164
			name : kumar 102410164*/
		}
	}
}


class EmployeeR{
	int eid;
	String ename;
	EmployeeR(int eid, String ename){
		this.eid=eid;this.ename=ename;
	}
	public String toString(){
		return " "+this.ename+" ";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
//		result = prime * result + ((eid == null) ? 0 : ename.hashCode());
		result = prime * result + (ename==null?0:ename.hashCode());
		return result;
	}
	
	//It creates a new Object when the below method return false. Hashcode Gets created when you create new Object
	@Override
	public boolean equals(Object obj){
		if(obj instanceof EmployeeR){
			EmployeeR em=(EmployeeR) obj;
			if(em.ename.equals(this.ename)){
				return true;
			}
		}
		return false;
	}
	
}
