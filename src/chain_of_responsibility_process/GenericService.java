package chain_of_responsibility_process;

public class GenericService {
	
	public static Object run(ProcessStep startProcess, ProcessContext initialContext) {
		try {
			ProcessContext context = startProcess.execute(initialContext);
			return context.getResult();
		} catch(Exception e) {
			return "Error: " + e.getMessage();
		}
	}

}
