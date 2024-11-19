package cf.rodolfo.JavaCore.B_Introduction_To_Methods.test;

import cf.rodolfo.JavaCore.B_Introduction_To_Methods.domain.Person;

public class PersonTest01 {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Ginny");
		person.setAge(15);
		person.printPersonInfo();
		
	}
}
