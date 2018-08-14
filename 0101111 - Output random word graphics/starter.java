import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

class starter extends JPanel implements Runnable
{
	static JFrame frame;
	
	Rectangle2D.Double rect;
	int xCoord;
	EasyReader infile;
	String randomWord;
	
	public static void main(String[] args) {
		frame = new JFrame("App");
		frame.add(new starter());
		frame.setSize(600,600);
		frame.setVisible(true);
	}
	public starter()
	{
		infile = new EasyReader("mobydick.txt");
		randomWord = getRandomWord(infile);
		//System.out.print("\nThere are "+countWhales(infile)+" whale occurances in Moby Dick.\n#Savethewhales\n");
		//System.out.print("\nA random word from Moby Dick is "+getRandomWord(infile));
		System.out.print("\nThe rectangle will display a random word from Moby Dick on each recycle");
		
		Color a = new Color(0,255,0);
		setBackground(a);
		
		xCoord=0;
		rect = new Rectangle2D.Double(xCoord,100,50,50);
		
		Thread thread = new Thread(this);
		thread.start();
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.BLUE);
		g2.fill(rect);
		
		g.setColor(Color.WHITE);
		g.drawString(randomWord,(int)rect.getX(),(int)rect.getY()+30);
		
		g.setColor(Color.BLACK);
		String coords = "("+(int)rect.getX()+","+(int)rect.getY()+")";
		g.drawString(coords,(int)rect.getX(),(int)rect.getY()-10);
	}
	
	public void run()
	{
		while(true)
		{
			if(xCoord>=600)
			{
				xCoord=-50;
				//new code
				infile = new EasyReader("mobydick.txt");
				randomWord = getRandomWord(infile);
			}
			
			xCoord+=2;
			rect.setFrame(xCoord,100,50,50);
			repaint();
		
			try { Thread.sleep(15); }
			catch (InterruptedException e) { }
		}
	}
	public static int countWhales(EasyReader file)
	{
		int numOfWhales = 0;
		while(!file.eof())
		{
			String currentWord = file.readWord();
			if(currentWord!=null && (currentWord.contains("whale") || currentWord.contains("Whale") || currentWord.contains("whaling") || currentWord.contains("Whaling")))
			   numOfWhales++;
		}
		return numOfWhales;
	}
	//good time for arraylists?
	public static String getRandomWord(EasyReader file)
	{
		ArrayList<String> words = new ArrayList<String>();
		while(!file.eof())
		{
			String currentWord = file.readWord();
			if(currentWord != null)
			   words.add(currentWord);
		}
		String randomWord = "";
		//while loop that checks condition at the end
		do
		{
			randomWord = words.get((int)(Math.random()*words.size()));
		}
		while(!checkPunctaution(randomWord));
		return randomWord;
	}
	//checks for excess punctuation and empty words
	public static boolean checkPunctaution(String word)
	{
		return !word.contains(",") && !word.contains(".") && 
		       !word.contains("!") && !word.contains("?") &&
			   !word.contains("--") && word.length() > 0;
	}
}