package shape;

import java.util.Objects;

public class Rectangle extends Shape {
	private int witdh;
	private int length;
	
	public Rectangle(int witdh, int length) {
		super("Rectangle");
		this.witdh= witdh;
		this.length= length;
		
	}
	public int getWitdh() {
		return witdh;
	}
	public int getLength() {
		return length;
	}
	
	@Override 
	void draw() {
		System.out.println("The rectangle has been drawn");
	}
	
	@Override 
	void erase(){
		System.out.println("The rectangle has been erased");
	}
	
	@Override
	double calculateArea() {
		area = getWitdh() * getLength();
		return super.calculateArea();
	}
	
	@Override
	double calculateCircumference() {
		circumference = 2 * (getWitdh() + getLength());
				return super.calculateCircumference();
	}
	@Override
	public int hashCode() {
		return Objects.hash(length, witdh);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		return length == other.length && witdh == other.witdh;
	}
	@Override
	public String toString() {
		return "Rectangle [witdh=" + witdh + ", length=" + length + "]";
	}
	


	

}
