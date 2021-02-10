package codeTest;
class Employee {
	private String firstName;
	private String lastName;

	public void setName(String fName) {
		try
		{ 
			if(fName.length() < 3) {
				System.out.print("Name should be minimum 3 character"); 
			}
			else {
				firstName = fName;
			}

		} 
		catch(NullPointerException e) 
		{ 
			System.out.print("Entry Missing"); 
		} 
	}

	public void setLastName( String LName) {
		try
		{ 
			if(LName.length() < 3) {
				System.out.print("Name should be minimum 3 character"); 
			}
			else {
				lastName = LName;
			}
		} 
		catch(NullPointerException e) 
		{ 
			System.out.print("Entry Missing"); 
		}		
	}
}

public class RunEmployee {

	public static void main(String args[]) {
		RunEmployee emp = new RunEmployee();
		emp.setName("Avinash");
		emp.setLastName("Karle");
	}
}