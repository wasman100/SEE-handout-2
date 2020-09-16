import java.awt.Color;


import acm.graphics.*;
import acm.program.*;


public class RobotHead extends GraphicsProgram {

	public static final int HEAD_WIDTH= 500;
	public static final int HEAD_HEIGHT=400;
	public static final double EYE_RADIUS =25;
	public static final int MOUTH_WIDTH =85;
	public static final int MOUTH_HEIGHT =50;

	
	
	public void run() {
		double ELength = EYE_RADIUS * 2;
		GRect face = new GRect(HEAD_WIDTH, HEAD_HEIGHT);
		GOval eyes = new GOval(ELength, ELength);
		GRect mouth = new GRect(MOUTH_WIDTH,MOUTH_HEIGHT);
		face.setFillColor(Color.DARK_GRAY);
		face.setFilled(true);
		eyes.setFillColor(Color.yellow);
		eyes.setFilled(true);
		mouth.setFillColor(Color.white);
		mouth.setFilled(true);
		add(face);
		add(eyes);
		add(mouth);
	}
}
