package pkg;



public class kevinCarP2 implements Vehicle
{
    Rectangle c1;
    Rectangle c2;
    Ellipse wc1;
    Ellipse wc2;
    Rectangle rc1;
    Rectangle rc2;
    Ellipse hubcap1;
    Ellipse hubcap2;
    Line windowfront;
    Line backwindow;
    Rectangle border;
    String f;
    Text abc;
    int xxx;
    int yyy;
    int width = 90;
    int height =50;
    public kevinCarP2(int x, int y){
        xxx =x;
        yyy=y;
        c1 = new Rectangle(x,y,70,20);
        c2 = new Rectangle(x,y,70,20);
        wc1= new Ellipse(x-10,y+10,20,20);
        wc2 = new Ellipse(x+60,y+10,20,20);
        rc1=new Rectangle(x+5,y-20,60,20);
        rc2=new Rectangle(x+5,y-20,60,20);
        hubcap1 = new Ellipse(x-7, y+13,15,15);
        hubcap2 = new Ellipse(x+63,y+13,15,15);
        windowfront = new Line(x+65, y-20, x+70.5, y+10);
        backwindow = new Line(x+5.5,y-21,x, y);
        border = new Rectangle(x-10,y-20,90,50);
//        abc = new Text(x+10,y, s);
        
        c1.setColor(Color.RED);
        rc1.setColor(Color.BLUE);
        hubcap1.setColor(Color.LIGHT_GRAY);
        hubcap2.setColor(Color.LIGHT_GRAY);
        
    }
   
    public int getX()
    {
        return border.getX();
        
    }
    public int getY()
    {
        
        return c1.getY();
    }
    public int getWidth()
    {
        
        return border.getWidth();
    }
    public int getHeight()
    {
        
        return border.getHeight();
    }
    public int enterX(){
        EasyReader t1_in;
        t1_in = new EasyReader();
        System.out.println("please enter x");
        int e1 = t1_in.readInt();
        return e1;
    }
    public void draw(){
        c1.fill();
        c2.draw();
        wc1.fill();
        wc2.fill();
        rc1.fill();
        rc2.draw();
        hubcap1.fill();
        hubcap2.fill();
        windowfront.draw();
        backwindow.draw();
//        abc.draw();
        
        //            border.draw();
        //        EasyReader t2_in;
        //        t2_in = new EasyReader();
        //        System.out.println("please enter y");
        //        int e2 = t2_in.readInt();
        //        EasyReader t3_in;
        //        t3_in = new EasyReader();
        //        System.out.println("please enter a word");
        //        String e3 = t3_in.readWord();
        //
    }
    //
    public void translate(double xx, double yy){
        c1.translate(xx,yy);
        c2.translate(xx,yy);
        wc1.translate(xx,yy);
        wc2.translate(xx,yy);
        rc1.translate(xx,yy);
        rc2.translate(xx,yy);
        hubcap1.translate(xx,yy);
        hubcap2.translate(xx,yy);
        windowfront.translate(xx,yy);
        border.translate(xx,yy);
        backwindow.translate(xx,yy);
//        abc.translate(xx,yy);
    }
    
    public boolean crash(Rectangle other){
        xxx = this.getX();
        yyy = this.getY();
        //        System.out.println(xxx +" "+ yyy);
        if(xxx < other.getX() + other.getWidth() && xxx + width > other.getX() && yyy < other.getY() + other.getHeight() && yyy + height > other.getY())
        {
            return true;
        }
        return false;
        
    }
}