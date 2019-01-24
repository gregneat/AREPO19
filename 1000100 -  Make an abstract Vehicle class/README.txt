Lab Goal: Build an abstract class Vehicle.  Follow these steps.

1) Get a copy of universal base code from arepos.
2) Put your latest namePiCar.java file into the universal base code folder.
(note: don't put it into pkg and make sure the top line of the file
is: import pkg.*;
3) Make a new file (where starter.java is) called Vehicle.java.
4) Make sure the top line of Vehicle.java is:import pkg.*;
5) The body of this file should be:

public abstract class Vehicle
{
	
	private int speed;

	
	
	
	public void setSpeed(int s)
	
	{
		
		speed = s;
	
	}
	
	public int getSpeed()
	
	{
		
		return speed;
	
	}
	
	public abstract void draw();
	
}

6) Make your namePiCar class extend Vehicle
7) call the setSpeed method in your namePiCar class constructor(s) 
(giving your Car an initial speed value.)
8) Make a few Cars in your psvm (starter) to test.

	static Vehicle mary;
	static NileshCarP2 joe;
        public static void main(String args[])
        {
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			// put code here
			mary = new NileshCarP2(10,40);
			mary.draw();
			joe = new NileshCarP2(10,10);
			joe.draw();
			while(true)
			{
				Canvas.pause(5);
				joe.translate(joe.getSpeed(),0);
				Canvas.pause(5);
				mary.translate(mary.getSpeed(),0);
				if(mary.getX()>500)
				{
					mary.translate(-500,0);
				}
				if(joe.getX()>500)
				{
					joe.translate(-500,0);
				}
			}
	}


