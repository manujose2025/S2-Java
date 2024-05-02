package area.figures;

public class Square
{
	float len;
	
	public Square(float l)
	{
		len = l;
	}
	
	public float area()
	{
		float area = len * len;
		return area;
	}
}
