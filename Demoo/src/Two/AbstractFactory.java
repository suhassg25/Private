package Two;

public class AbstractFactory {

	public Shape getShape(int a)
	{
		return new ShapeFactory().getShape(a);
	}
	
	public Color getColor(int b)
	{
		return new ColorFactory().getColor(b);
	}
}
