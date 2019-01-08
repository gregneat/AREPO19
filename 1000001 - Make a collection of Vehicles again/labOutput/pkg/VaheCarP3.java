package pkg;

public class VaheCarP3 implements Vehicle{
	private  Rectangle body;
	private  Ellipse wheel1;
	private  Ellipse wheel2;
	private  Text location;
	private int x;
	private int y;
	private int w;
	private int h;
	
	public VaheCarP3(int a, int b)
	{
		w=50;
		h=40;
		x = a;
		y = b;
		body = new Rectangle(a, b, w, h);
		wheel1 =  new Ellipse(a - w/5, b + w*3.5/5, h*2/5, h*2/5);
		wheel2 = new Ellipse(a + 3*w/4, b + w*3.5/5, h*2/5, h*2/5);	
		location = new Text(a, b, "("+(int)(a)+","+(int)(b)+")");		
	}
	
	
	public void draw()
	{
		body.fill();
		wheel1.fill();
		wheel2.fill();
		location.draw();
		location.grow(3, 3);
	}
	
	public void translate(double dx, double dy)
	{
		body.translate(dx, dy);
		wheel1.translate(dx, dy);
		wheel2.translate(dx, dy);
		location.translate(dx, dy);
		x+=dx;
		y+=dy;
		location.setText("("+(int)(dx)+","+(int)(dx)+")");
	}
	
	public int getX()
	{
		return body.getX();
	}
	
	public int getY()
	{
		return body.getY();
	}
	public void setColor(Color c)
	{
		body.setColor(c);
	}
}