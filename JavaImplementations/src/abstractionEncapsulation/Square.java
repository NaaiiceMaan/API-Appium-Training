package abstractionEncapsulation;

public class Square extends Rectangle {
	
	public Square() {
		
	}
	
	public void draw() {
		setHeight(10);
		setWidth(10);
		setColor("Red");
		double area = getHeight()*getWidth();
		System.out.println("Square is filled with "+getColor()+" and area = "+area);
	}

}
