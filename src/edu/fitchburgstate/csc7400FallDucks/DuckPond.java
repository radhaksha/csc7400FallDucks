package edu.fitchburgstate.csc7400FallDucks;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 *Class defines various ducks flying, quacking and swimming in pond
 */
public class DuckPond {
	
	
	   public void addDuck(DuckType newDuck) {
	     this.ducks.add(newDuck);
	   }
	 

	   /** 
	    *  Method shows all ducks swimming
	    */
	   public void swimming() {
	 	this.drawPond();
	     for (DuckType duck: this.ducks) {
	       duck.quack();
	       duck.swim();
	     }
	   }
	 
	   
	   /**
	    * Method describes what happens when ducks are scared
	    */
	   public void spook() {
	     this.drawSky();
	     for (DuckType duck: this.ducks) {
	         duck.quack();
	         duck.quack();
	         duck.fly();
	       }
	   }
	 
	   
	   
	   protected void drawPond() {
	     System.out.println("Drawing nice pond with cattails");
	   }
	 
	   protected void drawSky() {
	     System.out.println("Drawing blue sky");
	   }
	 
	   
	   protected List<DuckType> ducks = new ArrayList<DuckType>();
	 }
	
