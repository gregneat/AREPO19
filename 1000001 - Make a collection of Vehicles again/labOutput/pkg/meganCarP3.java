package pkg;

public class meganCarP3 implements Vehicle
{
	private Rectangle body, bottom, bounder, bodyTop, bumper, window1, window2, window3;
	private Ellipse w1, w2, w1cover, w2cover, bodyTop1, bodyTop2, light1, light2;
	private Text label, labelShadow;
	
		//Vintage constructor
        public meganCarP3(double x, double y)
		{
			bounder = new Rectangle(x,y,100,60);
			body = new Rectangle(x+20,y+10,60,20);
			bottom = new Rectangle(x,y+25,100,25);
			bumper = new Rectangle(x,y+40,100,10);
			bodyTop1 = new Ellipse(x+19,y,15,15);
			bodyTop2 = new Ellipse(x+65,y,15,15);
			bodyTop = new Rectangle(x+30,y+1,45,10);
			w1 = new Ellipse(x+10,y+35,25,25);
			w2 = new Ellipse(x+65,y+35,25,25);
			window1 = new Rectangle(x+20,y+10,10,15);
			window2 = new Rectangle(x+35,y+10,30,15);
			window3 = new Rectangle(x+70,y+10,10,15);
			w1cover = new Ellipse(x+16,y+41,13,13);
			w2cover = new Ellipse(x+71,y+41,13,13);
			light1 = new Ellipse(x-5,y+35,7,7);
			light2 = new Ellipse(x+97,y+35,7,7);
			
			w1.setColor(new Color(38, 38, 38));
			w2.setColor(new Color(38, 38, 38));
			w1cover.setColor(new Color(255, 211, 56));
			w2cover.setColor(new Color(255, 211, 56));
			window1.setColor(new Color(105, 188, 211));
			window2.setColor(new Color(105, 188, 211));
			window3.setColor(new Color(105, 188, 211));
			bumper.setColor(new Color(124, 124, 124));
			light1.setColor(new Color(255, 211, 56));
			light2.setColor(new Color(255, 211, 56));
			
			label = new Text(x,y+23,"");
			labelShadow = new Text(x,y+23,"");
			label.setColor(Color.WHITE);
		}
		
		//Added string to be able to name meganCarP3
		public meganCarP3(double x, double y, String s)
		{
			this (x,y);
			//line 13 calls line 48, calling a constructor inside another constructor
			label.setText(s);
			labelShadow.setText(s);
			double set = label.getWidth()/2;
			label.translate(50-set,0);
			labelShadow.translate(50-set+1,1);
			//draws s for second meganCarP3
		}
	
		//Added color to be able to color meganCarP3
		public meganCarP3(double x, double y, Color c, String s)
		{
			this(x,y);
			label.setText(s);
			labelShadow.setText(s);
			double set = label.getWidth()/2;
			label.translate(50-set,0);
			labelShadow.translate(50-set+1,0);
			bottom.setColor(c);
			body.setColor(c);
			bodyTop1.setColor(c);
			bodyTop2.setColor(c);
			bodyTop.setColor(c);
		}
		
		public meganCarP3(int x, int y){
			this(Double.valueOf(x),Double.valueOf(y));
		}
		
		//Draws meganCarP3
		public void draw(){
			light1.fill();
			light2.fill();
			body.fill();
			bodyTop1.fill();
			bodyTop2.fill();
			bodyTop.fill();
			bottom.fill();
			bumper.fill();
			window1.fill();
			window2.fill();
			window3.fill();
			labelShadow.draw();
			label.draw();
			w1.fill();
			w2.fill();
			w1cover.fill();
			w2cover.fill();
		}
		
		//Returns x-location (of bounding box)
		public int getX(){
			return bounder.getX();
		}
		
		//Returns y-location (of bounding box)
		public int getY(){
			return bounder.getY();
		}
		
		//Returns width (of bounding box)
		public int getWidth(){
			return bounder.getWidth();
		}
		
		//Returns height (of bounding box)
		public int getHeight(){
			return bounder.getHeight();
		}
		
		//Translates meganCarP3
		public void translate(double x, double y){
			body.translate(x,y);
			bottom.translate(x,y); 
			bounder.translate(x,y); 
			bodyTop.translate(x,y); 
			bumper.translate(x,y); 
			window1.translate(x,y); 
			window2.translate(x,y); 
			window3.translate(x,y);
			w1.translate(x,y); 
			w2.translate(x,y);
			w1cover.translate(x,y);
			w2cover.translate(x,y);
			bodyTop1.translate(x,y); 
			bodyTop2.translate(x,y);
			label.translate(x,y);
			labelShadow.translate(x,y);
			light1.translate(x,y);
			light2.translate(x,y);
		}
		// Undraws/hides meganCarP3
		
		// public void undraw()
		// {
			// light1.undraw();
			// light2.undraw();
			// body.undraw();
			// bodyTop1.undraw();
			// bodyTop2.undraw();
			// bodyTop.undraw();
			// bottom.undraw();
			// bumper.undraw();
			// window1.undraw();
			// window2.undraw();
			// window3.undraw();
			// labelShadow.undraw();
			// label.undraw();
			// w1.undraw();
			// w2.undraw();
			// w1cover.undraw();
			// w2cover.undraw();
		// }
}