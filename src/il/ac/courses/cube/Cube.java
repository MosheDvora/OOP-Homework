package il.ac.courses.cube;

public class Cube {
	private double length=10;

	public Cube(double length) {
		this.length = length;
	}

	public Cube() {
		this(10);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	// Volume Calc
	public double getVolume(){			
		return  Math.pow(length,3);
	}
	

}
