package Two;

public class FactoryProducer {

	public AbstractFactory getFactory(int a, int b)
	{
		AbstractFactory abstractFactory=new AbstractFactory();
		abstractFactory.getColor(a);
	   abstractFactory.getShape(b);
	   return abstractFactory;
	}
}
