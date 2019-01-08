package pkg;

public class sarahCarp4 implements Vehicle
{
	private Rectangle pumpkin;
	private Ellipse witch;
	private Ellipse cat;
	private Rectangle ghost;
	private Rectangle web;
	private Rectangle spider;
	private String whatever;
//	private Color c;
	private Text dyl;
	
	public sarahCarp4(int neato,int james)
	{
		
			pumpkin = new Rectangle(neato,james,50,40);
			pumpkin.fill();
			pumpkin.setColor(Color.RED);

			witch = new Ellipse(neato-10,james+30,20,20);
			witch.fill();
			witch.setColor(Color.BLUE);

			cat = new Ellipse(neato+40,james+30,20,20);
			cat.fill();
			cat.setColor(Color.BLUE);

			ghost = new Rectangle(neato+30,james+5,15,15);
			ghost.fill();
			ghost.setColor(Color.WHITE);

			web = new Rectangle(neato,james,15,15);
			web.fill();
			web.setColor(Color.WHITE); 
			
			spider = new Rectangle(neato-10,james,70,50);
			spider.draw();
			spider.setColor(Color.RED);
	}
	
	
	
	public sarahCarp4(int neato,int james, String name)
	{
			this(neato,james);
			dyl = new Text(neato+5, james+5,name);
			dyl.draw();
			whatever = name;
	}
	
	public sarahCarp4(int neato, int james, Color c)
	{
			this(neato,james);
			pumpkin.setColor(c);
			
	}
	
	public sarahCarp4(int neato, int james, String name, Color c)
	{
		this(neato,james);
		pumpkin.setColor(c);
		dyl = new Text(neato+5, james+5,name);
		dyl.draw();
		whatever = name;
	}
	
	public void draw()
	{
		
	}
	
	public void translate (double neato,double james){
		pumpkin.translate(neato,james);
		witch.translate(neato,james);
		cat.translate(neato,james);
		ghost.translate(neato,james);
		web.translate(neato,james);
		spider.translate(neato,james);
		// dyl.translate(neato,james);
	}
	public int getX(){
		return spider.getX();
	}
	
	public int getY(){
		return spider.getY();
	}
	
	public int getHeight(){
		return spider.getHeight();
	}
	

	public Rectangle getBounds() {
		return spider;
	}
	
	public String getName(){
		return whatever;
	}
	

	
}