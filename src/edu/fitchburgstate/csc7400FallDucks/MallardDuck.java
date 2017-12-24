package edu.fitchburgstate.csc7400FallDucks;
/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * 
 * Date: 2017-11-28
 * Name: Radha/Mohamod
 */


/** 
 *  Mallard duck for pond
 */
public class MallardDuck extends Duck {
	  
    public MallardDuck() {
    	 super("mallard_still.bmp", new DuckBehaviorFactory("mallard_fly.gif", "mallard_swim.gif"));
    	 }
 

    
 
    public void display() {
    	still.show();
    }
}
