package pkg;

public class andrewbCarP1 implements Vehicle
{
	
	private Rectangle filo;
	private Ellipse pilo;
	private Ellipse sim;
	private Rectangle bound;
	private Rectangle wind;
	private Text loopis;
	private String ced;
	
		public andrewbCarP1(int banana, int apple, String s){
			wind = new Rectangle(banana+10,apple,40,30);
			wind.setColor(Color.BLUE);
			
			
			filo = new Rectangle(banana,apple+10,50,30);
			filo.setColor(Color.BLACK);
				
			
			pilo = new Ellipse(banana-10,apple+30,20,20);		
		
			
			sim = new Ellipse(banana+40 ,apple+30,20,20);
			
			
			bound = new Rectangle(banana-10,apple,70,50);
			
			loopis = new Text(banana, apple-15, s);
			
			ced = s;
		}
		
		
		
		
		public void translate(double xx, double yy){
			filo.translate(xx,yy);
			pilo.translate(xx,yy);
			sim.translate(xx,yy);
			bound.translate(xx,yy);
			wind.translate(xx,yy);
			loopis.translate(xx,yy);
		}
		
		public void fill(){
			wind.fill();
			filo.fill();
			pilo.fill();
			sim.fill();
			// bound.draw();
			loopis.draw();
		}
		
		public void draw(){}
		
		public void grow(int gx, int gy){
			filo.grow(gx,gy);
			pilo.grow(gx,gy);
			sim.grow(gx,gy);
			pilo.translate(-gx,gy);
			sim.translate(gx,gy);
		}
		
		public int getX(){
			return bound.getX();
		}
		
		public int getY(){
			return bound.getY();
		}
		
		public String getName(){
			return ced;
		}
		
		public void setColor(int rr,int gg, int bb){
			Color goopy = new Color(rr,gg,bb);
			filo.setColor(goopy);
		}
		
        public static void main(String args[])
        {
			
			
		}
		
		

}