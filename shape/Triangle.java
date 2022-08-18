package shape;
import java.util.Objects;

public class Triangle extends Shape {
	private int side1;
	private int side2;
	private int side3;
	
	public Triangle(int side1, int side2, int side3) {
        super("Triangle");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
	public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }
	
	@Override
	void draw() {
		System.out.println("The triangle has been drawn");
	}

	@Override
	void erase() {
		System.out.println("The triangle has been erased");
	}
	
	@Override
	double calculateArea() {
		double U = (side1 + side2 + side3) / 2;
		area = Math.sqrt(U * (U - side1) * (U - side2) * (U - side3));
        return super.calculateArea();
	}

	@Override
    double calculateCircumference() {
        circumference = getSide1() + getSide2() + getSide3();
        return super.calculateCircumference();
    }
	@Override
	public int hashCode() {
		return Objects.hash(side1, side2, side3);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		return side1 == other.side1 && side2 == other.side2 && side3 == other.side3;
	}
	@Override
	public String toString() {
		return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
	}
	

}
