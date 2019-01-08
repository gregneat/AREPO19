package pkg;
public class shantACarP6 implements Vehicle{
		Color thanos = new Color(112,39,185);
		Color chin = new Color(30,28,28);
		Color stewBelly = new Color(192,192,192);
		int x;
		int y;
		Rectangle b1dy;
		Rectangle b2dy;
		Rectangle trunk;
		Ellipse wheel1;
		Ellipse wheel2;
		Ellipse r1m;
		Ellipse r2m;
		Rectangle headlights;
		Rectangle window;
		Rectangle chiin;

	
	public shantACarP6(int x,int y)
	{
		b1dy = new Rectangle(x,y,75,30);
		b2dy = new Rectangle(x+10,y-15,30,25);
		trunk = new Rectangle(x+40,y,35,8);
		wheel1 = new Ellipse(x+5,y+20,30,30);
		wheel2 = new Ellipse(x+45,y+20,30,30);
		r1m = new Ellipse(x+15,y+30,10,10);
		r2m = new Ellipse(x+55,y+30,10,10);
		headlights = new Rectangle(x,y+2,5,5);
		window = new Rectangle(x+13,y-13,13,13);
		chiin = new Rectangle(x,y+10,12,33);
		chiin.setColor(chin);
		b1dy.setColor(thanos);
		b2dy.setColor(thanos);
		trunk.setColor(chin);
		wheel1.setColor(chin);
		wheel2.setColor(chin);
		r1m.setColor(stewBelly);
		r2m.setColor(stewBelly);
		headlights.setColor(stewBelly);
		window.setColor(chin);
		
	}

	public void fill(){
		b1dy.fill();
		b2dy.fill();
		trunk.fill();
		wheel1.fill();
		wheel2.fill();
		r1m.fill();
		r2m.fill();
		headlights.fill();
		window.fill();
		chiin.fill();

	}
	public void draw(){
		fill();
	}
	public void translate(double x,double y){
		b1dy.translate(x,y);
		b2dy.translate(x,y);
		trunk.translate(x,y);
		wheel1.translate(x,y);
		wheel2.translate(x,y);
		r1m.translate(x,y);
		r2m.translate(x,y);
		headlights.translate(x,y);
		window.translate(x,y);
		chiin.translate(x,y);
	}
	public int getX(){
		return b1dy.getX();


	}
	public int getY(){
		return b1dy.getY();

	}
}
		


