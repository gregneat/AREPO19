import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class starter extends JPanel implements Runnable
{
	static JFrame frame;
	
	Rectangle2D.Double[] rects;
	String[] names;

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
		
		rects = new Rectangle2D.Double[7];
		for(int i=0;i<rects.length;i++)
		{
			int y = (int)(Math.random()*500);
			
			//makes sure rects start with rect width gap between them
			rects[i] = new Rectangle2D.Double(-i*2*50,y,50,50);
		}
		
		names = new String[]{"BOB","SUE","JOE"};
		
		Thread thread = new Thread(this);
		thread.start();//calls the run function
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		
		for(int i=0;i<rects.length;i++)
		{
			Color[] colors = new Color[] {Color.BLUE, Color.YELLOW, Color.RED};
			g2.setColor(colors[i%3]);
			g2.fill(rects[i]);
			
			g.setColor(Color.BLACK);
			//String name = "JOE";
			String name = names[i%3];
			g.drawString(name,(int)rects[i].getX()+10,(int)rects[i].getY()+30);
		
			String coords = "("+(int)rects[i].getX()+","+(int)rects[i].getY()+")";
			g.drawString(coords,(int)rects[i].getX(),(int)rects[i].getY()-10);
		}

	}
	
	
	public void run()
	{
		while(true)
		{
			for(int i=0;i<rects.length;i++)
			{
				double x = rects[i].getX()+2;
				double y = rects[i].getY();
				
				if(x>=600)
				{
					//make it spawn at new y location
					y = (int)(Math.random()*500);
					
					//makes sure gap between rects stays constant
					x= -2*rects[i].getWidth();
				}
				rects[i].setFrame(x,y,rects[i].getWidth(),rects[i].getHeight());
			}
			repaint();
			
		
			try { Thread.sleep(15); }
			catch (InterruptedException e) { }
		}
	}
}

