Lab Goal: Make a new class, CarWBoat.  The moving object
should look like the previous lab output, but it should
come from a single class.

CS Topics: inheritance, making classes

API

http://horstmann.com/sjsu/graphics/api/index.html

Car class:

Car(double x, double y);
Car(double x, double, y, String s);
Car(double x, double y, String s, Color c);
Car(double x, double y, String s, Color c, int speed);
getX()
getY()
getSpeed()
getHeight()
getName()
translate(int xx, int yy)
boolean contains (double x, double y);
changeSpeed(int s)
