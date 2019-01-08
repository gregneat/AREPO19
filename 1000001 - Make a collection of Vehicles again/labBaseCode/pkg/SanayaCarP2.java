package pkg;

	public class SanayaCarP2 implements Vehicle
	{
		 Rectangle car;
		Rectangle cartop;
		Rectangle carlight;
		Rectangle bwindow;
		Rectangle fwindow;
		Ellipse wheel1;
		Ellipse wheel2;
		Ellipse wheelinl;
		Ellipse wheelinr;
		Rectangle box;

		public SanayaCarP2(int x,int y)
		{
                    box= new Rectangle(x-10,y,90,42);

                    car= new Rectangle(x,y,60,10);

                    car.setColor(Color.BLACK);

                    cartop= new Rectangle(x-10,y+10,90,20);
                    cartop.setColor(Color.BLACK);

                    carlight= new Rectangle(x-10,y+10,10,5);
                    carlight.setColor(Color.YELLOW);

                    wheel1= new Ellipse(x,y+22,20,20);

                    wheel2= new Ellipse(x+50,y+22,20,20);

                    bwindow=new Rectangle(x+2,y+2,25,10);
                    Color blue= new Color(100,189,233);
                    bwindow.setColor(blue);

                    fwindow=new Rectangle(x+32,y+2,25,10);
                    fwindow.setColor(blue);
                    wheelinl= new Ellipse(x+4,y+27,12,12);
                    wheelinl.setColor(Color.GRAY);

                    wheelinr= new Ellipse(x+54,y+27,12,12);
                    wheelinr.setColor(Color.GRAY);

		}
		public int getX()
                    {
                        return box.getX();

                    }
		public int getWidth()
		{

			return box.getWidth();
		}
		public int getHeight()
		{

			return box.getHeight();
		}
		public int getY()
		{
			return box.getY();
		}
		public void draw()
		{
                    car.fill();
                    cartop.fill();
                    carlight.fill();
                    wheel1.fill();
                    wheel2.fill();
                    wheelinr.fill();
                    wheelinl.fill();
                    bwindow.fill();
                    fwindow.fill();

		}
		public void translate(double xx, double yy)
		{
                    car.translate(xx,yy);
                    cartop.translate(xx,yy);
                    carlight.translate(xx,yy);
                    wheel1.translate(xx,yy);
                    wheel2.translate(xx,yy);
                    wheelinr.translate(xx,yy);
                    wheelinl.translate(xx,yy);
                    bwindow.translate(xx,yy);
                    fwindow.translate(xx,yy);
                    box.translate(xx,yy);
		}
		
	}