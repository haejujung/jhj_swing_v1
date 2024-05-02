package bubble.test.ex01;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Moveable {

	private int x;
	private int y;
	private ImageIcon playerR, playerL;

	public Player() {
		initData();
		setInitLayout();

	}

	private void initData() {
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");

		// 처음 실행 시 초기값 세팅
		x = 55;
		y = 535;
		setIcon(playerR);
		setSize(50, 50);
		setLocation(x, y);
	}

	private void setInitLayout() {

	}

	@Override
	public void left() {
		setIcon(playerL);
		x = x - 10;
		setLocation(x, y);

	}

	@Override
	public void right() {
		setIcon(playerR);
		x = x + 10;
		setLocation(x, y);

	}

	@Override
	public void up() {
		y = y - 10;
		setLocation(x, y);
	}

	@Override
	public void down() {
		
	}

}
