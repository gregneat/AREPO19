import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class TestContain extends JPanel implements MouseListener,MouseMotionListener
{
	Rectangle2D.Double rect;
	boolean click;
	double a,b;
	static JFrame frame;
	Color color = Color.BLUE;
	
	public static void main(String[] args) 
	{
		frame = new JFrame("TestContain");
		frame.add(new TestContain());
		frame.setSize(600,300);
		
		frame.setUndecorated(true);
		frame.setVisible(true);
		
	}
	  
	public TestContain()
	{
		setBackground(Color.GREEN);
		rect = new Rectangle2D.Double(40,40,50,50);
		System.out.print("\nClick rect to change its color\n\nHold and move mouse to drag rect");
		
		frame.addMouseListener(this);
		frame.addMouseMotionListener(this);
	}
  
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		//must use graphics2D for shapes
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(color);
		g2.fill(rect);
		
		g.setColor(Color.BLACK);
		g.drawString("Drag the rectangle",100,200);
	}
  
	//must use all the methods of the MouseListener and MouseMotionListener interfaces
	public void mousePressed(MouseEvent e)
	{
		if(rect.contains(e.getX(),e.getY()))
		{
			click=true;
			a = e.getX()-rect.getX();
			b = e.getY()-rect.getY();
		}
	}
	
	public void mouseDragged(MouseEvent e)
	{
		if(click)
		{
			rect.setFrame(e.getX()-a,e.getY()-b,50,50);
			repaint();
		}
		
	}
	public void mouseReleased(MouseEvent e)
	{
		click=false;
	}  
    public void mouseClicked(MouseEvent e)
	{
		if(rect.contains(e.getX(),e.getY()))
			color = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
		repaint();
	}
	
	//must be implemented but do not have to be used
	public void mouseEntered(MouseEvent e){} 
	public void mouseExited(MouseEvent e){}
	public void mouseMoved(MouseEvent e){}
	
}

