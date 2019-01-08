package pkg;


public class andrewCarP6 implements Vehicle
{
	private Rectangle blooboi, agent47;
	private Ellipse bwheel, fwheel;
	private Line spoilerb, spoilerw, lglass, rglass, mglass;
	private Text string;
	private Boolean boolSp;
	public andrewCarP6(double w, double z, Boolean sp/*, String text*/) 
	{
		blooboi = new Rectangle(w,z,50,40);

		agent47 = new Rectangle(w-20,z-15, 75, 65); /*agent47.draw();*/ agent47.setColor(Color.RED);

		bwheel = new Ellipse(w-10,z+30,20,20); 
		fwheel = new Ellipse(w+40,z+30,20,20); 
		spoilerb = new Line(w,z, w-10, z-10); 
		spoilerw = new Line(w-20,z-10, w, z-10); 

		lglass = new Line(w,z, w+25, z-15); 
		rglass = new Line(w+25,z-15, w+50, z);
		mglass = new Line(w+25,z-15, w+25, z);

		boolSp = sp;

		blooboi.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255),
			(int)(Math.random()*255)));		
		bwheel.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255),
			(int)(Math.random()*255)));		
		fwheel.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255),
			(int)(Math.random()*255)));	
		spoilerb.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255),
			(int)(Math.random()*255)));
		spoilerw.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255),
			(int)(Math.random()*255)));	
		string = new Text(0, 0, "");
	}
	public andrewCarP6(double x, double y, Boolean slr, String text)
	{
		this( x, y, slr);
		string = new Text(x,y,text); string.draw();
	}
	public andrewCarP6(int x, int y){
		this(x,y,true);
	}

	public void fill()
	{
		blooboi.fill();
		bwheel.fill();
		fwheel.fill();
		if (boolSp) {
			spoilerb.draw();
			spoilerw.draw();
		} else {

		}
		
		lglass.draw();
		rglass.draw();
		mglass.draw();
	}

	public void draw()
	{

	}

	public void translate(double x, double y)
	{
		spoilerb.translate(x,y);
		spoilerw.translate(x,y);
		lglass.translate(x,y);
		rglass.translate(x,y);
		mglass.translate(x,y);
		bwheel.translate(x,y);
		fwheel.translate(x,y);
		blooboi.translate(x,y);
		agent47.translate(x,y);
		string.translate(x,y);
	}

	public void grow(double x, double y)
	{
		spoilerb.grow(x,y);
		spoilerw.grow(x,y);
		lglass.grow(x,y);
		rglass.grow(x,y);
		mglass.grow(x,y);
		bwheel.grow(x,y);
		fwheel.grow(x,y);
		blooboi.grow(x,y);
		agent47.grow(x,y);
	}

	public void setColor(int r, int g, int b)
	{
		spoilerb.setColor(new Color(r,g,b));
		spoilerw.setColor(new Color(r,g,b));
		lglass.setColor(new Color(r,g,b));
		rglass.setColor(new Color(r,g,b));
		mglass.setColor(new Color(r,g,b));
		bwheel.setColor(new Color(r,g,b));
		fwheel.setColor(new Color(r,g,b));
		blooboi.setColor(new Color(r,g,b));
	}
	public int getX()
	{
		return blooboi.getX();
	}
	public int getY()
	{
		return  blooboi.getY();
	}

	public int getWidth()
	{
		return agent47.getWidth();
	}
	
	public int getHeight()
	{
		return agent47.getHeight();
	}	

	public Rectangle getBounds()
	{
		return agent47;
	}
}