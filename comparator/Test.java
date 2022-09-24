package comparator;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		RegistrationOffice registrationOffice = new RegistrationOffice();

		List<AbstractStudent> list_student = registrationOffice.getAllStudent();

		list_student.add(new GraduateStudent(5434, "zerrin", 2014, new Date(), "Programming","yeliz", "Java"));

		Collections.sort(list_student, new StudentComparator());

		for (AbstractStudent s : list_student) {
			System.out.println(s);
		}

	}

}
