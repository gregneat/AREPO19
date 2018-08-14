import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class starter extends JPanel implements Runnable, MouseListener
{
	//private variables
	static JFrame frame;
	
	int CAR_WIDTH=60;
	Car[] cars;
	Road[] roads;
	
	public static void main(String[] args)
	{
		frame = new JFrame("App");
		frame.add(new starter());
		frame.setUndecorated(true);
		frame.setSize(600,600);
		frame.setVisible(true);
	}
	//creates all objects
	public starter()
	{	
		Color a = new Color(0,255,0);
		setBackground(a);
		
		roads = new Road[10];
		makeRoads();
		cars = new Car[100];
		makeCars();
		//printFastestCar();
		//printAverageSpeed();
		System.out.println("Click on a car for that car's information");
		
		frame.addMouseListener(this);
		Thread thread = new Thread(this);
		//calls the run function
		thread.start();
	}
	
	public void makeRoads()
	{
		for(int i=0; i<roads.length; i++)
			roads[i] = new Road(i*60,600,50);
	}
	//makes cars on a random road
	public void makeCars()
	{
		String[] names = new String[]{"BOB","SUE","JOE"};
		Color[] colors = new Color[]{Color.BLUE,Color.RED,Color.GREEN};
		
		for(int i=0; i<cars.length; i++)
		{
			String name = names[(int)(Math.random()*names.length)];
			Color color = colors[(int)(Math.random()*colors.length)];
			double speed = Math.random()*10;
			cars[i] = new Car(-i*CAR_WIDTH,roads[(int)(Math.random()*roads.length)].getY()-10,name,color,speed);
		}
	}
	
	//called by repaint
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		//important to paint roads first so that the cars are not hidden
		for(int i=0; i<roads.length; i++)
			roads[i].paint(g);
		for(int i=0; i<cars.length; i++)
			cars[i].paint(g);
	}
	
	public void run()
	{
		while(true)
		{
			for(int i=0;i<cars.length;i++)
			{
				//recycles cars if they go off screen
				if(cars[i].getX() >= 600)
				{
					cars[i].setLocation(-90*CAR_WIDTH,roads[(int)(Math.random()*roads.length)].getY()-10);
				}
				cars[i].drive();
			}
			repaint();
		
			try { Thread.sleep(15); }
			catch (InterruptedException e) { }
		}
	}
	public void printFastestCar()
	{
		Car fastest = new Car();
		double topSpeed = 0.0;
		for(int i=0; i<cars.length; i++)
		{
			if(cars[i].getSpeed() > topSpeed)
			{
				topSpeed = cars[i].getSpeed();
				fastest = cars[i];
			}	
		}	
		System.out.println("The fastest car is "+fastest.getName()+". "+fastest.stringSpeed());
	}
	public void printAverageSpeed()
	{
		double[] speeds = new double[cars.length];
		double sum = 0;
		for(int i=0; i<speeds.length; i++)
		{
			speeds[i] = cars[i].getSpeed();
			sum += speeds[i];
		}	
		//rounds to hundredths place
		double roundedAverage = (int)(((sum/0.015)/(double)(speeds.length))*100)/100.0;
		System.out.println("The average speed of all the cars is: "+roundedAverage+" pixels per second.");
	}
	//more accurate when frame.setUndecorated(true) is called (line 19)
	public void mousePressed(MouseEvent e)
	{
		//reverse loop and break ensures that only the info from the top car gets displayed
		for(int i=cars.length-1; i>=0; i--)
		{
			if(cars[i].contains(e.getX(), e.getY()))
			{
				System.out.println(cars[i]);
				break;
			}
		}
	}
	public void mouseReleased(MouseEvent e){}  
	public void mouseClicked(MouseEvent e){} 
	public void mouseEntered(MouseEvent e){} 
	public void mouseExited(MouseEvent e){}
}