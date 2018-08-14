import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;

public class GameShow extends JPanel implements Runnable,MouseListener,KeyListener{
	
	Player p;
	Car[] arr;
	Thread runner;
	int x,count;
	boolean lose,win;
	static JFrame frame;
	
	public static void main(String[] args) {
		frame = new JFrame("App");
		frame.add(new GameShow());
		frame.setSize(1200,600);
		frame.setVisible(true);
	}
	
	public GameShow()
	{
		setBackground(Color.GREEN);
		p = new Player(50,300);
		
		arr = new Car[100];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = new Car(1200+100*i,(int)(600*Math.random()));
		}
		x=1300+(arr.length-1)*100;
		frame.addMouseListener(this);
	}
	
	
	public void mouseClicked(MouseEvent e)
	{
		count++;
		if(count==2)
		{
			frame.addKeyListener(this);
			runner = new Thread(this);
			runner.start();
		}
	} 
 
	//this method is called by runner.start() in the init method and starts a java thread
	//this is the time based part of the code so the blocks can fall without mouse input
	public void run() {
		//end is the position of the block that starts farthest up plus length of applet
		int end = 0;
		while (!win && !lose && x>end) 
		{
			x-=4;
			setScreen();
			repaint();
			
			//this part pauses the method for 15 milliseconds so it appears the blocks are falling
			try { Thread.sleep(15); }
			catch (InterruptedException e) { }
		}
		
		if(p.getY()<=-40||p.getY()>=600)
		{
			lose=true;
			repaint();
		}
		else
		{
			win=true;
			repaint();
		}
	}
	
	//repaints all the objects in the applet
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
	
		if(count<2)
		{
			g.drawString("Double click to start",500,100);
			g.drawString("Use up and down arrow keys to move",500,120);
		}
	
		p.paint(g);
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i].paint(g);
		}
		
		if(lose)
		{
			frame.removeKeyListener(this);
			g.setColor(Color.BLACK);
			g.drawString("GAME OVER",500,100);
		}
		else if(win)
		{
			frame.removeKeyListener(this);
			g.setColor(Color.BLACK);
			g.drawString("YOU WIN!!",500,100);
		}
	}
	
	//this method sets the new position of the falling blocks
	//it also checks if the car intersects the falling blocks
	public void setScreen()
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i].drive(4);
			
			if(p.crash(arr[i]))
			{
				lose = true;
				repaint();
			}
		}
	}
	
	//moving the car object with keys
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyCode() == KeyEvent.VK_UP)
		{
			p.setLocation(p.getX(),p.getY()-10);
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			p.setLocation(p.getX(),p.getY()+10);	
		}
		repaint();
	}
	
	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}
	public void mouseReleased(MouseEvent e){}  
	public void mousePressed(MouseEvent e){} 
	public void mouseEntered(MouseEvent e){} 
	public void mouseExited(MouseEvent e){}

	
}