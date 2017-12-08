/**
 * Class: Object-Oriented Design and Analysis





 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * 
 * Date: 2017-11-28
 */


package edu.fitchugstate.csc7400.y2017fall.duckpond;

/*
 * Base duck class that will be used for ducks on the pond.
 *  Duck is a abstract class where method are declared as a signature.
 */
  
  

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	
	/*
	 * setFlyBehavior is the method which initializes the flybehavior of duck.
	 */

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	
	/*
	 * SetQuackeBehavior method initialize the quackbehavior of duck which is of the type QuackBehavior.
	 */
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	/*
	 * 
	 */
	public Duck() {

	}

	/*
	 * PerformFly method calls the flybehavior(fly with wing or no fly ) of duck.
	 */

	public void performFly() {
		flyBehavior.fly();
	}

	
	/*
	 * performQuack method calls the quack (quack, squeak, silence) behavior of duck.
	 */
	public void performQuack() {
		quackBehavior.quack();
	}

	/*
	 * swim method calls the swim behavior of duck . where all types of duck can swim.
	 */
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	

  
}
