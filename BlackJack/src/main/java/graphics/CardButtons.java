package graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import SpeedRoid.BlackJack.Main;
import dealer.Card;

public class CardButtons {
	/* images */
	protected static ImageIcon clubs1ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/aceofClubs.png"));
	protected static ImageIcon clubs2ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/2ofClubs.png"));
	protected static ImageIcon clubs3ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/3ofClubs.png"));
	protected static ImageIcon clubs4ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/4ofClubs.png"));
	protected static ImageIcon clubs5ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/5ofClubs.png"));
	protected static ImageIcon clubs6ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/6ofClubs.png"));
	protected static ImageIcon clubs7ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/7ofClubs.png"));
	protected static ImageIcon clubs8ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/8ofClubs.png"));
	protected static ImageIcon clubs9ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/9ofClubs.png"));
	protected static ImageIcon clubs10ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/10ofClubs.png"));
	protected static ImageIcon clubs11ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/jackofClubs.png"));
	protected static ImageIcon clubs12ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/queenofClubs.png"));
	protected static ImageIcon clubs13ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/kingofClubs.png"));

	protected static ImageIcon hearts1ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/aceofHearts.png"));
	protected static ImageIcon hearts2ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/2ofHearts.png"));
	protected static ImageIcon hearts3ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/3ofHearts.png"));
	protected static ImageIcon hearts4ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/4ofHearts.png"));
	protected static ImageIcon hearts5ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/5ofHearts.png"));
	protected static ImageIcon hearts6ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/6ofHearts.png"));
	protected static ImageIcon hearts7ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/7ofHearts.png"));
	protected static ImageIcon hearts8ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/8ofHearts.png"));
	protected static ImageIcon hearts9ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/9ofHearts.png"));
	protected static ImageIcon hearts10ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/10ofHearts.png"));
	protected static ImageIcon hearts11ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/jackofHearts.png"));
	protected static ImageIcon hearts12ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/queenofHearts.png"));
	protected static ImageIcon hearts13ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/kingofHearts.png"));

	protected static ImageIcon diamonds1ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/aceofDiamonds.png"));
	protected static ImageIcon diamonds2ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/2ofDiamonds.png"));
	protected static ImageIcon diamonds3ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/3ofDiamonds.png"));
	protected static ImageIcon diamonds4ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/4ofDiamonds.png"));
	protected static ImageIcon diamonds5ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/5ofDiamonds.png"));
	protected static ImageIcon diamonds6ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/6ofDiamonds.png"));
	protected static ImageIcon diamonds7ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/7ofDiamonds.png"));
	protected static ImageIcon diamonds8ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/8ofDiamonds.png"));
	protected static ImageIcon diamonds9ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/9ofDiamonds.png"));
	protected static ImageIcon diamonds10ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/10ofDiamonds.png"));
	protected static ImageIcon diamonds11ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/jackofDiamonds.png"));
	protected static ImageIcon diamonds12ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/queenofDiamonds.png"));
	protected static ImageIcon diamonds13ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/kingofDiamonds.png"));

	protected static ImageIcon spades1ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/aceofSpades.png"));
	protected static ImageIcon spades2ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/2ofSpades.png"));
	protected static ImageIcon spades3ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/3ofSpades.png"));
	protected static ImageIcon spades4ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/4ofSpades.png"));
	protected static ImageIcon spades5ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/5ofSpades.png"));
	protected static ImageIcon spades6ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/6ofSpades.png"));
	protected static ImageIcon spades7ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/7ofSpades.png"));
	protected static ImageIcon spades8ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/8ofSpades.png"));
	protected static ImageIcon spades9ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/9ofSpades.png"));
	protected static ImageIcon spades10ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/10ofSpades.png"));
	protected static ImageIcon spades11ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/jackofSpades.png"));
	protected static ImageIcon spades12ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/queenofSpades.png"));
	protected static ImageIcon spades13ButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/cards/kingofSpades.png"));

	/* buttons (except 0 index) */
	protected static JButton[] clubsButtons = new JButton[14];
	protected static JButton[] heartsButtons = new JButton[14];
	protected static JButton[] diamondsButtons = new JButton[14];
	protected static JButton[] spadesButtons = new JButton[14];

	/* initialize */
	public static void setAllcardButtons() {
		clubsButtons[1] = new JButton(clubs1ButtonImage);
		clubsButtons[2] = new JButton(clubs2ButtonImage);
		clubsButtons[3] = new JButton(clubs3ButtonImage);
		clubsButtons[4] = new JButton(clubs4ButtonImage);
		clubsButtons[5] = new JButton(clubs5ButtonImage);
		clubsButtons[6] = new JButton(clubs6ButtonImage);
		clubsButtons[7] = new JButton(clubs7ButtonImage);
		clubsButtons[8] = new JButton(clubs8ButtonImage);
		clubsButtons[9] = new JButton(clubs9ButtonImage);
		clubsButtons[10] = new JButton(clubs10ButtonImage);
		clubsButtons[11] = new JButton(clubs11ButtonImage);
		clubsButtons[12] = new JButton(clubs12ButtonImage);
		clubsButtons[13] = new JButton(clubs13ButtonImage);

		diamondsButtons[1] = new JButton(diamonds1ButtonImage);
		diamondsButtons[2] = new JButton(diamonds2ButtonImage);
		diamondsButtons[3] = new JButton(diamonds3ButtonImage);
		diamondsButtons[4] = new JButton(diamonds4ButtonImage);
		diamondsButtons[5] = new JButton(diamonds5ButtonImage);
		diamondsButtons[6] = new JButton(diamonds6ButtonImage);
		diamondsButtons[7] = new JButton(diamonds7ButtonImage);
		diamondsButtons[8] = new JButton(diamonds8ButtonImage);
		diamondsButtons[9] = new JButton(diamonds9ButtonImage);
		diamondsButtons[10] = new JButton(diamonds10ButtonImage);
		diamondsButtons[11] = new JButton(diamonds11ButtonImage);
		diamondsButtons[12] = new JButton(diamonds12ButtonImage);
		diamondsButtons[13] = new JButton(diamonds13ButtonImage);

		heartsButtons[1] = new JButton(hearts1ButtonImage);
		heartsButtons[2] = new JButton(hearts2ButtonImage);
		heartsButtons[3] = new JButton(hearts3ButtonImage);
		heartsButtons[4] = new JButton(hearts4ButtonImage);
		heartsButtons[5] = new JButton(hearts5ButtonImage);
		heartsButtons[6] = new JButton(hearts6ButtonImage);
		heartsButtons[7] = new JButton(hearts7ButtonImage);
		heartsButtons[8] = new JButton(hearts8ButtonImage);
		heartsButtons[9] = new JButton(hearts9ButtonImage);
		heartsButtons[10] = new JButton(hearts10ButtonImage);
		heartsButtons[11] = new JButton(hearts11ButtonImage);
		heartsButtons[12] = new JButton(hearts12ButtonImage);
		heartsButtons[13] = new JButton(hearts13ButtonImage);

		spadesButtons[1] = new JButton(spades1ButtonImage);
		spadesButtons[2] = new JButton(spades2ButtonImage);
		spadesButtons[3] = new JButton(spades3ButtonImage);
		spadesButtons[4] = new JButton(spades4ButtonImage);
		spadesButtons[5] = new JButton(spades5ButtonImage);
		spadesButtons[6] = new JButton(spades6ButtonImage);
		spadesButtons[7] = new JButton(spades7ButtonImage);
		spadesButtons[8] = new JButton(spades8ButtonImage);
		spadesButtons[9] = new JButton(spades9ButtonImage);
		spadesButtons[10] = new JButton(spades10ButtonImage);
		spadesButtons[11] = new JButton(spades11ButtonImage);
		spadesButtons[12] = new JButton(spades12ButtonImage);
		spadesButtons[13] = new JButton(spades13ButtonImage);

		setAllControls();
		cardOff();
	}

	public static void setAllControls() {
		for (int i = 1; i < 14; i++) {
			clubsButtons[i].setBounds(0, 0, 150, 220);
			clubsButtons[i].setBorderPainted(false);
			clubsButtons[i].setContentAreaFilled(false);
			clubsButtons[i].setFocusPainted(false);

			heartsButtons[i].setBounds(0, 0, 150, 220);
			heartsButtons[i].setBorderPainted(false);
			heartsButtons[i].setContentAreaFilled(false);
			heartsButtons[i].setFocusPainted(false);

			diamondsButtons[i].setBounds(0, 0, 150, 220);
			diamondsButtons[i].setBorderPainted(false);
			diamondsButtons[i].setContentAreaFilled(false);
			diamondsButtons[i].setFocusPainted(false);

			spadesButtons[i].setBounds(0, 0, 150, 220);
			spadesButtons[i].setBorderPainted(false);
			spadesButtons[i].setContentAreaFilled(false);
			spadesButtons[i].setFocusPainted(false);

		}
	}

	/* card off */
	public static void cardOff() {
		for (int i = 1; i < 14; i++) {
			clubsButtons[i].setVisible(false);
			heartsButtons[i].setVisible(false);
			diamondsButtons[i].setVisible(false);
			spadesButtons[i].setVisible(false);
		}
	}

	/* add hand */
	public static void addHand(int cnt, Card userCard) {
		if (userCard.getSuit().equals("clubs")) {
			clubsButtons[userCard.getFaceNum()].setBounds(170 * (cnt - 1) + 50, 420, 150, 220);
			clubsButtons[userCard.getFaceNum()].setVisible(true);
		}
		if (userCard.getSuit().equals("hearts")) {
			heartsButtons[userCard.getFaceNum()].setBounds(170 * (cnt - 1) + 50, 420, 150, 220);
			heartsButtons[userCard.getFaceNum()].setVisible(true);
		}
		if (userCard.getSuit().equals("diamonds")) {
			diamondsButtons[userCard.getFaceNum()].setBounds(170 * (cnt - 1) + 50, 420, 150, 220);
			diamondsButtons[userCard.getFaceNum()].setVisible(true);
		}
		if (userCard.getSuit().equals("spades")) {
			spadesButtons[userCard.getFaceNum()].setBounds(170 * (cnt - 1) + 50, 420, 150, 220);
			spadesButtons[userCard.getFaceNum()].setVisible(true);
		}
	}
}
