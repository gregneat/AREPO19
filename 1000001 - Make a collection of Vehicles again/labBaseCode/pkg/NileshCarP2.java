package pkg;

public class NileshCarP2 implements Vehicle{
	
	private double x;
	private double x2;
	private double y;
	private double y2;
	
	private Rectangle boundbox;
	
	private int r;
	private int g;
	private int b;
	
	// private double GROWX;
	// private double GROWY;
	private double MOVEX;
	private double MOVEY;
	
	private double WIDTH;
	private double HEIGHT;
	
	private Color window = new Color (50,170,255);
	private Color TandB = new Color (50,50,50);
	private Color bodyc;
	private Color capcolor = new Color (192,192,192);
	
	private Rectangle body1;
	private Rectangle body2;	
	private Rectangle body3;
	private Rectangle body4;
	
	private Rectangle bdoor;
	private Rectangle fdoor;
	private Rectangle bdoorhandle;
	private Rectangle fdoorhandle;
	
	private Rectangle windshield1;
	private Rectangle windshield2;
	
	private Rectangle bumper;
	private Rectangle fbumper;

	private Ellipse fwheel;
	private Ellipse bwheel;
	
	private Rectangle taillight;
	private Rectangle headlight;
	private Rectangle brakelight;
	
	private Rectangle tframe;
	private Rectangle hframe;

	private Ellipse bcap;
	private Ellipse fcap;
	
	private Text name;
	private Text location;
	private String coord;
	
	// private Boolean moving = false;
	
	//fleft = faceLeft boolean, fright = faceRight boolean
	private Boolean fleft = false;
	private Boolean fright = false;
	
	
	//outlines
	private Rectangle bodyframe1;
	private Rectangle bodyframe2;
	private Rectangle bodyframe3;
	
	private Rectangle windshieldframe1;
	private Rectangle windshieldframe2;
	private Rectangle spoilerframe;
	
	private Line line1;
	private Line line2;
	private Line line3;
	private Line line4;
	private Line line5;
	
	public NileshCarP2(double x, double y)
	{
		
		body1 = new Rectangle(x+5,y+10,80,30);
		
		bodyframe1 = new Rectangle(x+5,y+10,80,30);
		
		body2 = new Rectangle(x+85,y+20,10,20);
		
		bodyframe2 = new Rectangle(x+85,y+20,10,20);

		body3 = new Rectangle(x+94,y+26,11,14);
		
		bodyframe3 = new Rectangle(x+95,y+25,10,15);
		
		body4 = new Rectangle(x,y+5,10,5);
		
		spoilerframe = new Rectangle(x,y+5,10,5);

		bdoor = new Rectangle(x+15,y+20,35,19);
		//bdoor.setColor(Color.WHITE);
		
		fdoor = new Rectangle(x+50,y+20,35,19);
		//fdoor.setColor(Color.WHITE);
		
		bdoorhandle = new Rectangle(x+20,y+25,5,2);
		bdoorhandle.setColor(Color.WHITE);
		
		fdoorhandle = new Rectangle(x+55,y+25,5,2);
		fdoorhandle.setColor(Color.WHITE);
		
		windshield1 = new Rectangle(x+15,y,60,20);
		windshield1.setColor(window);
		
		windshield2 = new Rectangle(x+74,y+11,11,9);
		windshield2.setColor(window);
		
		windshieldframe1 = new Rectangle(x+15,y,60,20);
		
		windshieldframe2 = new Rectangle(x+75,y+10,10,10);
		
		bumper = new Rectangle(x,y+35,11,5);
		bumper.setColor(TandB);
		
		fbumper = new Rectangle(x+100,y+35,10,5);
		fbumper.setColor(TandB);
		
		bwheel = new Ellipse(x+15,y+30,20,20);
		bwheel.setColor(TandB);
		
		fwheel = new Ellipse(x+75,y+30,20,20);
		fwheel.setColor(TandB);

		brakelight = new Rectangle(x+5,y+30,5,3);
		brakelight.setColor(Color.RED);
		
		taillight = new Rectangle(x+5,y+30,5,5);
		taillight.setColor(Color.YELLOW);
		
		headlight = new Rectangle(x+100,y+30,5,5);
		headlight.setColor(Color.YELLOW);
		
		tframe = new Rectangle(x+5,y+30,5,5);
		// tframe.setColor(Color.WHITE);
		
		hframe = new Rectangle(x+100,y+30,5,5);
		// hframe.setColor(Color.WHITE);
		
		bcap = new Ellipse(x+20,y+35,10,10);
		bcap.setColor(capcolor);
		
		fcap = new Ellipse(x+80,y+35,10,10);
		fcap.setColor(capcolor);
		
		location = new Text(x+17,y-16,"");
		location.draw();
		
		name = new Text(x+17,y+5,"");
		
		// WIDTH = (int)(0.5*body4.getWidth() + body1.getWidth() + body2.getWidth() + body3.getWidth() + 0.5*fbumper.getWidth() - 1);
		// HEIGHT = (int)(body1.getHeight() + 0.5*windshield1.getHeight() + 0.5*bwheel.getHeight());
		WIDTH = 110;
		HEIGHT = 50;
		
		
		boundbox = new Rectangle(x,y,WIDTH,HEIGHT);
		//boundbox.draw();
		
		x = boundbox.getX();
		x2 = x + boundbox.getWidth();
		y = boundbox.getY();
		y2 = y + boundbox.getHeight();
		
		fright = true;
		


	}
	
	public NileshCarP2(int x, int y){
		this(Double.valueOf(x),Double.valueOf(y));
	}
	
	public NileshCarP2(double x, double y, String label)
	{	
		this(x,y);
		
		name = new Text(x+17,y+5,label);
		
	}
	
	public void setColor(int r, int g, int b)
	{
		Color bodyc = new Color(r,g,b);
		body1.setColor(bodyc);
		body2.setColor(bodyc);
		body3.setColor(bodyc);
		body4.setColor(bodyc);
		
	}
	
	public void fill()
	{
		body1.fill();
		
		bodyframe1.draw();
		body2.fill();
		bodyframe2.draw();
		bodyframe3.draw();
		body3.fill();
	
		
		body4.fill();
		spoilerframe.draw();
		
		bdoorhandle.fill();
		fdoorhandle.fill();
		
		windshield1.fill();
		windshieldframe1.draw();
		windshieldframe2.draw();
		windshield2.fill();
		
		bdoor.draw();
		fdoor.draw();
		
		bwheel.fill();
		fwheel.fill();
		
		bumper.fill();
		fbumper.fill();
		
		taillight.fill();
		headlight.fill();
		brakelight.fill();
	
		tframe.draw();
		hframe.draw();
		
		bcap.fill();
		fcap.fill();
		name.draw();	
	}
	
	public void draw()
	{
		this.fill();
	}
	
	public void name(String n)
	{
		name = new Text(boundbox.getX()+17,boundbox.getY()+5,n);
		name.draw();
	}
	
	public void coords()
	{
		coord = new String("(" + boundbox.getX() + "," + boundbox.getY() + ")");
		location.setText(coord);		
		location.draw();		
		
	}
	
	public void translate(double MOVEX, double MOVEY)
	{	
		body1.translate(MOVEX,MOVEY);
		bodyframe1.translate(MOVEX,MOVEY);
		body2.translate(MOVEX,MOVEY);
		bodyframe2.translate(MOVEX,MOVEY);
		bodyframe3.translate(MOVEX,MOVEY);
		body3.translate(MOVEX,MOVEY);
		body4.translate(MOVEX,MOVEY);
		spoilerframe.translate(MOVEX,MOVEY);
		
		bdoorhandle.translate(MOVEX,MOVEY);
		fdoorhandle.translate(MOVEX,MOVEY);
		
		windshield1.translate(MOVEX,MOVEY);
		windshieldframe1.translate(MOVEX,MOVEY);
		windshieldframe2.translate(MOVEX,MOVEY);;
		windshield2.translate(MOVEX,MOVEY);
		
		bdoor.translate(MOVEX,MOVEY);
		fdoor.translate(MOVEX,MOVEY);
		
		bwheel.translate(MOVEX,MOVEY);
		fwheel.translate(MOVEX,MOVEY);
		
		bumper.translate(MOVEX,MOVEY);
		fbumper.translate(MOVEX,MOVEY);
		
		taillight.translate(MOVEX,MOVEY);
		headlight.translate(MOVEX,MOVEY);
		brakelight.translate(MOVEX,MOVEY);
		
		tframe.translate(MOVEX,MOVEY);
		hframe.translate(MOVEX,MOVEY);
		
		bcap.translate(MOVEX,MOVEY);
		fcap.translate(MOVEX,MOVEY);
			
		boundbox.translate(MOVEX,MOVEY);
		
		location.translate(MOVEX,MOVEY);
		coord = new String("(" + boundbox.getX() + "," + boundbox.getY() + ")");
		location.setText(coord);
		name.translate(MOVEX,MOVEY);
	}
	
	
	public void faceLeft()
	{
		if(fright == true){
		fright = false;
		fleft = true;
		body1.translate(20,0);
		bodyframe1.translate(20,0);
		body2.translate(-70,0);
		bodyframe2.translate(-70,0);
		bodyframe3.translate(-90,0);
		body3.translate(-88,0);
		body4.translate(100,0);
		spoilerframe.translate(100,0);
		
		bdoorhandle.translate(65,0);
		fdoorhandle.translate(-5,0);
		
		windshield1.translate(20,0);
		windshieldframe1.translate(20,0);
		windshieldframe2.translate(-50,0);;
		windshield2.translate(-48,0);
		
		bdoor.translate(45,0);
		fdoor.translate(-25,0);
		
		bwheel.translate(0,0);
		fwheel.translate(0,0);
		
		bumper.translate(100,0);
		fbumper.translate(-100,0);
		
		taillight.translate(95,0);
		headlight.translate(-95,0);
		brakelight.translate(95,0);
		
		tframe.translate(95,0);
		hframe.translate(-95,0);
		
		bcap.translate(0,0);
		fcap.translate(0,0);
		
		name.translate(25,0);
		location.translate(25,0);
		
		}
	}
	
	public void faceRight()
	{
		if(fleft == true){
		fleft = false;
		fright = true;
		
		body1.translate(-20,0);
		bodyframe1.translate(-20,0);
		body2.translate(70,0);
		bodyframe2.translate(70,0);
		bodyframe3.translate(90,0);
		body3.translate(88,0);
		body4.translate(-100,0);
		spoilerframe.translate(-100,0);
		
		bdoorhandle.translate(-65,0);
		fdoorhandle.translate(5,0);
		
		windshield1.translate(-20,0);
		windshieldframe1.translate(-20,0);
		windshieldframe2.translate(50,0);;
		windshield2.translate(48,0);
		
		bdoor.translate(-45,0);
		fdoor.translate(25,0);
		
		bwheel.translate(0,0);
		fwheel.translate(0,0);
		
		bumper.translate(-100,0);
		fbumper.translate(100,0);
		
		taillight.translate(-95,0);
		headlight.translate(95,0);
		brakelight.translate(-95,0);
		
		tframe.translate(-95,0);
		hframe.translate(95,0);
		
		bcap.translate(0,0);
		fcap.translate(0,0);
		
		name.translate(-25,0);
		location.translate(-25,0);
		}
	}
	
		public int getX()
	{
		return body1.getX();
	}	
	
	public int getY()
	{
		return body1.getY();
	}	
	
		public int getHeight()
	{
		return (int)(body1.getHeight() + 0.5*windshield1.getHeight() + 0.5*bwheel.getHeight());
		
	}
	
	public int getWidth()
	{
		return (int)(body4.getWidth() + body1.getWidth() + body2.getWidth() + body3.getWidth() + fbumper.getWidth());
	}
	
	public int getX2()
	{
		x = body1.getX();
		return (int)(x + body4.getWidth() + body1.getWidth() + body2.getWidth() + body3.getWidth() + fbumper.getWidth());
	}
	
	public int getY2()
	{
		y = body1.getY();
		return (int)(y + body1.getHeight() + 0.5*windshield1.getHeight() + 0.5*bwheel.getHeight());
		
	}
	
		// public boolean contains(Face b)
	// {

		// x = boundbox.getX();
		// x2 = x + boundbox.getWidth();
		// y = boundbox.getY();
		// y2 = y + boundbox.getHeight();
		
		// if(x < b.getX2() && x2 > b.getX() && y < b.getY2() && y2 > b.getY())
		// { 
			// return true;
		// }
		// return false;
	// }
	

		
}
