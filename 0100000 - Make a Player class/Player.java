import java.awt.geom.*;
import java.awt.*;

public class Player{

	private Ellipse2D.Double face, eye1, eye2;
	private Line2D.Double mouth;
	
	public Player(int xx, int yy)
	{
		face = new Ellipse2D.Double(xx,yy,40,40);
		eye1 = new Ellipse2D.Double(xx+5,yy+10,10,10);
		eye2 = new Ellipse2D.Double(xx+25,yy+10,10,10);
		mouth = new Line2D.Double(xx+10,yy+30,xx+30,yy+30);
	}
	
	
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.BLUE);
		g2.fill(face);
		g2.setColor(Color.YELLOW);
		g2.fill(eye1);
		g2.fill(eye2);
		g2.draw(mouth);
	}
}