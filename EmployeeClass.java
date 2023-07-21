class Employee {
		
		//protected fields to specify employees
		protected String firstName;
		protected String lastName;
		protected int employeeID;
		protected double salary;
	
		//constructor that initializes salary to zero
		public Employee() {
			salary = 0;
		}
		
		//getter and setter for firstName
		public void setFirstName(String name) {
			firstName = name;
		}
		public String getFirstName() {
			return firstName;
		}
		
		//getter and setter for lastName
		public void setLastName(String name) {
			lastName = name;
		}
		public String getLastName() {
			return lastName;
		}
		
		//getter and setter for ID
		public void setID(int num) {
			employeeID = num;
		}
		public int getID() {
			return employeeID;
		}
		
		//getter and setter for salary
		public void setSalary(double newSalary) {
			salary = newSalary;
		}
		public double getSalary() {
			return salary;
		}
		//prints fields of employee class
		public void employeeSummary() {
			System.out.println("First name: " + firstName);
			System.out.println("Last name: " + lastName);
			System.out.println("Employee ID: " + employeeID);
			System.out.println("salary: $" + salary + "/hr");
		}
	}
	
