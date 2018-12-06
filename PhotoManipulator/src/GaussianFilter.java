/**
 * Filter that flips the image to negative.
 */
public class GaussianFilter implements Filter
{
	public void filter(PixelImage pi)
  	{
		int[][] Gaussian = new int[3][3];
		Gaussian[0][0] = 1;
		Gaussian[1][0] = 2;
		Gaussian[2][0] = 1;
		Gaussian[0][1] = 2;
		Gaussian[1][1] = 4;
		Gaussian[2][1] = 2;
		Gaussian[0][2] = 1;
		Gaussian[1][2] = 2;
		Gaussian[2][2] = 1;
	  
		Pixel[][] data = pi.WeightedPixels(Gaussian, pi, 16);


	  	pi.setData(data);
  	}
}