// note this solution does use arraylists
// how do you make the Canvas clear of the removed Vehicle Object?

import java.util.*;

public class starter implements InputControl {
	
	private static ArrayList<Vehicle> traffic;
	
	public static void main(String args[])
        {
			traffic = new ArrayList<Vehicle>();
			
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			// int r = (int)(Math.random()*255);
			// int g = (int)(Math.random()*255);
			// int b = (int)(Math.random()*255);
			// Color temp = new Color(r,g,b);
			// Truck joe = new Truck(30,30,"neato",temp,23);
			// put your code here:
			
			int yStart = 0;
			for(int i=0; i<5;i++)
			{
				int r = (int)(Math.random()*255);
				int g = (int)(Math.random()*255);
				int b = (int)(Math.random()*255);
				Color temp = new Color(r,g,b);
				String s = "car ";
				// make all cars go speed 1 to check average calc
				int sp = (int)(Math.random()*5)+1;
				int xStart = 100;
				while(yStart%Truck.CARHEIGHT != 0)
				{
					yStart++;
				}
				int flip = (int)(Math.random()*3);
				if(flip == 0)
				{
					traffic.add(new Truck(xStart,yStart, s+i,temp,sp));
				}
				else if(flip == 1)
				{
					traffic.add(new Car(xStart,yStart, s+i,temp,sp));
				}
				else
				{
					traffic.add(new CarWBoat(xStart,yStart, "car w boat",temp,sp));
				}
				
				yStart++;
			}
			while(true)
			{
				// for(int j =0; j< traffic.length; j++)V
				// {
					// traffic[j].translate(traffic[j].getSpeed(),0);
					// if(traffic[j].getX() > 570)
					// {
						// traffic[j].translate(-570,0);
					// }
				// }
				for(Vehicle v:traffic)
				{
					v.translate(v.getSpeed(),0);
					if(v.getX() > 570)
					{
						v.translate(-570,0);
					}
				}
				Canvas.pause(10000);
			}	
		}

		public void onMouseClick(double x, double y)
		{
			
			for(int i = 0; i<traffic.size();i++)
			{
				if(traffic.get(i).contains(x,y))
				{				
					traffic.remove(i);
				}
				System.out.println(traffic.size());
			}
			
		}
}
