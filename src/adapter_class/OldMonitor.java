package adapter_class;

public class OldMonitor implements Vga {

	@Override
	public void setImage(String image) {
		System.out.println(getClass().getSimpleName() + " displaying image: " + image);
	}

}
