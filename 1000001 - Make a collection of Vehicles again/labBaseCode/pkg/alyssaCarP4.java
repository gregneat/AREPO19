package pkg;

public class alyssaCarP4 implements Vehicle{
	//
	public Rectangle boundingbox;
	//
	//middle of the car body
	public Rectangle car;
	//back of the car
	public Rectangle carback;
	//front of the car
	public Rectangle carfront;
	//windows of car
	public Rectangle windowsideone;
	public Rectangle windowsidetwo;
	public Rectangle windowfront;
	//doors of car
	public Rectangle backdoor;
	public Rectangle frontdoor;
	//wheels of car
	public Ellipse wheelone;
	public Ellipse wheeltwo;
	public Ellipse metalone;
	public Ellipse metaltwo;
	//headlight
	public Ellipse headlight;
	//doorknob
	public Ellipse doorknobone;
	public Ellipse doorknobtwo;
	
	public alyssaCarP4 (double xvalue, double yvalue){
		//
		boundingbox = new Rectangle (xvalue-10, yvalue, 100, 65);
		//	
		Color gray = new Color(153,153,153);
		
		//middle of the car body
			car = new Rectangle(xvalue+40, yvalue, 70, 45);
			car.setColor(Color.RED);
			car.fill();
		//back of the car
			carback = new Rectangle(xvalue+10, yvalue+15, 30, 30);
			carback.setColor(Color.RED);
			carback.fill();
		//front of the car
			carfront = new Rectangle(xvalue+100, yvalue+15, 30, 30);
			carfront.setColor(Color.RED);
			carfront.fill();
		//windows of car
			windowsideone = new Rectangle(xvalue+52, yvalue+11, 15, 15);
			windowsideone.setColor(Color.BLUE);
			windowsideone.fill();
			
			windowsidetwo = new Rectangle(xvalue+82, yvalue+11, 15, 15);
			windowsidetwo.setColor(Color.BLUE);
			windowsidetwo.fill();
			
			windowfront = new Rectangle(xvalue+105, yvalue+5, 5, 15);
			windowfront.setColor(Color.BLUE);
			windowfront.fill();
		//doors of car
			backdoor = new Rectangle(xvalue+50, yvalue+8, 20, 30);
			backdoor.draw();
			
			frontdoor = new Rectangle(xvalue+80, yvalue+8, 20, 30);
			frontdoor.draw();
		//wheels of car
			wheelone = new Ellipse(xvalue+15  , yvalue+38, 25, 25);
			wheelone.fill();
			wheeltwo = new Ellipse(xvalue+95, yvalue+38, 25, 25);
			wheeltwo.fill();
			
			metalone = new Ellipse (xvalue+20 , yvalue+42, 16, 16);
			metalone.setColor(gray);
			metalone.fill();
			metaltwo = new Ellipse (xvalue+100 , yvalue+42, 16, 16);
			metaltwo.setColor(gray);
			metaltwo.fill();
		//headlight
			headlight = new Ellipse(xvalue+122, yvalue+20, 10, 10);
			headlight.setColor(Color.YELLOW);
			headlight.fill();
		//doorknob
			doorknobone = new Ellipse(xvalue+50, yvalue+25, 5, 5);
			doorknobone.fill();
			doorknobtwo = new Ellipse(xvalue+80, yvalue+25, 5, 5);
			doorknobtwo.fill();
	}
	
	public alyssaCarP4(int x, int y){
			this(Double.valueOf(x),Double.valueOf(y));
		}
	
	public void translate (double xvalue, double yvalue){
		//
		boundingbox.translate(xvalue,yvalue);
		//
		
		//middle of the car body
			car.translate(xvalue,yvalue);
		//back of the car
			carback.translate(xvalue,yvalue);
		//front of the car
			carfront.translate(xvalue,yvalue);
		//windows of car
			windowsideone.translate(xvalue,yvalue);
			windowsidetwo.translate(xvalue,yvalue);
			windowfront.translate(xvalue,yvalue);
		//doors of car
			backdoor.translate(xvalue,yvalue);
			frontdoor.translate(xvalue,yvalue);
		//wheels of car
			wheelone.translate(xvalue,yvalue);
			wheeltwo.translate(xvalue,yvalue);
			metalone.translate(xvalue,yvalue);
			metaltwo.translate(xvalue,yvalue);
		//headlight
			headlight.translate(xvalue,yvalue);
		//doorknob
			doorknobone.translate(xvalue,yvalue);
			doorknobtwo.translate(xvalue,yvalue);
	}
	public void draw(){
		
	}
	public int getX(){
		return boundingbox.getX();
	}
	public int getY(){
		return boundingbox.getY();
	}
	public int getHeight()
	{
		return boundingbox.getHeight();
	}	
	public Rectangle getBounds()
	{
		return boundingbox;
	}
}