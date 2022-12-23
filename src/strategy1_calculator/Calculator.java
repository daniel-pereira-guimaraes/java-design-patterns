package strategy1_calculator;

public class Calculator {
	
	private double x;
	private double y;
	
	
	public Calculator(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getResult(OperationStrategy strategy) {
		return strategy.calculate(x, y);
	}

}
