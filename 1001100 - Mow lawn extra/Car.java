import java.awt.geom.*;
import java.awt.*;

public class Car
{

	private Rectangle2D.Double body, head;
	private Ellipse2D.Double leftWheel, rightWheel;
	private String name;
	
	public Car()
	{
		int x = 0;
		int y = 100;
		body = new Rectangle2D.Double(x,y,60,20);
		head = new Rectangle2D.Double(x+10,y-20,40,20);
		leftWheel = new Ellipse2D.Double(x,y+20,15,15);
		rightWheel = new Ellipse2D.Double(x+45,y+20,15,15);
		name = "";
	}
	
	public Car(String n)
	{
		this();
		name = n;
	}
	
	public Car(double xx, double yy, String n)
	{
		this(n);
		setLocation(xx,yy);
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.BLUE);
		g2.fill(body);
		g2.fill(head);
		g2.setColor(Color.BLACK);
		g2.fill(leftWheel);
		g2.fill(rightWheel);
		
		g.setColor(Color.BLACK);
		g.drawString(name,(int)body.getX()+20,(int)body.getY()+10);

		String coords = "("+(int)getX()+","+(int)getY()+")";
		g.drawString(coords,(int)getX(),(int)getY()-30);		
	}
	
	public void drive(int x)
	{
		body.setFrame(body.getX()+x,body.getY(),60,20);
		head.setFrame(head.getX()+x,head.getY(),40,20);
		leftWheel.setFrame(leftWheel.getX()+x,leftWheel.getY(),15,15);
		rightWheel.setFrame(rightWheel.getX()+x,rightWheel.getY(),15,15);
	}
	
	public void setLocation(double x, double y)
	{
		body.setFrame(x,y,60,20);
		head.setFrame(x+10,y-20,40,20);
		leftWheel.setFrame(x,y+20,15,15);
		rightWheel.setFrame(x+45,y+20,15,15);
	}
	public double getX()
	{
		return body.getX();
	}
	public double getY()
	{
		return body.getY();
	}
	public double getWidth()
	{
		return body.getWidth();
	}
	public double getHeight()
	{
		return body.getHeight()+head.getHeight()+leftWheel.getHeight();
	}
}