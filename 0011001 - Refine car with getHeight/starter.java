import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class starter extends JPanel implements Runnable
{
	static JFrame frame;
	
	Car car;

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
		
		car = new Car(0,300,"JOE");
		
		System.out.print("The car's height is "+car.getHeight());
		Thread thread = new Thread(this);
		thread.start();//calls the run function
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		car.paint(g);

	}
	
	
	public void run()
	{
		while(true)
		{
			if(car.getX()>=600)
			{
				car.setLocation(-car.getWidth(),car.getY());
			}
			car.drive(2);
			repaint();
			
		
			try { Thread.sleep(15); }
			catch (InterruptedException e) { }
		}
	}
}

