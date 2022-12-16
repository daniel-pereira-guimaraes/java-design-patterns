package decorator;

public class Application {

	public static void main(String[] args) {
		Milk milk = new Milk();
		
		Coffee coffee = new Coffee();
		
		HoneyDecorator honeyDecoratorForCoffee = new HoneyDecorator(coffee);
		HoneyDecorator honeyDecoratorForMilk = new HoneyDecorator(milk);
		DoubleDrinkDecorator doubleDrink = new DoubleDrinkDecorator(new ChocolateDecorator(milk));
		
		milk.serve();
		System.out.println("Price: " + milk.getPrice());
		System.out.println();
		
		coffee.serve();
		System.out.println("Price: " + coffee.getPrice());
		System.out.println();
		
		honeyDecoratorForCoffee.serve();
		System.out.println("Price: " + honeyDecoratorForCoffee.getPrice());
		System.out.println();
				
		honeyDecoratorForMilk.serve();
		System.out.println("Price: " + honeyDecoratorForMilk.getPrice());
		System.out.println();
				
		
		doubleDrink.serve();
		System.out.println("Price: " + doubleDrink.getPrice());
		System.out.println();
				
	}
}
