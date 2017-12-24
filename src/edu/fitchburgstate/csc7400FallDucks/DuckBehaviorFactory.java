package edu.fitchburgstate.csc7400FallDucks;


import external.GIF;


public class DuckBehaviorFactory extends AbstractBehaviorFactory {
		 
	    /**
	     * 
	     * @param fly
	     * @param swim
	     */
	 	public DuckBehaviorFactory(String fly, String swim) {
	 		this.fly = BehaviorFactory.createGif(fly);
	 		this.swim = BehaviorFactory.createGif(swim);
	 	}
	 
	 	@Override
	 	public Flybehavior createFlyBehavior() {
	 		return  new Fly(this.fly);
	 	}
	 
	 	@Override
	 	public SwimBehavior createSwimBehavior() {
	 		return new SimpleSwim(this.swim);
	 	}
	 
	 	@Override
	 	public QuackBehavior createQuackBehavior() {
	 		return new SimpleQuack();
	 	}
	 
	 	protected GIF swim;
	 	protected GIF fly;
	 
	 }
	

