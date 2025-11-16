public class Deck {

	private int numCards;
	private List<Card> cards;
	private Card topCard;
	private boolean empty;

	public Deck() {
		// TODO - implement Deck.Deck
		throw new UnsupportedOperationException();
	}

	public void shuffle() {
		// TODO - implement Deck.shuffle
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param card
	 */
	public void setTopCard(Card card) {
		this.topCard = card;
	}

	public boolean isEmpty() {
		return this.empty;
	}

	public Card draw() {
		// TODO - implement Deck.draw
		throw new UnsupportedOperationException();
	}

	public Card getTopCard() {
		return this.topCard;
	}

}