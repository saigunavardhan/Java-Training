package OOps;

public class Relavant {
	public static void main(String[] args) {
		abstractionDemo pt1 = new abstractionDemo();
		pt1.x = 1;
		pt1.y = 2;
		
		abstractionDemo pt2 = new abstractionDemo();
		pt2.x = 3;
		pt2.y = 4;
		
		double distance = pt1.distance(pt2);
		
		System.out.println("Point 1 = ("+ pt1.x +","+pt1.y+") and" + "Point 2 = ("+pt2.x+","+pt2.y+")");
		System.out.println("Distance ="+ distance);
		
		
	}

}
