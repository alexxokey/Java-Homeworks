import java.util.Random;


public class RandomHandsOf5Cards {
	public static void main(String[] args) {
		Random rand = new Random();
	    int random;

		String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
	    String[] suit = { "♣", "♦", "♥", "♠" };
	    	  
	    for (int i = 0; i < 5; i++) {
			
	    	for (int j = 0; j < 5; j++) {
				random = rand.nextInt(13);
				System.out.print(cards[random]);
				random = rand.nextInt(4);
				System.out.print(suit[random] + " ");
			}
			System.out.println();
		}
	}
}
	
