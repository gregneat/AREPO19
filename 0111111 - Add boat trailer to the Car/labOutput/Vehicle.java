//HIDE
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public interface Vehicle
{
	public void translate(double ex, double why);
	public boolean contains(double x, double y);
	public int getX();
	public void changeSpeed(int ns);
	public int getSpeed();
}
