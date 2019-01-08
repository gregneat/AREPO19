package pkg;

public class sarahCarP1 implements Vehicle{			
		
		private Rectangle bob;
		private Rectangle joe;
		private Rectangle box;
		private Ellipse left;
		private Ellipse right;
		private Text name;
		private Color white;
		private String hey;
		
		public sarahCarP1(double banana, double apple){
			bob = new Rectangle(banana, apple, 50, 40);
			bob.setColor(Color.BLUE);
			joe = new Rectangle(banana-20, apple+20, 90, 20);
			joe.setColor(Color.BLUE);
			box = new Rectangle(banana-20, apple, 90, 50);
			//box.setColor(Color.RED);
			
			left = new Ellipse(banana-10, apple+30, 20, 20);
			right = new Ellipse(banana+40, apple+30, 20, 20);
			name = new Text(banana+10, apple+5, "");
			white = new Color(255, 255, 255);
			name.setColor(white);
		}
		public sarahCarP1(double dx, double dy, String s){
			this(dx,dy);
			name.setText(s);
			
			// bob = new Rectangle(dx, dy, 50, 40);
			// bob.setColor(Color.BLUE);
			// joe = new Rectangle(dx-20, dy+20, 90, 20);
			// joe.setColor(Color.BLUE);
			// box = new Rectangle(dx-20, dy, 90, 50);
			//box.setColor(Color.RED);
			
			//name = new Text(dx+10, dy+5, s);
			
			// left = new Ellipse(dx-10, dy+30, 20, 20);
			// right = new Ellipse(dx+40, dy+30, 20, 20);
			
			hey = s;
		}
		public sarahCarP1(double xxx, double yyy, Color ccc){
			this(xxx,yyy);
			bob.setColor(ccc);
			joe.setColor(ccc);
		}
		public sarahCarP1(double yes, double no, Color ok, String wow){
			this(yes,no);
			bob.setColor(ok);
			joe.setColor(ok);
			name = new Text(yes+5, no+15, wow);
			//name.setText(wow);
		}
		public sarahCarP1(int x, int y){
			this(Double.valueOf(x),Double.valueOf(y));
		}
		
		public void fill(){
			bob.fill();
			joe.fill();
			left.fill();
			right.fill();
			name.draw();
			//box.draw();
		}
		public void draw()
		{
			bob.fill();
			joe.fill();
			left.fill();
			right.fill();
			name.draw();
		}
		public void translate(double xx, double yy){
			bob.translate(xx, yy);
			joe.translate(xx, yy);
			left.translate(xx, yy);
			right.translate(xx, yy);
			box.translate(xx, yy);
			name.translate(xx, yy);
		}
		public int getX(){
			return box.getX();
		}
		public int getY(){
			return box.getY();
		}
		public int getWidth(){
			return box.getWidth();
		}
		public int getHeight(){
			return box.getHeight();
		}
		public Rectangle bounds(){
			return box;
		}
		public String getName(){
			return hey;
		}
}






