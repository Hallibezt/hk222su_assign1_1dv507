package hk222su_assign_1;

import java.text.DecimalFormat;

public class Square extends Rectangle {
	
	public Square() {}
	public Square(String shapeName, int height) {
			super.name=shapeName;
			super.height=height;
	}
	
	public void setName (String shapeName) {		
		super.setName(shapeName);
	}
	public String getName () {			
		return super.name;		
	}
	
	public void setHeight (int height) {		
		super.setHeight(height);
	}
	
	
	public int getHeight () {			
		return super.height;		
	}	
	
	@Override
	public double getArea() {
		double area = super.height*super.height;
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = super.height*4;
		return perimeter;
	}
	
	@Override 
	public String toString() {
		if(super.height <=0)
			throw new IndexOutOfBoundsException();
		DecimalFormat f = new DecimalFormat("##.00");
		String a = f.format( getArea() );
		String p = f.format( getPerimeter() );
		return name+", Area = "+a+", Perimeter = "+p;}

}
