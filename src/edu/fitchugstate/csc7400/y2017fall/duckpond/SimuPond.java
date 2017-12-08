/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * 
 * Date: 2017-11-28
 * Name: Radha/ Mohamed
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

/** 
 *  Main program that simulates a pond
 */
public class SimuPond {

  /** 
   *  Runs the duck pond simulator
   *  This is the main method.
   *  different types of duck(mallerduck, ruberduck, woodendecoyduck, readheadduck )making thier own object from duckfactory.And preforming the respective behavior.
   */
	public static void main(String[] args) {
		/*
		 * Creating the object of DuckFactory Class.
		 * each types of duck gets the respective type of quack behavior from factory class.
		 */
		
		DuckFactory duckFactory = new DuckFactory();
		
		/*
		 * Objects of Mallard, Rubber and WoodenDuck gets created below.
		 */
		
		Duck mallardduck = duckFactory.getDuck("Quack");
		
		Duck rubberduck = duckFactory.getDuck("Squeak");
		
		Duck woodendecoyduck = duckFactory.getDuck("MuteQuack");
		
		
		System.out.println("\nGoing to call MallardDuck.performQuack()");
		mallardduck.performQuack();
		
		System.out.println("\nGoing to call MallardDuck.performFly()");
		mallardduck.performFly();		
		
		System.out.println("\nGoing to call RubberDuck.performQuack()");
		rubberduck.performQuack();
		
		System.out.println("\nGoing to call RubberDuck.performFly()");
		rubberduck.performFly();	
		
		System.out.println("\nGoing to call WoodenDecoyDuck.performQuack()");
		woodendecoyduck.performQuack();
		
		System.out.println("\nGoing to call woodendecoyduck.performFly()");
		woodendecoyduck.performFly();	

		
		System.out.println("\nIdyllic pond");
		pond.swimming();

		
		System.out.println("\nDuck runs into pond");
		pond.spook();
	}

	
	/**
	 * Adds a duck to the pond, just a helper function
	 * 
	 * @param duck the duck to add to the pond
	 */
	public static void addDuck(DuckType duck) {
		duck.display();
		pond.addDuck(duck);
	}

	
	/**
	 * The pond for the simulation
	 */
	private static DuckPond pond = new DuckPond();
}
