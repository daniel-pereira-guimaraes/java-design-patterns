package adapter_class;

public class AdaptedOldMonitor extends OldMonitor implements Hdmi {
	
	@Override
	public void setImage(String image) {
		System.out.println(getClass().getSimpleName() + " relaying image to " + getClass().getSuperclass().getSimpleName());
		super.setImage(image);
	}

	@Override
	public void setSound(String sound) {
		System.out.println(getClass().getSimpleName() + ": The device does not support sound!");
	}

}
