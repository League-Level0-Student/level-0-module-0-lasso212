package _02_code_flow._2_robot_spiral;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */


import org.jointheleague.graphical.robot.Robot;

public class RobotSpiral {
 
	public static void main(String[] args) {
		
		// Create a new Robot
		Robot r=new Robot();
		// Set your robot's pen down 
		r.penDown();
		// SPEED. Set the robot to go at max speed (100)
r.setSpeed(100);
		// COUNT. Create an int variable that will count how many lines of the spiral we have drawn.
			//        Start its value as zero.
int lines= 0;
while(lines<100) {			// COLOR.   Have the robot set a random pen color:      setRandomPenColor()
r.setRandomPenColor();
			// DRAW.    Move the robot (5*count) pixels
			//          count is the name of the variable you created earlier
r.move(5*lines);
			// TURN.    Turn the robot (360/7) degrees to the right
r.turn(360/4);
			// COUNT.   Increase the count of how many lines have been drawn so far ( count+=1 
lines+=1;
			// Change the robot pen width to the current value of the count variable 
r.setPenWidth(1);

		//  End the while loop here

		
		// Run the program. 
		// Check the pattern against the picture in the recipe. If it matches, you are done!
}
	}
}
