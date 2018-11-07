package pkg;
public class Car {
	
	private double x;
	private double y;
	
	private int r;
	private int g;
	private int b;
	
	private double GROWX;
	private double GROWY;
	private double MOVEX;
	private double MOVEY;
	
	private Color window = new Color (50,170,255);
	private Color TandB = new Color (50,50,50);
	private Color bodyc;
	private Color capcolor = new Color (192,192,192);
	
	private Rectangle boundBox;
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
	
	public Car(double x, double y)
	{
		
		
		body1 = new Rectangle(x,y,80,30);
		
		bodyframe1 = new Rectangle(x,y,80,30);
		
		body2 = new Rectangle(x+80,y+10,10,20);
		
		bodyframe2 = new Rectangle(x+80,y+10,10,20);

		body3 = new Rectangle(x+89,y+16,11,14);
		
		bodyframe3 = new Rectangle(x+90,y+15,10,15);
		
		body4 = new Rectangle(x-10,y-5,10,5);
		
		spoilerframe = new Rectangle(x-10,y-5,10,5);

		bdoor = new Rectangle(x+10,y+10,35,19);
		//bdoor.setColor(Color.WHITE);
		
		fdoor = new Rectangle(x+45,y+10,35,19);
		//fdoor.setColor(Color.WHITE);
		
		bdoorhandle = new Rectangle(x+15,y+15,5,2);
		bdoorhandle.setColor(Color.WHITE);
		
		fdoorhandle = new Rectangle(x+50,y+15,5,2);
		fdoorhandle.setColor(Color.WHITE);
		
		windshield1 = new Rectangle(x+10,y-10,60,20);
		windshield1.setColor(window);
		
		windshield2 = new Rectangle(x+69,y+1,11,9);
		windshield2.setColor(window);
		
		windshieldframe1 = new Rectangle(x+10,y-10,60,20);
		
		windshieldframe2 = new Rectangle(x+70,y,10,10);
		
		bumper = new Rectangle(x-5,y+25,11,5);
		bumper.setColor(TandB);
		
		fbumper = new Rectangle(x+95,y+25,10,5);
		fbumper.setColor(TandB);
		
		bwheel = new Ellipse(x+10,y+20,20,20);
		bwheel.setColor(TandB);
		
		fwheel = new Ellipse(x+70,y+20,20,20);
		fwheel.setColor(TandB);

		brakelight = new Rectangle(x,y+20,5,3);
		brakelight.setColor(Color.RED);
		
		taillight = new Rectangle(x,y+20,5,5);
		taillight.setColor(Color.YELLOW);
		
		headlight = new Rectangle(x+95,y+20,5,5);
		headlight.setColor(Color.YELLOW);
		
		tframe = new Rectangle(x,y+20,5,5);
		// tframe.setColor(Color.WHITE);
		
		hframe = new Rectangle(x+95,y+20,5,5);
		// hframe.setColor(Color.WHITE);
		
		bcap = new Ellipse(x+15,y+25,10,10);
		bcap.setColor(capcolor);
		
		fcap = new Ellipse(x+75,y+25,10,10);
		fcap.setColor(capcolor);
		// Neato add 10/21/18
		int bbWidth = body4.getWidth()+bodyframe1.getWidth()+fbumper.getWidth()*2+hframe.getWidth();
		int bbHeight = windshieldframe1.getHeight()+bodyframe1.getHeight();
		boundBox = new Rectangle(body4.getX(),windshieldframe1.getY(),bbWidth,bbHeight);
		boundBox.setColor(Color.RED);
		// make the box but don't draw it, just need the boundaries
	
	}
	
	public void setColor(Color bodyc)
	{

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
		boundBox.draw();
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
		boundBox.translate(MOVEX,MOVEY);
	}

	/*
	public void grow(double GROWX, double GROWY)
	{	
		body1.grow(GROWX,GROWY);
		bodyframe1.grow(GROWX,GROWY);
		body2.grow(GROWX,GROWY);
		bodyframe2.grow(GROWX,GROWY);
		bodyframe3.grow(GROWX,GROWY);
		body3.grow(GROWX,GROWY);
		body4.grow(GROWX,GROWY);
		spoilerframe.grow(GROWX,GROWY);
		
		bdoorhandle.grow(GROWX,GROWY);
		fdoorhandle.grow(GROWX,GROWY);
		
		windshield1.grow(GROWX,GROWY);
		windshieldframe1.grow(GROWX,GROWY);
		windshieldframe2.grow(GROWX,GROWY);;
		windshield2.grow(GROWX,GROWY);
		
		bdoor.grow(GROWX,GROWY);
		fdoor.grow(GROWX,GROWY);
		
		bwheel.grow(GROWX,GROWY);
		fwheel.grow(GROWX,GROWY);
		
		bumper.grow(GROWX,GROWY);
		fbumper.grow(GROWX,GROWY);
		
		taillight.grow(GROWX,GROWY);
		headlight.grow(GROWX,GROWY);
		brakelight.grow(GROWX,GROWY);
		
		tframe.grow(GROWX,GROWY);
		hframe.grow(GROWX,GROWY);
		
		bcap.grow(GROWX,GROWY);
		fcap.grow(GROWX,GROWY);
	}
	*/
	
	/*public void reverse()
	{
		body1.translate(0,0);
		bodyframe1.translate(0,0);
		body2.translate(-90,0);
		bodyframe2.translate(-90,0);
		bodyframe3.translate(-100,0);
		body3.translate(-100,0);
		body4.translate(80,0);
		spoilerframe.translate(80,0);
		
		bdoorhandle.translate(45,0);
		fdoorhandle.translate(-25,0);
		
		windshield1.translate(0,0);
		windshieldframe1.translate(0,0);
		windshieldframe2.translate(-70,0);;
		windshield2.translate(-70,0);
		
		bdoor.translate(45,0);
		fdoor.translate(-35,0);
		
		bwheel.translate(40,0);
		fwheel.translate(-40,0);
		
		bumper.translate(100,0);
		fbumper.translate(-100,0);
		
		taillight.translate(95,0);
		headlight.translate(-95,0);
		brakelight.translate(95,0);
		
		tframe.translate(95,0);
		hframe.translate(-95,0);
		
		bcap.translate(40,0);
		fcap.translate(-40,0);
	}
	*/
	public int getX()
	{
		return boundBox.getX();
	}	
	public int getY()
	{
		return boundBox.getY();
	}	
	public int getWidth()
	{
		return boundBox.getWidth();
	}	
	public int getHeight()
	{
		return boundBox.getHeight();
	}	
	public Rectangle getBounds()
	{
		return boundBox;
	}
		
}


