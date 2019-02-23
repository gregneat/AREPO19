# sample graphics program
#
# imports graphics library
#
from graphics import *;
from random import *;
#window.getMouse();
window = GraphWin("Window", 1000,1000);

one = Rectangle(Point(20,20),Point(50,50))
one.draw(window)
t="when the square stops changing color, click once."
tt = Text(Point(200,200),t)
tt.draw(window)
for t in range(100):
    r = randint(0,255)
    g = randint(0,255)
    b = randint(0,255)
    one.setFill(color_rgb(r,g,b))
    time.sleep(.1)

window.getMouse();
tt.undraw()
one.undraw()
t = "click again"
tt.setText(t)
tt.draw(window)
num = 10
s = []
for x in range(20,500,30):
    s.append(Rectangle(Point(x,20),Point(x+30,50)))
for y in range(num):
    s[y].draw(window)
for z in range(num):
    r = randint(0,255)
    g = randint(0,255)
    b = randint(0,255)
    s[z].setFill(color_rgb(r,g,b))
window.getMouse();
while True:
    for a in range(num):
        s[a].move(30,0)
    window.getMouse();
window.getMouse();
##size = randint(5,36);
##dx = 0
##dy = 100
##for x in range(0,10):
##    r = randint(0,255)
##    g = randint(0,255)
##    b = randint(0,255)
##    deltaX = randint(5,36)
##    dx = dx + 20*len(word)
##    w = Text(Point(dx,dy),word)
##    w.setFill(color_rgb(r,g,b))
##    w.setSize(deltaX)
##    w.draw(window)

##window.getMouse();
##size = randint(5,36);
##dx = 0
##dy = 150
##for xo in range(0,100):
##    for x in range(0,10):
##        r = randint(0,255)
##        g = randint(0,255)
##        b = randint(0,255)
##        deltaX = randint(5,36)
##        dx = dx + 20*len(word)
##        w = Text(Point(dx,dy),word)
##        w.setFill(color_rgb(r,g,b))
##        w.setSize(deltaX)
##        w.draw(window)
##    dy = dy + deltaX #randint(5,36)
##    dx = 0
##window.getMouse();   
# closes the window
window.close();

    
