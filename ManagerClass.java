class Manager extends Employee {
		
		//create protected string field called department
		protected String department;
		
		//create getter and setter for department
		public void setDepartment(String newDepartment) {
			department = newDepartment;
		}
		public String getDepartment() {
			return department;
		}
		
		//print summary of manager object
		public void employeeSummary() {
			//prints the values of Manager inherited from employee class
			super.employeeSummary();
			//print manager specific fields
			System.out.print("Manager department: " + department);
		}
	}