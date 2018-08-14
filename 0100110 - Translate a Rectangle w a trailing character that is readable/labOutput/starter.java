import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.util.ArrayList;

public class starter extends JPanel implements Runnable
{
	static JFrame frame;
	
	Rectangle2D.Double rect;
	int startPos=50;
	int xCoord=startPos;
	String word;
	FontMetrics metrics;
	ArrayList<String> words = new ArrayList<String>();
	
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
		
		rect = new Rectangle2D.Double(xCoord,100,50,50);
		
		System.out.print("Please enter a word: ");
		EasyReader in = new EasyReader();
		word = in.readWord();
		
		Thread thread = new Thread(this);
		thread.start();
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.BLACK);
		String name = "JOE";
		g.drawString(name,(int)rect.getX()+10,(int)rect.getY()+30);
		
		String coords = "("+(int)rect.getX()+","+(int)rect.getY()+")";
		g.drawString(coords,(int)rect.getX(),(int)rect.getY()-10);
		
		metrics = g.getFontMetrics(g.getFont());
		int width = metrics.stringWidth(word);
		
		if((rect.getX()-startPos)%width==0)
		{
			words.add(word);
		}
		
		for(int i=0;i<words.size();i++)
		{
			g.drawString(words.get(i),startPos+width*i,(int)rect.getY()+15);
		}
		
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.BLUE);
		g2.fill(rect);
		
	}
	
	
	public void run()
	{
		while(xCoord<570)
		{
			xCoord+=1;
			rect.setFrame(xCoord,100,50,50);
			repaint();
		
			try { Thread.sleep(15); }
			catch (InterruptedException e) { }
		}
	}


}

