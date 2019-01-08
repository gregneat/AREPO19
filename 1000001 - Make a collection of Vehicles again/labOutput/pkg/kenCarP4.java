package pkg;

public class kenCarP4 implements Vehicle
{
	private Rectangle rbbox;
	private Rectangle lmbox;							
	private Rectangle msbox;
	private Ellipse lw;
	private Ellipse rw;
	private Rectangle window;
	private Ellipse siren;
	private Rectangle coversiren;
	private Rectangle vcross;
	private Rectangle hcross;
	private Rectangle carbox;
	private Rectangle yellowlight;
		
        public kenCarP4(int x1, int y1)
		{
			carbox=new Rectangle(x1,y1,120,66);
			carbox.setColor(Color.BLACK);
			
			rbbox=new Rectangle(x1+40,y1+1,79,50);
			rbbox.setColor(Color.WHITE);
			
			lmbox=new Rectangle(x1+1,y1+25,38,26);
			lmbox.setColor(Color.WHITE);
			
			lw=new Ellipse(x1+30,y1+45,20,20);
			lw.setColor(Color.GRAY);
			
			rw=new Ellipse(x1+91,y1+45,20,20);
			rw.setColor(Color.GRAY);
			
			siren=new Ellipse(x1+77,y1-10,15,15);
			siren.setColor(Color.RED);
			
			coversiren=new Rectangle(x1+69,y1+1,30,15);
			coversiren.setColor(Color.WHITE);
			
			vcross=new Rectangle(x1+77,y1+9,15,30);
			vcross.setColor(Color.RED);
			
			hcross=new Rectangle(x1+69,y1+16,31,15);
			hcross.setColor(Color.RED);
			
			msbox=new Rectangle(x1+19,y1+10,20,15);
			msbox.setColor(Color.WHITE);
			
			Color lightblue=new Color(204,255,255);
			
			window=new Rectangle(x1+19,y1+10,15,15);
			window.setColor(lightblue);

			yellowlight=new Rectangle(x1+1,y1+25,13,10);
			yellowlight.setColor(Color.YELLOW);
			

		}
				
		public void translate(double x2,double y2)
		{
			rbbox.translate(x2,y2);
			lmbox.translate(x2,y2);
			lw.translate(x2,y2);
			rw.translate(x2,y2);
			window.translate(x2,y2);
			carbox.translate(x2,y2);
			msbox.translate(x2,y2);
			siren.translate(x2,y2);
			coversiren.translate(x2,y2);
			vcross.translate(x2,y2);
			hcross.translate(x2,y2);
			yellowlight.translate(x2,y2);
		}
		
		public void draw()
		{
			rbbox.fill();
			lmbox.fill();					
			msbox.fill();
			lw.fill();
			rw.fill();
			window.fill();
			siren.fill();
			coversiren.fill();
			vcross.fill();
			hcross.fill();
			carbox.fill();
			yellowlight.fill();
		}
		
		public int getX()
		{
			return carbox.getX();
		}
		
		public int getY()
		{
			return carbox.getY();
		}
		
		public int getWidth()
		{
			return carbox.getWidth();
		}
		
		public int getHeight()
		{
			return carbox.getWidth();
		}

}