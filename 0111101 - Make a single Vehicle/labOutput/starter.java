import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class starter extends JPanel implements MouseListener, Runnable {
	
	private Vehicle what;
	static JFrame frame;
	
	public static void main(String[] args) {
		frame = new JFrame("App");
		frame.add(new starter());
		frame.setUndecorated(true);
		frame.setSize(600,300);
		frame.setVisible(true);
	}
	
	public starter()
    {
		frame.addMouseListener(this);
			
		int r = (int)(Math.random()*255);
		int g = (int)(Math.random()*255);
		int b = (int)(Math.random()*255);
		Color temp = new Color(r,g,b);
		what = new Truck(30,30,"Neato",temp,10);	
		
		Thread thread = new Thread(this);
		thread.start();
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.BLACK);
		g.drawString("Click the vehicle to stop it", 200,200);
		
		what.paint(g);
	}
	
	public void run()
	{
		while(true)
		{
			what.drive();
		
			if(what.getX() > 570)
			{
				what.setLocation(-200,what.getY());
			}
			repaint();
			
			try { Thread.sleep(15); }
			catch (InterruptedException e) { }
		}	
	}	

	public void mousePressed(MouseEvent e)
	{
		if(what.contains(e.getX(),e.getY()))
		{				
			what.changeSpeed(0);
		}
	}
	
	public void mouseClicked(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
}
