import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class starter extends JPanel implements KeyListener
{
	//private variables
	static JFrame frame;
	Player p;
	int xCoord=50,yCoord=50;

	public static void main(String[] args)
	{
		frame = new JFrame("App");
		frame.add(new starter());
		frame.setSize(600,600);
		frame.setVisible(true);
	}
	//creates all objects
	public starter()
	{	
		Color a = new Color(0,255,0);
		setBackground(a);
		
		p = new Player(xCoord,yCoord);
		frame.addKeyListener(this);
	}
	
	//called by repaint
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		p.paint(g);
		
		g.setColor(Color.BLACK);
		g.drawString("Use WASD to move player",200,300);
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
		p.setLocation(xCoord,yCoord);
		repaint();
	}
	
	public void keyReleased(KeyEvent e){}  
	public void keyTyped(KeyEvent e){} 
}