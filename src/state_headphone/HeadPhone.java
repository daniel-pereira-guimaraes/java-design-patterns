package state_headphone;

public class HeadPhone {

	private boolean isOn = false;
	private boolean isPlaying = false;
	private HeadPhoneState state;
	
	public HeadPhone(HeadPhoneState state) {
		this.state = state;
	}
	
	public boolean isOn() {
		return isOn;
	}
	
	public boolean isPlaying() {
		return isPlaying;
	}
	
	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
	
	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}
	
	public void onClick() {
		state.click(this);
	}
	
	public void onLongClick() {
		state.longClick(this);
	}

	public void setState(HeadPhoneState state) {
		this.state = state;
	}
	
}
