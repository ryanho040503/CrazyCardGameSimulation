package ca.sheridancollege.hohoan.project1_hoangduy_ho;

public class Card {

	private int rank; // rank 1 - 13 (Ace - King)
        private String suit; // "Hearts", "Diamonds", "Clubs", "Spades"
        private int index; // 0 - 51 unique index

	/**
	 * 
	 * @param rank
	 * @param suit
	 * @param index
	 */
	public Card(int rank, String suit, int index) {
            this.rank = rank;
            this.suit = suit;
            this.index = index; 
	}

        @Override
	public String toString() {
		return "(" + index + ") " + rank + " " + suit;
	}

	public int getRank() {
		return this.rank;
	}

	public String getSuit() {
		return this.suit;
	}

	public int getIndex() {
		return this.index;
	}

}