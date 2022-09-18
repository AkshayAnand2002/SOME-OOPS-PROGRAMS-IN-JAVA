/*
Create a class called Employee. Employee has three private data members name, 
department and salary. Initialize these data member via constructor. Display all
 the information for 5 employee of same company. Also display name of their company. 
 Use static member concept to implement this code.
*/
import java.util.Scanner;
class Employee{
	private String name,department;
	private double salary;
	public static String company;
	public Employee(String name,String department,double salary) {
		this.name=name;
		this.department=department;
		this.salary=salary;
		company = "My Company";
	}
	public void displaydata() {
		System.out.printf("NAME: %s\nDEPARTMENT: %s\nSALARY: %.2f\n",name,department,salary);
	}
}
public class EmployeeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp[] = new Employee[5];
		for(int i=0;i<5;i++) {
			System.out.println("ENTER NAME,DEPARTMENT,SALARY FOR EMPLOYEE "+(i+1)+": ");
			String name = sc.nextLine();
			String department = sc.nextLine();
			double salary=sc.nextDouble();
			sc.nextLine();
			emp[i]= new Employee(name,department,salary);
		}
		System.out.println("\nCompany Name: " + Employee.company);
        for (Employee employee : emp) {
            employee.displaydata();
        }
	}

}
