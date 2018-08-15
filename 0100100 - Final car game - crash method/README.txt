Lab Goals: Make a crash method to detect if player and car intersect
CS Topics: making methods, boolean variable, if conditions, for loops

API
NOTE: Add this to your Rectangle class

public boolean contains(Rectangle a)
{
	if(getX() < a.getX() + a.getWidth() && getX() + getWidth() > a.getX() && getY() < a.getY() + a.getHeight() && getY() + getHeight() > a.getY())
	{ 
		return true;
	}
	return false;
}

This is needed to tell if player crashes with a car.