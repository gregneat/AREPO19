import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class starter extends JPanel implements Runnable{
	
	private static Truck[] traffic;
	static JFrame frame;
	
	public static void main(String[] args) {
		frame = new JFrame("App");
		frame.add(new starter());
		frame.setUndecorated(true);
		frame.setSize(600,900);
		frame.setVisible(true);
	}
	
	public starter()
	{	
		traffic = new Truck[5];
		int yStart = 0;
		for(int i=0; i<traffic.length;i++)
		{
			int r = (int)(Math.random()*255);
			int g = (int)(Math.random()*255);
			int b = (int)(Math.random()*255);
			Color temp = new Color(r,g,b);
			String s = "Truck ";
			// make all cars go speed 1 to check average calc
			int sp = (int)(Math.random()*5)+1;
			int xStart = 5;
			
			traffic[i] = new Truck(xStart,yStart, s+i,temp,sp);
			yStart+=150;
		}
		Thread thread = new Thread(this);
		thread.start();
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		for(int j =0; j< traffic.length; j++)
		{
			traffic[j].paint(g);
		}
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
}
