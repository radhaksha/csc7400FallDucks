package edu.fitchburgstate.csc7400FallDucks;
/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * 
 * Date: 2017-11-28
 */


/** 
 *  Rubber duck for pond
 *  Rubber duck class inherits the flybehavior and queak behavior from duck class.
 */


public class RubberDuck extends Duck {
	 
	public RubberDuck() {
super("rubber_duck_still.bmp", new RubberDuckBehaviorFactory("rubber_duck_fly.gif", "rubber_duck_swim.gif"));
	}
 
	
	
	/*
	 * Display method displays the rubber duck.
	 */
	public void display() {
		still.show();
	}
}
