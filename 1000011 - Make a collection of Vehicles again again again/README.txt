Lab Goal: Make a collection of Vehicles again.  This time, if 
you click on a Vehicle, it will disappear because it is removed from 
memory.  The rest of the 
Vehicles will keep on going unless they are clicked.

CS Topics: inheritance, interfaces, ArrayLists, for-each loops

API

ArrayList API

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

Truck class:

Truck(double x, double y);
Truck(double x, double, y, String s);
Truck(double x, double y, String s, Color c);
Truck(double x, double y, String s, Color c, int speed);
getX()
getY()
getSpeed()
getHeight()
getName()
translate(int xx, int yy)
boolean contains (double x, double y);
changeSpeed(int s)

CarWBoat class:

CarWBoat(double x, double y, String n, Color c, int s)