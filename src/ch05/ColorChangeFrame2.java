package ch05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChangeFrame2 extends JFrame implements ActionListener {
	private JPanel panel;
	private JButton button1;
	private JButton button2;

	public ColorChangeFrame2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		panel = new JPanel();
		panel.setBackground(Color.YELLOW);

		button1 = new JButton("click1");
		button2 = new JButton("click2");
	}

	private void setInitLayout() {
		add(button1, BorderLayout.NORTH);
		add(button2, BorderLayout.SOUTH);

		add(panel, BorderLayout.CENTER);
		setVisible(true);
	}

	// 이 메서드의 책임은 이벤트 리스너만 등록
	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);

	}

	// 오버라이드: 이벤트가 일어나면 호출되어지는 메서드.
	public void actionPerformed(ActionEvent e) {
//		Object object = e.getSource();
//		// 주소값으로 비교도 가능 
//		// 문자열 값으로 비교 가능 
//		JButton selectedButton = (JButton)e.getSource();
//		if(selectedButton == this.button1) {
//			System.out.println("button1 객체가 눌러졌다라고 판명 가능 ");
//			panel.setBackground(Color.yellow);
//		} else {
//			System.out.println("button2 객체가 눌러졌다라고 판명 가능 ");
//			panel.setBackground(Color.black);
//		}
		System.out.println(e.getSource().toString());
		if (e.getSource().equals(button1)) {
			panel.setBackground(Color.BLACK);

		} else if (e.getSource().equals(button2)) {
			panel.setBackground(Color.blue);

		}

	}

	public static void main(String[] args) {
		new ColorChangeFrame2();
	} // end of main

}