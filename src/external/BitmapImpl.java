/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * 
 * Date: 2017-11-28
 */
package external;

/** 
 *  Simple implementation of bitmap
 */
public class BitmapImpl implements Bitmap {


  /** 
   *  Creates a new bitmap given a file name
   */
  public BitmapImpl(String fileName) {
    this.fileName = fileName;
  }

  /** 
   *  Displays the bitmap file name
   */
  public void show() {
	  System.out.println("Showing bitmap " + this.fileName);
  }

  /**
   * File name of the bitmap
   */
  protected String fileName;
}
