import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;


public class starter extends JPanel implements Runnable, MouseListener {
	
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
		frame.addMouseListener(this);
		
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
		
		g.setFont(new Font("SERIF",Font.PLAIN,30));
		g.setColor(Color.WHITE);
		g.drawString("Click screen to see effect",200,280);
		
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
	
	public void fixTraffic()
	{
		determineMaxSpeeds();
		organizeLanes();
		setOriginalPositions();
		repaint();
		
		for(int i=0;i<maxSpeeds.length;i++)
		{
			System.out.println("The speed of lane "+i+ " is: "+cars[i][0].getSpeed());
		}
		
	}
	
	public void determineMaxSpeeds()
	{
		maxSpeeds = new double[cars.length];
		for(int i=0;i<cars.length;i++)
		{
			for(int j=0;j<cars[0].length;j++)
			{
				if(cars[i][j].getSpeed()>maxSpeeds[i])
				{
					maxSpeeds[i] = cars[i][j].getSpeed();
				}
			}
		}
		
		for(int i=0;i<cars.length;i++)
		{
			for(int j=0;j<cars[0].length;j++)
			{
				if(cars[i][j].getSpeed()<maxSpeeds[i])
				{
					cars[i][j].changeSpeed(maxSpeeds[i]);
				}
			}
		}
	}
	
	public void setOriginalPositions()
	{
		int xStart=0;
		int yStart=30;
		for(int i=0;i<cars.length;i++)
		{
			for(int j=0;j<cars[0].length;j++)
			{
				int num = i*cars[0].length+j;
				cars[i][j] = new Car(xStart,yStart,"car "+num,cars[i][j].getColor(),cars[i][j].getSpeed());
				xStart+=Car.CARWIDTH+50;
			}
			xStart=0;
			yStart+=Car.CARHEIGHT+30;
		}
	}
	
	public void organizeLanes()
	{
		for (int i = 0; i < maxSpeeds.length; i++) 
		{
            for (int j = i+1; j < maxSpeeds.length; j++) 
			{
                if (maxSpeeds[i] < maxSpeeds[j]) 
				{
                    double temp = maxSpeeds[j];
					maxSpeeds[j] = maxSpeeds[i];
                    maxSpeeds[i] = temp;
					
					for(int k=0;k<cars[0].length;k++)
					{
						Car flip = cars[j][k];
						cars[j][k] = cars[i][k];
						cars[i][k] = flip;
					}
                }
            }
		}
	}
			
	public void mouseClicked(MouseEvent e)
	{
		fixTraffic();
		System.out.println("Traffic has been solved");
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
		
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
}
