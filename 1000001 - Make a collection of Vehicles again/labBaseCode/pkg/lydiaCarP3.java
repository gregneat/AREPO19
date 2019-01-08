package pkg;
public class lydiaCarP3 implements Vehicle{
	
	Rectangle body;
	Rectangle front;
	Ellipse w1;
	Ellipse w2;
	Ellipse plOne;
	Ellipse plTwo;
	Ellipse frontWindow;
	Rectangle backWindow1;
	Rectangle backWindow2;
	Rectangle backWindow3;
	Rectangle backWindow4;
	Rectangle headLight;
	Rectangle whiteHeadLight;
	
	public lydiaCarP3(int x, int y)
	{
		//body and front
		body= new Rectangle(x,y,200,100);
		front= new Rectangle(x+200,y+50,50,50);
		
		//wheels
		w1= new Ellipse(x-10,y+85,30,30);
		w2= new Ellipse(x+180,y+85,30,30);
		plTwo= new Ellipse(x+185,y+89,20,20);
		plOne= new Ellipse(x-5,y+89,20,20);
		
		//windows
		
		frontWindow= new Ellipse(x+155,y+10,40,30);
		backWindow1= new Rectangle(x+120,y+18,20,20);
		backWindow2= new Rectangle(x+90,y+18,20,20);
		backWindow3= new Rectangle(x+60,y+18,20,20);
		backWindow4= new Rectangle(x+30,y+18,20,20);
		
		//headlights
		headLight= new Rectangle(x+226,y+50,10,10);
		whiteHeadLight= new Rectangle(x+225,y+50,10,10);
	}
	
	public void draw()
	{
		body.fill();
		front.fill();
		w1.fill();
		w2.fill();
		plTwo.fill();
		plOne.fill();
		frontWindow.fill();
		backWindow1.fill();
		backWindow2.fill();
		backWindow3.fill();
		backWindow4.fill();
		headLight.fill();
		whiteHeadLight.fill();
		
	}
	
	public void translate(double x, double y)
	{
		body.translate(x,y);
		front.translate(x,y);
		w1.translate(x,y);
		w2.translate(x,y);
		plTwo.translate(x,y);
		plOne.translate(x,y);
		backWindow1.translate(x,y);
		backWindow2.translate(x,y);
		backWindow3.translate(x,y);
		backWindow4.translate(x,y);
		headLight.translate(x,y);
		whiteHeadLight.translate(x,y);
		frontWindow.translate(x,y);
	}
	
	public void setColor(int r, int g, int b) 
	{
		//sets the color of the car
		Color window= new Color(210,255,254);
		Color orangeHeadLightColor= new Color(255,69,0);
		Color color= new Color(r,g,b);
		Color headLightColor= new Color(255,0,0);
		
		//color of the car parts
		body.setColor(color);
		front.setColor(color);
		plTwo.setColor(window);
		plOne.setColor(window);
		frontWindow.setColor(window);
		backWindow1.setColor(window);
		backWindow2.setColor(window);
		backWindow3.setColor(window);
		backWindow4.setColor(window);
		headLight.setColor(headLightColor);
		whiteHeadLight.setColor(orangeHeadLightColor);	
	}
	
	public int getY()
	{
		return body.getY();
	}
	
	public int getX()
	{
		return body.getX();
	}
}
