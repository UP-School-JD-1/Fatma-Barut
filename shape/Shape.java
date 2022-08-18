package shape;

public class Shape {

	String name;
	double circumference;
	double area;
	
	public Shape(String name) {
		this.name= name;
		
	}
	
	void draw() {
		System.out.println("The shape has been drawn");
	
	}
	
	void erase() {
		System.out.println("The shape has been erased");
	}
	
	double calculateArea() {
		System.out.println("The area =" + area);
		return area;
	}
	
	double calculateCircumference() {
		System.out.println("The circumfrence =" + circumference);
		return circumference;
	}

}
