package ch06;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MiniGame2 extends JFrame {

	private JLabel backgroundMap;
	private JLabel mPlayer;
	private int mPlayerX = 100;
	private int mPlayerY = 100;
	private final int MOVE_DISTANCE = 10;

	public MiniGame2() {
		initData();
		setInitLayout();
		addEventListener();

	}

	private void initData() {
		setTitle("야스오의 모험");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Icon icon = new ImageIcon("images/background1.jpg");
		backgroundMap = new JLabel(icon);
		
		backgroundMap.setSize(500,500);
		
		mPlayer = new JLabel(new ImageIcon("images/yasuo.png"));
		mPlayer.setSize(100, 100);
	}

	private void setInitLayout() {
		setLayout(null);
		add(backgroundMap);
		backgroundMap.add(mPlayer);
		mPlayer.setLocation(mPlayerX, mPlayerY);
		setVisible(true);
	}

	private void addEventListener() {

		addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_UP) {
					mPlayerY -= MOVE_DISTANCE;
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					mPlayerY += MOVE_DISTANCE;
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					mPlayerX -= MOVE_DISTANCE;
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					mPlayerX += MOVE_DISTANCE;
				}
				mPlayer.setLocation(mPlayerX, mPlayerY);
			}

		});

	}

	public static void main(String[] args) {

		MiniGame2 minigame = new MiniGame2();

	}

}
