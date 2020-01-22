package hk222su_assign_1;

import java.text.DecimalFormat;

public class Rectangle extends Shape{
	protected int height; //use this as a data field for subclass of square
	private int width;
	
	public Rectangle() {}
	
	public Rectangle(String shapeName, int height, int width) {
		super(shapeName);
		setHeight(height);
		setWidth(width);		
	}
	public void setName (String shapeName) {		
		super.name=shapeName;
	}
	public String getName () {			
		return super.name;		
	}
	
	public void setHeight (int height) {		
		this.height=height;
	}
	
	public void setWidth (int width) {		
		this.width=width;
	}
	
	
	public int getHeight () {			
		return height;		
	}
	
	public int getWidth () {			
		return width;		
	}
	
	@Override
	public double getArea() {
		double area = this.height*this.width;
		return area;
	}
	@Override
	public double getPerimeter() {
		double perimeter = ((this.height*2)+(this.width*2));
		return perimeter;
	}
	
	@Override 
	public String toString() {
		if(height<=0||width <=0)
			throw new IndexOutOfBoundsException();
		DecimalFormat f = new DecimalFormat("##.00");
		String a = f.format( getArea() );
		String p = f.format( getPerimeter() );
		return name+", Area = "+a+", Perimeter = "+p;}

}
