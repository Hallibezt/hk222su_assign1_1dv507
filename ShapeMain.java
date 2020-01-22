package hk222su_assign_1;

import java.util.ArrayList;

public class ShapeMain {
	public static void main(String[] args) {
		//Why can I not access retangle methods when I create object via Shape
		//Want to be able to create empty constructor retangle
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add( new Rectangle("R1",2,-1) );  // base=2, height=3
		shapes.add( new Rectangle("R2",3,4) ); 	
		shapes.add( new Circle("S1",3) );       // side=3
		shapes.add( new Circle("S2",0) );
		shapes.add( new Square("S1",3) );       // side=3
		shapes.add( new Square("S2",-5) );
		
			
		
			for (Shape s :shapes)  // Print all shapes
				try {System.out.println(s);
				}	
			catch (IndexOutOfBoundsException e) {
			System.out.println("Input must be higher than 0");			
			}	    
		
		
	}
}
