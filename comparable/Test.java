package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Student> list_student = new ArrayList<Student>();

		list_student.add(new Student(123, " fatma ", 1995, new Date(), " teacher "));
		list_student.add(new Student(124, " suleyman ", 1998, new Date(), "engineer"));
		list_student.add(new Student(125, " caglar ", 1997, new Date(), " medicine "));
		list_student.add(new Student(126, " salih ", 1991, new Date(), " chemistry "));

		Collections.sort(list_student);

		for (Student s : list_student) {
			System.out.println(s);
		}

	}

}
