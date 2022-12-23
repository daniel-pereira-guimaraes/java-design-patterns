package strategy1_calculator;

public class Application {

	public static void main(String[] args) {
	
		Calculator calculator = new Calculator(10, 2);
		
		System.out.println(calculator.getResult(new AdditionStrategy()));
		System.out.println(calculator.getResult(new SubtractionStrategy()));
		System.out.println(calculator.getResult(new MultiplicationStrategy()));
		System.out.println(calculator.getResult(new DivisionStrategy()));
		System.out.println(calculator.getResult((m, n) -> Math.pow(m, n)));

	}
}
