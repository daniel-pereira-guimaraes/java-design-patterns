package simple_factory;

public class Client {

	public static void main(String[] args) {
		
		Shape shape1 = ShapeFactory.createShape();
		Shape shape2 = ShapeFactory.createShape();
		Shape shape3 = ShapeFactory.createShape();
		Shape shape4 = ShapeFactory.createShape();
		Shape shape5 = ShapeFactory.createShape();
		
		System.out.println(shape1);
		System.out.println(shape2);
		System.out.println(shape3);
		System.out.println(shape4);
		System.out.println(shape5);
	}

}
