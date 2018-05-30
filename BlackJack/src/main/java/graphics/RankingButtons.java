package graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import SpeedRoid.BlackJack.Main;

public class RankingButtons {
	protected static ImageIcon rankingOnButtonImage = new ImageIcon(
			Main.class.getResource("../../images/ranking/rankingOnButton.png"));
	protected static JButton rankingOnButton;

	/* initialize */
	public static void setRankingOnButton() {
		rankingOnButton = new JButton(rankingOnButtonImage);

		rankingOnButton.setBounds(0, 0, 1280, 720);
		rankingOnButton.setBorderPainted(false);
		rankingOnButton.setContentAreaFilled(false);
		rankingOnButton.setFocusPainted(false);

		rankingOnButton.setVisible(false);
	}

	/* ranking on */
	public static void rankingOn() {
		MainButtons.mainOff();
		StartButtons.startOff();

		rankingOnButton.setVisible(true);
		ShareButtons.backButton.setVisible(true);
	}

	/* ranking off */
	public static void rankingOff() {
		rankingOnButton.setVisible(false);
		ShareButtons.backButton.setVisible(false);
	}
}
