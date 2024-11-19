package cf.rodolfo.JavaCore.O_Exception.execption.test;


import java.io.FileNotFoundException;

import cf.rodolfo.JavaCore.O_Exception.execption.domain.Employee;
import cf.rodolfo.JavaCore.O_Exception.execption.domain.InvalidLoginException;
import cf.rodolfo.JavaCore.O_Exception.execption.domain.Person;

public class OverrideWithExceptionTest01 {
	public static void main(String[] args) {
		Person person = new Person();
		Employee employee = new Employee();
		
		employee.save();
		try {
			person.save();
		} catch (FileNotFoundException | InvalidLoginException e) {
			e.printStackTrace();
		}
	}

}
