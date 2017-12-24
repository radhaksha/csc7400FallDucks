package edu.fitchburgstate.csc7400FallDucks;
import external.GIF;

public class SimpleSwim implements SwimBehavior {
 
	protected GIF swimBehavior;
	
 	public SimpleSwim(GIF swimBehavior){
 		this.swimBehavior = swimBehavior;
 	}
 	/** 
    *  Outputs a swimming animation
    */
 	public void swim() {
 		swimBehavior.animate();
 	}
 	
 	
}
