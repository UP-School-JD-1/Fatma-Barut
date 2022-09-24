package comparator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegistrationOffice {

	RegistrationOffice() {

	}

	void registerStudent(Student student) {

		if (student instanceof GraduateStudent graduateStudent1) {
			System.out.println("GraduateStudent" + graduateStudent1.toString());
		} else if (student instanceof VocationalStudent vocationalStudent1) {
			System.out.println("VocationalStudent" + vocationalStudent1.toString());
		} else if (student instanceof UndergraduateStudent undergraduateStudent1) {
			System.out.println("UndergraduateStudent" + undergraduateStudent1.toString());
		} else if (student instanceof MasterStudent masterStudent1) {
			System.out.println("MasterStudent" + masterStudent1.toString());
		} else if (student instanceof PhdStudent phdStudent1) {
			System.out.println("PhdStudent" + phdStudent1.toString());
		} else
			student.study();
	}

	Student getAStudent() {
		Student student = null;

		int i = (int) (5 * Math.random());
		int no = new java.util.Random().nextInt(10);

		switch (i) {
		case 0:
			student = new GraduateStudent(no, "fatma", 2016, new Date(), "Math Engineering", "yeliz",
					"Java");
			break;
		case 1:
			student = new VocationalStudent(no, "yeliz", 2016, new Date(), "Math Engineering");
			break;
		case 2:
			student = new UndergraduateStudent(no, "ayse", 2016, new Date(), "Faculty of Medicine", "");
			break;
		case 3:
			student = new MasterStudent(no, "seda", 2015, new Date(), "Faculty of Medicine", "fatma", "Medicine");
			break;
		case 4:
			student = new PhdStudent(no, "can", 2015, new Date(), "nuclear", "fatma", "", true);
			break;
		}
		return student;
	}
	
	

	public List<AbstractStudent> getAllStudent(){
		List<AbstractStudent> list_student = new ArrayList<AbstractStudent>();
		
		list_student.add(new GraduateStudent(189, "fatma", 2014, new Date(), "Math Engineering",
				"Enes", "Java"));
		list_student.add(new VocationalStudent(145, "yeliz", 2014, new Date(), "Math Engineer"));
		list_student.add(new UndergraduateStudent(846, "ayse", 2014, new Date(), "Faculty of Medicine", "doctor"));
		list_student.add(new MasterStudent(654, "seda", 2015, new Date(), "Faculty of Medicine", "fatma", "doctor"));

		list_student.add(new GraduateStudent(2, "murat", 2014, new Date(), "Arch", "Eng.", "Java"));
		return list_student;
		
	}

}


