package graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.JFrame;

import user.GameStart;

@SuppressWarnings("serial")
public class BlackJack extends JFrame {

	private Image screenImage;
	private Graphics screenGraphic;

	private final int screenWidth = 1280;
	private final int screenHeight = 720;

	/* constructor && trigger */
	public BlackJack() {

		/* initialize screen */
		setTitle("SpeedRoid.BlackJack");
		setSize(screenWidth, screenHeight);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		/* share GUI */
		ShareButtons.setBackButton();
		add(ShareButtons.backButton);

		/* card GUI */
		CardButtons.setAllcardButtons();
		for (int i = 1; i < 14; i++) {
			add(CardButtons.clubsButtons[i]);
			add(CardButtons.diamondsButtons[i]);
			add(CardButtons.heartsButtons[i]);
			add(CardButtons.spadesButtons[i]);
		}

		/* start GUI */
		StartButtons.setAllStartButtons();
		add(StartButtons.aceButton1);
		add(StartButtons.aceButton11);
		add(StartButtons.hitButton);
		add(StartButtons.standButton);
		add(StartButtons.winButton);
		add(StartButtons.loseButton);
		add(StartButtons.total);

		/* rules GUI */
		RulesButtons.setRulesOnButton();
		add(RulesButtons.rulesOnButton);

		/* ranking GUI */
		RankingButtons.setRankingOnButton();
		add(RankingButtons.rankingOnButton);

		/* main buttons GUI */
		MainButtons.setAllMainButtons();
		add(MainButtons.githubButton);
		add(MainButtons.exitButton);
		add(MainButtons.rankingButton);
		add(MainButtons.rulesButton);
		add(MainButtons.startButton);
		add(MainButtons.introButton);
	}

	/* paint */
	public void paint(Graphics g) {
		screenImage = createImage(screenWidth, screenHeight);
		screenGraphic = screenImage.getGraphics();
		screenDraw((Graphics2D) screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}

	/* drawing */
	public void screenDraw(Graphics2D g) {
		paintComponents(g);
		this.repaint();

		if (StartButtons.duringGame) {
			g.setColor(Color.white);
			((Graphics2D) g).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
					RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
			g.setFont(new Font("Papyrus", Font.BOLD, 80));
			g.drawString(GameStart.userTotalToString(), 600, 300);
		}

		if (StartButtons.endGame) {
			g.setColor(Color.white);
			((Graphics2D) g).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
					RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
			g.setFont(new Font("Papyrus", Font.BOLD, 80));
		}
	}
}
