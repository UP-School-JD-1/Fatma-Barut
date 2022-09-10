package java2ch5q1;

public class Employee {
	private String name;
	private int no;
	private String department;
	private int year;
	
	public static final int BASE_PAYMENT= 500; 
	
	 public Employee(String name, int no, String department, int year) {
		 this.name= name;
		 this.no= no;
		 this.department= department;
		 this.year= year;
	 }
	 public void work() {
			System.out.println("Employee is working");
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", no=" + no + ", department=" + department + ", year=" + year + "]";
	}
	
	public double calculateSalary() throws SalaryPaidOnBankException{
		double salary= year * BASE_PAYMENT;
		 if (salary>=7000) {
	            throw new SalaryPaidOnBankException();
		 }else if(salary<7000){
	            System.out.println("Your payment will not be made from the bank.");
	        }
		return salary;
	}
	 
	 

}
