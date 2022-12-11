package simple.factory;

public class ShapeFactory {

	public static Shape createShape() {

		final int selector = (int) (Math.random() * 10) % 3;

		switch (selector) {
		case 0:
			return new Square(Math.random() * 10);
		case 1:
			return new Circle(Math.random() * 10);
		default:
			return new Triangle(Math.random() * 10, Math.random() * 10);
		}
	}

}
