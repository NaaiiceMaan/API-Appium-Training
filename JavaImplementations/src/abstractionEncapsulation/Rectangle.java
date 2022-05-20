package abstractionEncapsulation;

public class Rectangle extends Shape {
	double width;
	double height;
	
	public Rectangle() {
		
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void draw() {
		setHeight(10);
		setWidth(20);
		setColor("Green");
		double area = getHeight() * getWidth();
		System.out.println("Rectangle filled with "+getColor()+" and Area = "+area);
	}
	
	

}
