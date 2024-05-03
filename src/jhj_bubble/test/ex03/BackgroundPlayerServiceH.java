package jhj_bubble.test.ex03;

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
		
		image = ImageIO.read(new File("img/backgroundMapService.png"));

		
	@Override
	public void run() {
		while(true) {
			Color leftColor = new Color(image.getRGB(0, 0))
		}
	}

	}

}
