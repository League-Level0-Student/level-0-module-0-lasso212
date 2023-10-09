package _02_code_flow._4_flaming_ninja_star;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	System.out.println("hello world");
	String input = JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null,"Hello "+input);
}
}
