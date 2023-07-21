
public class CT_Module1 {
	public static void main(String[] args) {
		
		//Create new Employee object named Bob
		Employee Bob = new Employee();
		
		//assign employee Bob first and last name, ID, and salary
		Bob.setFirstName("Bob");
		Bob.setLastName("Smith");
		Bob.setID(12345);
		Bob.setSalary(15.5);
		
		//print out summary of employee bob
		Bob.employeeSummary();
		//print blank line
		System.out.println();

		//Create manager object named Joe
		Manager Joe = new Manager();
		
		//assign Joe first and last name, ID, salary, and Department
		Joe.setFirstName("Joe");
		Joe.setLastName("Moe");
		Joe.setID(123456);
		Joe.setSalary(20.5);
		Joe.setDepartment("Warehouse");
		
		//print summary of information about joe
		Joe.employeeSummary();
		

	}

}
