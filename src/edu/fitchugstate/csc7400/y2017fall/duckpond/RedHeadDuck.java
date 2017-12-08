/* Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
  
+ * Date: 2017-12-5


 
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

/** 
 *  Redhead duck for pond
 */
public class RedHeadDuck extends Duck {
	 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	
	/*
	 * Display the Read Headed duck with flyBehavior and quackBehavior.
	 */
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
