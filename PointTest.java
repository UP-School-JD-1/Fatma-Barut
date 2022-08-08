package point;

public class PointTest {

	public static void main(String[] args) {
		Point point1 = new Point (8,7);
		Point point2 = new Point (13,8);
		
		double distaceFromOrigin1= point1.distanceFromOrigin();
		
		System.out.println("Distance of " + point1 + "to origin is" + point1.distanceFromOrigin());
		
		double distanceBetweenPoints1= point1.distanceBetweenPoints(13, 8);
		
		System.out.println("Distance between" + point1 + "and" + point2 + "is" point1.distanceBetweenPoints(13, 8));
        
		point2.move('x', 5);
        
		System.out.print(point2.move('x', 5)); 
		
		System.out.println(point1.clone());
	}

}
