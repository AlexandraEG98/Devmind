package surprise;

import java.util.ArrayList;
import java.util.Arrays;

public class MinionToy implements ISurprise{

	String name;
	static ArrayList<String> minions = new ArrayList<String>(Arrays.asList("Dave","Carl", "Kevin", "Stuart", "Jerry", "Tim"));
	static int cnt = 0;
	
	private MinionToy (int cnt) {
		this.name = minions.get(cnt);
	}
	
	public static MinionToy generateMinionToy() {
		MinionToy minionToy = new MinionToy(cnt);
		cnt++;
		if(cnt == minions.size()) {
			cnt = 0;
		}
		return minionToy;
	}
	public String getName() {
		return this.name;
	}
	
	@Override
	public void enjoy() {
		System.out.println("Minion Toy! Ai primit un minion: " + getName() );
	}
}
