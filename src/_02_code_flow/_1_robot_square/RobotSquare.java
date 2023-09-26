package _02_code_flow._1_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {

	public static void main(String[] args) {

		// This code makes a new Robot
		Robot me = new Robot();
		me.setSpeed(100);
		// PEN. Put the robot's pen down so it can draw, Use this command:
		/** rob.penDown(); **/
		int count = 0;
		// INCREASE COUNT. Add one to the number of sides that have now been drawn like
		// this:
		/** count += 1; **/
		

		// Run the program. Did the Robot draw a line and turn?

		while (count < 4) {
			me.penDown();
			count += 1;
					me.move(300);
					me.turn(90);
}
				
	}
}