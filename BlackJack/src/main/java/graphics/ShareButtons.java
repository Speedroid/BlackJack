package graphics;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import SpeedRoid.BlackJack.Main;

public class ShareButtons {
	protected static ImageIcon backButtonImage = new ImageIcon(
			Main.class.getResource("../../images/share/backButton.png"));
	public static JButton backButton;

	/* initialize */
	public static void setBackButton() {
		backButton = new JButton(backButtonImage);

		backButton.setBounds(50, 580, 550, 100);
		backButton.setBorderPainted(false);
		backButton.setContentAreaFilled(false);
		backButton.setFocusPainted(false);

		backButton.setVisible(true);
		backButton.setVisible(false);

		backButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				RankingButtons.rankingOff();
				RulesButtons.rulesOff();
				StartButtons.startOff();

				backButton.setVisible(false);
				StartButtons.endGame = false;

				MainButtons.mainOn();
			}
		});
	}
}
