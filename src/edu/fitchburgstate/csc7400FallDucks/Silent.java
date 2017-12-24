package edu.fitchburgstate.csc7400FallDucks;

public class Silent implements QuackBehavior {

	/** 
   *  Outputs silent
   */
	@Override
	public void quack() {
		System.out.println("Decoy is Silent");
	}

 
}
