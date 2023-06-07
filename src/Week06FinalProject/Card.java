package Week06FinalProject;
/*
1.	Create the Card class:
2.  Create two Fields:
	a)	value (contains a value from 2-14 representing cards 2-Ace)
	b)	name (e.g. Ace of Diamonds, or Two of Hearts)
3.	Create Methods:
	a)	Getters and Setters
	b)	describe (prints out information about a card)
*/

public class Card {
	// (e.g. "Ace of Diamonds", or "Two of Hearts")
	String name;
	//contains a value from 2-14 representing cards 2-Ace
	int value;
	
	public Card(int value, String suit) {		//Creating a method that utilizes switch statements. and linking each case number to a written string.
		this.value = value;
		
		switch(value) {
        case 2:
        	name = "Two";
            break;
        case 3:
        	name = "Three";
            break;
        case 4: 
        	name = "Four";
            break;
        case 5: 
        	name = "Five";
            break;
        case 6: 
        	name = "Six";
            break;
        case 7: 
        	name = "Seven";
            break;
        case 8:
        	name = "Eight";
            break;
        case 9: 
        	name = "Nine";
            break;
        case 10:
        	name = "Ten";
            break;
        case 11: 
        	name = "Jack";
            break;
        case 12: 
        	name = "Queen";
            break;
        case 13:
        	name = "King";
            break;
        case 14:
        	name = "Ace";
            break;
		}
										// This will add name expression and suit(when passed) with "of" in the middle.
		name += " of " + suit; 			//suit is being passed in once we create a new card in the deck class and because its looped and all 4 suits will be created for that value.
		
	}
	

	
	public void describe() {			//Describe method for printing name of card
		//System.out.println("Name of card is: " + name);
		//System.out.println("Card: " + name + " with the value of " + value);
		System.out.println(name);

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	
	

}
