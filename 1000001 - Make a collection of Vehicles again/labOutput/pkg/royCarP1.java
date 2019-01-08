package pkg;

public class royCarP1 implements Vehicle{
	
	private Rectangle outline;
	private Rectangle outline2;
	private Rectangle outline3;
	private Rectangle outline4;
	private Rectangle outline5;
	private Rectangle outline6;
	private Rectangle outline7;
	private Rectangle outline8;
	private Rectangle outline9;
	private Rectangle outline10;
	private Rectangle outline11;
	private Rectangle outline12;
	private Rectangle carbody;
	private Rectangle carbody2;
	private Rectangle carbody3;
	private Rectangle window;
	private Rectangle window2;
	private Rectangle doorline;
	private Rectangle doorhandlefront;
	private Rectangle doorhandleback;
	private Ellipse wheel;
	private Ellipse wheelcover;
	private Ellipse wheel2;
	private Ellipse wheelcover2;
	private Rectangle headlights;
	private Rectangle stoplights;
	private Rectangle headlightoutline;
	private Rectangle headlightoutline2;
	private Rectangle stoplightoutline;
	private Rectangle stoplightoutline2;
	private Rectangle bound;
	private Rectangle personbody;
	private Rectangle personbodyoutline;
	private Ellipse personhead;
	private Ellipse personheadoutline;
	private Rectangle personbody2;
	private Rectangle personbodyoutline2;
	private Ellipse personhead2;
	private Ellipse personheadoutline2;
	
	Color col = new Color(250,206,243);
	Color col2 = new Color(255,224,179);
	
	public royCarP1(int x, int y) {
		
		outline = new Rectangle(x,y+39,50,1);
		outline2 = new Rectangle(x,y+20,10,1);
		outline3 = new Rectangle(x+40,y+20,10,1);
		outline4 = new Rectangle(x,y+20,1,20);
		outline5 = new Rectangle(x+49,y+20,1,20);
		outline6 = new Rectangle(x+10,y+4,5,1);
		outline7 = new Rectangle(x+35,y+4,5,1);
		outline8 = new Rectangle(x+10,y+4,1,17);
		outline9 = new Rectangle(x+39,y+4,1,17);
		outline10 = new Rectangle(x+15,y,20,1);
		outline11 = new Rectangle(x+15,y,1,5);
		outline12 = new Rectangle(x+34,y,1,5);
		
		carbody = new Rectangle(x,y+20,50,20);
		carbody.setColor(col);
		carbody2 = new Rectangle(x+10,y+4,30,16);
		carbody2.setColor(col);
		carbody3 = new Rectangle(x+15,y,20,4);
		carbody3.setColor(col);
		
		window = new Rectangle(x+13,y+7,10,13);
		window.setColor(Color.WHITE);
		window2 = new Rectangle(x+27,y+7,10,13);
		window2.setColor(Color.WHITE);
		
		doorline = new Rectangle(x+24,y+6,1,30);
		doorhandlefront = new Rectangle(x+27,y+22,6,3);
		doorhandleback = new Rectangle(x+13,y+22,6,3);
		
		wheel = new Ellipse(x+4,y+30,16,16);
		wheelcover = new Ellipse(x+8,y+34,8,8);
		wheelcover.setColor(Color.GRAY);
		wheel2 = new Ellipse(x+30,y+30,16,16);
		wheelcover2 = new Ellipse(x+34,y+34,8,8);
		wheelcover2.setColor(Color.GRAY);
		
		stoplights = new Rectangle(x+1,y+21,7,7);
		stoplights.setColor(Color.RED);
		stoplightoutline = new Rectangle(x+42,y+28,8,1);
		stoplightoutline2 = new Rectangle(x+41,y+20,1,9);
		headlights = new Rectangle(x+42,y+21,7,7);
		headlights.setColor(Color.YELLOW);
		headlightoutline = new Rectangle(x,y+28,8,1);
		headlightoutline2 = new Rectangle(x+8,y+20,1,9);
		
		personbodyoutline = new Rectangle(x+29,y+14,6,6);
		personbody = new Rectangle(x+30,y+15,4,5);
		personbody.setColor(Color.CYAN);
		personhead = new Ellipse(x+28,y+9,8,8);
		personhead.setColor(col2);
		personheadoutline = new Ellipse(x+27,y+8,10,10);
		
		personbodyoutline2 = new Rectangle(x+15,y+14,6,6);
		personbody2 = new Rectangle(x+16,y+15,4,5);
		personbody2.setColor(Color.ORANGE);
		personhead2 = new Ellipse(x+14,y+9,8,8);
		personhead2.setColor(col2);
		personheadoutline2 = new Ellipse(x+13,y+8,10,10);
		
		bound = new Rectangle(x,y,50,40);		
	}
		
	public void translate(double xx, double yy)
	{
		outline.translate(xx,yy);
		outline2.translate(xx,yy);
		outline3.translate(xx,yy);
		outline4.translate(xx,yy);
		outline5.translate(xx,yy);
		outline6.translate(xx,yy);
		outline7.translate(xx,yy);
		outline8.translate(xx,yy);
		outline9.translate(xx,yy);
		outline10.translate(xx,yy);
		outline11.translate(xx,yy);
		outline12.translate(xx,yy);
		carbody.translate(xx,yy);
		carbody2.translate(xx,yy);
		carbody3.translate(xx,yy);
		window.translate(xx,yy);
		window2.translate(xx,yy);
		doorline.translate(xx,yy);
		doorhandlefront.translate(xx,yy);
		doorhandleback.translate(xx,yy);
		wheel.translate(xx,yy);
		wheelcover.translate(xx,yy);
		wheel2.translate(xx,yy);
		wheelcover2.translate(xx,yy);
		headlights.translate(xx,yy);
		headlightoutline.translate(xx,yy);
		headlightoutline2.translate(xx,yy);
		stoplights.translate(xx,yy);
		stoplightoutline.translate(xx,yy);
		stoplightoutline2.translate(xx,yy);
		bound.translate(xx,yy);		
		personbodyoutline.translate(xx,yy);
		personbody.translate(xx,yy);
		personheadoutline.translate(xx,yy);
		personhead.translate(xx,yy);
		personbodyoutline2.translate(xx,yy);
		personbody2.translate(xx,yy);
		personheadoutline2.translate(xx,yy);
		personhead2.translate(xx,yy);
	}
	
	public void fill()
	{
		carbody.fill();
		outline.fill();
		outline2.fill();
		outline3.fill();
		outline4.fill();
		outline5.fill();
		carbody2.fill();
		outline6.fill();
		outline7.fill();
		outline8.fill();
		outline9.fill();
		carbody3.fill();
		outline6.fill();
		outline10.fill();
		outline11.fill();
		outline12.fill();
		window.fill();
		window2.fill();
		doorline.fill();
		doorhandlefront.fill();
		doorhandleback.fill();
		wheel.fill();
		wheelcover.fill();
		wheel2.fill();
		wheelcover2.fill();
		headlights.fill();
		headlightoutline.fill();
		headlightoutline2.fill();
		stoplights.fill();
		stoplightoutline.fill();
		stoplightoutline2.fill();
		personbodyoutline.fill();
		personbody.fill();
		personheadoutline.fill();
		personhead.fill();
		personbodyoutline2.fill();
		personbody2.fill();
		personheadoutline2.fill();
		personhead2.fill();
	}
	
	public void draw()
	{
		carbody.fill();
		outline.fill();
		outline2.fill();
		outline3.fill();
		outline4.fill();
		outline5.fill();
		carbody2.fill();
		outline6.fill();
		outline7.fill();
		outline8.fill();
		outline9.fill();
		carbody3.fill();
		outline6.fill();
		outline10.fill();
		outline11.fill();
		outline12.fill();
		window.fill();
		window2.fill();
		doorline.fill();
		doorhandlefront.fill();
		doorhandleback.fill();
		wheel.fill();
		wheelcover.fill();
		wheel2.fill();
		wheelcover2.fill();
		headlights.fill();
		headlightoutline.fill();
		headlightoutline2.fill();
		stoplights.fill();
		stoplightoutline.fill();
		stoplightoutline2.fill();
		personbodyoutline.fill();
		personbody.fill();
		personheadoutline.fill();
		personhead.fill();
		personbodyoutline2.fill();
		personbody2.fill();
		personheadoutline2.fill();
		personhead2.fill();
	}
	
	public void faceOpposite()
	{
		headlights.setColor(Color.RED);
		stoplights.setColor(Color.YELLOW);
		doorhandlefront.translate(4,0);
		doorhandleback.translate(4,0);
	}
	
	public int getX()
	{
		return bound.getX();
	}	
	
	public int getY()
	{
		return bound.getY();
	}
	
	public int getWidth()
	{
		return bound.getWidth();
	}
	
	public int getHeight()
	{
		return bound.getHeight();
	}
	
	public Rectangle getAll()
	{
		return bound;
	}
	
	public void setColor(Color color)
	{
		carbody.setColor(color);
		carbody2.setColor(color);
		carbody3.setColor(color);
	}
}