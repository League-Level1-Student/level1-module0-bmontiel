package extra;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
public static void main(String[] args) {
drawHouse();
	
}
static void drawHouse() {
	Robot nancy=new Robot("mini");
	nancy.setX(50);
	nancy.setY(500);
	nancy.penDown();
	nancy.setPenColor(Color.pink);
	nancy.move(100);
	nancy.turn(30);
	nancy.move(50);
	nancy.turn(120);
	nancy.move(50);
	nancy.turn(30);
	nancy.move(100);
	nancy.setPenColor(Color.GREEN);
	nancy.turn(270);
	nancy.move(20);
}


}
