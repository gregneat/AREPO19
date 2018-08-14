import java.awt.geom.*;
import java.awt.*;

public class Car{

	private Rectangle2D.Double body1,body2;
	private Ellipse2D.Double wheel1, wheel2;
	
	public Car()
	{
		int x=50;
		int y=50;
		body1 = new Rectangle2D.Double(x,y,60,20);
		body2 = new Rectangle2D.Double(x+10,y-20,40,20);
		wheel1 = new Ellipse2D.Double(x,y+20,15,15);
		wheel2 = new Ellipse2D.Double(x+45,y+20,15,15);
	}
	
	
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.BLUE);
		g2.fill(body1);
		g2.fill(body2);
		g2.setColor(Color.BLACK);
		g2.fill(wheel1);
		g2.fill(wheel2);
	}
	
	public void drive(int x)
	{
		body1.setFrame(body1.getX()+x,body1.getY(),60,20);
		body2.setFrame(body2.getX()+x,body2.getY(),40,20);
		wheel1.setFrame(wheel1.getX()+x,wheel1.getY(),15,15);
		wheel2.setFrame(wheel2.getX()+x,wheel2.getY(),15,15);
	}

	
}