package adapter_object;

public class Application {
	
	public static void main(String[] args) {
		Tv tv = new Tv();
		
		Computer c1 = new Computer();
		c1.setVideoDevice(tv);
		c1.writeToVideoDevice();

		OldMonitor oldMonitor = new OldMonitor();
		HdmiToVgaAdapter adaptedOldMonitor = new HdmiToVgaAdapter(oldMonitor); 
		
		Computer c2 = new Computer();
		c2.setVideoDevice(adaptedOldMonitor);
		c2.writeToVideoDevice();
		
	}

}
