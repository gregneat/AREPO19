import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class starter extends JPanel
{
	//private variables
	static JFrame frame;
	Player p;

	public static void main(String[] args)
	{
		frame = new JFrame("App");
		frame.add(new starter());
		frame.setSize(600,600);
		frame.setVisible(true);
	}
	//creates all objects
	public starter()
	{	
		Color a = new Color(0,255,0);
		setBackground(a);
	
		p = new Player(50,50);
	}
	
	//called by repaint
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		p.paint(g);
	}
	
	

}