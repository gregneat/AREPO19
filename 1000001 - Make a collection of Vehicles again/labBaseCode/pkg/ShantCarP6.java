package pkg;

public class ShantCarP6 implements Vehicle
{
	private Rectangle rubo;
	private Ellipse fwheel;
	private Ellipse bwheel;
	private Rectangle window;
	private Rectangle hbox;
	private Text word;
	private String name;
	
	public ShantCarP6(int w, int z)
	{
		Text word = new Text(w,z-13,name);
		word.draw();
		
		rubo = new Rectangle(w,z,100,75);
		
		fwheel = new Ellipse(w-10,z+30,20,20);
			
		bwheel = new Ellipse(w+37.5,z+30,20,20);
			
		window = new Rectangle(w+17.5,z+10,15,15);
		
		hbox = new Rectangle(w-11.5,z,68,50);
		
	}
	public ShantCarP6(int w, int z, Color a)
	{

		this(w,z);
		setColor(a);
		
	}
	public void translate(double x,double y)
	{
		rubo.translate(x,y);
		fwheel.translate(x,y);
		bwheel.translate(x,y);
		window.translate(x,y);
		hbox.translate(x,y);
	}
	public void fill()
	{	
		rubo.fill();
		fwheel.fill();
		bwheel.fill();
		window.fill();
	
	}
	public void draw()
	{
		fill();
	}
	public void setColor(Color a)
	{
		rubo.setColor(Color.GREEN);
		fwheel.setColor(Color.BLUE);
		bwheel.setColor(Color.GRAY);
		window.setColor(Color.RED);
	}
	public int getX()
	{
		return hbox.getX();
	}
	public int getY()
	{
		return hbox.getY();
	}
	public int getHeight()
	{
		return hbox.getHeight();
	}
	public int getWidth()
	{
		return hbox.getWidth();
	}
	public Rectangle getBound()
	{
		return hbox;
	}
	
	
	
}
	
	
	 
	