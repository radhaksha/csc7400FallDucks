package edu.fitchburgstate.csc7400FallDucks;
/* Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9 
 * Date: 2017-12-5
 */


/**
 * Redhead duck for pond
 */
public class RedheadDuck extends Duck {
	public RedheadDuck() {

		super("redhead_still.bmp", new DuckBehaviorFactory("redhead_fly.gif", "redhead_swim.gif"));
	}

	/*
	 * Display the Read Headed duck with flyBehavior and quackBehavior.
	 */
	public void display() {
		still.show();
	}
}
