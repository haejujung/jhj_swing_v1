package ch02;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

// 내부 클래스 활용해서 코드를 완성해주세요
public class PaintFrame extends JFrame {

	MyPaintPanel myPaintPanel;

	public PaintFrame() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("나의집");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		myPaintPanel = new MyPaintPanel();
	}

	private void setInitLayout() {
		add(myPaintPanel);
		setVisible(true);

	}

	class MyPaintPanel extends JPanel {

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawRect(100, 200, 300, 250);
			g.drawRect(200, 250, 100, 200);
			g.drawLine(100, 200, 200, 400);
			g.drawLine(400, 200, 300, 400);
			g.drawLine(100, 200, 150, 450);
			g.drawLine(400, 200, 350, 450);
			g.drawOval(210, 300, 80, 80);
			int x[] = { 100, 250, 400 };
            int y[] = { 200, 100, 200 };
            g.drawPolygon( x, y, 3 );
		}

	}

}
