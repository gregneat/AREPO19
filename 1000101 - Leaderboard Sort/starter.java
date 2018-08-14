import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class starter extends JPanel implements Runnable, MouseListener
{
	//private variables
	static JFrame frame;
	
	int CAR_WIDTH = 60;
	int Xpos;
	Car[] cars;
	Road[] roads;
	Color buttonColor;
	Rectangle2D.Double button;
	boolean viewBoard = false;
	String text;
	
	public static void main(String[] args)
	{
		frame = new JFrame("App");
		frame.add(new starter());
		frame.setUndecorated(true);
		frame.setSize(900,700);
		frame.setVisible(true);
	}
	public starter()
	{	
		begin();
		frame.addMouseListener(this);
		Thread thread = new Thread(this);
		//calls the run function
		thread.start();
	}
	//creates race
	public void begin()
	{
		setBackground(Color.GREEN);
		buttonColor = Color.WHITE;
		button = new Rectangle2D.Double(350,600,200,100);
		text = "View Leaderboard";
		Xpos = -CAR_WIDTH;
		roads = new Road[10];
		makeRoads(0,900);
		cars = new Car[10];
		makeCars();
	}
	public void makeRoads(double dx, double length)
	{
		for(int i=0; i<roads.length; i++)
			roads[i] = new Road(dx,i*60,length,50);
	}
	//makes cars on a random road
	public void makeCars()
	{
		//users can add colors or names
		String[] names = new String[]{"DYLAN","EDAN","RICKY","NEATO"};
		Color[] colors = new Color[]{Color.BLUE,Color.RED,Color.GREEN,Color.MAGENTA,Color.GRAY,new Color(255,128,0)};
		
		for(int i=0; i<cars.length; i++)
		{
			String name = names[(int)(Math.random()*names.length)];
			Color color = colors[(int)(Math.random()*colors.length)];
			double speed = Math.random()*10;
			cars[i] = new Car(Xpos,roads[(int)(Math.random()*roads.length)].getY()-10,name,color,speed);
		}
	}
	//creates leaderboard page
	public void makeBoard()
	{
		Xpos = 300;
		makeRoads(Xpos,600);
		for (int i=0; i<cars.length-1; i++)
        {
            int index = i;
            for (int j=i+1; j<cars.length; j++)
                if (cars[j].getSpeed() < cars[index].getSpeed()) 
                    index = j;      
            Car temp = cars[index];  
            cars[index] = cars[i];
            cars[i] = temp;
        }
		for(int i=cars.length-1; i>=0; i--)
			cars[i].setLocation(Xpos,roads[roads.length-1-i].getY()-10);
	}
	//called by repaint
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(buttonColor);
		g2.fill(button);
		g.setColor(Color.BLACK);
		g.drawString(text,(int)(button.getX()+0.25*button.getWidth()),(int)(button.getY()+0.5*button.getHeight()));
		//important to paint roads first so that the cars are not hidden
		for(int i=0; i<roads.length; i++)
			roads[i].paint(g);
		for(int i=0; i<cars.length; i++)
			cars[i].paint(g);
		if(viewBoard)
		{	
			drawStats(g);
			//makes winner medals
			Medal[] winners = new Medal[3];
			for(int i=0; i<winners.length; i++)
			{
				winners[i] = new Medal(i+1,250,60*i,Color.GREEN);
				winners[i].paint(g);
			}	
		}
	}
	//creates the stats for the leaderboard
	public void drawStats(Graphics g)
	{
		g.setColor(Color.BLACK);
		String suffix = "";
		for(int i=0; i<cars.length; i++)
		{
			if(i == 0)
				suffix = "st";
			else if (i == 1)
				suffix = "nd";
			else if (i == 2)
				suffix = "rd";
			else
				suffix = "th";
			g.drawString(""+(i+1)+suffix+": "+cars[cars.length-1-i].getName(),0,(int)(roads[i].getY()-5));
			g.drawString(cars[cars.length-1-i].stringColor(),0,(int)(roads[i].getY()+5));
			g.drawString(cars[cars.length-1-i].stringSpeed(),0,(int)(roads[i].getY()+15));
			if(i == cars.length-1)
				g.drawString("Poor "+cars[cars.length-1-i].getName()+"...",0,(int)(roads[i].getY()+25));
		}
	}
	public void run()
	{
		while(true)
		{
			for(int i=0;i<cars.length;i++)
			{
				//recycles cars if they go off screen
				if(cars[i].getX() >= 900)
				{
					if(!viewBoard)
						cars[i].setLocation(Xpos,roads[(int)(Math.random()*roads.length)].getY()-10);
					else
						cars[i].setLocation(Xpos,roads[roads.length-1-i].getY());
				}
				cars[i].drive();
			}
			repaint();
		
			try { Thread.sleep(15); }
			catch (InterruptedException e) {}
		}
	}
	//button stuff for switching between the race and the leaderboard
	//buttons shrink if pressed and expand when released
	public void mousePressed(MouseEvent e)
	{
		if(button.contains(e.getX(), e.getY()))
		{
			button = new Rectangle2D.Double(button.getX()+10,button.getY()+5,180,90);
			buttonColor = new Color(192,192,192);
			repaint();
		}
	}
	public void mouseReleased(MouseEvent e)
	{
		if(button.getWidth()<200)
		{
			button = new Rectangle2D.Double(button.getX()-10,button.getY()-5,200,100);
			buttonColor = Color.WHITE;
			repaint();
		}
	}
	public void mouseClicked(MouseEvent e)
	{
		if(!viewBoard && button.contains(e.getX(), e.getY()))
		{
			button = new Rectangle2D.Double(700,600,200,100);
			buttonColor = Color.WHITE;
			text = "Start a new race";
			viewBoard = true;
			makeBoard();
			repaint();
		}
		else if(viewBoard && button.contains(e.getX(), e.getY()))
		{
			viewBoard = false;
			begin();
			repaint();
		}
	} 
	public void mouseEntered(MouseEvent e){} 
	public void mouseExited(MouseEvent e){}
}