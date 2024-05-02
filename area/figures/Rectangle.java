package area.figures;

public class Rectangle
{
	float len;
	float bre;
	
	public Rectangle(float l, float b)
	{
		len = l;
		bre = b;
	}
	
	public float area()
	{
		float area = len * bre;
		return area;
	}
}
