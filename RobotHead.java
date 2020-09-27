import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class RobotHead extends GraphicsProgram {

	public static final int HEAD_WIDTH = 250;
	public static final int HEAD_HEIGHT = 400;
	public static final double EYE_RADIUS = 25;
	public static final int MOUTH_WIDTH = 175;
	public static final int MOUTH_HEIGHT = 50;

	public void run() {
		double ELength = EYE_RADIUS * 2;
		GRect face = new GRect(getWidth() / 2, getHeight() / 2, HEAD_WIDTH, HEAD_HEIGHT);
		GOval eyes = new GOval(ELength, ELength);
		GRect mouth = new GRect(135, 400, MOUTH_WIDTH, MOUTH_HEIGHT);

		face.setFilled(true);
		face.setColor(Color.black);
		face.setFillColor(Color.gray);
		mouth.setFillColor(Color.white);
		mouth.setFilled(true);
		add(face);
		add(mouth);
		makeEyes(ELength);
	}

	private void makeEyes(double eLength) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 2; i++) {
			if (i == 0) {
				GOval eyes = new GOval(150, 200, eLength, eLength);
				eyes.setFilled(true);
				eyes.setColor(Color.yellow);
				add(eyes);
			} else {
				GOval eyes = new GOval(250, 200, eLength, eLength);
				eyes.setFilled(true);
				eyes.setColor(Color.yellow);
				add(eyes);

			}

		}

	}
}
