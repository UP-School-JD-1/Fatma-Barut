package shape;
import java.util.Objects;

public class Square extends Shape {
	private int side;
	public Square(int side) {
        super("Square");
        this.side = side;
    }
	public int getSide() {
		return side;
	}

	@Override 
	void draw() {
		System.out.println("The square has been drawn");
	}
	
	@Override
	void erase() {
		System.out.println("The square has been erased");
	}
	
	@Override
	double calculateArea() {
		area = Math.pow(getSide(), 2);
        return super.calculateArea();
	}
	
	@Override
	double calculateCircumference() {
		circumference = 4 * (getSide());
				return super.calculateCircumference();
	}
	@Override
	public int hashCode() {
		return Objects.hash(side);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Square other = (Square) obj;
		return side == other.side;
	}
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	

	

}
