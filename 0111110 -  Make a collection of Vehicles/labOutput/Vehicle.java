//HIDE
import java.awt.*;
import java.awt.geom.*;

public interface Vehicle
{
	public void drive();
	public void setLocation(double x, double y);
	public boolean contains(double x, double y);
	public void paint(Graphics g);
	public void changeSpeed(double ns);
	public double getSpeed();
	public double getX();
	public double getY();
}
