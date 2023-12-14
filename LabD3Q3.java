// Lab D3 ques_no. 3

/*
3. Create a program to calculate the annual salary of an employee by using inheritance. Create a class named "User" with the following properties and methods: 
Properties: id(int): representing the id of the User name(String):representing the name of the User 
Constructor: Declare parameterized constructor to initialize id and name. Create a subclass named "Employee" that inherits from the "User" class. 
Add the following additional properties and methods: 
Properties: salary(double):representing the monthly salary of the employee 
Method: double calculateAnnualSalary():to calculate the annual salary earned by the employee. In the main method, create an object of "Employee" class. 
Calculate the annual salary of the employee and display it..		 [Hint:Use constructor or setter methods to set the value]
Sample Input: Id:1 name: john salary: 20000
*/



class User  { 
	private int id;		//prop.
	private String name;


	public User(int id, String name) {		//constructor
		this.id = id;
		this.name = name; 
		}

		//getter methd
		public int getId() {
		return id;
		}

		public String getName() {
		return name;
		}
	}

		class Employee extends User {
			private double salary;	//additinal prop

			public Employee(int id, String name, double salary) {	//additinal constructor
			super(id, name);
			this.salary = salary;
			}

		public double calculateAnnualSalary(){ //methd : cal annual salary
		return salary * 12;
		}
	}

		public class LabD3Q3Main {
			public static void main(String[] args) {
				Employee employee = new Employee(1, " John ", 20000);

				double annualSalary = employee.calculateAnnualSalary();
				System.out.println(" Employee ID :   " + employee.getId());
				System.out.println("Employee Name : " + employee.getName());
				System.out.println("Annaul Salary : " + annualSalary);
		}
	}

