/**
 * Represents a pixel, which is a red, green, and blue value
 * This class is COMPLETE. Don't change it.
 */
public class Pixel
{
  // RGB color values for this pixel (0-255)
  public int red;
  public int green;
  public int blue;

  /**
   * Constructor for objects of class Pixel
   * Initializes the pixel values;
   */
  public Pixel(int red, int green, int blue)
  {
    this.red = Fixed(red);
    this.green = Fixed(green);
    this.blue = Fixed(blue);
  }
  
  public static int Fixed(int fix)
  {
	  int fixed = 0;
	  if(fix < 0)
	  {
		  fixed = 0;
		  return fixed;
	  }
	  else if (fix > 255)
	  {
		  fixed = 255;
		  return fixed;
	  }
	  else
	  {
		  fixed = fix;
	  }
	  return fixed;
  }
}