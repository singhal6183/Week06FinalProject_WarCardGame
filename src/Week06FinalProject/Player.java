package Week06FinalProject;
import java.util.*;
/*
1. Create Player class
2. Create Fields
	a)	 hand (List of Card)
	b)	 score (set to 0 in the constructor)
	c)	 name
3.	Methods
	a)	describe (prints out information about the player and calls the describe method for each card in the Hand List)
	b)	flip (removes and returns the top card of the Hand)
	c)	draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
	d)	incrementScore (adds 1 to the Player’s score field)

*/

public class Player {
	
	// Fields
		String name;
		int score;
		List<Card> hand = new ArrayList<Card>();
		
		// Constructor
		public Player() {
		}
			
		public Player(String name, List<Card> hand, int score) {
			this.name = name;
			this.hand = hand;
			this.score = 0;
		}

		// prints out information about the cards
		// that the player has in their hand
		/*public void describe() {
			System.out.println("\nPlayer: " + name + " has these cards in their hand:");
			for (Card card : this.hand) {
				card.describe();
			}
		}*/
		
		
		public void draw(Deck deck)
		{
			hand.add(deck.draw());
		}
		
		public Card flipCard() 
		{
			return hand.remove(0);
		}
		
		public void incrementScore()
		{
			score++;
		}
		
		
		
		public String getName()
		{
			return name;
		}

		public void setName(String name)
		{
			this.name = name;
		}

		public int getScore()
		{
			return score;
		}

		public void setScore(int score)
		{
			this.score = score;
		}

		public List<Card> getHand() 
		{
			return hand;
		}

		public void setHand(List<Card> hand)
		{
			this.hand = hand;
		}

}
