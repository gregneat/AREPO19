package pkg;
 //implements means carro has "agreed" to be in club vehicle
public class Daniel3CarP4 implements Vehicle{		
		public Ellipse cabhead;
		public Rectangle cover;
		public String name;
		public int w;
		public int l;
		public Rectangle cover2;
		public Rectangle cabmain;
		public Rectangle cabbottom;
		public Rectangle cabsub;
		public Rectangle box;
		public Rectangle trailer;
		public Rectangle hook;
		public Rectangle edge;
		public Ellipse backw;
		public Ellipse nextw;
		public Ellipse frontw;
	
		public Color grey = new Color(184,174,149);
		public Color darkgrey = new Color(133,122,94);
		public Color maroon = new Color(161,15,10);
		public Color red = new Color(245,60,54);
		
		public Daniel3CarP4(double x,double y){
			w = 142;
			l = 90;
			name="";
			 cabhead = new Ellipse(x+70,y,60,45 );
			cabhead.setColor(maroon);
			 cover = new Rectangle(x+70,y,25 ,50 );
			
			cover.setColor(Color.WHITE);
			 cover2 = new Rectangle(x+70,y+20,60,25 );
			
			cover2.setColor(Color.WHITE);
			
			 cabmain = new Rectangle(x+80+15,y+15,35 ,30 );
			cabmain.setColor(maroon);
			 cabbottom = new Rectangle(x+80+11,y+45,51  ,5 );
			
			cabbottom.setColor(grey);
			 cabsub = new Rectangle(x+80+15,y+25,47 ,20 );
			cabsub.setColor(maroon);
			
			 box = new Rectangle(x,y,85,44);
			box.setColor(red);
			 trailer = new Rectangle(x,y+5+40,90,5);
			trailer.setColor(darkgrey);
			 hook = new Rectangle(x+86,y+40,8,5);
			hook.setColor(darkgrey);
			
			
			 backw = new Ellipse(x+5,y+45,10,10 );
			 nextw = new Ellipse(x+20,y+45,10 ,10 );
			 frontw = new Ellipse(x+125,y+45,10 ,10 );
			
			
			 edge = new Rectangle(x,y,w ,l );
			edge.setColor(Color.YELLOW);
			
			
			
			
		}
		
		public Daniel3CarP4(int x, int y){
			this(Double.valueOf(x),Double.valueOf(y));
		}
		
		public void draw(){
			cabhead.fill();
			cover.fill();
			cover2.fill();
			backw.fill();
			nextw.fill();
			frontw.fill();
			hook.fill();
			trailer.fill();
			box.fill();
			cabsub.fill();
			cabbottom.fill();
			cabmain.fill();
			
			//edge.draw();
		}
		
		public int getX(){
			
				return edge.getX();
			
		}
		public int getY(){
			
				return edge.getY();
		
		}
		// public int findH(){
			
				// return edge.getHeight();
			
			
		// }
		// public int findW(){
			
				// return edge.getWidth();
			
		// }
		
		// public Rectangle breadth(){
			
			// return edge;
		// }
		public void translate(double ex,double why){
			edge.translate(ex,why);
			cabhead.translate(ex,why);
			cover.translate(ex,why);
			cover2.translate(ex,why);
			backw.translate(ex,why);
			nextw.translate(ex,why);
			frontw.translate(ex,why);
			hook.translate(ex,why);
			trailer.translate(ex,why);
			box.translate(ex,why);
			cabsub.translate(ex,why);
			cabbottom.translate(ex,why);
			cabmain.translate(ex,why);
		
		}
	
}
