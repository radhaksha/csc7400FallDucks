package edu.fitchburgstate.csc7400FallDucks;

 /*
   Class: Object-Oriented Design and Analysis
  Professor: Orlando Montalvo
  Assignment: HW 9
  Date: 2017-12-05
  Name: Radha(@13789877)
 */

import external.Bitmap;
import external.BitmapImpl;
import external.GIF;
import external.GifImpl;

/*
 * BehaviorFactory class to create instance of bitmap and instance of GIF.
 */

 public class BehaviorFactory {
 	/** 
 	 *  Creates a new Bitmap instance
 	 */
 	public static Bitmap createBitmap(String fileName) {
 		return new BitmapImpl(fileName);
 	}
 	
 	
 	/** 
 	 *  Creates a new GIF instance
 	 */
 	public static GIF createGif(String fileName) {
 		return new GifImpl(fileName);
 	}


	
 

}

