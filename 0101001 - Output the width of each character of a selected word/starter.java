import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class starter extends JPanel
{
	static JFrame frame;
	
	String word;
	
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
		
		System.out.print("Please enter a word: ");
		EasyReader in = new EasyReader();
		word = in.readWord();
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		FontMetrics metrics = g.getFontMetrics(g.getFont());
		
		for(int i=0;i<word.length();i++)
		{
			int width = metrics.stringWidth(word.substring(i,i+1));
			g.drawString(word.substring(i,i+1)+ ": "+width,50,50+i*20);
		}
		
	}

}

