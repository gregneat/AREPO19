import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class starter extends JPanel implements MouseListener,Runnable {
	
	private static Vehicle[] traffic;
	static JFrame frame;
	
	public static void main(String[] args) {
		frame = new JFrame("App");
		frame.add(new starter());
		frame.setUndecorated(true);
		frame.setSize(600,700);
		frame.setVisible(true);
	}
	
	public starter()
    {
		frame.addMouseListener(this);
		
		traffic = new Vehicle[5];
		int yStart = 50;
		for(int i=0; i<traffic.length;i++)
		{
			int r = (int)(Math.random()*255);
			int g = (int)(Math.random()*255);
			int b = (int)(Math.random()*255);
			Color temp = new Color(r,g,b);
			String s = "vehicle ";
				
			int sp = (int)(Math.random()*5)+1;
			int xStart = 5;
				
			int flip = (int)(Math.random()*2);
			if(flip == 0)
			{
				traffic[i] = new Truck(xStart,yStart,s+i,temp,sp);
			}
			else
			{
				traffic[i] = new Car(xStart,yStart,s+i,temp,sp);
			}
			yStart+=150;
		}	
		
		Thread thread = new Thread(this);
		thread.start();
	}
	
	public void run()
	{
		while(true)
		{
			for(int j =0; j< traffic.length; j++)
			{
				traffic[j].drive();
				if(traffic[j].getX() > 570)
				{
					traffic[j].setLocation(-200,traffic[j].getY());
				}
			}
			repaint();
			
			try { Thread.sleep(15); }
			catch (InterruptedException e) { }
		}	
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		for(int j =0; j< traffic.length; j++)
		{
			traffic[j].paint(g);
		}
		
		g.setColor(Color.BLACK);
		g.drawString("Click a vehicle to stop it",200,650);
	}

	public void mousePressed(MouseEvent e)
	{
		for(int i = 0; i<traffic.length;i++)
		{
			if(traffic[i].contains(e.getX(),e.getY()))
			{				
				traffic[i].changeSpeed(0);
			}
		}
	}
	
	public void mouseClicked(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
}
