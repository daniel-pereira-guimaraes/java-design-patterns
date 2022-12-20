package chain_of_responsibility_process;

public class SaveUser extends ProcessStep {
	
	public SaveUser(Object... args) {
		super(args);
	}

	@Override
	public ProcessContext execute(ProcessContext context) throws Exception {
		System.out.println("Saving user...");
		System.out.println("\tname: " + context.get("name"));
		System.out.println("\temail: " + context.get("email"));
		System.out.println("\tpassword: " + context.get("password"));
		return next(context, String.format("User '%s' saved!", context.get("name")));
	}
	
	

}
