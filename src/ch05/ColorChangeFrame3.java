package ch05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChangeFrame3 extends JFrame implements ActionListener {

	private JPanel panel1;
	private JPanel panel2;
	private JButton button1;
	private JButton button2;

	public ColorChangeFrame3() {
		initData();
		setInitLayout();
		addEventListener();

	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		panel1 = new JPanel();
		panel2 = new JPanel();

		panel1.setBackground(Color.PINK);
		panel2.setBackground(Color.DARK_GRAY);

		button1 = new JButton("click1");
		button2 = new JButton("click2");

	}

	private void setInitLayout() {

		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
		panel2.add(button1);
		panel2.add(button2);
		setVisible(true);

	}

	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource().toString());
		if (e.getSource().equals(button1)) {
			panel1.setBackground(Color.MAGENTA);
		} else if (e.getSource().equals(button2)) {
			panel1.setBackground(Color.WHITE);
		}

	}

	public static void main(String[] args) {
		new ColorChangeFrame3();
	}

}