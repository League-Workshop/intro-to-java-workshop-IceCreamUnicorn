package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	
		Robot bob = new Robot();
		bob.penDown();
		bob.move(100);
		bob.turn(100);
		bob.hide();
	}
}
