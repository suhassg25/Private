package Two;

public class ColorFactory extends AbstractFactory {

	Color c;
	public Color getColor(int a)
	{
		
		if(a==1)
		{
			new Blue().fill();
			return new Blue();
		}
		else if(a==2)
		{
			new Red().fill();
			return new Red();
		}
		else if(a==3)
		{
			new Green().fill();
			return new Green();
		}
		else
		{
			return null;
		}
	}
}
