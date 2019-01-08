package pkg;

public class andrewCarP1 implements Vehicle
{
  Rectangle jimin;
  Rectangle jimin2;
  Rectangle jimin3;
  Rectangle jimin4;
  Rectangle jimin5;
  Rectangle headlight;
  Rectangle window1;
  Rectangle window2;
  Ellipse andy1;
  Ellipse andy2;
  public andrewCarP1(int banana, int apple)
  {
    Color gintama = new Color(202,255,251);
    Color rim = new Color(192,192,192);
    jimin = new Rectangle(banana-25,apple+20,100,20);
    jimin2 = new Rectangle(banana-10,apple,50,20);
    jimin3 = new Rectangle(banana+40,apple+10,20,10);
    jimin4 = new Rectangle(banana-40,apple+15,20,10);
    jimin5 = new Rectangle(banana-25,apple+35,100,5);
    headlight = new Rectangle(banana+70,apple+20,5,10);
    window1 = new Rectangle(banana+25,apple+10,10,10);
    window2 = new Rectangle(banana,apple+10,10,10);
    int wl = banana-10;
    int wr = banana+40;
    int h = apple+30;
    andy1 = new Ellipse(wl,h,20,20);
    andy2 = new Ellipse(wr,h,20,20);
    jimin.setColor(gintama);
    jimin2.setColor(gintama);
    jimin3.setColor(gintama);
    jimin4.setColor(gintama);
    jimin5.setColor(rim);
    headlight.setColor(Color.YELLOW);
    window1.setColor(Color.WHITE);
    window2.setColor(Color.WHITE);
  }
  public void translate(double ex, double why)
  {
    jimin.translate(ex,why);
    jimin2.translate(ex,why);
    jimin3.translate(ex,why);
    jimin4.translate(ex,why);
    jimin5.translate(ex,why);
    andy1.translate(ex,why);
    andy2.translate(ex,why);
    headlight.translate(ex,why);
    window1.translate(ex,why);
    window2.translate(ex,why);
  }
  public void draw()
  {
    jimin.fill();
    jimin2.fill();
    jimin3.fill();
    jimin4.fill();
    jimin5.fill();
    andy1.fill();
    andy2.fill();
    headlight.fill();
    window1.fill();
    window2.fill();
  }
  public int getX()
  {
    return jimin.getX();
  }
  public int getY()
  {
    return jimin.getY();
  }
  public void setColor(Color andrew)
  {
    jimin.setColor(andrew);
  }
}