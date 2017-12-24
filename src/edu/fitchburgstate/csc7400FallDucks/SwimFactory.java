package edu.fitchburgstate.csc7400FallDucks;


public class SwimFactory implements SwimBehaviorFactory {
 
 	/**
 	 * @return object SimpleSwim
 	 */
 	@Override
 	public SwimBehavior CreateGeneralSwim() {
 		return new SimpleSwim(null);
 	}
 
 }