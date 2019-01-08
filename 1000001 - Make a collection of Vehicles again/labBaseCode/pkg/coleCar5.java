package pkg;

public class coleCar5 implements Vehicle{
	private Rectangle R;
	private Rectangle HB;
	private Ellipse wheel_1;
	private Ellipse wheel_2;
	private Text name;
	private String s;
	private Color c;
	public coleCar5(int w, int z, int wheel_widthx, int wheel_heightx, int coleCar5_lengthx,int coleCar5_heightx){
		
		R = new Rectangle(w,z,coleCar5_lengthx,coleCar5_heightx);
		wheel_1 = new Ellipse(w-wheel_widthx/2,z+coleCar5_heightx-wheel_heightx/2,wheel_widthx,wheel_heightx);
		wheel_2 = new Ellipse(w+coleCar5_lengthx-wheel_widthx/2,z+coleCar5_heightx-wheel_heightx/2,wheel_widthx,wheel_heightx);
		HB = new Rectangle(w-wheel_widthx/2,z,coleCar5_lengthx+wheel_widthx,coleCar5_heightx+wheel_heightx/2);
		name = new Text(0,0,"");
		// HB.setColor(Color.RED);
	}
	public coleCar5(int w, int z){
		R = new Rectangle(w,z,50,20);
		wheel_1 = new Ellipse(w-5,z+15,10,10);
		wheel_2 = new Ellipse(w+45,z+15,10,10);
		HB = new Rectangle(w-5, z, 60, 25);
		name = new Text(w,z,"");
		// HB.setColor(Color.RED);
		
	}
	public coleCar5(int w, int z, String s){
		this(w,z);
		name.setText(s);
		
	}
	public coleCar5(int w, int z, String s,int r, int g, int b){
		this(w,z,s);
		c = new Color(r,g,b);
		R.setColor(c);
	}
	public void translate(double x, double y){
		R.translate(x,y);
		wheel_1.translate(x,y);
		wheel_2.translate(x,y);
		HB.translate(x,y);
		name.translate(x,y);
	}
	public void draw(){
		R.draw();
		wheel_1.fill();
		wheel_2.fill();
		name.draw();
		// HB.draw();
	}
	public void fill(){
		R.fill();
		wheel_1.fill();
		wheel_2.fill();
		name.setColor(Color.WHITE);
		name.draw();
		// HB.draw();
	}
	public int getX(){
		return HB.getX();
	}
	public int getY(){
		return HB.getY();
	}
	public int getWidth(){
		return HB.getWidth();
	}
	public int getHeight(){
		return HB.getHeight();
	}
	public String getName(){
		return name.toString();
	}
	public void grow(int x, int y){
		R.grow(x,y);
		HB.grow(x,y);
		wheel_1.grow(x,y);
		wheel_2.grow(x,y);
		name.grow(x,y);
		wheel_1.translate(-x,y);
		wheel_2.translate(x,y);
	}
	public Rectangle getBounds(){
		return HB;
	}
	
} 