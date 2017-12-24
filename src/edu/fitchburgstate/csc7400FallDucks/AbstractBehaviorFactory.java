package edu.fitchburgstate.csc7400FallDucks;

 /*
   Class: Object-Oriented Design and Analysis
  Professor: Orlando Montalvo
  Assignment: HW 9
  Date: 2017-12-05
  Name: Radha(@13789877)
 
 /*
  * This is a AbstractBehaviorFactory class to define the behaviors of duck.
  */
public abstract class AbstractBehaviorFactory {
	 
	 	public abstract Flybehavior createFlyBehavior();
	 	public abstract SwimBehavior createSwimBehavior();
	 	public abstract QuackBehavior createQuackBehavior();
	 	
	 	
}


 


