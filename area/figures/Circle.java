package area.figures;

public class Circle
{
	float rad;
	
	public Circle(float r)
	{
		rad = r;
	}
	
	public float area()
	{
		float area = (float) 3.14 * (rad * rad);
		return area;
	}
}
