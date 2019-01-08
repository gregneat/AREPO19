package pkg;


public class JosephCarP1 implements Vehicle{
	
	private Rectangle joe;
	private Ellipse whol;
	private Ellipse whole;
	private Rectangle bound;
	private Text onse;
	private String s;

    public JosephCarP1(int banana, int apple){
			bound = new Rectangle(banana-10,apple,70,50);
			bound.setColor(Color.RED);
			bound.draw();
			joe = new Rectangle(banana,apple,50,40);
			joe.setColor(Color.BLUE);
			
			whol = new Ellipse(banana-10,apple+30,20,20);

			whole = new Ellipse(banana+40,apple+30,20,20);
			
			onse = new Text(banana,apple,"");
			onse.setColor(Color.WHITE);
	}
	
	public JosephCarP1(int xs, int ys, String s){
	
			this(xs,ys);
			onse.setText(s);
			// bound = new Rectangle(x-10,y,70,50);
			// bound.setColor(Color.RED);
			// joe = new Rectangle(x,y,50,40);
			// joe.setColor(Color.BLUE);
			
			// whol = new Ellipse(x-10,y+30,20,20);

			// whole = new Ellipse(x+40,y+30,20,20);
			
			// onse = new Text(x, y, s);
	}
	
	public void translate(int xx, int yy){
		
		joe.translate(xx,yy);
		whol.translate(xx,yy);
		whole.translate(xx,yy);
		bound.translate(xx,yy);
		onse.translate(xx,yy);
	}
	
	public void translate(double xx, double yy){
		
		joe.translate(xx,yy);
		whol.translate(xx,yy);
		whole.translate(xx,yy);
		bound.translate(xx,yy);
		onse.translate(xx,yy);
	}
	
	public void fill(){
		
		joe.fill();
		whol.fill();
		whole.fill();
		onse.draw();
		bound.draw();
	}
	
	public void draw(){
		
		joe.fill();
		whol.fill();
		whole.fill();
		onse.draw();
		bound.draw();
	}

    public void setColor(Color redf){
		joe.setColor(redf);
		whol.setColor(redf);
		whole.setColor(redf);
		onse.setColor(redf);
	}
	
	public String getName(){
			return s;
	}
	
	public int getX(){
		return bound.getX();
	}
	
	public int getY(){
		return bound.getY();
	}

	public int getHeight(){
		return bound.getHeight();
	}
	
	public int getWidth(){
		return bound.getWidth();
	}
	
	public Rectangle bounds(){
		return bound;
	}

}