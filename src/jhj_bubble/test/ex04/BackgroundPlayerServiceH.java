package jhj_bubble.test.ex04;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import bubble.test.ex05.Player;

public class BackgroundPlayerServiceH implements Runnable {

	private BufferedImage image;
	private Player player;

	public BackgroundPlayerServiceH(Player player) {
		this.player = player;

		try {
			image = ImageIO.read(new File("img/backgroundMapService.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {

		Color leftColor = new Color(image.getRGB(player.getX() + 10, player.getY() + 25));
		Color rightColor = new Color(image.getRGB(player.getX() + 50 + 10, player.getY() + 25));

		if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
			System.out.println("왼쪽벽에 충돌 함");
			player.setLeftWallCrash(true);
			player.setLeft(false);

		} else if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
			System.out.println("오른쪽벽에 충돌 함");
			player.setRightWallCrash(true);
			player.setRight(false);
		} else {
			player.setLeftWallCrash(false);
			player.setRightWallCrash(false);
		}

		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
