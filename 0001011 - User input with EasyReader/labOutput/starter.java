import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class starter extends JPanel implements KeyListener
{
	static JFrame frame;
	
	String joe;
	Rectangle2D.Double rect;
	int xCoord=0;
	
	public static void main(String[] args) {
		EasyReader r_in = new EasyReader();
		System.out.println("Please enter Window width");
		int width = r_in.readInt();
		System.out.println("Please enter a Window title");
		String cheese = r_in.readLine();
		frame = new JFrame(cheese);
		frame.add(new starter());
		frame.setSize(width,600);
		frame.setVisible(true);
	}
	
	public starter()
	{
		Color a = new Color(0,255,0);
		setBackground(a);
		
		rect = new Rectangle2D.Double(xCoord,0,200,100);
		
		frame.addKeyListener(this);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.BLUE);
		g2.fill(rect);
		g.setColor(Color.BLACK);
		g.drawString("Press space to move rectangle",250,300);
	}
	
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			xCoord+=10;
			rect.setFrame(xCoord,rect.getY(),rect.getWidth(),rect.getHeight());	
			repaint();			
		}
	}

	public void keyReleased(KeyEvent e){}
	public void keyTyped(KeyEvent e){}
}

