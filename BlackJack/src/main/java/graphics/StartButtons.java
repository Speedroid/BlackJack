package graphics;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import SpeedRoid.BlackJack.Main;
import dealer.Card;
import user.GameStart;

public class StartButtons {
	/* images */
	protected static ImageIcon totalImage = new ImageIcon(Main.class.getResource("../../images/start/total.png"));

	protected static ImageIcon hitButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/hitButton.png"));
	protected static ImageIcon standButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/standButton.png"));

	protected static ImageIcon aceButton1Image = new ImageIcon(
			Main.class.getResource("../../images/start/aceButton1.png"));
	protected static ImageIcon aceButton11Image = new ImageIcon(
			Main.class.getResource("../../images/start/aceButton11.png"));

	protected static ImageIcon winButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/winButton.png"));
	protected static ImageIcon loseButtonImage = new ImageIcon(
			Main.class.getResource("../../images/start/loseButton.png"));

	/* buttons */
	protected static JButton total;

	public static JButton hitButton;
	public static JButton standButton;

	public static JButton aceButton1;
	public static JButton aceButton11;

	public static JButton winButton;
	public static JButton loseButton;

	/* boolean */
	public static boolean duringGame;
	public static boolean endGame;

	/* other */
	public static Card aceCard;

	/* initialize */
	public static void setAllStartButtons() {
		total = new JButton(totalImage);

		aceButton1 = new JButton(aceButton1Image);
		aceButton11 = new JButton(aceButton11Image);

		hitButton = new JButton(hitButtonImage);
		standButton = new JButton(standButtonImage);

		winButton = new JButton(winButtonImage);
		loseButton = new JButton(loseButtonImage);

		setAllControls();
		startOff();
	}

	public static void setAllControls() {
		totalControl();

		hitButtonControl();
		standButtonControl();

		aceButton1Control();
		aceButton11Control();

		winButtonControl();
		loseButtonControl();

		// cardsControl();
	}

	public static void totalControl() {
		total.setBounds(0, 0, 1280, 720);
		total.setBorderPainted(false);
		total.setContentAreaFilled(false);
		total.setFocusPainted(false);
	}

	public static void hitButtonControl() {
		hitButton.setBounds(-200, 50, 850, 400);
		hitButton.setBorderPainted(false);
		hitButton.setContentAreaFilled(false);
		hitButton.setFocusPainted(false);
		hitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				hitButton.setVisible(false);
				standButton.setVisible(false);
				GameStart.hit();
			}
		});
	}

	public static void standButtonControl() {
		standButton.setBounds(600, 50, 850, 400);
		standButton.setBorderPainted(false);
		standButton.setContentAreaFilled(false);
		standButton.setFocusPainted(false);
		standButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				hitButton.setVisible(false);
				standButton.setVisible(false);
				GameStart.stand();
			}
		});
	}

	public static void aceButton1Control() {
		aceButton1.setBounds(-200, 50, 850, 400);
		aceButton1.setBorderPainted(false);
		aceButton1.setContentAreaFilled(false);
		aceButton1.setFocusPainted(false);
		aceButton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				aceButton1.setVisible(false);
				aceButton11.setVisible(false);

				GameStart.plusUserTotal(1);
				GameStart.dealerCalc();
				GameStart.duringAceOff();

				if (GameStart.getCnt() > 1) {
					GameStart.hitOrStand();
					
					if (GameStart.getDealerTotal() == 21) {
						GameStart.lose();
						return;
					}
					if (GameStart.getDealerTotal() > 21) {
						GameStart.win();
						return;
					}
				} else {
					GameStart.drawCard();
					GameStart.playContinue();
				}
			}
		});
	}

	public static void aceButton11Control() {
		aceButton11.setBounds(600, 50, 870, 400);
		aceButton11.setBorderPainted(false);
		aceButton11.setContentAreaFilled(false);
		aceButton11.setFocusPainted(false);
		aceButton11.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				aceButton1.setVisible(false);
				aceButton11.setVisible(false);

				GameStart.plusUserTotal(11);
				GameStart.dealerCalc();
				GameStart.duringAceOff();

				if (GameStart.getCnt() > 1) {
					GameStart.hitOrStand();
					
					if (GameStart.getDealerTotal() == 21) {
						GameStart.lose();
						return;
					}
					if (GameStart.getDealerTotal() > 21) {
						GameStart.win();
						return;
					}
				} else {
					GameStart.drawCard();
					GameStart.playContinue();
				}
			}
		});
	}

	public static void winButtonControl() {
		winButton.setBounds(0, 0, 1280, 720);
		winButton.setBorderPainted(false);
		winButton.setContentAreaFilled(false);
		winButton.setFocusPainted(false);
	}

	public static void loseButtonControl() {
		loseButton.setBounds(0, 0, 1280, 720);
		loseButton.setBorderPainted(false);
		loseButton.setContentAreaFilled(false);
		loseButton.setFocusPainted(false);
	}

	/* start on */
	public static void startOn() {
		MainButtons.mainOff();
		RulesButtons.rulesOff();
		RankingButtons.rankingOff();

		total.setVisible(true);

		duringGame = true;
		endGame = false;
	}

	/* start off */
	public static void startOff() {
		total.setVisible(false);

		hitButton.setVisible(false);
		standButton.setVisible(false);

		aceButton1.setVisible(false);
		aceButton11.setVisible(false);

		winButton.setVisible(false);
		loseButton.setVisible(false);

		duringGame = false;
		endGame = false;
	}
}
