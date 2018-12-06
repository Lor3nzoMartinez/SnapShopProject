/* Filter that gives the Unsharp mask Effect.
 */
public class UnsharpMaskingFilter implements Filter
{
	public void filter(PixelImage pi)
  	{
		//Assigning values to proper position in array
		int[][] UnsharpMask = new int[3][3];
		UnsharpMask[0][0] = -1;
		UnsharpMask[1][0] = -2;
		UnsharpMask[2][0] = -1;
		UnsharpMask[0][1] = -2;
		UnsharpMask[1][1] = 28;
		UnsharpMask[2][1] = -2;
		UnsharpMask[0][2] = -1;
		UnsharpMask[1][2] = -2;
		UnsharpMask[2][2] = -1;
	  
		Pixel[][] data = pi.WeightedPixels(UnsharpMask, pi, 16);


	  	pi.setData(data);
  	}
}