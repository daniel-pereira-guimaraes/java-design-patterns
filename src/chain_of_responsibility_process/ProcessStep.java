package chain_of_responsibility_process;

public abstract class ProcessStep {

	protected ProcessStep nextStep;
	protected Object[] args;
	
	public ProcessStep(Object... args) {
		this.args = args;
	}

	public ProcessStep getNextStep() {
		return nextStep;
	}
	
	public void setNextStep(ProcessStep nextStep) {
		this.nextStep = nextStep;
	}
	
	protected ProcessContext next(ProcessContext context, Object actualResult) throws Exception {
		context.setResult(actualResult);
		return nextStep != null ? nextStep.execute(context) : context;  
	}
	
	public abstract ProcessContext execute(ProcessContext context) throws Exception;
	
}
