/**
 * Filter that Implements the Laplacian Filter.
 */
public class LaplacianFilter implements Filter
{
	public void filter(PixelImage pi)
  	{
		//Assigning values to proper position in array
		int[][] Laplacian = new int[3][3];
		Laplacian[0][0] = -1;
		Laplacian[1][0] = -1;
		Laplacian[2][0] = -1;
		Laplacian[0][1] = -1;
		Laplacian[1][1] =  8;
		Laplacian[2][1] = -1;
		Laplacian[0][2] = -1;
		Laplacian[1][2] = -1;
		Laplacian[2][2] = -1;
	  
		Pixel[][] data = pi.WeightedPixels(Laplacian, pi, 1);


	  	pi.setData(data);
  	}
}