package c11;

public class Speaker {

	private int maxVolume;
	private double crtVolume;
	
	public Speaker(int maxVolume) {
		this.crtVolume = 0.25 * maxVolume;
	}
	public Speaker(int maxVolume, double crtVolume) {
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
	public void setSilenceMode() {
		this.crtVolume = 0;
		System.out.println("Modul mute");
	}
}
