package edu.fitchburgstate.csc7400FallDucks;
import external.GIF;

/* Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
  
 * Date: 2017-12-5
 * Name: Radha/mohamod 
 */



/**
 * Cannot Fly  concrete class implements FlyBehavior Interface
 * Implements fly() method of FlyBehavior Interface
 */
public class CannotFly implements Flybehavior {
	protected GIF flying;
	 
	
	 	public CannotFly(GIF flying){
	 		this.flying = flying;
	 	}
	 	
	/** 
	*  Outputs duck won't fly
	 */
	 	public void Flying() {
	 		 System.out.println("The duck won't fly");
	 	}
	 	
	 

	 
		@Override
		public void fly() {
			System.out.println("Rubber duck continues to swim");		
		}

		
		
	 }