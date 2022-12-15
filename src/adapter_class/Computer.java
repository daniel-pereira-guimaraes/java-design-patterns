package adapter_class;

public class Computer {
	
	private Hdmi videoDevice;

	public void setVideoDevice(Hdmi videoDevice) {
		this.videoDevice = videoDevice;
	}

	public void writeToVideoDevice() {
		System.out.println(getClass().getSimpleName() + " sendind image to " + videoDevice.getClass().getSimpleName());
		videoDevice.setImage("Image from " + getClass().getSimpleName());
		System.out.println();

		System.out.println(getClass().getSimpleName() + " sendind sound to " + videoDevice.getClass().getSimpleName());
		videoDevice.setSound("Sound from " + getClass().getSimpleName());
		System.out.println();
	}
	
}
