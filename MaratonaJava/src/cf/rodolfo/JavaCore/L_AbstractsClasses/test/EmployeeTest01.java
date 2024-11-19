package cf.rodolfo.JavaCore.L_AbstractsClasses.test;

import cf.rodolfo.JavaCore.L_AbstractsClasses.domain.Developer;
import cf.rodolfo.JavaCore.L_AbstractsClasses.domain.Manager;

public class EmployeeTest01 {
	public static void main(String[] args) {
		Manager manager = new Manager("Athur", 4500);
		Developer developer = new Developer("Perkins", 2000);
		System.out.println(manager);
		System.out.println(developer);
		manager.print();
		developer.print();

	}
}
