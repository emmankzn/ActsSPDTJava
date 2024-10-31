package arrayofobject;

public class Main {
	
	public static void main(String[] args) {
		
		Employee employees[] = new Employee[6];
		
		employees[0] = new Employee("Emmanuel","Espena","Boss");
		employees[1] = new Employee("Cedric","Nano","CEO");
		employees[2] = new Employee("Christian","Dacillo","Manager");
		employees[3] = new Employee("Mark Joseph","Ante","Manager");
		employees[4] = new Employee("Charles","Alamares","Boss");
		employees[5] = new Employee("James Mickel","Ricarte","Boss");
		
		
		
		
		
		
		for(int i = 0; i < employees.length; i++) {
			
			employees[i].introduceSelf();		
			
		}
		
		for(Employee emp: employees) {
			
			emp.introduceSelf();
			
		}
	
		
	} // Main Method'
}// Main Class