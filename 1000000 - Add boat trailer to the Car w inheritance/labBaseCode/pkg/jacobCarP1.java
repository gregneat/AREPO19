package pkg;

public class jacobCarP1 implements Vehicle
{
	public Line windshield;
	public Ellipse body;
	public Rectangle bodyfill;
	public Rectangle bodyfill2;
	public Line bodyfill4;
	public Ellipse windows;
	public Rectangle windowfill;
	public Rectangle windowfill2;
	public Rectangle windowfill3;
	public Rectangle windowseparate;
	public Ellipse boody;
	public Rectangle boodyfill;
	public Rectangle boody2;
	public Rectangle boody3;
	public Rectangle boodyfill2;
	public Ellipse tire;
	public Ellipse tire2;
	public Rectangle doorseparate;
	public Rectangle doorseparate2;
	public Rectangle doorseparate3;
	public Line windowfill4;
	public Line drift;
	public Line dfoorseparate2;
	public Line dfoorseparate3;
	public Line ornament;
	
	public jacobCarP1(int a, int b){
	body = new Ellipse(a-25,b,125,33);
	body.setColor(Color.RED);
	body.fill();
	windows = new Ellipse(a-25,b+3,125,33);
	windows.setColor(Color.GRAY);
	windows.fill();
	windowfill = new Rectangle(a,b+5,3,33);
	windowfill.setColor(Color.RED);
	windowfill.fill();
	windowfill2 = new Rectangle(a-24,b+21,60,3);
	windowfill2.setColor(Color.ORANGE);
	windowfill2.fill();
	windowfill3 = new Rectangle(a+35,b+2,3,33);
	windowfill3.setColor(Color.RED);
	windowfill3.fill();
	windowseparate = new Rectangle(a+16,b+4,3,13);
	windowseparate.setColor(Color.BLACK);
	windowseparate.fill();
	bodyfill = new Rectangle(a-25,b,25,33);
	bodyfill.setColor(Color.WHITE);
	bodyfill.fill();
	bodyfill2 = new Rectangle(a-25,b+25,125,38);
	bodyfill2.setColor(Color.WHITE);
	bodyfill2.fill();
	boody = new Ellipse(a+15,b+19,75,25);
	boody.setColor(Color.RED);
	boody.fill();
	boodyfill = new Rectangle(a-25,b+33,125,38);
	boodyfill.setColor(Color.WHITE);
	boodyfill.fill();
	boody2 = new Rectangle(a-25,b+33,115,15);
	boody2.setColor(Color.RED);
	boody2.fill();
	boody3 = new Rectangle(a-25,b+20,75,15);
	boody3.setColor(Color.RED);
	boody3.fill();
	boodyfill2 = new Rectangle(a-25,b+38,125,38);
	boodyfill2.setColor(Color.WHITE);
	boodyfill2.fill();
	int bodyfill3 = 0;
	tire = new Ellipse(a-15,b+30,20,20);
	tire.fill();
	tire2 = new Ellipse(a+50, b+30,20,20);
	tire2.fill();
	doorseparate = new Rectangle(a+17,b+17,1,15);
	doorseparate.setColor(Color.BLACK);
	doorseparate.fill();
	doorseparate2 = new Rectangle(a+17,b+32,18,1);
	doorseparate2.setColor(Color.BLACK);
	doorseparate2.fill();
	doorseparate3 = new Rectangle(a+35,b+17,1,16);
	doorseparate3.setColor(Color.BLACK);
	doorseparate3.fill();
	dfoorseparate2 = new Line(a+5,b+32,a+17,b+32);
	dfoorseparate2.setColor(Color.BLACK);
	dfoorseparate2.draw();
	dfoorseparate3 = new Line(a-1,b+17,a+5,b+32);
	dfoorseparate3.setColor(Color.BLACK);
	dfoorseparate3.draw();
	}
	
	public void translate(double ex,double why){
		body.translate(ex,why);
		bodyfill.translate(ex,why);
		bodyfill2.translate(ex,why);
		windows.translate(ex,why);
		windowfill.translate(ex,why);
		windowfill2.translate(ex,why);
		windowfill3.translate(ex,why);
		windowseparate.translate(ex,why);
		boody.translate(ex,why);
		boodyfill.translate(ex,why);
		boody2.translate(ex,why);
		boody3.translate(ex,why);
		boodyfill2.translate(ex,why);
		tire.translate(ex,why);
		tire2.translate(ex,why);
		doorseparate.translate(ex,why);
		doorseparate2.translate(ex,why);
		doorseparate3.translate(ex,why);
		dfoorseparate2.translate(ex,why);
		dfoorseparate3.translate(ex,why);
	}
	
	public void draw()
	{
	}
	public int getX()
	{
		return body.getX();
	}
	public int getY()
	{
		return body.getY();
	}
		public int getHeight()
	{
		return body.getHeight();
	}	
	public int getWidth()
	{
		return body.getWidth();
	}	
}
		
	