package bubble.test.ex02;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {

	private JLabel backgroundMaP;
	// 포함관계
	private Player player;

	public BubbleFrame() {

		initData();
		setInitLayout();
		addEventListener();

	}

	private void initData() {
		backgroundMaP = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Frame --> root panal
		setContentPane(backgroundMaP); // add 처리
		setSize(1000, 640);

		player = new Player();
	}

	private void setInitLayout() {
		// 좌표 값으로 배치
		setLayout(null);
		setResizable(false); // 프레임 조절 불가
		setLocationRelativeTo(null); // JFrame 모니터 가운데 자동 배치
		setVisible(true);

		add(player);

	}

	private void addEventListener() {

		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("key code : " + e.getKeyCode());

				switch (e.getKeyCode()) {

				case KeyEvent.VK_LEFT:
					player.left();
					break;
				case KeyEvent.VK_RIGHT:
					player.right();
					break;
				case KeyEvent.VK_UP:
					player.up();
					break;
				}

			} // end of KeyPressed

			@Override
			public void keyReleased(KeyEvent e) {

				switch (e.getKeyCode()) {

				case KeyEvent.VK_LEFT:
					player.setLeft(false);
					break;
				case KeyEvent.VK_RIGHT:
					player.setRight(false);
					break;
				}
			} // end of KeyRealeased
		});

	}

	// 코드 테스트
	public static void main(String[] args) {
		new BubbleFrame();

	} // end of main

}
