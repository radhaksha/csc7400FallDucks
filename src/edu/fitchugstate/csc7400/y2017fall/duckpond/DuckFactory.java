
 /* Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
  
 * Date: 2017-12-5


 
 */










package edu.fitchugstate.csc7400.y2017fall.duckpond;
/*
 * creating the duck factory class. Factory class contains the all changing behavior of duck.
 */

public class DuckFactory {

	public Duck getDuck(String QuackType) {
		Duck duck = null;
		
		if(QuackType.equalsIgnoreCase("Quack")) {
			return new MallardDuck();
			
		}else if(QuackType.equalsIgnoreCase("Squeak")) {
			return new RubberDuck();
		
		}else if (QuackType.equalsIgnoreCase("MuteQuack")) {
			return new WoodenDecoy();
		}			
		return null;
	}
		
}
