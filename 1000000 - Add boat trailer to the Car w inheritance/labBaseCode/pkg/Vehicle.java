//HIDE
package pkg;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public interface Vehicle
{
	public void translate(double ex, double why);
	public int getY();
	public int getX();
	public int getHeight();
	public int getWidth();
	public void draw();
}