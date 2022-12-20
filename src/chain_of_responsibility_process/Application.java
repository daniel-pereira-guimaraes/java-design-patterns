package chain_of_responsibility_process;

public class Application {

	public static void main(String[] args) {

		System.out.println("Process one...");
		ProcessContext ctx = new ProcessContext();
		ctx.put("name", "Emma");
		ctx.put("email", "emma@gmail.com");
		Object result = GenericService.run(ServicesCatalog.saveUserProcess, ctx);
		System.out.println(result);
				
		System.out.println();
		System.out.println("Process two...");
		ctx.clear();
		ctx.put("name", "Anna");
		ctx.put("email", "anna@gmail.com");
		ctx.put("password", "abc123");
		result = GenericService.run(ServicesCatalog.saveUserProcess, ctx);
		System.out.println(result);
	}

}
