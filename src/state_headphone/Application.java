package state_headphone;

public class Application {

	public static void main(String[] args) {
		
		HeadPhone headPhone = new HeadPhone(HeadPhoneOffState.getInstance());
		
		headPhone.onClick();
		headPhone.onLongClick();
		headPhone.onClick();
		headPhone.onClick();
		headPhone.onClick();
		headPhone.onLongClick();
		headPhone.onClick();
		headPhone.onLongClick();
		headPhone.onClick();
		headPhone.onClick();
		headPhone.onLongClick();
	}

}
