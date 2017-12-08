
/* Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
  
+ * Date: 2017-12-5
Name: Radha/Mohamod


 
 */package edu.fitchugstate.csc7400.y2017fall.duckpond;

/*
 * MuteQuack is concrete class that implements QuackBehavior interface.
 */
public class MuteQuack implements QuackBehavior {
	
	public void quack() {
		System.out.println("<< Silence >>");
	}
	
}