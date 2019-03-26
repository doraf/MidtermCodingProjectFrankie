package pkgShape;

public class Rectangle extends Shape {
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
		
	}
	public double getWidth() {return width;}
	public double getLength() {return length;}
	
	public void setWidth(double newWidth) {
		this.width = newWidth;
		
	}
	public void setLength(double newLength) {
		this.length = newLength;
		
	}
	@Override
	public double area() {
		return length * width;
		
	}
	@Override
	public double perimeter() {
		return 2 * (width + length);
	}

}

