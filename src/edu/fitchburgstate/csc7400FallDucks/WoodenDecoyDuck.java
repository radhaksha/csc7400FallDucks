package edu.fitchburgstate.csc7400FallDucks;

 /*
   Class: Object-Oriented Design and Analysis
  Professor: Orlando Montalvo
  Assignment: HW 9
  Date: 2017-12-05
  Name: Radha(@13789877)
 /


/**
 * Wooden decoys for the duck.
 * WoodenDecoy duck inherits the Duck class.
 */

public class WoodenDecoyDuck extends Duck {
	
	public WoodenDecoyDuck() {
		 		super("decoy_still.bmp",new DuckBehaviorFactory(null, "decoy_swim.gif"));
		 	}
	/*
	 * Display method displays the Woodendecoy dock
	 */
	
	public void display() {
		still.show();
	}
	
	@Override
	public void quack() {
		System.out.println("Decoy is Silent");
	}
	
	
}