package java2ch5q1;

public class Manager extends Employee {
	
	private String departmentManaged;

	public static final int MANAGEMENT_PAYMENT = 1000;
	
	public Manager(String name, int no, String department, int year, String departmentManaged) {
	
		super(name, no, department, year);
	
		this.departmentManaged= departmentManaged;
	
	}
	
	public void manage(){
		
		System.out.println("Manager manages department: " + departmentManaged);
	}
	
	@Override
	public double calculateSalary() throws SalaryPaidOnBankException{
		return super.calculateSalary() + MANAGEMENT_PAYMENT;
	}

	@Override
	public String toString() {
		return "Manager [departmentManaged=" + departmentManaged + "]";
	}
	
	

}
