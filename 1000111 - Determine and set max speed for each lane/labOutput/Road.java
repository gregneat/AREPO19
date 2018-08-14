import java.awt.geom.*;
import java.awt.*;

public class Road
{
	//private variables
	private Rectangle2D.Double body, topBorder, bottomBorder;
	private Rectangle2D.Double[] dividers;
	private double roadWidth;
	
	public Road(double startX, double startY, double length, double width)
	{
		roadWidth = width;
		topBorder = new Rectangle2D.Double(startX,startY,length,5);
		body = new Rectangle2D.Double(startX,startY+5,length,width);
		bottomBorder = new Rectangle2D.Double(startX,startY+width+5,length,5);
		dividers = new Rectangle2D.Double[20];
		for(int i=0; i<dividers.length; i++)
			dividers[i] = new Rectangle2D.Double(startX+5+(length/15)*i,startY+5+0.4*width,length/30,width/5);
	}
	
	//draws road
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.BLACK);
		g2.fill(body);
		
		g2.setColor(Color.GRAY);
		g2.fill(bottomBorder);
		g2.fill(topBorder);
		
		g2.setColor(Color.YELLOW);
		for(int i=0; i<dividers.length; i++)
			g2.fill(dividers[i]);
	}
	//accessor methods
	public boolean contains(double x, double y)
	{
		return body.contains(x,y) || topBorder.contains(x,y) || bottomBorder.contains(x,y);
	}
	public double getX()
	{
		return body.getX();
	}
	//returns middle of road coordinate
	public double getY()
	{
		return body.getY() + 0.5*roadWidth;
	}
}