package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score=0;
		// ASK A QUESTION AND CHECK THE ANSWER
	String question1=	JOptionPane.showInputDialog("what is 65+7");
		if(question1.equals("72")) {
			
		score+=1;
		}
				// 2.  Ask the user a question 
				String question2 = JOptionPane.showInputDialog("what is 32*4?");
				// 3.  Use an if statement to check if their answer is correct
				if(question2.equals("128")) {
					score+=1;
				}
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
	JOptionPane.showMessageDialog(null,"your score is"+ score +"great job");
	}
}
