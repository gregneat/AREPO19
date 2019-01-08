package pkg;

public class ConnorCarP2 implements Vehicle{
	private double x;
	private double y;
	private double width;
	private double height;
	private static int amnt;
	private String text;
	private int r,g,b;
	private Rectangle top;
	private Rectangle body;
	private Ellipse lwheel;
	private Ellipse rwheel;
	private Text word;
	private Color joe;
	
	// Constructs an empty car
	public ConnorCarP2() {
		x = 0;
		y = 0;
		
	}
	
	public ConnorCarP2(int x, int y){
		this(x,y,30,20,"");
	}
	
	// Constructs a Car
	public ConnorCarP2(double x, double y, double width, double height, String text){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		top = new Rectangle(x+10,y,width-20,height-10);//50,20
		body = new Rectangle(x,y+20,width,height);//70,30
		lwheel = new Ellipse(x-5,y+40,width-50,height-10);//20,20
		rwheel = new Ellipse(x+55,y+40,width-50,height-10);//20,20
		word = new Text(x+20,y+10,text);
	}
	//fills a car
	public void fill(){
		top.fill();
		body.fill();
		lwheel.fill();
		rwheel.fill();
		word.draw();
	}
	//draws a car
	public void draw(){
		top.draw();
		body.draw();
		lwheel.draw();
		rwheel.draw();
		word.draw();
	}
	//sets color of body
	public void setColor(int r, int g, int b){
		this.r = r;
		this.g = g;
		this.b = b;
		Color joe = new Color(r,g,b);
		top.setColor(joe);
		body.setColor(joe);
		this.joe = joe;
	}
	public void randColor(){
		int r = (int)(Math.random() * 255);
		int g = (int)(Math.random() * 255);
		int b = (int)(Math.random() * 255);
		Color joe = new Color(r,g,b);
		top.setColor(joe);
		body.setColor(joe);
		this.joe = joe;
		
	}
	//translates a car
	public void translate(double dx, double dy){
		x += dx;
		y += dy;
		top.translate(dx,dy);
		body.translate(dx,dy);
		lwheel.translate(dx,dy);
		rwheel.translate(dx,dy);
		word.translate(dx,dy);
	}
	//sleeps for an amount
	public static void sleep(int amount){
		amnt = amount;
		try{
			Thread.sleep(amnt);
		}
		catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
	}
	//gets speed
	public String getSpeed(){
		return "the speed is: " + amnt;
	}
	//gets x
	public int getX(){
		return (int) Math.round(x);
	}
	//gets y
	public int getY(){
		return (int) Math.round(y);
	}
	//gets text
	public String getText(){
		return text;
	}
	//gets width
	public int getWidth(){
		return (int) Math.round(width);
	}
	//gets height
	public int getHeight(){
		return (int) Math.round(height);
	}
	//shows x and y
	public String toString(){
		return "(" + x + ", " + y + ")";
	}
	//gets Color
	public String getColor() {
		return "Red: " + r + ", Green: " + g + ", Blue: " + b;
	}
	//moves a car to a specific location
	public void moveTo(double mx, double my){
		double hx = mx - top.getX();;
		double hy = mx - top.getY(); 
		top.translate(hx,hy);
		hx = mx - body.getX();
		hy = mx - body.getY();
		body.translate(hx,hy);
		hx = mx - lwheel.getX();
		hy = mx - lwheel.getY();
		lwheel.translate(hx,hy);
		hx = mx - rwheel.getX();
		hy = mx - rwheel.getY();
		rwheel.translate(hx,hy);
		
	}
	
}