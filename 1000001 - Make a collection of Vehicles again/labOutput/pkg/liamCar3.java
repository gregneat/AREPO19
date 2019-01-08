package pkg;

public class liamCar3 implements Vehicle
{		
		private Rectangle body;
		private Ellipse wheel_1;
		private Ellipse wheel_2;
		private Rectangle bound; 
		
		public liamCar3(int x, int y)
		{
			body = new Rectangle(x,y,50.0,40.0);
			body.setColor(Color.RED);
			wheel_1 = new Ellipse(x-10,y+30,20.0,20.0);
			wheel_2 = new Ellipse(x+40,y+30,20.0,20.0);
			bound = new Rectangle(x-10,y,70,50);
		}
		
		public void draw(){
			fill();
		}
		
		public void fill()
		{
			bound.draw();
			body.fill();
			wheel_1.fill();
			wheel_2.fill();
		}
		
		public void translate(int x, int y)
		{
			body.translate(x,y);
			wheel_1.translate(x,y);
			wheel_2.translate(x,y);
			bound.translate(x,y);
		}
		
		public void translate(double x, double y)
		{
			body.translate(x,y);
			wheel_1.translate(x,y);
			wheel_2.translate(x,y);
			bound.translate(x,y);
		}
		
		public int getX()
		{
			return bound.getX();
		}
		
		public int getY()
		{
			return bound.getY();
		}
}