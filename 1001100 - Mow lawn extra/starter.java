import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;

public class starter extends JPanel implements Runnable
{
	static JFrame frame;
	Car car;
	ArrayList<Rectangle2D.Double> cutGrass;
	boolean isMovingRight = true;
	boolean isMovingLeft = false;

	public static void main(String[] args)
	{
		frame = new JFrame("App");
		frame.add(new starter());
		frame.setSize(600,600);
		frame.setVisible(true);
	}
	
	public starter()
	{
		// Color a = new Color(0,255,0);
		setBackground(Color.GREEN);	
		car = new Car(0,20,"JOE");
		cutGrass = new ArrayList<Rectangle2D.Double>();
		Thread thread = new Thread(this);
		//calls the run function
		thread.start();
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(new Color(25,100,0));
		for(int i=0; i<cutGrass.size(); i++)
		{
			if(i==cutGrass.size()-1 && isMovingRight)
				cutGrass.get(i).setFrame(0,car.getY()-20,car.getX(),car.getHeight());
			else if(i==cutGrass.size()-1 && isMovingLeft)
				cutGrass.get(i).setFrame(car.getX()+60,car.getY()-20,600-car.getWidth()-car.getX(),car.getHeight());
			g2.fill(cutGrass.get(i));
		}
		car.paint(g);
	}
	
	public void run()
	{
		while(true)
		{
			if(cutGrass.size() == 0)
				cutGrass.add(new Rectangle2D.Double(0,car.getY()-20,0,car.getHeight()));
			if(car.getX() >= 600)
			{
				car.setLocation(600-car.getWidth(),car.getY()+car.getHeight());
				cutGrass.add(new Rectangle2D.Double(600,car.getY()-20,0,car.getHeight()));
				isMovingLeft = true;
				isMovingRight = false;
			}
			else if(car.getX() <= -60)
			{
				car.setLocation(0,car.getY()+car.getHeight());
				cutGrass.add(new Rectangle2D.Double(0,car.getY()-20,0,car.getHeight()));
				isMovingRight = true;
				isMovingLeft = false;
			}
			if(isMovingRight)
				car.drive(2);
			else if(isMovingLeft)
				car.drive(-2);
			
			repaint();
			try { Thread.sleep(15); }
			catch (InterruptedException e) { }
		}
	}
}