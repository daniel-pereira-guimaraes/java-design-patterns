package chain_of_responsibility_process;

import java.util.HashMap;
import java.util.Map;

public class ProcessContext {
	
	private final Map<Object, Object> context = new HashMap<>();
	private Object result;
	
	public void put(Object key, Object value) {
		context.put(key, value);
	}
	
	public Object get(Object key) {
		return context.get(key);
	}
	
	public void clear() {
		context.clear();
		result = null;
	}

	public Object getResult() {
		return result;
	}
	
	public void setResult(Object result) {
		this.result = result;
	}

}
