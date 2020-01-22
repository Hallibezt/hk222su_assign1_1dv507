package hk222su_assign_1;

import java.text.DecimalFormat;

public class Circle extends Shape{
private double radius;
	
	
	public Circle() {}
	public Circle(String shapeName, double radius) {
		super(shapeName);
		setRadius(radius);
				
	}
	public void setName (String shapeName) {		
		super.name=shapeName;
	}
	public String getName () {			
		return super.name;		
	}
	
	public void setRadius (double radius) {		
		this.radius=radius;
	}
	
	
	public double getRadius () {			
		return radius;		
	}	
	
	@Override
	public double getArea() {
		double area = Math.pow(this.radius, 2)* Math.PI;
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = this.radius*2*Math.PI;
		return perimeter;
	}
	
	@Override 
	public String toString() {
		if(radius <=0)
			throw new IndexOutOfBoundsException();
		DecimalFormat f = new DecimalFormat("##.00");
		String a = f.format( getArea() );
		String p = f.format( getPerimeter() );
		return name+", Area = "+a+", Perimeter = "+p;}
}
