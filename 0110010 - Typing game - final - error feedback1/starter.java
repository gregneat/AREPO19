 import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.util.ArrayList;

public class starter extends JPanel implements Runnable, KeyListener
{
	static JFrame frame;
	
	//user part
	String phrase = "crescenta valley";
	String answer="";
	String endPhrase="";
	boolean gameOver;
	
	//behind the scenes
	Rectangle2D.Double rect;
	int startPos=50;
	int xCoord=startPos;
	int counter=0;
	double spacing;
	FontMetrics metrics;
	ArrayList<String> letters = new ArrayList<String>();
	ArrayList<Integer> widths = new ArrayList<Integer>();

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
		
		frame.addKeyListener(this);
		Thread thread = new Thread(this);
		thread.start();
	}
	
	public void run()
	{
		while(!gameOver)
		{
			xCoord+=1;
			rect.setFrame(xCoord,100,50,50);
			repaint();
		
			try { Thread.sleep(50); }
			catch (InterruptedException e) { }
		}
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.drawString("Press enter to submit",200,20);
		
		g.setColor(Color.BLACK);
		String name = "JOE";
		g.drawString(name,(int)rect.getX()+10,(int)rect.getY()+30);
		
		String coords = "("+(int)rect.getX()+","+(int)rect.getY()+")";
		g.drawString(coords,(int)rect.getX(),(int)rect.getY()-10);
	
	
		metrics = g.getFontMetrics(g.getFont());
		
		//set first checkpoint for rect to pass
		if(counter==0)
		{
			spacing = startPos+getWidth(phrase.substring(0,1));
		}
		
		//checks if rect passed next letter
		if(rect.getX()==spacing&&counter<phrase.length())
		{
			letters.add(phrase.substring(counter,counter+1));
			int width = getWidth(phrase.substring(counter,counter+1));
			widths.add(width);
			counter++;
			spacing+=width;
		}
		
		//draws all letter
		int sum=0;
		for(int i=0;i<letters.size();i++)
		{
			g.drawString(letters.get(i),startPos+sum,(int)rect.getY()+15);
			sum+=widths.get(i);
		}
		
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.BLUE);
		g2.fill(rect);
		
		g.setColor(Color.BLACK);
		g.drawString("Start: "+answer,50,200);
		
		if(gameOver)
		{
			frame.removeKeyListener(this);
			g.drawString(endPhrase,200,300);
		}
	}
	
	public void keyTyped(KeyEvent e)
	{
		char cc = e.getKeyChar();
		String c = Character.toString(cc);
		
		char done = (char)10;
		String enter = Character.toString(done);
			
		//press enter to be done
		if(c.equals(enter))
		{
			gameOver = true;
			if(answer.equals(phrase))
			{
				endPhrase="CORRECT";
				repaint();
			}
			else
			{
				endPhrase = "INCORRECT";
				repaint();
			}
		}
		answer+=c;
		
		//check for shift
		// if(e.getKeyCode()!=KeyEvent.VK_SHIFT)
		// {}

		
	}
	
	public int getWidth(String a)
	{
		return metrics.stringWidth(a);
	}
	
	public void keyReleased(KeyEvent e){}
	public void keyPressed(KeyEvent e){}
}

