package edu.fitchburgstate.csc7400FallDucks;
import external.GIF;

public class RubberDuckBehaviorFactory  extends AbstractBehaviorFactory {
	 
	 	public RubberDuckBehaviorFactory(String fly, String swim) {
	 		this.fly = BehaviorFactory.createGif(fly);
	 		this.swim = BehaviorFactory.createGif(swim);
	 	}
	 	
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
	 		
	 		return new Squeak();
	 	}
	 
	 	protected GIF swim;
	 	protected GIF fly;
	 }


