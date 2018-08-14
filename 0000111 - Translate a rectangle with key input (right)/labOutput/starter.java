import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class starter extends JPanel implements KeyListener
{
	static JFrame frame;
	
	Rectangle2D.Double rect;
	int xCoord=200, yCoord=200;
	String key;
	
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
		
		rect = new Rectangle2D.Double(xCoord,yCoord,50,50);
		
		frame.addKeyListener(this);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.BLUE);
		g2.fill(rect);
		g.setColor(Color.BLACK);
		g.drawString("Use WASD to move rectangle",200,300);
		
		g.drawString("You pressed: "+key, 250,50);
	}
	
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyCode() == KeyEvent.VK_W)
		{
			yCoord = yCoord-10;
		}
		if(e.getKeyCode() == KeyEvent.VK_A)
		{
			xCoord = xCoord-10;
		}
		if(e.getKeyCode() == KeyEvent.VK_S)
		{
			yCoord = yCoord+10;
		}
		if(e.getKeyCode() == KeyEvent.VK_D)
		{
			xCoord = xCoord+10;
		}
		
		char a = e.getKeyChar();
		key = Character.toString(a);

		rect.setFrame(xCoord,yCoord,rect.getWidth(),rect.getHeight());
		repaint();
	}
	
	public void keyReleased(KeyEvent e){}  
	public void keyTyped(KeyEvent e){} 

}

