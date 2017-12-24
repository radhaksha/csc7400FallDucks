package edu.fitchburgstate.csc7400FallDucks;


/**
 * 
 * Interface to implement Fly behaviour of ducks
 *
 */
public interface FlyBehaviorFactory {
	 /**
	  * Methods to create fly objects
	  */
	   public Flybehavior CreateFlyWithWings();
	   public Flybehavior CreateNoFly();

}
