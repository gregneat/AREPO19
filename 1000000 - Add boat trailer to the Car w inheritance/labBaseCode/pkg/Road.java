package pkg;
public class Road
{
  private Rectangle road;
  private Rectangle[] line;
  public Road(int y)
  {
    road = new Rectangle(0,y,10000,200);
    road.fill();
    road.setColor(Color.GRAY);
    line = new Rectangle[20];
    for(int counter = 0 ; counter < line.length ; counter++)
    {
      int a = (int)(counter*100);
      line[counter] = new Rectangle(10+a,y+95,40,10);
      line[counter].setColor(Color.WHITE);
      line[counter].fill();
    }
  }
}
