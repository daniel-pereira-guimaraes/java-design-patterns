package chain_of_responsibility_process;

public class ValidateRequiredField extends ProcessStep {

	public ValidateRequiredField(Object... args) {
		super(args);
	}

	@Override
	public ProcessContext execute(ProcessContext context ) throws Exception {
		Object fieldName = args[0];
		System.out.println("Validating field " + fieldName);
		Object fieldValue = context.get(fieldName);
		if (fieldValue == null) 
			throw new Exception(String.format("%s is empty.", fieldName));
		return next(context, true);
		
	}
	
}
