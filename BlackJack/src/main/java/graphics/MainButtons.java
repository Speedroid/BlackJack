package graphics;

import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import SpeedRoid.BlackJack.Main;
import user.GameStart;

public class MainButtons {
	protected static ImageIcon introButtonImage = new ImageIcon(
			Main.class.getResource("../../images/main/introButton.png"));
	protected static ImageIcon startButtonImage = new ImageIcon(
			Main.class.getResource("../../images/main/startButton.png"));
	protected static ImageIcon rulesButtonImage = new ImageIcon(
			Main.class.getResource("../../images/main/rulesButton.png"));
	protected static ImageIcon rankingButtonImage = new ImageIcon(
			Main.class.getResource("../../images/main/rankingButton.png"));
	protected static ImageIcon exitButtonImage = new ImageIcon(
			Main.class.getResource("../../images/main/exitButton.png"));
	protected static ImageIcon githubButtonImage = new ImageIcon(
			Main.class.getResource("../../images/main/githubButton.png"));

	protected static JButton blackBackButton;
	protected static JButton introButton;
	protected static JButton startButton;
	protected static JButton rulesButton;
	protected static JButton rankingButton;
	protected static JButton exitButton;
	protected static JButton githubButton;

	/* setters */
	public static void setBlackBackButton(ImageIcon blackBackButtonImage) {
		blackBackButton = new JButton(blackBackButtonImage);
	}

	public static void setIntroButton(ImageIcon introButtonImage) {
		introButton = new JButton(introButtonImage);
	}

	public static void setStartButton(ImageIcon startButtonImage) {
		startButton = new JButton(startButtonImage);
	}

	public static void setRulesButton(ImageIcon rulesButtonImage) {
		rulesButton = new JButton(rulesButtonImage);
	}

	public static void setRankingButton(ImageIcon rankingButtonImage) {
		rankingButton = new JButton(rankingButtonImage);
	}

	public static void setExitButton(ImageIcon exitButtonImage) {
		exitButton = new JButton(exitButtonImage);
	}

	public static void setGithubButton(ImageIcon githubButtonImage) {
		githubButton = new JButton(githubButtonImage);
	}

	public static void setAllMainButtons() {
		setIntroButton(introButtonImage);
		setStartButton(startButtonImage);
		setRulesButton(rulesButtonImage);
		setRankingButton(rankingButtonImage);
		setExitButton(exitButtonImage);
		setGithubButton(githubButtonImage);

		setAllControls();
	}

	/* introButton control */
	public static void introButtonControl() {
		introButton.setBounds(0, 0, 1280, 720);
		introButton.setBorderPainted(false);
		introButton.setContentAreaFilled(false);
		introButton.setFocusPainted(false);
	}

	/* start control */
	public static void startControl() {
		startButton.setBounds(50, 150, 550, 100);
		startButton.setBorderPainted(false);
		startButton.setContentAreaFilled(false);
		startButton.setFocusPainted(false);
		startButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				StartButtons.startOn();
				GameStart.play();
			}
		});
	}

	/* rules control */
	public static void rulesControl() {
		rulesButton.setBounds(50, 250, 550, 100);
		rulesButton.setBorderPainted(false);
		rulesButton.setContentAreaFilled(false);
		rulesButton.setFocusPainted(false);
		rulesButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				RulesButtons.rulesOn();
			}
		});
	}

	/* ranking control */
	public static void rankingControl() {
		rankingButton.setBounds(50, 350, 550, 100);
		rankingButton.setBorderPainted(false);
		rankingButton.setContentAreaFilled(false);
		rankingButton.setFocusPainted(false);
		rankingButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				RankingButtons.rankingOn();
			}
		});
	}

	/* exit control */
	public static void exitControl() {
		exitButton.setBounds(50, 500, 550, 100);
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				System.exit(0);
			}
		});
	}

	/* github control */
	public static void githubControl() {
		githubButton.setBounds(850, 200, 400, 300);
		githubButton.setBorderPainted(false);
		githubButton.setContentAreaFilled(false);
		githubButton.setFocusPainted(false);
		githubButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Desktop desktop = Desktop.getDesktop();
				if (!desktop.isSupported(Desktop.Action.BROWSE)) {
					System.err.println("Desktop doesn't support web browser action");
				}
				try {
					URI uri = new URI("https", "github.com/Speedroid", "/path");

					desktop.browse(uri);
				} catch (IOException _e) {
					System.err.println(_e.getMessage());
				} catch (URISyntaxException _e) {
					System.err.println(_e.getMessage());
				}
			}
		});
	}

	public static void setAllControls() {
		githubControl();
		exitControl();
		rankingControl();
		rulesControl();
		startControl();
		introButtonControl();
	}

	public static void mainOn() {
		introButton.setVisible(true);
		startButton.setVisible(true);
		rulesButton.setVisible(true);
		rankingButton.setVisible(true);
		exitButton.setVisible(true);
		githubButton.setVisible(true);
	}

	public static void mainOff() {
		startButton.setVisible(false);
		rulesButton.setVisible(false);
		rankingButton.setVisible(false);
		exitButton.setVisible(false);
		githubButton.setVisible(false);
	}
}
