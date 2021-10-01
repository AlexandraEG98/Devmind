package surprise;

import java.util.Random;

public final class GatherSurprises {

	static Random random = new Random();
	static ISurprise[] tolba ;
	static boolean singleton = false;
	private GatherSurprises(int numberRandom) {
		tolba = new ISurprise[numberRandom]; 
	}
	public static ISurprise [] gather(int n) {
		if(singleton == true) {
			return tolba;
		}
		if(singleton == false) {
			new GatherSurprises(n);
		}
		if(singleton == false) {
		for(int i = 0; i < n; i++ ) {
			int numberRandom = random.nextInt(3);
			if(numberRandom == 0) {
				tolba[i] = Candies.generateCandies();
			}else if(numberRandom == 1) {
				tolba[i] = FortuneCookie.generateFortueCookie();
			} else {
				tolba[i] = MinionToy.generateMinionToy();
			}
		}
		}
		singleton = true;
		return tolba;
	}
		
	
	public static ISurprise gather() {
		int numberRandom = random.nextInt(3);
		if(numberRandom == 0) {
			return Candies.generateCandies();
		}else if(numberRandom == 1) {
			return FortuneCookie.generateFortueCookie();
		} else {
			return MinionToy.generateMinionToy();
		}
	}
}
