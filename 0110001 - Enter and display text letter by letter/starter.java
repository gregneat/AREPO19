import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.util.ArrayList;

public class starter extends JPanel implements KeyListener
{
	static JFrame frame;
	String letters="";
	
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
		
		frame.addKeyListener(this);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.drawString(letters,100,200);
	}
	
	public void keyTyped(KeyEvent e)
	{
		char cc = e.getKeyChar();
		String c = Character.toString(cc);
		
		letters+= c+" ";
		System.out.println("You typed: "+c);
		repaint();
	}
	
	public void keyReleased(KeyEvent e){}
	public void keyPressed(KeyEvent e){}
}

