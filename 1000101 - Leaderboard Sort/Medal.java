import java.awt.geom.*;
import java.awt.*;

public class Medal {
	
	private Polygon innerNeck, outerNeck;
	private Color medalColor, neckColor, background;
	private Ellipse2D.Double medal;
	
	public Medal(int place, int x, int y, Color bg)
	{
		background = bg;
		//makes medal colors based on place
		switch(place) {
			case 1: medalColor = Color.YELLOW;
				neckColor = Color.BLUE;
				break;
			case 2: medalColor = new Color(192,192,192);
				neckColor = Color.RED;
				break;
			case 3: medalColor = new Color(195,132,23);
				neckColor = Color.WHITE;
				break;
		}
		//create triangles through the polygon class
		outerNeck = new Polygon(new int[]{x,x+30,x+15}, new int[]{y+5,y+5,y+45},3);
		innerNeck = new Polygon(new int[]{x+10,x+20,x+15},new int[]{y+5,y+5,y+35},3);
		medal = new Ellipse2D.Double(x,y+30,30,30);
	}
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(neckColor);
		g2.fill(outerNeck);
		g2.setColor(background);
		g2.fill(innerNeck);
		g2.setColor(medalColor);
		g2.fill(medal);
	}
}