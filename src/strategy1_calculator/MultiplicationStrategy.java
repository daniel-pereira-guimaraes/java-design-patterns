package strategy1_calculator;

public class MultiplicationStrategy implements OperationStrategy {

	@Override
	public double calculate(double a, double b) {
		return a * b;
	}

}
