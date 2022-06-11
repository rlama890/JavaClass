package day26.abstractdemo;

public class ShapeTest {

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.draw();
		
		Rectangle rec = new Rectangle();
		rec.draw();
		
		Triangle triangle = new Triangle();
		triangle.draw();
	}

}
