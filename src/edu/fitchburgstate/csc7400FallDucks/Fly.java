package edu.fitchburgstate.csc7400FallDucks;
import external.GIF;


/**
 * 
 *Class describes or sets flying types for various kind of ducks
 */
public class Fly implements Flybehavior {

 	public Fly(GIF flying){
 		this.flying = flying;
 	}
 

	protected GIF flying;

	@Override
	public void fly() {
		flying.animate();
		
	}

 
 }
