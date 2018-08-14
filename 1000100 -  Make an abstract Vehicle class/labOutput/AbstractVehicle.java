import java.awt.*;

public abstract class AbstractVehicle{

	private double xLoc, yLoc;
	
	public AbstractVehicle(double x, double y)
	{
		xLoc = x;
		yLoc = y;
	}
	
	public String printInitialPosition()
	{
		return "Intial Position: "+"("+xLoc+", "+yLoc+")";
	}
	
	public void printSuperClass()
	{
		System.out.println("This class extends the abstract vehicle class.");
	}
	
	public abstract void printVehicleType();
	public abstract void paint(Graphics g);
	public abstract void drive();
	public abstract void setLocation(double x, double y);
	//cannot be implemented because getX() and getY() changes
	public abstract double getX();
	public abstract double getY();


	
}