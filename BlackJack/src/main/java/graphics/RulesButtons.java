package graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import SpeedRoid.BlackJack.Main;

public class RulesButtons {
	protected static ImageIcon rulesOnButtonImage = new ImageIcon(
			Main.class.getResource("../../images/rules/rulesOnButton.png"));
	protected static JButton rulesOnButton;

	/* initialize */
	public static void setRulesOnButton() {
		rulesOnButton = new JButton(rulesOnButtonImage);

		rulesOnButton.setBounds(0, 0, 1280, 720);
		rulesOnButton.setBorderPainted(false);
		rulesOnButton.setContentAreaFilled(false);
		rulesOnButton.setFocusPainted(false);

		rulesOnButton.setVisible(false);
	}

	/* rules on */
	public static void rulesOn() {
		MainButtons.mainOff();
		StartButtons.startOff();

		rulesOnButton.setVisible(true);
		ShareButtons.backButton.setVisible(true);
	}

	/* rules off */
	public static void rulesOff() {
		rulesOnButton.setVisible(false);
		ShareButtons.backButton.setVisible(false);
	}
}
