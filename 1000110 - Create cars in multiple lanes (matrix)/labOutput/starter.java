import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;


public class starter extends JPanel implements Runnable{
	
	Car[][] cars;
	Road[] roads;
	double[] maxSpeeds;
	
	static JFrame frame;
	
	public static void main(String[] args) {
		frame = new JFrame("App");
		frame.add(new starter());
		frame.setUndecorated(true);
		frame.setSize(800,600);
		frame.setVisible(true);
	}
	
	public starter()
    {
		int numOfRows = 600/(Car.CARHEIGHT+30);
		int numOfCol = 800/(Car.CARWIDTH+50);
	
		cars = new Car[numOfRows][numOfCol];
		roads = new Road[numOfRows];
		
		int xStart=0;
		int yStart=30;
		for(int i=0;i<cars.length;i++)
		{
			for(int j=0;j<cars[0].length;j++)
			{
				int num = i*cars[0].length+j;
				cars[i][j] = new Car(xStart,yStart,"car "+num,getRandomColor(),getRandomSpeed());
				xStart+=Car.CARWIDTH+50;
			}
			xStart=0;
			yStart+=Car.CARHEIGHT+30;
		}
		
		for(int i=0; i<roads.length; i++)
		{
			roads[i] = new Road(0,i*85,800,85);
		}
		
		Thread thread = new Thread(this);
		thread.start();
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		for(int i=0; i<roads.length; i++)
		{
			roads[i].paint(g);
		}
		
		for(int i=0;i<cars.length;i++)
		{
			for(int j=0;j<cars[0].length;j++)
			{
				cars[i][j].paint(g);
			}
		}
		
		
		
	}
	
	public void run()
	{
		while(true)
		{
			for(int i=0;i<cars.length;i++)
			{
				for(int j=0;j<cars[0].length;j++)
				{
					cars[i][j].drive();
				
					if(cars[i][j].getX() > 800)
					{
						cars[i][j].setLocation(-cars[i][j].getWidth(),cars[i][j].getY());
					}
				}
			}
			
			repaint();
			
			try { Thread.sleep(15); }
			catch (InterruptedException e) { }
		}	
	}
	
	public Color getRandomColor()
	{
		int r = (int)(Math.random()*255);
		int g = (int)(Math.random()*255);
		int b = (int)(Math.random()*255);
		return new Color(r,g,b);
	}
		
	public double getRandomSpeed()
	{
		return (Math.random()*5)+1;
	}
}
