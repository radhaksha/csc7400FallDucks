/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * 
 * Date: 2017-11-28
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

/** 
 *  Rubber duck for pond
 *  Rubber duck class inherits the flybehavior and queak behavior from duck class.
 */


public class RubberDuck extends Duck {
	 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
 
	
	
	/*
	 * Display method displays the rubber duck.
	 */
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
