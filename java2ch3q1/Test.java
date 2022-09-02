package java2ch3q1;

public class Test {

	public static void main(String[] args) {
		
   RegistrationOffice registrationOffice=new RegistrationOffice();
  
    Student student = registrationOffice.getAStudent();
     registrationOffice.registerStudent(student);
     System.out.println(student);

		
	}
		
	}