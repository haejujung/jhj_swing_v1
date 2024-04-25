package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx2 extends JFrame {

	private JButton[] buttons;

	public FlowLayoutEx2() {
		super.setTitle("FlowLayout 연습");
		super.setSize(500, 500);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 생성자에서 메서드 호출 가능하다.
		initData();
		setInitLayout();
	}

	// 멤버 변수를 초기화 하는 기능(값 넣다)

	// 반복문 활용

	public void initData() {

		buttons = new JButton[6]; // 공간만 선언 [][][][][][]
									// 0 1 2 3 4 5

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("button" + i + 1);
		}
	}

	public void setInitLayout() {
		super.setLayout(new FlowLayout(10, 50, 50));

		for (int i = 0; i < buttons.length; i++) {
			super.add(buttons[i]);
		}

	}

	public static void main(String[] args) {
		new FlowLayoutEx2(); // <---- 익명 클래스 : 다시접근해서 사용할 일 없으면...

	} // end of main

}
