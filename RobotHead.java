import java.awt.Color;


import acm.graphics.*;
import acm.program.*;


public class RobotHead extends GraphicsProgram {

	public static final int HEAD_WIDTH= 250;
	public static final int HEAD_HEIGHT=400;
	public static final double EYE_RADIUS =25;
	public static final int MOUTH_WIDTH =175;
	public static final int MOUTH_HEIGHT =50;

	
	
	public void run() {
		double ELength = EYE_RADIUS * 2;
		GRect face = new GRect(getWidth()/2, getHeight()/2,HEAD_WIDTH, HEAD_HEIGHT);
		GOval eye1 = new GOval(150, 200,ELength, ELength);
		GRect mouth = new GRect(135,400,MOUTH_WIDTH,MOUTH_HEIGHT);
		GOval eye2 = new GOval(250, 200,ELength, ELength);
		face.setFilled(true);
		face.setColor(Color.black);
		face.setFillColor(Color.gray);
		eye1.setFillColor(Color.yellow);
		eye1.setFilled(true);
		eye2.setFillColor(Color.yellow);
		eye2.setFilled(true);
		mouth.setFillColor(Color.white);
		mouth.setFilled(true);
		add(face);
		add(eye1);
		add(eye2);
		add(mouth);
	}
}
