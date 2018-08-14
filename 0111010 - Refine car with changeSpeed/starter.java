import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class starter extends JPanel implements Runnable, MouseListener
{
	static JFrame frame;
	
	Car redCar, blueCar;

	public static void main(String[] args) {
		frame = new JFrame("App");
		frame.add(new starter());
		frame.setUndecorated(true);
		frame.setSize(600,600);
		frame.setVisible(true);
	}
	
	public starter()
	{
		Color a = new Color(0,255,0);
		setBackground(a);
		
		redCar = new Car(0,200,"FERRARI",Color.RED,0.5);
		blueCar = new Car(0,400,"PRIUS",Color.BLUE,2);
		
		System.out.println("The red car will automatically speed up after recycling due to calls to changeSpeed()");
		System.out.println("The blue car will stop and start on click");
		frame.addMouseListener(this);
		Thread thread = new Thread(this);
		thread.start();//calls the run function
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		redCar.paint(g);
		blueCar.paint(g);
	}
	
	public void run()
	{
		while(true)
		{
			if(redCar.getX()>=600)
			{
				redCar.setLocation(-redCar.getWidth(),redCar.getY());
				redCar.changeSpeed(redCar.getSpeed()+2);
			}
			if(blueCar.getX()>=600)
				blueCar.setLocation(-blueCar.getWidth(),blueCar.getY());
			redCar.drive();
			blueCar.drive();
			repaint();
		
			try { Thread.sleep(15); }
			catch (InterruptedException e) { }
		}
	}
	public void mousePressed(MouseEvent e)
	{
		if(blueCar.contains(e.getX(), e.getY()))
		{
			if(blueCar.getSpeed() != 0)
				blueCar.changeSpeed(0.0);
			else
				blueCar.changeSpeed(2.0);
		}
	}
	public void mouseReleased(MouseEvent e){}  
	public void mouseClicked(MouseEvent e){} 
	public void mouseEntered(MouseEvent e){} 
	public void mouseExited(MouseEvent e){}
}

