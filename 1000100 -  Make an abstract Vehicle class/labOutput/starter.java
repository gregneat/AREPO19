import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;

public class starter extends JPanel implements Runnable{
	
	static JFrame frame;
	
	public static void main(String[] args) 
	{
		frame = new JFrame("App");
		frame.add(new starter());
		frame.setSize(600,600);
		frame.setVisible(true);
	}
	
	AbstractVehicle b;
	AbstractVehicle c;
	Car d;
	public starter()
	{
		//AbstractVehicle a = new Abstract Vehicle(50,50);
		
		b = new Car(50,120);
		b.printSuperClass();
		b.printVehicleType();
		System.out.println(b.printInitialPosition());
		
		c = new Truck(50,200);
		c.printSuperClass();
		c.printVehicleType();
		System.out.println(c.printInitialPosition());
		
		d = new Car(50,380);
		// d.printSuperClass();
		// d.printVehicleType();
		// System.out.println(d.printInitialPosition());
		
		Thread thread = new Thread(this);
		thread.start();
	}

	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		
		b.paint(g);
		
		c.paint(g);
		
		d.paint(g);
	}
	
	public void run()
	{
		while(true)
		{
			b.drive();
			if(b.getX() > 570)
			{
				b.setLocation(-200,b.getY());
			}
			
			c.drive();
			if(c.getX() > 570)
			{
				c.setLocation(-200,c.getY());
			}
			
			d.drive();
			if(d.getX() > 570)
			{
				d.setLocation(-200,d.getY());
			}
			
			repaint();
			
			try { Thread.sleep(15); }
			catch (InterruptedException e) { }
		}
	}
	
}