package pkg;

public class kevinCarP4 implements Vehicle
{
	private Rectangle boundingbox, Trunk, main, doorpanel, rearpanel, reartail, rear, HIDErear, FRONTDOR, Frontquad, Frontpanel, HIDErearF, WINDOW, roofback, Roof, doorout, support, doorhandle; 
	private Ellipse bumper, WHEELWELL, REARWHEEL, REARHUB, WHEELWELLF, FRONTHUB, FRONTWHEEL, Fbumper, F;
	private Text avacado;
	private double xx, yy;
	private String taco;

	public kevinCarP4(int xx, int yy)

	{
		double x= .43;
		double chris = Math.random();
		double Mathew= Math.random();
		double Ricky= Math.random();
		int R=(int)(chris*256);
		int G=(int)(Mathew*256);
		int B=(int)(Ricky*256);
		Color Banana= new Color(R, G, B);
			
		Color GREY = new Color (159, 159, 159);
		bumper= new Ellipse(40*x,370*x,66*x,50*x);
		bumper.fill();
		bumper.setColor(GREY);
		Trunk =new Rectangle(44*x,324*x, 24*x, 50*x);
		Trunk.fill();
		Trunk.setColor(GREY);
		main= new Rectangle(186*x,310*x,79*x,112*x);
		main.fill();
		main.setColor(Banana);
		doorpanel= new Rectangle(238*x,326*x,262*x,104*x);
		doorpanel.fill();
		doorpanel.setColor(Banana);
		rearpanel= new Rectangle(148*x,316*x,38*x,104*x);
		rearpanel.fill();
		rearpanel.setColor(Banana);
		reartail= new Rectangle(108*x,320*x,45*x,100*x);
		reartail.fill();
		reartail.setColor(Banana);
		rear= new Rectangle(64*x, 322*x, 44*x, 100*x);
		rear.fill();
		rear.setColor(Banana);
		WHEELWELL= new Ellipse (118*x, 360*x, 112*x, 112*x);
		WHEELWELL.fill();
		WHEELWELL.setColor(GREY);
		HIDErear= new Rectangle (108*x, 420*x, 132*x, 60*x);
		HIDErear.fill();
		HIDErear.setColor(Color.WHITE);
		REARWHEEL= new Ellipse (122*x, 368*x, 104*x, 104*x);
		REARWHEEL.fill();
		REARHUB= new Ellipse (135*x, 380*x, 80*x, 80*x);
		REARHUB.fill();
		REARHUB.setColor(GREY);
		FRONTDOR= new Rectangle(500*x,322*x, 60*x, 108*x);
		FRONTDOR.fill();
		FRONTDOR.setColor(Banana);
		Frontquad= new Rectangle(560*x,326*x,76*x,94*x);
		Frontquad.fill();
		Frontquad.setColor(Banana);
		Frontpanel = new Rectangle(620*x,330*x,88*x,78*x);
		Frontpanel.fill();
		Frontpanel.setColor(Banana);
		WHEELWELLF= new Ellipse (575*x, 355*x, 112*x, 112*x);
		WHEELWELLF.fill();
		WHEELWELLF.setColor(GREY);
		HIDErearF= new Rectangle (575*x, 420*x, 132*x, 60*x);
		HIDErearF.fill();
		HIDErearF.setColor(Color.WHITE);
		FRONTWHEEL= new Ellipse (580*x, 360*x, 104*x, 104*x);
		FRONTWHEEL.fill();
		FRONTHUB= new Ellipse (590*x, 370*x, 80*x, 80*x);
		FRONTHUB.fill();
		FRONTHUB.setColor(GREY);
		Fbumper= new Ellipse(691*x,374*x,33*x,40*x);
		Fbumper.fill();
		Fbumper.setColor(GREY);
		F= new Ellipse(691*x,334*x,30*x,30*x);
		F.fill();
		F.setColor(Color.YELLOW);
		//Roof
		WINDOW= new Rectangle(262*x, 276*x, 242*x, 54*x);
		WINDOW.fill();
		WINDOW.setColor(Color.CYAN);
		roofback= new Rectangle (200*x,266*x,62*x,48*x);
		roofback.fill();
		roofback.setColor(Color.BLACK);
		Roof=new Rectangle (200*x,266*x,324*x,10*x);
		Roof.fill();
		doorout= new Rectangle(312*x,330*x,190*x,80*x);
		doorout.draw();
		support= new Rectangle(312*x,276*x,10*x,54*x);
		support.fill();
		doorhandle= new Rectangle(328*x, 350*x, 30*x,10*x);
		doorhandle.fill();
		boundingbox= new Rectangle(40*x,266*x,685*x,205*x);
		//boundingbox.draw();
		boundingbox.setColor(Color.RED);
			
			
	}
	public kevinCarP4(int xx, int yy, String name)
	{
	this(xx,yy);
	avacado= new Text(F.getX()+ 15, F.getY()+ 5, name);	
	avacado.draw();
	taco=name;
	}
	
	public void draw()
	{
		
	}

	public void translate(double xx, double yy)
	{
	Trunk.translate(xx,yy);
	main.translate(xx,yy);
	doorpanel.translate(xx,yy);
	rearpanel.translate(xx,yy);
	reartail.translate(xx,yy);
	rear.translate(xx,yy);
	HIDErear.translate(xx,yy);
	FRONTDOR.translate(xx,yy);
	Frontquad.translate(xx,yy);
	Frontpanel.translate(xx,yy);
	HIDErearF.translate(xx,yy);
	WINDOW.translate(xx,yy);
	roofback.translate(xx,yy);
	Roof.translate(xx,yy);
	doorout.translate(xx,yy);
	doorhandle.translate(xx,yy);
	boundingbox.translate(xx,yy);
	support.translate(xx,yy);
	bumper.translate(xx,yy);
	WHEELWELL.translate(xx,yy);
	REARHUB.translate(xx,yy);
	REARWHEEL.translate(xx,yy);
	WHEELWELLF.translate(xx,yy);
	FRONTWHEEL.translate(xx,yy);
	Fbumper.translate(xx,yy);
	F.translate(xx,yy);
	FRONTHUB.translate(xx,yy);
	
	if(avacado!=null)
		avacado.translate(xx,yy);
	
	
	}

	public int getX()
	{
		return boundingbox.getX();
	}	
	
	public int getY()
	{
		return boundingbox.getY();
	}
	
	public int getHeight()
	{
			return boundingbox.getHeight();
	}
	
	public int getWidth()
	{
		return boundingbox.getWidth();
	}
	
	public Rectangle getBoundingbox()
	{
		return boundingbox;
	}
	public String getName()
	{
		return taco;
	}
}