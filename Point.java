package point;

public class Point {

	double x;
	double y;
	
	public Point(double x, double y) {
		this.x= x;
		this.y= y;
		
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x=x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y=y;
	}
    
	public double distanceFromOrigin() {
		return Math.sqrt((x * x) + (y * y) );
	}
	
	double distancebetweenpoints;
	public double distanceBetweenPoints(
			double x1,
			double y1) {
			return distancebetweenpoints= Math.sqrt((y1 - y) * (y1 - y) + (x1 - x) * (x1 - x ));
	}
	public Point clone() {
		Point point = new Point(x, y);
		return point;
	}
	
	public void move (char direction, int number) {
		if (direction == 'x')
			this.x += number;
		else if (direction == 'y')
			this.y += number;
	}
	
	
	

			
}
