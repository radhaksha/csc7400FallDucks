package edu.fitchugstate.csc7400.y2017fall.duckpond;

/*
/* Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
  
 * Date: 2017-12-5
Name: Radha/ mohamod


 
 
package edu.fitchugstate.csc7400.y2017fall.duckpond;

/**
 * Wooden decoys for the duck.
 * WoodenDecoy duck inherits the Duck class.
 */

public class WoodenDecoy extends Duck {
	
	public WoodenDecoy() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}

	/*
	 * Display method displays the Woodendecoy dock
	 */
	public void display() {
		System.out.println("I'm a duck WoodenDecoy");
	}
}