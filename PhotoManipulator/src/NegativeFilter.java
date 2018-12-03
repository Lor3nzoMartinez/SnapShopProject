/**
 * Filter that flips the image to negative.
 */
public class NegativeFilter implements Filter
{
  public void filter(PixelImage pi)
  {
    Pixel[][] data = pi.getData();

    for (int row = 0; row < pi.getHeight(); row++)
    {
      for (int col = 0; col < pi.getWidth(); col++)
      {
    	Pixel temp = data[row][col];
        data[row][col] = new Pixel(255 - temp.red
        		, 255 - temp.green, 255 - temp.blue);
      }
    }

    pi.setData(data);
  }
}