/* Filter that is slightly more.... Edgy.
 */
public class EdgyFilter implements Filter
{
	public void filter(PixelImage pi)
  	{
		//Assigning values to proper position in array
		int[][] Edgy = new int[3][3];
		Edgy[0][0] = -1;
		Edgy[1][0] = -1;
		Edgy[2][0] = -1;
		Edgy[0][1] = -1;
		Edgy[1][1] =  9;
		Edgy[2][1] = -1;
		Edgy[0][2] = -1;
		Edgy[1][2] = -1;
		Edgy[2][2] = -1;
	  
		Pixel[][] data = pi.WeightedPixels(Edgy, pi, 16);


	  	pi.setData(data);
  	}
}