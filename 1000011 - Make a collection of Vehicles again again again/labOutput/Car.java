//HIDE
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class Car implements Vehicle
{
	public static final int CARHEIGHT = 90;
    private Color color = Color.BLACK;
	private int sp;
    private boolean filled = false;
    private double x;
    private double y;
    private double width;
    private int height;
	private Rectangle body;
	private Ellipse wh1;
	private Ellipse wh2;
	private Text label;
	private Text locLabel;
	private String s;

    /**
       Constructs a rectangle.
       @param x the leftmost x-coordinate
       @param y the topmost y-coordinate
       @param width the width
       @param height the height
    */
    public Car(double x, double y)
    {
		height = 60+30;
		body = new Rectangle(x,y, 100,60);
		body.fill();
		wh1 = new Ellipse(x+10,y+50,30,30);
		wh1.fill();
		wh2 = new Ellipse(x+60,y+50,30,30);
		wh2.fill();
        this.x = x;
        this.y = y;
		sp = 5;
		s = "";
    }
	public Car(double x, double y, String n)
    {
		this(x,y);
		label = new Text(x+35,y+25,n);
		label.setColor(Color.WHITE);
		label.draw();
		locLabel = new Text(x+35,y+45,getX()+", "+getY());
		locLabel.setColor(Color.WHITE);
		locLabel.draw();
		s=n;
    }
	public Car(double x, double y, String n, Color c)
    {
		this(x,y,n);
		body.setColor(c);
		body.fill();
    }
	public Car(double x, double y, String n, Color c, int s)
    {
		this(x,y,n,c);
		sp = s;
    }
	public void translate(double ex, double why)
	{
		body.translate(ex,why);
		wh1.translate(ex,why);
		wh2.translate(ex,why);
		label.translate(ex,why);
		locLabel.setText(getX()+", "+getY());
		locLabel.translate(ex,why);
	}
	
	public int getX()
	{
		return body.getX();
	}
	
	public int getY()
	{
		return body.getY();
	}
	public int getSpeed()
	{
		return sp;
	}
	public int getHeight()
    {
        return CARHEIGHT;
    }

	public String getName()
	{
		return s;
	}
	// should improve this to include wheels or bounding box
	
	public boolean contains(double x, double y)
	{
		return body.contains(x,y);
	}
	public void changeSpeed(int ns)
	{
		sp=ns;
	}
    // /**
       // Gets the width of this rectangle.
       // @return the width
    // */    
    // public int getWidth()
    // {
        // return (int) Math.round(width);
    // } 
    

 

    // /**
       // Resizes this rectangle both horizontally and vertically.
       // @param dw the amount by which to resize the width on each side
       // @param dw the amount by which to resize the height on each side
    // */
    // public void grow(double dw, double dh)
    // {
        // width += 2 * dw;
        // height += 2 * dh;
        // x -= dw;
        // y -= dh;
        // Canvas.getInstance().repaint();
    // }

    // /**
       // Sets the color of this rectangle.
       // @param newColor the new color
    // */
    // public void setColor(Color newColor)
    // {
        // color = newColor;
        // Canvas.getInstance().repaint();
    // }

    // /**
       // Draws this rectangle.
    // */
    // public void draw()
    // {
        // filled = false;
        // Canvas.getInstance().show(this);
    // }

    // /**
       // Fills this rectangle.
    // */
    // public void fill()
    // {
        // filled = true;
        // Canvas.getInstance().show(this);
    // }

    // public String toString()
    // {
        // return "Rectangle[x=" + getX() + ",y=" + getY() + ",width=" + getWidth() + ",height=" + getHeight() + "]";
    // }

    // public void paintShape(Graphics2D g2)
    // {
        // Rectangle2D.Double rect = new Rectangle2D.Double(getX(), getY(),
                // getWidth(), getHeight());
        // g2.setColor(new java.awt.Color((int) color.getRed(), (int) color.getGreen(), (int) color.getBlue()));
        // if (filled)
        // {
            // g2.fill(rect);
        // }
        // else
        // {
            // g2.draw(rect);
        // }
    // }
}
