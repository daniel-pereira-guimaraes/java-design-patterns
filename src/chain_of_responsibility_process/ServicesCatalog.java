package chain_of_responsibility_process;

public class ServicesCatalog {

	private static ProcessStep buildChain(ProcessStep... steps) {
		for (int i = 0; i < steps.length - 1; i++) {
			steps[i].setNextStep(steps[i + 1]);
		}
		return steps[0];
	}
	
	public static ProcessStep saveUserProcess = buildChain(
			new ValidateRequiredField("name"),
			new ValidateRequiredField("email"),
			new ValidateRequiredField("password"),
			new SaveUser());
	
}
