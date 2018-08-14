import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class starter extends JPanel implements Runnable
{
	static JFrame frame;
	
	Rectangle2D.Double rect;
	int xCoord;
	
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
		
		xCoord=0;
		rect = new Rectangle2D.Double(xCoord,100,50,50);
		
		Thread thread = new Thread(this);
		thread.start();//calls the run function
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.BLUE);
		g2.fill(rect);
		
		g.setColor(Color.BLACK);
		String coords = "("+(int)rect.getX()+","+(int)rect.getY()+")";
		g.drawString(coords,(int)rect.getX(),(int)rect.getY()-10);
	}
	
	
	public void run()
	{
		while(true)
		{
			xCoord = xCoord+2;
			rect.setFrame(xCoord,100,50,50);
			repaint();
		
			try { Thread.sleep(15); }
			catch (InterruptedException e) { }
		}
	}
	
	public void mouseReleased(MouseEvent e){}  
	public void mousePressed(MouseEvent e){} 
	public void mouseEntered(MouseEvent e){} 
	public void mouseExited(MouseEvent e){}

}

