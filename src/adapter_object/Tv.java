package adapter_object;

public class Tv implements Hdmi {

	@Override
	public void setImage(String image) {
		System.out.println(getClass().getSimpleName() + " displaying image: " + image);
	}

	@Override
	public void setSound(String sound) {
		System.out.println(getClass().getSimpleName() + " playing sound: " + sound);
	}

}
