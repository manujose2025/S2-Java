package area.figures;

public class Triangle
{
	float bre;
	float hei;
	
	public Triangle(float b, float h)
	{
		bre = b;
		hei = h;
	}
	
	public float area()
	{
		float area = (bre * hei) / 2;
		return area;
	}
}

