import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class starter extends JPanel 
{
	static JFrame frame;
	
	String joe;
	Rectangle2D.Double rect1, rect2, rect3;
	
	public static void main(String[] args) {
		frame = new JFrame("App");
		frame.add(new starter());
		frame.setSize(600,600);
		frame.setVisible(true);
	}
	
	public starter()
	{
		Color a = new Color(0,255,0);
		setBackground(a);
		
		rect1 = new Rectangle2D.Double(0,0,200,100);
		rect1.setFrame(200,0,200,100);
		
		rect2 = new Rectangle2D.Double(300,200,50,100);
		
		rect3 = new Rectangle2D.Double(50,300,150,150);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.BLUE);
		g2.fill(rect1);
		g2.setColor(Color.RED);
		g2.fill(rect2);
		g2.setColor(Color.BLACK);
		g2.fill(rect3);
	}

}

