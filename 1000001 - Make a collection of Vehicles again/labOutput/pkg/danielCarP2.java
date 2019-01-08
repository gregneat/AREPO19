package pkg;

public class danielCarP2 implements Vehicle
{
	private Rectangle box1;
	private Ellipse edgetr;
	private Rectangle toppanel;
	private Ellipse edgetl;
	private Rectangle frontpanel;
	private Ellipse edgebr;
	private Rectangle backpanel;
	private Ellipse edgebl;
	private Ellipse wheel1;
	private Ellipse wheel2;
	private Ellipse circ1;
	private Ellipse circ2;
	private Ellipse circ3;
	private Ellipse circ4;
	private Rectangle box2;
	private Rectangle box3;
	private Rectangle box4;
	private Rectangle box5;
	private Rectangle box6;
	private Rectangle box7;
	private Rectangle box8;
	private Rectangle box9;
	private Rectangle box10;
	private Rectangle box11;
	private Rectangle box12;
	private Rectangle box13;
	private Rectangle box14;
	private Rectangle brakelight;
	private Rectangle brakelight2;
	private Rectangle signal;
	private Rectangle brakelight3;
	private Rectangle signal2;
	private Text bus;
	
	public danielCarP2(int ex, int why)
	{
		box1 = new Rectangle(ex,why,130,50);
		edgetr = new Ellipse(ex+120,why-11,20,20);
		toppanel = new Rectangle(ex-5,why-10,135,20);
		edgetl = new Ellipse(ex-10,why-11,20,20);
		frontpanel = new Rectangle(ex+130,why-5,10,50);
		frontpanel = new Rectangle(ex+130,why-5,10,50);
		edgebr = new Ellipse(ex+120,why+30,20,20);
		backpanel = new Rectangle(ex-9,why-5,10,50);
		edgebl = new Ellipse(ex-10,why+30,20,20);
		wheel1 = new Ellipse(ex+7,why+38,26,26);
		wheel2 = new Ellipse(ex+89,why+38,26,26);
		circ1 = new Ellipse(ex+10,why+40,20,20);
		circ2 = new Ellipse(ex+92,why+40,20,20);
		circ3 = new Ellipse(ex+15,why+45,10,10);
		circ4 = new Ellipse(ex+97,why+45,10,10);
		box2 = new Rectangle(ex+114,why,20,14);
		box3 = new Rectangle(ex,why,10,14);
		box4 = new Rectangle(ex+14,why,10,14);
		box5 = new Rectangle(ex+28,why,10,14);
		box6 = new Rectangle(ex+42,why,10,14);
		box7 = new Rectangle(ex+56,why,10,14);
		box8 = new Rectangle(ex+70,why,10,14);
		box9 = new Rectangle(ex+84,why,10,14);
		box10 = new Rectangle(ex+98,why,10,14);
		box11 = new Rectangle(ex+118,why+17,8,30);
		box12 = new Rectangle(ex+127,why+17,8,30);
		brakelight = new Rectangle(ex-9,why,5,8);
		brakelight2 = new Rectangle(ex-9,why+36,5,5);
		signal = new Rectangle(ex-9,why+30,5,6);
		box13 = new Rectangle(ex-9,why+20,126,2);
		box14 = new Rectangle(ex-4,why+36,121,2);
		brakelight3 = new Rectangle(ex+136,why-4,4,6);
		signal2 = new Rectangle(ex+136,why+36,4,6);
		bus = new Text(ex+23,why+20, "SCHOOL BUS");
	}
	public void draw()
	{
		box1.fill();
		box1.setColor(Color.YELLOW);
		edgetr.fill();
		edgetr.setColor(Color.YELLOW);
		toppanel.fill();
		toppanel.setColor(Color.YELLOW);
		edgetl.fill();
		edgetl.setColor(Color.YELLOW);
		frontpanel.fill();
		frontpanel.setColor(Color.YELLOW);
		edgebr.fill();
		edgebr.setColor(Color.YELLOW);
		backpanel.fill();
		backpanel.setColor(Color.YELLOW);
		edgebl.fill();
		edgebl.setColor(Color.YELLOW);
		wheel1.fill();
		wheel1.setColor(Color.WHITE);
		wheel2.fill();
		wheel2.setColor(Color.WHITE);
		circ1.fill();
		circ2.fill();
		circ3.fill();
		circ3.setColor(Color.WHITE);
		circ4.fill();
		circ4.setColor(Color.WHITE);
		circ1.fill();
		box2.fill();
		box2.setColor(Color.WHITE);
		box3.fill();
		box3.setColor(Color.GRAY);
		box4.fill();
		box4.setColor(Color.GRAY);
		box5.fill();
		box5.setColor(Color.GRAY);
		box6.fill();
		box6.setColor(Color.GRAY);
		box7.fill();
		box7.setColor(Color.GRAY);
		box8.fill();
		box8.setColor(Color.GRAY);
		box9.fill();
		box9.setColor(Color.GRAY);
		box10.fill();
		box10.setColor(Color.GRAY);
		box11.fill();
		box11.setColor(Color.GRAY);
		box12.fill();
		box12.setColor(Color.GRAY);
		brakelight.fill();
		brakelight.setColor(Color.RED);
		brakelight2.fill();
		brakelight2.setColor(Color.RED);
		signal.fill();
		signal.setColor(Color.ORANGE);
		box13.fill();
		box14.fill();
		brakelight3.fill();
		brakelight3.setColor(Color.RED);
		signal2.fill();
		signal2.setColor(Color.ORANGE);
		bus.draw();
	}
	
	public void translate(double ex,double why)
	{
		box1.translate(ex,why);
		edgetr.translate(ex,why);
		toppanel.translate(ex,why);
		edgetl.translate(ex,why);
		frontpanel.translate(ex,why);
		edgebr.translate(ex,why);
		backpanel.translate(ex,why);
		edgebl.translate(ex,why);
		wheel1.translate(ex,why);
		wheel2.translate(ex,why);
		circ1.translate(ex,why);
		circ2.translate(ex,why);
		circ3.translate(ex,why);
		circ4.translate(ex,why);
		box2.translate(ex,why);
		box3.translate(ex,why);
		box4.translate(ex,why);
		box5.translate(ex,why);
		box6.translate(ex,why);
		box7.translate(ex,why);
		box8.translate(ex,why);
		box9.translate(ex,why);
		box10.translate(ex,why);
		box11.translate(ex,why);
		box12.translate(ex,why);
		box13.translate(ex,why);
		box14.translate(ex,why);
		brakelight.translate(ex,why);
		brakelight2.translate(ex,why);
		signal.translate(ex,why);
		brakelight3.translate(ex,why);
		signal2.translate(ex,why);
		bus.translate(ex,why);
	}
	public int getX(){
		return box1.getX();
		// return edgetr.getex();
		// return toppanel.getex();
		// return edgetl.getex();
		// return frontpanel.getex();
		// return edgebr.getex();
		// return backpanel.getex();
		// return edgebl.getex();
	}
	public int getY(){
		return box1.getY();
		// return edgetr.getex();
		// return toppanel.getex();
		// return edgetl.getex();
		// return frontpanel.getex();
		// return edgebr.getex();
		// return backpanel.getex();
		// return edgebl.getex();
	}
}