package dealer;

public class Card {
	private final String face;
	private final String suit;

	/* constructor */
	public Card(String face, String suit) {
		this.face = face;
		this.suit = suit;
	}

	/* methods */
	public String getSuit() {
		return this.suit;
	}

	public String getFace() {
		return this.face;
	}

	public int getFaceNum() {
		switch (this.face) {
		case "ace":
			return 1;
		case "jack":
			return 11;
		case "queen":
			return 12;
		case "king":
			return 13;
		default:
			return Integer.parseInt(this.getFace());
		}
	}
}
