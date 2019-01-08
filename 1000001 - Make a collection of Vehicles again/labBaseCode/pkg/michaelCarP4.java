package pkg;

public class michaelCarP4 implements Vehicle
{
	private String name;
	private Rectangle mikal,wheel,wheel2;
	
	public michaelCarP4(int xx,int yy)
	{
			mikal = new Rectangle(xx,yy,50,40);
			wheel = new Rectangle(xx-10,yy+30,20,20);
			wheel2 = new Rectangle(xx+40,yy+30,20,20);
	}

	public void translate(double x,double y)
	{
		mikal.translate(x,y);
		wheel.translate(x,y);
		wheel2.translate(x,y);
	}
	
	public void draw()
	{
		mikal.draw();  
		wheel.draw();
		wheel2.draw();  
	}
	
	public int getX()
	{
		System.out.println(mikal.getX());
		return mikal.getX();
	}
	
	public int getY()
	{
		System.out.println(mikal.getY());
		return mikal.getY();
	}
}