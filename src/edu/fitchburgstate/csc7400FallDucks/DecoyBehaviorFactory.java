package edu.fitchburgstate.csc7400FallDucks;
import external.GIF;


/*
 * This is a DecoyBehaviorFactory class to define the behaviors of decoy duck.
 */
public class DecoyBehaviorFactory extends AbstractBehaviorFactory{
	
			protected GIF swim;
		 	protected GIF fly;	 
			
	
	        /**
	         * 
	         * @param fly object
	         * @param swim object
	         */
		 	public DecoyBehaviorFactory(String fly, String swim) {
		 		this.fly = BehaviorFactory.createGif(fly);
		 		this.swim = BehaviorFactory.createGif(swim);
		 	}
		 	
		 	/*
		 	 * @returns CannotFly object
		 	 */
		 	@Override
		 	public Flybehavior createFlyBehavior() {
		 	
		 		return new CannotFly(this.fly);
		 	}
		 
		 	@Override
		 	public SwimBehavior createSwimBehavior() {
		 	
		 		return new SimpleSwim(this.swim);
		 	}
		 
		 	@Override
		 	public QuackBehavior createQuackBehavior() {
		 	
		 		return new Silent();
		 	}
		 
		 
		 }
