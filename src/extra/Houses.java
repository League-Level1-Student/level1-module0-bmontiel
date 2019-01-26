package extra;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
static	Robot nancy=new Robot("mini");
public static void main(String[] args) {
	nancy.setX(50);
	nancy.setY(500);
	Robot.setWindowColor(Color.BLACK);
for (int i = 0; i < 3; i++) {
			drawHouse("medium");
			drawHouse("small");
			drawHouse("big");
		}
}
static void drawHouse(String height) {
	int distance=0;
	if (height.equals("small")) {
		distance=60;
	}
	if (height.equals("medium")) {
		distance=120;
	}
	if (height.equals("big")) {
		distance=250;
	}
	
	nancy.penDown();
	nancy.setSpeed(20);
	nancy.setRandomPenColor();
	nancy.move(distance);
	nancy.turn(90);
	nancy.move(50);
	nancy.turn(90);
	nancy.move(distance);
	nancy.setPenColor(Color.GREEN);
	nancy.turn(270);
	nancy.move(20);
	nancy.turn(270);
	
}


}
