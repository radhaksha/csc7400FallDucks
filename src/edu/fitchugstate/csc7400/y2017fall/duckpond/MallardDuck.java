/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * 
 * Date: 2017-11-28
 * Name: Radha/Mohamod
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

/** 
 *  Mallard duck for pond
 */
public class MallardDuck extends Duck {
	  
    public MallardDuck() {

      quackBehavior = new Quack();
              flyBehavior = new FlyWithWings();
 

    }
 
    public void display() {
       System.out.println("MallardDuck.display()");
        System.out.println("I'm a real Mallard duck");
    }
}
