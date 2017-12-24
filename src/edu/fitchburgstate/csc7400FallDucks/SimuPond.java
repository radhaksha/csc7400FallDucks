package edu.fitchburgstate.csc7400FallDucks;

 /*
   Class: Object-Oriented Design and Analysis
  Professor: Orlando Montalvo
  Assignment: HW 9
  Date: 2017-12-05
  Name: Radha(@13789877)
 /

/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * Date: 2017-12-05
 * Name: Radha/ Mohamed
 */


/** 
 *  Main program that simulates a pond
 */
public class SimuPond {

	
	private static DuckPond pond = new DuckPond();

	
	public static void main(String[] args) {

		/**
		 * creating various ducks objects
		 */
		Duck mallardDuck = new MallardDuck();
		Duck redheadDuck = new RedheadDuck();
		Duck rubberDuck = new RubberDuck();
		Duck woodenDecoyDuck = new WoodenDecoyDuck();

        /**
         * Below addDuck method adds various ducks in the pond
         */
		System.out.println("Adding ducks to duck pond");
		addDuck(mallardDuck);
		addDuck(redheadDuck);
		addDuck(rubberDuck);
		addDuck(woodenDecoyDuck);

		System.out.println("\nIdyllic pond");
		pond.swimming();

		
		System.out.println("\nDog runs into pond");
		/**
		 * Mehtod that explains what happens to various ducks when they are spooked
		 */
		pond.spook();

	}


    /**
 	 * Adds a duck to the pond
 	 * 
 	 * @param duck
 	 */
	public static void addDuck(DuckType duck) {
		duck.display();
		pond.addDuck(duck);
	}
	

}
	