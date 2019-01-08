package pkg;

public class matthewCarP3 implements Vehicle{
//Class name and constructor must match file name exactly
        
		private Rectangle roof;
		private Rectangle hood;
		private Ellipse chood1;
		private Ellipse chood2;
		private Ellipse wheel1;
		private Ellipse wheel2;
		private Ellipse cap1;
		private Ellipse cap2;
		private String rloc;
		private Text location;
		private String name;
		private Text txt;
		private double x;
		private double y;
		private long speed = 3;
		
		public matthewCarP3(int x, int y)
		{
			roof = new Rectangle(x,y,50,40);
			hood = new Rectangle(x-20,y+20,90,20);
			roof.setColor(Color.GRAY);
			hood.setColor(Color.GRAY);
			
			rloc = "("+x+","+y+")";
			location = new Text(x,y-15,rloc);
			
			chood1 = new Ellipse(x+30,y+10,40,20);
			chood1.setColor(Color.GRAY);
			
			chood2 = new Ellipse(x-20,y+10,40,20);
			chood2.setColor(Color.GRAY);
			
			wheel1 = new Ellipse(x-10,y+30,20,20);
			wheel2 = new Ellipse(x+40,y+30,20,20);
			
			cap1 = new Ellipse(x-5,y+35,10,10);
			cap1.setColor(Color.GRAY);

			cap2 = new Ellipse(x+45,y+35,10,10);
			cap2.setColor(Color.GRAY);
			
			txt = new Text(x,y+10,"");
		}
		
		public matthewCarP3(int x, int y, String s, Color color)
		{	
			this (x,y);
			roof.setColor(color);
			hood.setColor(color);
			chood1.setColor(color);
			chood2.setColor(color);
			cap1.setColor(color);
			cap2.setColor(color);
			name = s;
			txt.setText(s);
		}
		
		public int getX()
		{
			return roof.getX();
		}
		
		public int getY()
		{
			return roof.getY();
		}
		
		public double getHeight()
		{
			return 45.00;
		}
		
		public String getName()
		{
			return name;
		}
		
		public void setName(String n)
		{
			name = n;
			txt.setText(name);
		}
		
		// public void gotoY(double dy)
		// {
		// roof.gotoY(dy);
		// hood.gotoY(dy+20);
		// chood1.gotoY(dy+10);
		// chood2.gotoY(dy+10);
		// wheel1.gotoY(dy+30);
		// wheel2.gotoY(dy+30);
		// cap1.gotoY(dy+35);
		// cap2.gotoY(dy+35);
		// location.gotoY(dy-15);
		// txt.gotoY(dy+10);
		// int rlocx = roof.getX();
		// int rlocy = roof.getY();
		// rloc = "("+rlocx+","+rlocy+")";
		// location.setText(rloc);
		// }
		
		// public void gotoX(double dx)
		// {
		// roof.gotoY(dx);
		// hood.gotoY(dx-20);
		// chood1.gotoY(dx+30);
		// chood2.gotoY(dx-20);
		// wheel1.gotoY(dx-10);
		// wheel2.gotoY(dx+40);
		// cap1.gotoY(dx-5);
		// cap2.gotoY(dx+45);
		// location.gotoY(dx);
		// txt.gotoY(dx);
		// int rlocx = roof.getX();
		// int rlocy = roof.getY();
		// rloc = "("+rlocx+","+rlocy+")";
		// location.setText(rloc);
		// }
		
		public void showLocation()
		{
			location.draw();
		}
		
		public void setColor(Color c)
		{
			roof.setColor(c);
			hood.setColor(c);
			chood1.setColor(c);
			chood2.setColor(c);
			cap1.setColor(c);
			cap2.setColor(c);
		}
		public void draw()
		{
			roof.fill();
			hood.fill();
			chood1.fill();
			chood2.fill();
			wheel2.fill();
			wheel1.fill();
			cap1.fill();
			cap2.fill();
			txt.draw();
		}
		
		public void createDiscoParty()
		{
			while(true){
			try{Thread.sleep(100);}
			catch(InterruptedException e){}
			int r = (int)(Math.random()*256);
			int g = (int)(Math.random()*256);
			int b = (int)(Math.random()*256);
			Color randcolor = new Color(r,g,b);
			roof.setColor(randcolor);
			hood.setColor(randcolor);
			chood1.setColor(randcolor);
			chood2.setColor(randcolor);
			cap1.setColor(randcolor);
			cap2.setColor(randcolor);
			}
		}
		
		public void setSpeedDelay(long s){
		speed = s;
		}
		
		public void translate(double xx,double yy)
		{
		int rlocx = roof.getX();
		int rlocy = roof.getY();
		try{Thread.sleep(speed);}
		catch(InterruptedException e){}
		roof.translate(xx,yy);
		hood.translate(xx,yy);
		chood1.translate(xx,yy);
		chood2.translate(xx,yy);
		wheel1.translate(xx,yy);
		wheel2.translate(xx,yy);
		cap1.translate(xx,yy);
		cap2.translate(xx,yy);
		txt.translate(xx,yy);
		location.translate(xx,yy);
		rloc = "("+rlocx+","+rlocy+")";
		location.setText(rloc);
		}
}