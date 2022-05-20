package abstractionEncapsulation;

public class Circle extends Shape {
	final double pi = 3.14;
	double radius;
	
	public Circle() {
		
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void draw() {
		setRadius(5);
		setColor("blue");
		double area = pi*getRadius()*getRadius();
		System.out.println("Circle is filled with "+getColor()+" and area = "+area);
		
	}
	
	

}
