import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class starter extends JPanel implements MouseListener
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
		
		frame.addMouseListener(this);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.BLUE);
		g2.fill(rect);
		g.setColor(Color.BLACK);
		g.drawString("Click to move rectangle",250,300);
	}
	
	public void mouseClicked(MouseEvent e)
	{
		xCoord = xCoord+10;
		rect.setFrame(xCoord,100,rect.getWidth(),rect.getHeight());
		repaint();
	}
	
	public void mouseReleased(MouseEvent e){}  
	public void mousePressed(MouseEvent e){} 
	public void mouseEntered(MouseEvent e){} 
	public void mouseExited(MouseEvent e){}

}

