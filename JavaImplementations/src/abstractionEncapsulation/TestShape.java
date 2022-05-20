package abstractionEncapsulation;

public class TestShape {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Square s = new Square();
		Circle c = new Circle();
		
		System.out.println("For Rectangle:");
		r.draw();
		System.out.println("For Circle:");
		c.draw();
		System.out.println("For Square:");
		s.draw();

	}

}
