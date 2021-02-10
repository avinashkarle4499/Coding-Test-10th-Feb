package codingTestday12;

public class Employee {

	String firstName;
	String lastName;
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastname=" + lastName + "]";
	}
	String fName ;
	String lName ;	
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public static void main(String[] args) {


		Employee emp1 = new Employee ("Avinash","Karle");
		Employee emp2 = new Employee ("Sachin","Patil");
		Employee emp3 = new Employee ("Mahesh","Veer");


		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);


	}

}
