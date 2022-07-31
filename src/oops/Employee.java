package oops;

public class Employee {

	public String name;
	public int EmpId;
	public String Department;
	
	public Employee() {
		System.out.println("Default Cons");
	}
	public Employee(String P1, int P2, String P3) {
		name = P1;
		EmpId = P2;
		Department = P3;
	}

public void display() {
	System.out.println(name);
	System.out.println(EmpId);
	System.out.println(Department);
}


}
