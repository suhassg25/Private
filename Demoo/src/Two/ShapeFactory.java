package Two;

public class ShapeFactory extends AbstractFactory{

	Shape s;
	public Shape getShape(int a)
	{	
		if(a==1)
		{
			s= new Square();
			s.draw();
		}
		else if(a==2)
		{
			s= new Rectangle();
			s.draw();
		}
		else if(a==3)
		{
			s= new Circle();
			s.draw();
		}
		else
		{
			return null;
		}
		return s;
	}
}
