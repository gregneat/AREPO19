package pkg;

public class ethanCarP3 implements Vehicle
{
        private Rectangle body,imag;
		private Ellipse wheel1,wheel2;
		private Text name;
		private String string;
		private Color color;

		public ethanCarP3(double x, double y)
		{
			body = new Rectangle(x,y,50,40);
			wheel1 = new Ellipse(x-10,y+30,20,20);
			wheel2= new Ellipse(x+40,y+30,20,20);
			body.setColor(Color.BLUE);
			imag = new Rectangle(x-10,y,70,50);
			name = new Text(0,0,"shyla cant yeet");
		}
		public ethanCarP3(double x, double y, Color c)
		{
			this(x,y);
			name = new Text(0,0,"shyla cant yeet");
			body.setColor(c);
			
		}
		public ethanCarP3(double x, double y, String s)
		{
			this(x,y);
			// body = new Rectangle(x,y,50,40);
			// wheel1 = new Ellipse(x-10,y+30,20,20);
			// wheel2= new Ellipse(x+40,y+30,20,20);
			// body.setColor(Color.BLUE);
			// imag = new Rectangle(x-10,y,70,50);
			string = ""+s;
			name = new Text(x,y-15,""+s);
			name.draw();
		}
		public ethanCarP3(int x, int y){
			body = new Rectangle(x,y,50,40);
			wheel1 = new Ellipse(x-10,y+30,20,20);
			wheel2= new Ellipse(x+40,y+30,20,20);
			body.setColor(Color.BLUE);
			imag = new Rectangle(x-10,y,70,50);
			name = new Text(0,0,"shyla cant yeet");
		}
		public void translate(double x, double y)
		{
			body.translate(x,y);
			wheel1.translate(x,y);
			wheel2.translate(x,y);
			imag.translate(x,y);
			name.translate(x,y);
		}
		public void yeet(int x, int y)
		{
			body.translate(x,y);
			wheel1.translate(x,y);
			wheel2.translate(x,y);
			imag.translate(x,y);
			name.translate(x,y);
		}
		public void fill()
		{
			body.fill();
			wheel1.fill();
			wheel2.fill();
		}
		public void draw()
		{
			fill();
		}
		public int getX()
		{
			return imag.getX();
		}
		public int getY()
		{
			return imag.getY();
		}
		public void recycle(int x, int y)
		{
			if(imag.getX()>600)
			{
				body.translate(x,y);
				wheel1.translate(x,y);
				wheel2.translate(x,y);
				imag.translate(x,y);
				name.translate(x,y);
			}
		}
		public java.lang.String getName()
		{
			return(string);
		}
		public void setColor(int r, int g, int b)
		{
			color = new Color(r,g,b);
			body.setColor(color);
		}
		
}