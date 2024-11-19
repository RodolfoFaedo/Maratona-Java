package cf.rodolfo.JavaCore.G_Association.test;

import cf.rodolfo.JavaCore.G_Association.domain.Local;
import cf.rodolfo.JavaCore.G_Association.domain.Seminary;
import cf.rodolfo.JavaCore.G_Association.domain.Student;
import cf.rodolfo.JavaCore.G_Association.domain.Teacher;

public class AssociationTest01 {
	public static void main(String[] args) {
		Local local = new Local("Howgwarts");
		Student student = new Student("Rony", 13);
		Teacher teacher = new Teacher("Remo Lupin", "Defense Against The Dark Arts");
		Student[] seminaryStudents = { student };
		Seminary seminary = new Seminary("Werewolf", seminaryStudents, local);
		Seminary[] seminarsAvailables = {seminary};
		teacher.setSeminars(seminarsAvailables);
		teacher.printReport();
	}
}
