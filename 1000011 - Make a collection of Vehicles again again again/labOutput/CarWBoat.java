
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class CarWBoat extends Car
{
	// public static final int CARHEIGHT = 150;
    // private Color color = Color.BLACK;
	// private int sp;
    // private boolean filled = false;
    // private double x;
    // private double y;
    // private double width;
    // private int height;
	// private Rectangle body;
	// private Rectangle cab;
	// private Ellipse wh1;
	// private Ellipse wh2;
	// private Ellipse wh3;
	// private Ellipse wh4;
	// private Text label;
	// private Text locLabel;
	// private String s;
	private static int boatLen = 80;
	Rectangle boat;

    // public Truck(double x, double y)
    // {
		// height = 150;
		// body = new Rectangle(x,y, 200,90);
		// body.fill();
		// cab = new Rectangle(x+205,y+40,50,50);
		// cab.fill();
		// wh1 = new Ellipse(x+205+10,y+40+50-10,30,30);
		// wh1.fill();
		// wh2 = new Ellipse(x+150,y+40+50-10,30,30);
		// wh2.fill();
		// wh3 = new Ellipse(x+10,y+40+50-10,30,30);
		// wh3.fill();
		// wh4 = new Ellipse(x+45,y+40+50-10,30,30);
		// wh4.fill();
        // this.x = x;
        // this.y = y;
		// sp = 5;
		// s = "";
    // }
	// public Truck(double x, double y, String n)
    // {
		// this(x,y);
		// label = new Text(x+35,y+25,n);
		// label.setColor(Color.WHITE);
		// label.draw();
		// locLabel = new Text(x+35,y+45,getX()+", "+getY());
		// locLabel.setColor(Color.WHITE);
		// locLabel.draw();
		// s=n;
    // }
	// public Truck(double x, double y, String n, Color c)
    // {
		// this(x,y,n);
		// body.setColor(c);
		// cab.setColor(c);
		// body.fill();
    // }
	public CarWBoat(double x, double y, String n, Color c, int s)
    {
		super(x,y,n,c);
		// sp = s;
		boat = new Rectangle(super.getX()-boatLen-5,super.getY()+30,boatLen,20);
		boat.fill();
    }
	public void translate(double ex, double why)
	{
		super.translate(ex, why);
		boat.translate(ex, why);
	}
	
	// public int getX()
	// {
		// return body.getX();
	// }
	
	// public int getY()
	// {
		// return body.getY();
	// }
	// public int getSpeed()
	// {
		// return sp;
	// }
	// public int getHeight()
    // {
        // return CARHEIGHT;
    // }

	// public String getName()
	// {
		// return s;
	// }
	// should improve this to include wheels or bounding box
	
	public boolean contains(double x, double y)
	{
		return super.contains(x,y)||boat.contains(x,y);
	}
	// public void changeSpeed(int ns)
	// {
		// sp=ns;
	// }
}
