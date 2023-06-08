/* ---- War Card Game---
 * Create a new Deck of cards
 * Shuffle the Deck to randomized the order of cards
 * Set The players
 * Deal the cards
 * Play the game
 * declare the winner
 */


/*	Create a class called App with a main method.

	a)	Instantiate a Deck and two Players, call the shuffle method on the deck.
	b)	Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
	c)	Using a traditional for loop, iterate 26 times and call the flip method for each player.
	d)	Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.
	e)	After the loop, compare the final score from each player. 
	f)	Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
 */


package Week06FinalProject;


public class App {
		
	
	public static void main(String[] args) {
	
			
	    // Add your code here to instantiate a Deck	
		
		Deck deck = new Deck();
		System.out.println("New Deck has been created!");
		System.out.println("--------------");
	    
	   // Call the describe method on the newly instantiated deck.
	    deck.describe();
	    
	    
	//  Add a shuffle method within the Deck Class to randomizes the order of the cards
		//System.out.println("Shuffle the cards to randomizes the order of the cards");
	    System.out.println("\nShuffled Deck!");
		System.out.println("--------------");
		deck.shuffle();
		
		// Call the describe method on the newly shuffled deck.
		deck.describe();
		
			
		// Add two players
				Player player1 = new Player();
				Player player2 = new Player();
				
		// Set the players names
				player1.setName("Player1");
				player2.setName("Player2");
				
			
		// Deal the cards
	
				for (int i = 0; i < 52; i++)
				{
					if (i % 2 == 0) {
						player1.draw(deck);
						
					} else {
						player2.draw(deck);
					}
				}
				
				
		/* prints out information about the cards that the player 
		    has in their hand
		*/
				System.out.println("\n" + player1.getName() + " has these cards in their hand:" + player1.getHand());
				System.out.println("\n" + player2.getName() + " has these cards in their hand:" + player2.getHand());
				
				
		// Start the round and play the game
				int round = 1;
			
				// Players play the cards and increment the score
				for (int i = 0; i < 26; i++) {
					System.out.println("\n ---- Round " + round + " of 26 ---- ");
					round++;
					Card cardOne = player1.flipCard();
					Card cardTwo = player2.flipCard();
					
				
					System.out.printf(player1.getName() + " plays: ");
					cardOne.describe();
					System.out.printf(player2.getName() + " plays: ");
					cardTwo.describe();
				
					
					
				if (cardOne.getValue() > cardTwo.getValue()) {
					player1.incrementScore();
					System.out.println("\n" + player1.getName() + " Wins this round! ");
				} else if (cardTwo.getValue() > cardOne.getValue()) {
					player2.incrementScore();
					System.out.println("\n" + player2.getName() + " Wins this round! ");
				} else {
					System.out.println("It's a draw! ");
					
				}
				System.out.println("Current Score: [ Player1- " + player1.getScore() + "] [ Player2- " + player2.getScore() +"]");
				}
				int playerOneScore = player1.getScore();
				int playerTwoScore = player2.getScore();
				
				System.out.println("----------------------------------------------------");
				System.out.println("Final Score of Player1: " + playerOneScore);
				System.out.println("Final Score of Player2: " + playerTwoScore);
				
				System.out.println("----------------------------------------------------");
				System.out.println("    **GAME RESULTS**    ");
				
				if (playerOneScore > playerTwoScore) {
					System.out.println("Player1 Wins! Congratulations!");
				} else if 
					(playerTwoScore > playerOneScore) {
					System.out.println("Player2 Wins! Congratulations!");	
				} else if 
					(playerOneScore == playerTwoScore) {
					System.out.println("It's a draw!");
				}
				}
			
			}
