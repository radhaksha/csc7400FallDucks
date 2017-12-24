package edu.fitchburgstate.csc7400FallDucks;
import external.Bitmap;
import external.BitmapImpl;

/**
 * Class: Object-Oriented Design and Analysis
 * 
 * 
 * 
 * 
 * 
 * Professor: Orlando Montalvo Assignment: HW 9
 * 
 * Date: 2017-11-28
 */

/*
 * Base duck class that will be used for ducks on the pond. Duck is a abstract
 * class where method are declared as a signature.
 */

public class Duck implements DuckType {

	
	protected Bitmap still;

	protected Flybehavior flybehavior;

	protected SwimBehavior swimBehavior;
	 	   
	protected QuackBehavior quackBehavior;


	/*
	 * setFlyBehavior is the method which initializes the flybehavior of duck.
	 */

	public void setFlyBehavior(Flybehavior flybehavior) {
		this.flybehavior = flybehavior;
	}

	/*
	 * SetQuackeBehavior method initialize the quackbehavior of duck which is of the
	 * type QuackBehavior.
	 */

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	/*
	 * 
	 */

	public Duck(String bitmapFilename, AbstractBehaviorFactory factory) {
		this.still = this.createBitmap(bitmapFilename);
		this.flybehavior = factory.createFlyBehavior();
		this.swimBehavior = factory.createSwimBehavior();
		this.quackBehavior = factory.createQuackBehavior();
	}

	/*
	 * PerformFly method calls the flybehavior(fly with wing or no fly ) of duck.
	 */

	public Bitmap createBitmap(String fileName) {
		return new BitmapImpl(fileName);
	}

	/**
	 * Shows a swimming animation using the GIF file
	 */
	public void swim() {
		swimBehavior.swim();
	}

	
	public void performFly() {
		flybehavior.fly();
		
	}

	
	/*
	 * performQuack method calls the quack (quack, squeak, silence) behavior of duck.
	 */
	public void performQuack() {
		quackBehavior.quack();
	}

	
	public void fly() {
		// TODO Auto-generated method stub
		flybehavior.fly();
		
	}


	@Override
	public void quack() {
		quackBehavior.quack();
		
	}


	@Override
	public void display() {
		
		
	}
	

  
}
