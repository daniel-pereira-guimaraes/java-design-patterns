package adapter_object;

public class HdmiToVgaAdapter implements Hdmi {
	
	Vga vgaDevice;

	public HdmiToVgaAdapter(Vga vgaDevice) {
		this.vgaDevice = vgaDevice;
	}
	
	@Override
	public void setImage(String image) {
		System.out.println(getClass().getSimpleName() + " relaying image to " + vgaDevice.getClass().getSimpleName());
		vgaDevice.setImage(image);
	}

	@Override
	public void setSound(String sound) {
		System.out.println(getClass().getSimpleName() + ": The device does not support sound!");
	}

}
