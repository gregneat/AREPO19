package pkg;

public class CedricCar1 implements Vehicle{
			private Rectangle bob, hitbox;
			private Ellipse left;
			private Ellipse right;
			private Text name;
			public CedricCar1(int banana,int apple){
					bob = new Rectangle(banana,apple,50,40);
					left = new Ellipse(banana-10,apple+30,20,20);
					right = new Ellipse(banana+40,apple+30,20,20);	
					hitbox = new Rectangle(banana-10,apple,70,50);
					hitbox.setColor(Color.RED);
					name = new Text(banana+2,apple-17, "");
				
			}
			public CedricCar1(String s,int banana,int apple){
					this(banana,apple);
					name.setText(s);
				
			}
			
			public CedricCar1(int banana,int apple,Color p){
				this(banana,apple);
				bob.setColor(p);
			}
			
			// public String getName(){
				// return name.toString2();
			// }
			
			public void setPaint(Color b){
				bob.setColor(b);
			}
			
			public void translate(double xx,double yy){
				bob.translate(xx,yy);
				left.translate(xx,yy);
				right.translate(xx,yy);
				hitbox.translate(xx,yy);
			}
			public void draw(){
				bob.fill();
				left.fill();
				right.fill();
				hitbox.draw();	
				name.draw();
			}
			
			public int getX(){
				return hitbox.getX();
			}
			
			public int getY(){
				return hitbox.getY();
			}
			
			// public void grow(int a, int b){
				// bob.grow(a,b);
				// left.grow(a,b);
				// right.grow(a,b);
				// left.translate(-a,b);
				// right.translate(a,b);
				// hitbox.grow(a,b);
			// }
}