package abstractionEncapsulation;

public abstract class Shape {
	String color;
	
	public Shape() {
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	abstract void draw();
}
