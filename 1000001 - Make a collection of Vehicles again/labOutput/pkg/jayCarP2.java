package pkg;

public class jayCarP2 implements Vehicle{
			Rectangle body;
			Ellipse wheel1;
			Ellipse wheel2;
			Ellipse man1;
			Ellipse eye1;
			Ellipse eye2;
			Rectangle doors;
			Rectangle hood;
			Rectangle back;
			Rectangle lights;
			Rectangle boundBox;

        public jayCarP2(int x, int y)
        {
			// put code here
			double s = .75;
			body= new Rectangle(x,y,80*s,50*s);
			wheel1 = new Ellipse(x+5*s,y+40*s,20*s,20*s);
			wheel2= new Ellipse(x+85*s,y+40*s,20*s,20*s);
			man1 = new Ellipse(x+60*s,y,20*s,20*s);
			eye1 = new Ellipse(x+64*s,y+4*s,5*s,5*s);
			eye2 = new Ellipse(x+72*s,y+4*s,5*s,5*s);
			doors = new Rectangle (x-10*s,y+20*s,110*s,30*s);
			hood = new Rectangle(x+100*s,y+30*s,30*s,20*s);
			back =new Rectangle (x-20*s,y+20*s,20*s,30*s);
			lights = new Rectangle (x+120*s,y+40*s,10*s,5*s);
			boundBox = new Rectangle(x-20*s,y,150*s,60*s);
			
			body.fill();
			
			man1.fill();
			eye1.fill();
			eye2.fill();
			
			hood.fill();
			back.fill();
			doors.fill();
			lights.fill();
			//boundBox.draw();
			lights.setColor(Color.YELLOW);
			eye1.setColor(Color.WHITE);
			eye2.setColor(Color.WHITE);
			man1.setColor(Color.BLACK);
			
			doors.setColor(Color.RED);
			body.setColor(Color.BLUE);
			hood.setColor(Color.RED);
			back.setColor(Color.RED);
			wheel1.fill();
			wheel2.fill();
		
	
		}
		public void draw()
		{
		}
		
		public void translate(double z, double v)
		{
			body.translate(z,v);			
			wheel1.translate(z,v);
			wheel2.translate(z,v);
			man1.translate(z,v);
			eye1.translate(z,v);
			eye2.translate(z,v);
			doors.translate(z,v);
			hood.translate(z,v);
			back.translate(z,v);
			lights.translate(z,v);
			boundBox.translate(z,v);
		}
		public int getX()
		{
			return boundBox.getX();
		}
		public int getY()
		{
			return boundBox.getY();
		}
		public double getHeight()
		{
			return (((wheel1.getHeight())*0.5)+body.getHeight());
		}
		
		public int getWidth()
		{
			return boundBox.getWidth();
		}
	
		public Rectangle getBounds()
		{
			return boundBox;
		}
		public void growcar(int z, int v)
		{
			body.grow(z,v);			
			wheel1.grow(z,v);
			wheel2.grow(z,v);
			man1.grow(z,v);
			eye1.grow(z,v);
			eye2.grow(z,v);
			doors.grow(z,v);
			hood.grow(z,v);
			back.grow(z,v);
			lights.grow(z,v);
			boundBox.grow(z,v);
		}
		
	
}