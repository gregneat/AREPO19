import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;


public class starter extends JPanel implements Runnable, MouseListener {
	
	private Truck[] trucks = new Truck[3];
	private Car[] cars = new Car[2];
	
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
		
		String[] names = new String[]{"vehicle1","vehicle2","vehicle3"};
		int yStart = 0;
		for(int i=0;i<trucks.length;i++)
		{
			trucks[i] = new Truck(5,yStart,names[i],getRandomColor(),getRandomSpeed());
			yStart+=150;
		}
		
		String[] names2 = new String[]{"vehicle4","vehicle5"};
		for(int i=0;i<cars.length;i++)
		{
			cars[i] = new Car(5,yStart,names2[i],getRandomColor(),getRandomSpeed());
			yStart+=150;
		}
		
		Thread thread = new Thread(this);
		thread.start();
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		for(int j =0; j< trucks.length; j++)
		{
			trucks[j].paint(g);
		}
		
		for(int j =0; j< cars.length; j++)
		{
			cars[j].paint(g);
		}
	}
	
	public void run()
	{
		while(true)
		{
			for(int i=0;i<trucks.length;i++)
			{
				trucks[i].drive();
				
				if(trucks[i].getX() > 600)
				{
					trucks[i].setLocation(-trucks[i].getWidth(),trucks[i].getY());
				}
			}
			
			for(int i=0;i<cars.length;i++)
			{
				cars[i].drive();
				
				if(cars[i].getX() > 600)
				{
					cars[i].setLocation(-cars[i].getWidth(),cars[i].getY());
				}
			}
			repaint();
			
			try { Thread.sleep(15); }
			catch (InterruptedException e) { }
		}	
	}
			
	public void mouseClicked(MouseEvent e)
	{
		for(int i=0;i<trucks.length;i++)
		{
			if(trucks[i].contains(e.getX(),e.getY()))
			{
				trucks[i].changeSpeed(0);
				System.out.print(trucks[i].getName() + " " +trucks[i].getSpeed());
			}
		}
			
		for(int i=0;i<cars.length;i++)
		{
			if(cars[i].contains(e.getX(),e.getY()))
			{
				cars[i].changeSpeed(0);
				System.out.print(cars[i].getName() + " " +cars[i].getSpeed());
			}
		}
	}
		
	public Color getRandomColor()
	{
		int r = (int)(Math.random()*255);
		int g = (int)(Math.random()*255);
		int b = (int)(Math.random()*255);
		return new Color(r,g,b);
	}
		
	public int getRandomSpeed()
	{
		return (int)(Math.random()*5)+1;
	}
		
		public void mousePressed(MouseEvent e){}
		public void mouseReleased(MouseEvent e){}
		public void mouseExited(MouseEvent e){}
		public void mouseEntered(MouseEvent e){}
}
