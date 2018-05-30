package user;

import java.util.Random;

import dealer.Card;
import dealer.DeckOfCards;
import graphics.CardButtons;
import graphics.ShareButtons;
import graphics.StartButtons;

public class GameStart {
	private static int userTotal, dealerTotal;
	private static int cnt;
	private static int dealerTemp;

	private static Card userCard;
	private static DeckOfCards deck;

	private static boolean duringAce = false;

	/* getter */
	public static int getCnt() {
		return cnt;
	}

	public static int getDealerTotal() {
		return dealerTotal;
	}

	/* setter */
	public static void plusUserTotal(int tempInt) {
		userTotal += tempInt;
	}

	/* play */
	public static void play() {
		deck = new DeckOfCards();

		/* initialize */
		userTotal = dealerTotal = cnt = 0;

		deck.shuffle();
		drawCard();
		drawCard();

		playContinue();
	}

	public static void playContinue() {
		if (!duringAce) { // !!!
			if (cnt <= 21) {
				if (userTotal == 21)
					win();
				else if (userTotal > 21)
					lose();
				else
					hitOrStand();
			}
		}
	}

	public static void hitOrStand() {
		if (StartButtons.duringGame) {
			StartButtons.hitButton.setVisible(true);
			StartButtons.standButton.setVisible(true);
		}
	}

	public static void hit() {
		drawCard();

		if (!duringAce) {// !!!
			if (dealerTotal == 21) {
				lose();
				return;
			}
			if (dealerTotal > 21) {
				win();
				return;
			}
			playContinue();
		}
	}

	public static void stand() {
		dealerCalc();

		if (dealerTotal >= 17) {
			if (userTotal >= dealerTotal)
				win();
			if (userTotal < dealerTotal)
				lose();
			if (dealerTotal > 21)
				win();

			return;
		} else
			stand();

		playContinue();
	}

	/* draw */
	public static void drawCard() {
		if (!duringAce) {
			cnt++;
			userCard = deck.dealCard();

			switch (userCard.getFaceNum()) {
			case 1:
				duringAce = true;

				StartButtons.aceCard = userCard;

				StartButtons.aceButton1.setVisible(true);
				StartButtons.aceButton11.setVisible(true);

				CardButtons.addHand(cnt, userCard);
				return;
			case 11:
			case 12:
			case 13:
				userTotal += 10;
				break;
			default:
				userTotal += Integer.parseInt(userCard.getFace());
			}

			CardButtons.addHand(cnt, userCard);
			dealerCalc();
		}
	}

	/* dealer calculate */
	public static void dealerCalc() {
		Random random = new Random();

		if (dealerTotal < 17) {
			dealerTemp = random.nextInt(13) + 1;

			if (dealerTemp >= 11)
				dealerTemp = 10;

			if (dealerTemp == 1) {
				if (dealerTotal <= 10)
					dealerTemp = 11;
				else
					dealerTemp = 1;
			}

			dealerTotal += dealerTemp;
		}
	}

	/* win */
	public static void win() {
		StartButtons.startOff();
		CardButtons.cardOff();

		StartButtons.duringGame = false;
		StartButtons.endGame = true;
		StartButtons.winButton.setVisible(true);
		ShareButtons.backButton.setVisible(true);
	}

	/* lose */
	public static void lose() {
		StartButtons.startOff();
		CardButtons.cardOff();

		StartButtons.duringGame = false;
		StartButtons.endGame = true;
		StartButtons.loseButton.setVisible(true);
		ShareButtons.backButton.setVisible(true);
	}

	/* pass user total */
	public static String userTotalToString() {
		if (userTotal < 10)
			return String.format("0" + userTotal);
		else
			return String.format("%d", userTotal);
	}

	/* during ace off */
	public static void duringAceOff() {
		duringAce = false;
	}
}
