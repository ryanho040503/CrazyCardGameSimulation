package ca.sheridancollege.hohoan.project1_hoangduy_ho;

public class Player {

	private String name;
	private int position;
	private List<Card> hand;
	private int score;

	/**
	 * 
	 * @param name
	 * @param position
	 */
	public Player(String name, int position) {
		// TODO - implement Player.Player
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return this.name;
	}

	public List<Card> getHand() {
		return this.hand;
	}

	public void addCard() {
		// TODO - implement Player.addCard
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param deck
	 */
	public void drawCard(Deck deck) {
		// TODO - implement Player.drawCard
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param topCard
	 */
	public Card matchCard(Card topCard) {
		// TODO - implement Player.matchCard
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param deck
	 * @param topCard
	 */
	public void turn(Deck deck, Card topCard) {
		// TODO - implement Player.turn
		throw new UnsupportedOperationException();
	}

	public boolean hasNoCards() {
		// TODO - implement Player.hasNoCards
		throw new UnsupportedOperationException();
	}

	public void showHand() {
		// TODO - implement Player.showHand
		throw new UnsupportedOperationException();
	}

}