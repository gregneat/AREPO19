//Class nicolasCarP3 (inside package)
package pkg;

public class nicolasCarP3 implements Vehicle
{
	private int a;
	private int b;
	private String s;
	private int width = 50;
	private int height = 50;
	private Rectangle body;
	private Rectangle body2;
	private Rectangle window;
	private Ellipse wheelR;
	private Ellipse wheelL;
	private Rectangle imag;
	private Text display;
	
	public nicolasCarP3(int a, int b)
	{
		body = new Rectangle(a, b, 50, 40);
		body2 = new Rectangle(a-10, b+20, 70, 20);

		//LEFT wheel
		int ba = a-10;
		int bb = b+30;
		wheelL = new Ellipse(ba, bb, 20, 20);
		
		//RIGHT wheel
		int fa = a+40;
		int fb = b+30;
		wheelR = new Ellipse(fa, fb, 20, 20);
		
		//imaginary square
		imag = new Rectangle(a-10, b, 70, 50);
		
		//avoid runtime error
		display = new Text(a+20, b+20, "");
	}
	
	//added 11/7/2018
	public nicolasCarP3(int a, int b, String s) 
	{
		this (a,b); //calls line 24

		this.s = s;
		display = new Text(a+20, b+20, s);	
	}
	
	//added 11/13/2018
	public nicolasCarP3(int a, int b, Color c)
	{
		this(a, b);
		
		body.setColor(c);
		body2.setColor(c);
	}
	
	public nicolasCarP3(int a, int b, String s, Color c)
	{
		this(a,b,s);
		
		body.setColor(c);
		body2.setColor(c);
	}
	
	
/**methods
**/

	public void translate(double x, double y)
	{
		body.translate(x,y);
		body2.translate(x,y);
		wheelL.translate(x,y);
		wheelR.translate(x,y);
		imag.translate(x,y);
		
		display.translate(x,y);
	}
	
	public void fill()
	{
		Color gray = new Color(81, 81, 81);
		body.fill();
		body2.fill();
		wheelL.fill();
		wheelR.fill();
		
		// imag.draw(); imag.setColor(Color.RED);
		
		display.draw();
		
	}
	
	/*added for vehicle interface*/
	public void draw()
	{
		fill();
	}
	
	public void setColor(Color newColor){
		body.setColor(newColor);
		body2.setColor(newColor);
		
	}
	
	public int getX()
	{
		return imag.getX();
	}
	
	public int getY(){
		return imag.getY();
	}
	
	public int getWidth(){
		return imag.getWidth();
	}
	
	public int getHeight(){
		return imag.getHeight();
	}
	
	public Rectangle getBounds(){
		return imag;
	}
	
	public String getName(){
		return s;
	}
}