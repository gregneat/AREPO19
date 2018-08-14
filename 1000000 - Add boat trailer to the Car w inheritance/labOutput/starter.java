// note this solution utilize inheritance.

public class starter implements InputControl {
	
	public static void main(String args[])
        {
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			// int r = (int)(Math.random()*255);
			// int g = (int)(Math.random()*255);
			// int b = (int)(Math.random()*255);
			// Color temp = new Color(r,g,b);
			// Truck joe = new Truck(30,30,"neato",temp,23);
			// put your code here:
	
			int yStart = 0;
			int r = (int)(Math.random()*255);
			int g = (int)(Math.random()*255);
			int b = (int)(Math.random()*255);
			Color temp = new Color(r,g,b);
			String s = "car ";
			int sp = (int)(Math.random()*5)+1;
			int xStart = 100;
			CarWBoat wBoat = new CarWBoat(xStart,yStart, s,temp,sp);
	
			while(true)
			{
				wBoat.translate(wBoat.getSpeed(),0);
				if(wBoat.getX() > 570)
				{
					wBoat.translate(-570,yStart);
				}
				Canvas.pause(10000);
			}	
		}

		public void onMouseClick(double x, double y)
		{
			// // System.out.println("x is: " + x + "y is: " + y);
			// for(int i = 0; i<traffic.length;i++)
			// {
				// if(traffic[i].contains(x,y))
				// {				
					// traffic[i].changeSpeed(0);
					// System.out.print(traffic[i].getName() + " " +traffic[i].getSpeed());
				// }
				// System.out.println();
			// }
		}
}
