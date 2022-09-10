package java2ch5q1;

public static void main(String[] args) {
	Employee e1 = new Employee("Fatma", 168,"Engineer", 5);
	e1.printInfo();
	try {
		System.out.println("The payment" + e1.calculateSalary());
	} catch (SalaryPaidOnBankException e) {
		e.getMessage();
		processSalaryPaidOnBankException(e);
	}
	e1.work();

	System.out.println();
	
	Manager m1 = new Manager("Yeliz", 150, "Production", 7, "Production");
	m1.printInfo();
	try {
		System.out.println("The payment" + m1.calculateSalary());
	} catch (SalaryPaidOnBankException e) {
		e.getMessage();
		processSalaryPaidOnBankException(e);
	}
	m1.work();

	System.out.println();
}

private static void processSalaryPaidOnBankException(SalaryPaidOnBankException ex) {
	System.err.println(ex.getMessage());
}
}