// import pkg.*;
package pkg;
public class HappyFace {
		Rectangle a;
		Rectangle b;
		Rectangle oo;
		Rectangle uu;
		Ellipse e;
		Ellipse q;
		Ellipse z;
		Ellipse p;
		
        public HappyFace()
        {									
			e = new Ellipse(10,30,30,30);
			e.setColor(new Color (255,153,102));
			q = new Ellipse(17,37,7,7);
			z = new Ellipse(33,37,7,7);
			a = new Rectangle (17,-10,16,40);
			b = new Rectangle (5,30,40,5);
			p = new Ellipse (24,47,10,10);
			oo = new Rectangle (24,47,10,5);
			oo.setColor (new Color (255,153,102));
			uu = new Rectangle (27,44.3,5,5.4);
		}
		
		public HappyFace(int x, int y)
		{
			e = new Ellipse(x+10,y+30,30,30);
			e.setColor(new Color (255,153,102));
			q = new Ellipse(x+17,y+37,7,7);
			z = new Ellipse(x+33,y+37,7,7);
			a = new Rectangle (x+17,y+-10,16,40);
			b = new Rectangle (x+5,y+30,40,5);
			p = new Ellipse (x+24,y+47,10,10);
			oo = new Rectangle (x+24,y+47,10,5);
			oo.setColor (new Color (255,153,102));
			uu = new Rectangle (x+27,y+44.3,5,5.4);
		}
		
		public void draw()
		{
			e.fill();
			q.fill();
			z.fill();
			a.fill();
			b.fill();
			p.fill();
			oo.fill();
			uu.fill();
		}
		
		public void translate(int dx, int dy)
		{
			e.translate(dx,dy);
			q.translate(dx,dy);
			z.translate(dx,dy);
			a.translate(dx,dy);
			b.translate(dx,dy);
			p.translate(dx,dy);
			oo.translate(dx,dy);
			uu.translate(dx,dy);
		}
		
		// public void grow(int dh, int dw)
		// {
			// e.grow(dh,dw);
			// q.grow(dh,dw);
			// z.grow(dh,dw);
			// a.grow(dh,dw);
			// b.grow(dh,dw);
			// p.grow(dh,dw);
			// oo.grow(dh,dw);
			// uu.grow(dh,dw);
		// }
		
		public int getX()
		{
			return e.getX();
		}
		
		public int getY()
		{
			return e.getY();
		}
		
		public int getHeight()
		{
			return a.getHeight()+e.getHeight();
		}
		
		public int getWidth()
		{
			return b.getWidth();
		}
		
		public String toString()
		{
			return "HappyFace[X= "+this.getX()+"; Y= "+this.getY()+"; H= "+this.getHeight()+"; W= "+this.getWidth()+"]";
		}
}
