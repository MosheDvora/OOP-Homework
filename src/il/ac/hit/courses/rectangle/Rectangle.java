package il.ac.hit.courses.rectangle;

public class Rectangle {
	private double length,width;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Rectangle rec1 = new Rectangle(10);
		System.out.println("Area of Rectangle is:"+rec1.area());
		Rectangle rec2 = new Rectangle(10,20);
		System.out.println("Area of Rectangle is:"+rec2.area());
	
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public Rectangle(double length) {
		this(length,length);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	
	public double area() {
		return length*width;
		
	}
	
	
		
}
