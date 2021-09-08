package c11;

	public class Smartphone {
		
		  private Screen theScreen;
		  private Case theCase;
		  private Speaker theSpeaker;
		  private Microphone theMicrophone;
	 

		  public Smartphone(Screen theScreen, Case theCase, 
		                    Speaker theSpeaker, Microphone theMicrophone) {
		    this.theScreen = theScreen;
		    this.theCase = theCase;
		    this.theSpeaker = theSpeaker;
		    this.theMicrophone = theMicrophone;
		  }
		 
		  public Smartphone(int pixelsNo, int width, int length, int depth, int speakerMaxVol, 
		                    int microMaxVol) {
		    this.theScreen = new Screen(pixelsNo, width, length, depth);
		    this.theCase = new Case();
		    this.theSpeaker = new Speaker(speakerMaxVol);
		    this.theMicrophone = new Microphone(microMaxVol);
		  }
		  
		public Smartphone(int pixelsNo, int width, int length, int depth, int speakerMaxVol, 
	             int speakerCrtVol, int microMaxVol, int microCrtVol) {
			  this.theScreen = new Screen(pixelsNo, width, length, depth);
			  this.theCase = new Case();
			  this.theSpeaker = new Speaker(speakerMaxVol, speakerCrtVol);
			  this.theMicrophone = new Microphone(microMaxVol, microCrtVol);
		 }
		
		public void pressPowerButton() {
			System.out.println("class Smartphone: delegate to Case ->");
			this.theCase.pressPowerButton();
		}
			 
		public void pressVolumeUp() {
			System.out.println("class Smartphone: delegate to Case ->");
			this.theCase.pressVolumeUp();
			this.theSpeaker.increaseVolume();
		}
			 
		public void pressVolumeDown() {
			System.out.println("class Smartphone: delegate to Case ->");
			this.theCase.pressVolumeDown();
			this.theSpeaker.increaseVolume();
		} 
			  
		 public void setPixel (int pixel, String colorOfPixel) {
			 this.theScreen.setPixel(pixel, colorOfPixel);
		 }
		 
		 public void colorScreen(String color) {
			 this.theScreen.colorScreen(color);
		 }
		 
		 public void increaseMicrophoneVolume() {
			 this.theMicrophone.increaseVolume();
		 }
		 
		 public void decreaseMicrophoneVolume() {
			 this.theMicrophone.decreaseVolume();
		 }
		 
		 public void muteMicrophone() {
			 this.theMicrophone.muteMicrophone();
		 }
		 
		 public void setSilenceMode() {
			 this.theSpeaker.setSilenceMode();
		 }
	}
