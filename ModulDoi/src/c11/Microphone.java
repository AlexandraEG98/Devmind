package c11;

public class Microphone {
	private int maxVolume;
	private double crtVolume;
	
	public Microphone(int maxVolume) {
		this.crtVolume = 0.25 * maxVolume;
	}
	public Microphone(int maxVolume, double crtVolume) {
		this.maxVolume = maxVolume;
		this.crtVolume = crtVolume;
	}
	public boolean increaseVolume() {
		if(this.crtVolume < this.maxVolume) {
			this.crtVolume = this.crtVolume + 1;
		}else {
			return false;
		}
		return true;
	}
	public boolean decreaseVolume() {
		if(this.crtVolume > 0) {
			this.crtVolume = this.crtVolume - 1;
		}else {
			return false;
		}
		return true;
	}
	public void muteMicrophone() {
		this.crtVolume = 0;
		System.out.println("Modul mute");
	}
}
