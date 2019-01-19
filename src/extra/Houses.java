package extra;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
public static void main(String[] args) {
	
for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10; j++) {
			drawHouse();
		}
	
}
	
}
static void drawHouse() {
	Robot nancy=new Robot("mini");
	nancy.setX(50);
	nancy.setY(500);
	nancy.penDown();
	nancy.setSpeed(20);
	nancy.
	nancy.setPenColor(Color.pink);
	nancy.move(100);
	nancy.turn(90);
	nancy.move(50);
	nancy.turn(90);
	nancy.move(100);
	
	nancy.setPenColor(Color.GREEN);
	nancy.turn(270);
	nancy.move(20);
}


}
