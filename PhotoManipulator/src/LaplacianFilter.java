/**
 * Filter that flips the image to negative.
 */
public class LaplacianFilter implements Filter
{
	public void filter(PixelImage pi)
  	{
		int[][] filter = new int[3][3];
		filter[0][0] = -1;
		filter[1][0] = -1;
		filter[2][0] = -1;
		filter[0][1] = -1;
		filter[1][1] = 8;
		filter[2][1] = -1;
		filter[0][2] = -1;
		filter[1][2] = -1;
		filter[2][2] = -1;
	  
		Pixel[][] data = pi.WeightedPixels(filter, pi, 1);


	  	pi.setData(data);
  	}
}