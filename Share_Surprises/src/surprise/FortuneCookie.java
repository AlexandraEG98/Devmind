package surprise;

import java.util.ArrayList;
import java.util.Random;

public class FortuneCookie implements ISurprise{
	
	String message;
	ArrayList<String> messages;
	static Random random = new Random();
	
	private FortuneCookie(int numberMessage) {
		messages = new ArrayList<String>();
		
		messages.add("If you see someone without a smile, give them one of yours. - Dolly Parton");
		messages.add("Every child is born a genius. - Buckminster Fuller");
		messages.add("Adults are just outdated children. - Dr. Seuss");
		messages.add("Hugs can do great amounts of good, especially for children. - Diana, Princess of Wales");
		messages.add("Children make your life important. - Erma Bombeck");
		messages.add("The best way to make children good is to make them happy. - Oscar Wilde");
		messages.add("The soul is healed by being with children. - Fyodor Dostoevsky");
		messages.add("We must teach our children to dream with their eyes open. - Harry Edwards");
		messages.add("Children must be taught how to think, not what to think. - Margaret Mead");
		messages.add("A child is a curly, dimpled lunatic. - Ralph Waldo Emerson ");
		messages.add("Children are the living messages we send to a time we will not see. - John F. Kennedy");
		messages.add("Children see magic because they look for it. - Christopher Moore");
		messages.add("Don't handicap your children by making their lives easy. - Robert A. Heinlein");
		messages.add("Children aren't coloring books. You don't get to fill them with your favorite colors. - Khaled Hosseini");
		messages.add("Children find everything in nothing; men find nothing in everything. - Giacomo Leopardi");
		messages.add("Children are the hands by which we take hold of heaven. - Henry Ward Beecher");
		messages.add("Children are likely to live up to what you believe of them. - Lady Bird Johnson");
		messages.add("It is easier to build strong children than to repair broken men. - Frederick Douglass");
		messages.add("Always kiss your children goodnight, even if they're already asleep. - H. Jackson Brown, Jr.");
		messages.add("Let us remember: One book, one pen, one child and one teacher can change the world. - Malala Yousafzai");
		this.message = messages.get(numberMessage);
	
	}
	public static FortuneCookie generateFortueCookie() {
		
		int numberMessage = random.nextInt(19);
		FortuneCookie cookie = new FortuneCookie(numberMessage);
		
		return cookie;
	}
	public String getMessage() {
		return this.message;
	}
	@Override
	public void enjoy() {
		System.out.println("Fortune Cookie! Mesajul primit este: " + getMessage());
	}
			
	}

