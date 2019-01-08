package pkg;

public class SeanCarP1 implements Vehicle
{
  private Ellipse top;
  private Ellipse front;
  private Ellipse back;
  private Rectangle body;

  private Rectangle block;

  private Ellipse fwheel;
  private Ellipse bwheel;
  private Ellipse fplate;
  private Ellipse bplate;

  private Color skyblue = new Color (50,170,255);
  private Ellipse fwindow;
  private Ellipse bwindow;
  private Rectangle window;
  private Line fpane;
  private Line bpane;

  private Rectangle dsign;
  private Rectangle dsign2;

  private Rectangle flight;
  private Rectangle blight;

  private Rectangle fbumper;
  private Rectangle bbumper;

  private Rectangle doorhandle;

  public SeanCarP1(int x, int y)
  //x = 50, y = 20
  {
    top = new Ellipse(x+50,y,100,60);
    top.setColor(Color.PINK);
    window = new Rectangle(x+75,y+10,50,20);
    window.setColor(skyblue);
    fwindow = new Ellipse(x+110,y+10,30,40);
    fwindow.setColor(skyblue);
    bwindow = new Ellipse(x+60,y+10,30,40);
    bwindow.setColor(skyblue);
    bpane = new Line(x+75,y+10,x+75,y+30);
    fpane = new Line(x+125,y+10,x+125,y+30);
    front = new Ellipse(x+120,y+30,60,60);
    front.setColor(Color.PINK);
    back = new Ellipse(x+20,y+30,60,60);
    back.setColor(Color.PINK);
    block = new Rectangle(x+20,y+60,160,30);
    block.setColor(Color.WHITE);
    bwheel = new Ellipse(x+50,y+45,30,30);
    bplate = new Ellipse(x+57.5,y+52.5,15,15);
    bplate.setColor(Color.GRAY);
    fwheel = new Ellipse(x+120,y+45,30,30);
    fplate = new Ellipse(x+127.5,y+52.5,15,15);
    fplate.setColor(Color.GRAY);
    body = new Rectangle(x+50,y+30,100,30);
    body.setColor(Color.PINK);
    dsign = new Rectangle(x+28,y+40,145,5);
    dsign.setColor(Color.GREEN);
    dsign2 = new Rectangle(x+23,y+50,155,5);
    dsign2.setColor(Color.BLUE);
    flight = new Rectangle(x+170,y+45,5,5);
    flight.setColor(Color.YELLOW);
    blight = new Rectangle(x+25,y+45,5,5);
    blight.setColor(Color.RED);
    fbumper = new Rectangle(x+167,y+57,15,5);
    fbumper.setColor(Color.GRAY);
    bbumper = new Rectangle(x+22,y+57,15,5);
    bbumper.setColor(Color.GRAY);
    doorhandle = new Rectangle(x+85,y+45,10,3);
    doorhandle.setColor(Color.WHITE);
  }

  public void draw()
  {
    top.fill();

    fwindow.fill();
    bwindow.fill();
    window.fill();
    fpane.draw();
    bpane.draw();

    front.fill();
    back.fill();

    block.fill();

    fwheel.fill();
    bwheel.fill();
    fplate.fill();
    bplate.fill();

    body.fill();

    dsign.fill();
    dsign2.fill();

    flight.fill();
    blight.fill();

    fbumper.fill();
    bbumper.fill();

    doorhandle.fill();
  }
  //
  // public void fill()
  // {
  //   top.fill();
  //
  //   fwindow.fill();
  //   bwindow.fill();
  //   window.fill();
  //   fpane.draw();
  //   bpane.draw();
  //
  //   front.fill();
  //   back.fill();
  //
  //   block.fill();
  //
  //   fwheel.fill();
  //   bwheel.fill();
  //   fplate.fill();
  //   bplate.fill();
  //
  //   body.fill();
  //
  //   dsign.fill();
  //   dsign2.fill();
  //
  //   flight.fill();
  //   blight.fill();
  //
  //   fbumper.fill();
  //   bbumper.fill();
  //
  //   doorhandle.fill();
  // }

  public void translate(double xx, double yy)
  {
    top.translate(xx,yy);
    front.translate(xx,yy);
    back.translate(xx,yy);
    body.translate(xx,yy);

    block.translate(xx,yy);

    fwheel.translate(xx,yy);
    bwheel.translate(xx,yy);
    fplate.translate(xx,yy);
    bplate.translate(xx,yy);

    fwindow.translate(xx,yy);
    bwindow.translate(xx,yy);
    window.translate(xx,yy);
    fpane.translate(xx,yy);
    bpane.translate(xx,yy);

    dsign.translate(xx,yy);
    dsign2.translate(xx,yy);

    flight.translate(xx,yy);
    blight.translate(xx,yy);

    fbumper.translate(xx,yy);
    bbumper.translate(xx,yy);

    doorhandle.translate(xx,yy);
  }

  // public void setColor(Color newColor)
  // {
  //   top.setColor(newColor);
  //   front.setColor(newColor);
  //   back.setColor(newColor);
  //   body.setColor(newColor);
  //   if(newColor.getRed() > 128)
  //   {
  //     dsign.setColor(Color.YELLOW);
  //     dsign2.setColor(Color.BLUE);
  //   }
  //   if(newColor.getRed() < 128)
  //   {
  //     dsign.setColor(Color.PINK);
  //     dsign2.setColor(Color.GREEN);
  //   }
  // }

  public int getX()
  {
    return fbumper.getX();
  }

  public int getY()
  {
    return fbumper.getY();
  }

}