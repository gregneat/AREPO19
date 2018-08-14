import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class starter extends JPanel implements Runnable
{
	static JFrame frame;
	
	int CAR_WIDTH=60;
	Car[] cars;

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
		
		String[] names = new String[]{"BOB","SUE","JOE","EDAN","RICKY","NEAT"};
		Color[] colors = new Color[]{Color.BLUE,Color.RED,Color.YELLOW,Color.PINK,Color.MAGENTA,Color.ORANGE};
		
		//this amount of cars will not overlap when recycled
		cars = new Car[6];
		for(int i=0;i<cars.length;i++)
		{
			int y = (int)(Math.random()*500);
			String name = names[i%6];
			Color color = colors[i%6];
			
			//makes sure cars start with car width gap between them
			cars[i] = new Car(-i*2*CAR_WIDTH,y,name,color,2);
		}
		
		Thread thread = new Thread(this);
		thread.start();//calls the run function
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		for(int i=0;i<cars.length;i++)
		{
			cars[i].paint(g);
		}

	}
	
	
	public void run()
	{
		while(true)
		{
			for(int i=0;i<cars.length;i++)
			{
				if(cars[i].getX()>=600)
				{
					//make car spawn at new location
					int y = (int)(Math.random()*500);
					
					//makes sure cars continue with car width gap between them
					cars[i].setLocation(-2*CAR_WIDTH,y);
				}
				cars[i].drive();
			}
			repaint();
			
		
			try { Thread.sleep(15); }
			catch (InterruptedException e) { }
		}
	}
}

