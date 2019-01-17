package pkg;
public class tankCarP0 implements Vehicle
{
	private Rectangle basetop,basebttm,basemddle,armorplatelefttop,armorplateleftmddle,armorplatemddlebttm,armorplaterightbttm;
	private Rectangle armorplaterightmddle,armorplaterighttop,turrettop,turrettopmddle,turretmddle,turretmddlebttm,turretbttm,turretrightbttm,turretleftbttm,turretrightmddlebttm,turretrightmddle,turretright;
	private Rectangle rcktlauncher,barrel,barrelsight,turretrighttop,camotop1,camobttm1,camotop2,camobttm2,camotop3,camobttm3,camotop4,camobttm4,camotop5,camobttm5;
	private Rectangle camotop6,camobttm6,camotop7,camobttm7,camotop8,camobttm8,camotop9,camobttm9,camotop10,camobttm10,camotop11,camobttm11,camotop12;
	private Rectangle camobttm12,camotop13,camobttm13,camotop14,camobttm14,camotop15,camobttm15,camotop16,camobttm16;
	private Line treadbttm,treadtop,treadlefttop,treadleftmddle,treadleftbttm,treadrighttop,treadrightmddle,treadrightbttm,entena;
	private Ellipse wheel1,wheel2,wheel3,wheel4,wheel5,wheel6,wheel7,wheel8,wheel9,turrethatch,rcktlauncherbck,rckt1,rckt2,rckt3,rckttip1,rckttip2,rckttip3;
	private Ellipse barreltip,barrelopening,bolt1;
	private int a,c,o,p,r,g,b,contrast;
	private Color litcolor,drkrlitcolor,color,litrdrkcolor,drkcolor,black,grey,crimsonred;
	public tankCarP0(int x, int y){
		this(x,y,75,83,32,0);
	}
	
	public tankCarP0(int x, int y, int r_MAIN, int g_MAIN, int b_MAIN, int contrast_MAIN)
	//public Tank(int x, int y)
	{
			crimsonred = new Color (190,0,0);
			// contrast = 50; //20,30
			// r = 250;
			// g = 0;//120,180
			// b = 0;
			
			r = r_MAIN;
			g = g_MAIN;
			b = b_MAIN;
			contrast = contrast_MAIN;
			
			litcolor = new Color (r,g,b);
			if (r<contrast)
			{
				r=r-r;
			}
			if (r>=contrast)
			{
				r=r-contrast;
			}
			if (g<contrast)
			{
				g=g-g;
			}
			if (g>=contrast)
			{
				g=g-contrast;
			}
			if (b<contrast)
			{
				b=b-b;
			}
			if (b>=contrast)
			{
				b=b-contrast;
			}
			drkrlitcolor = new Color (r,g,b);
			if (r<contrast )
			{
				r=r-r;
			}
			if (r>=contrast)
			{
				r=r-contrast;
			}
			if (g<contrast)
			{
				g=g-g;
			}
			if (g>=contrast)
			{
				g=g-contrast;
			}
			if (b<contrast)
			{
				b=b-b;
			}
			if (b>=contrast)
			{
				b=b-contrast;
			}
			color = new Color (r,g,b);
			if (r<contrast)
			{
				r=r-r;
			}
			if (r>=contrast)
			{
				r=r-contrast;
			}
			if (g<contrast)
			{
				g=g-g;
			}
			if (g>=contrast)
			{
				g=g-contrast;
			}
			if (b<contrast)
			{
				b=b-b;
			}
			if (b>=contrast)
			{
				b=b-contrast;
			}
			litrdrkcolor = new Color (r,g,b);
			if (r<contrast)
			{
				r=r-r;
			}
			if (r>=contrast)
			{
				r=r-contrast;
			}
			if (g<contrast)
			{
				g=g-g;
			}
			if (g>=contrast)
			{
				g=g-contrast;
			}
			if (b<contrast)
			{
				b=b-b;
			}
			if (b>=contrast)
			{
				b=b-contrast;
			}
			drkcolor = new Color (r,g,b);
			
			grey = new Color (75,75,60);
			black = new Color (25,25,20);
			a = 0;
			c = 0;
			o = 0;
			p = 0;
			basetop = new Rectangle(2+x+a,75+y+c,210,20);
			basetop.fill();
			basetop.setColor(litcolor);
			basebttm = new Rectangle(13+x+a,70+y+c,180,35);
			basebttm.fill();
			basebttm.setColor(litcolor);
			basemddle = new Rectangle(38+x+a,70+y+c,130,42);
			basemddle.fill();
			basemddle.setColor(litcolor);
			
			wheel1 = new Ellipse(3+x+a,90+y+c,20,20);
			wheel1.fill();
			wheel1.setColor(black);
			wheel3 = new Ellipse(26+x+a,100+y+c,20,20);
			wheel3.fill();
			wheel3.setColor(black);
			wheel4 = new Ellipse(49+x+a,100+y+c,20,20);
			wheel4.fill();
			wheel4.setColor(black);
			wheel5 = new Ellipse(72+x+a,100+y+c,20,20);
			wheel5.fill();
			wheel5.setColor(black);
			wheel6 = new Ellipse(95+x+a,100+y+c,20,20);
			wheel6.fill();
			wheel6.setColor(black);
			wheel7 = new Ellipse(118+x+a,100+y+c,20,20);
			wheel7.fill();
			wheel7.setColor(black);
			wheel8 = new Ellipse(141+x+a,100+y+c,20,20);
			wheel8.fill();
			wheel8.setColor(black);
			wheel9 = new Ellipse(164+x+a,100+y+c,20,20);
			wheel9.fill();
			wheel9.setColor(black);
			wheel2 = new Ellipse(187+x+a,90+y+c,20,20);
			wheel2.fill();
			wheel2.setColor(black);
			
			turretrightmddle = new Rectangle(175+x+a,53+y+c,15,5);
			turretrightmddle.fill();
			turretrightmddle.setColor(drkcolor);
			turretrightmddlebttm = new Rectangle(165+x+a,58+y+c,15,5);
			turretrightmddlebttm.fill();
			turretrightmddlebttm.setColor(drkcolor);
			turretright = new Rectangle(160+x+a,60+y+c,15,8);
			turretright.fill();
			turretright.setColor(drkcolor);
			turretrighttop = new Rectangle(167+x+a,45+y+c,10,5);
			turretrighttop.fill();
			turretrighttop.setColor(drkcolor);
			barrel = new Rectangle(125+x+a+o,47+y+c+p,150,10);
			barrel.fill();
			barrel.setColor(color);
			barrelsight = new Rectangle(260+x+a+o,43+y+c+p,8,5);
			barrelsight.fill();
			barrelsight.setColor(litrdrkcolor);
			barreltip = new Ellipse(273+x+a+o,46+y+c+p,6,11);
			barreltip.fill();
			barreltip.setColor(color);
			barrelopening = new Ellipse(272+x+a+o,47+y+c+p,6,9);
			barrelopening.fill();
			barrelopening.setColor(Color.BLACK);
			turrethatch = new Ellipse(55+x+a,38+y+c,20,10);
			turrethatch.fill();
			turrethatch.setColor(drkcolor);
			turrettop = new Rectangle(30+x+a,43+y+c,140,5);
			turrettop.fill();
			turrettop.setColor(color);
			turrettopmddle = new Rectangle(30+x+a,48+y+c,150,5);
			turrettopmddle.fill();
			turrettopmddle.setColor(color);
			turretmddle = new Rectangle(30+x+a,53+y+c,145,5);
			turretmddle.fill();
			turretmddle.setColor(color);
			turretmddlebttm = new Rectangle(35+x+a,58+y+c,140,5);
			turretmddlebttm.fill();
			turretmddlebttm.setColor(color);
			turretbttm = new Rectangle(40+x+a,63+y+c,130,10);
			turretbttm.fill();
			turretbttm.setColor(color);
			turretrightbttm = new Rectangle(40+x+a,63+y+c,130,10);
			turretrightbttm.fill();
			turretrightbttm.setColor(color);
			turretleftbttm = new Rectangle(155+x+a,63+y+c,15,10);
			turretleftbttm.fill();
			turretleftbttm.setColor(color);
			
			rckttip1 = new Ellipse(113+x+a,46+y+c,15,5);
			rckttip1.fill();
			rckttip1.setColor(crimsonred);
			rckttip2 = new Ellipse(113+x+a,51+y+c,15,5);
			rckttip2.fill();
			rckttip2.setColor(crimsonred);
			rckttip3 = new Ellipse(113+x+a,56+y+c,15,5);
			rckttip3.fill();
			rckttip3.setColor(crimsonred);
			rckt1 = new Ellipse(112+x+a,46+y+c,15,5);
			rckt1.fill();
			rckt1.setColor(black);
			rckt2 = new Ellipse(112+x+a,51+y+c,15,5);
			rckt2.fill();
			rckt2.setColor(black);
			rckt3 = new Ellipse(112+x+a,56+y+c,15,5);
			rckt3.fill();
			rckt3.setColor(black);
			rcktlauncher = new Rectangle(97+x+a,46+y+c,25,16);
			rcktlauncher.fill();
			rcktlauncher.setColor(litrdrkcolor);
			rcktlauncherbck = new Ellipse(87+x+a,45+y+c,20,17);
			rcktlauncherbck.fill();
			rcktlauncherbck.setColor(litrdrkcolor);
			
			
			treadtop = new Line(11+x+a,90+y+c,199+x+a,90+y+c);
			treadtop.draw();
			treadtop.setColor(black);
			treadbttm = new Line(31+x+a,120+y+c,179+x+a,120+y+c);
			treadbttm.draw();
			treadbttm.setColor(black);
			treadlefttop = new Line(11+x+a,90+y+c,3+x+a,93+y+c);
			treadlefttop.draw();
			treadlefttop.setColor(black);
			treadleftmddle = new Line(3+x+a,93+y+c,3+x+a,106+y+c);
			treadleftmddle.draw();
			treadleftmddle.setColor(black);
			treadleftbttm = new Line(3+x+a,106+y+c,31+x+a,120+y+c);
			treadleftbttm.draw();
			treadleftbttm.setColor(black);
			treadrighttop = new Line(199+x+a,90+y+c,207+x+a,93+y+c);
			treadrighttop.draw();
			treadrighttop.setColor(black);
			treadrightmddle = new Line(207+x+a,93+y+c,207+x+a,106+y+c);
			treadrightmddle.draw();
			treadrightmddle.setColor(black);
			treadrightbttm = new Line(207+x+a,106+y+c,179+x+a,120+y+c);
			treadrightbttm.draw();
			treadrightbttm.setColor(black);
			entena = new Line(45+x+a,43+y+c,40+x+a,0+y+c);
			entena.draw();
			
			armorplatelefttop = new Rectangle(0+x+a,65+y+c,107,25);
			armorplatelefttop.fill();
			armorplatelefttop.setColor(litrdrkcolor);
			armorplateleftmddle = new Rectangle(20+x+a,70+y+c,170,25);
			armorplateleftmddle.fill();
			armorplateleftmddle.setColor(litrdrkcolor);
			armorplatemddlebttm = new Rectangle(25+x+a,70+y+c,160,30);
			armorplatemddlebttm.fill();
			armorplatemddlebttm.setColor(litrdrkcolor);
			armorplaterightbttm = new Rectangle(180+x+a,80+y+c,40,10);
			armorplaterightbttm.fill();
			armorplaterightbttm.setColor(litrdrkcolor);
			armorplaterightmddle = new Rectangle(180+x+a,75+y+c,35,10);
			armorplaterightmddle.fill();
			armorplaterightmddle.setColor(litrdrkcolor);
			armorplaterighttop = new Rectangle(180+x+a,70+y+c,30,10);
			armorplaterighttop.fill();
			armorplaterighttop.setColor(litrdrkcolor);
			
			camotop1 = new Rectangle(12+x+a,65+y+c,5,15);
			camotop1.fill();
			camotop1.setColor(drkcolor);
			camobttm1 = new Rectangle(9+x+a,75+y+c,5,10);
			camobttm1.fill();
			camobttm1.setColor(drkcolor);
			camotop2 = new Rectangle(23+x+a,70+y+c,5,15);
			camotop2.fill();
			camotop2.setColor(drkcolor);
			camobttm2 = new Rectangle(25+x+a,80+y+c,5,20);
			camobttm2.fill();
			camobttm2.setColor(drkcolor);
			camotop3 = new Rectangle(37+x+a,65+y+c,5,15);
			camotop3.fill();
			camotop3.setColor(drkcolor);
			camobttm3 = new Rectangle(40+x+a,75+y+c,5,10);
			camobttm3.fill();
			camobttm3.setColor(drkcolor);
			camotop4 = new Rectangle(50+x+a,70+y+c,5,20);
			camotop4.fill();
			camotop4.setColor(drkcolor);
			camobttm4 = new Rectangle(48+x+a,85+y+c,5,15);
			camobttm4.fill();
			camobttm4.setColor(drkcolor);
			camotop5 = new Rectangle(65+x+a,65+y+c,5,8);
			camotop5.fill();
			camotop5.setColor(drkcolor);
			camobttm5 = new Rectangle(63+x+a,69+y+c,5,20);
			camobttm5.fill();
			camobttm5.setColor(drkcolor);
			camotop6 = new Rectangle(75+x+a,70+y+c,5,15);
			camotop6.fill();
			camotop6.setColor(drkcolor);
			camobttm6 = new Rectangle(73+x+a,80+y+c,5,20);
			camobttm6.fill();
			camobttm6.setColor(drkcolor);
			camotop7 = new Rectangle(90+x+a,65+y+c,5,10);
			camotop7.fill();
			camotop7.setColor(drkcolor);
			camobttm7 = new Rectangle(87+x+a,71+y+c,5,20);
			camobttm7.fill();
			camobttm7.setColor(drkcolor);
			camotop8 = new Rectangle(100+x+a,80+y+c,5,15);
			camotop8.fill();
			camotop8.setColor(drkcolor);
			camobttm8 = new Rectangle(97+x+a,92+y+c,5,8);
			camobttm8.fill();
			camobttm8.setColor(drkcolor);
			camotop9 = new Rectangle(110+x+a,70+y+c,5,10);
			camotop9.fill();
			camotop9.setColor(drkcolor);
			camobttm9 = new Rectangle(113+x+a,76+y+c,5,18);
			camobttm9.fill();
			camobttm9.setColor(drkcolor);
			camotop10 = new Rectangle(125+x+a,78+y+c,5,10);
			camotop10.fill();
			camotop10.setColor(drkcolor);
			camobttm10 = new Rectangle(127+x+a,85+y+c,5,15);
			camobttm10.fill();
			camobttm10.setColor(drkcolor);
			camotop11 = new Rectangle(139+x+a,70+y+c,5,20);
			camotop11.fill();
			camotop11.setColor(drkcolor);
			camobttm11 = new Rectangle(142+x+a,87+y+c,5,8);
			camobttm11.fill();
			camobttm11.setColor(drkcolor);
			camotop12 = new Rectangle(155+x+a,75+y+c,5,15);
			camotop12.fill();
			camotop12.setColor(drkcolor);
			camobttm12 = new Rectangle(152+x+a,85+y+c,5,15);
			camobttm12.fill();
			camobttm12.setColor(drkcolor);
			camotop13 = new Rectangle(170+x+a,70+y+c,5,15);
			camotop13.fill();
			camotop13.setColor(drkcolor);
			camobttm13 = new Rectangle(167+x+a,82+y+c,5,15);
			camobttm13.fill();
			camobttm13.setColor(drkcolor);
			camotop14 = new Rectangle(183+x+a,75+y+c,5,8);
			camotop14.fill();
			camotop14.setColor(drkcolor);
			camobttm14 = new Rectangle(180+x+a,80+y+c,5,20);
			camobttm14.fill();
			camobttm14.setColor(drkcolor);
			camotop15 = new Rectangle(193+x+a,70+y+c,5,10);
			camotop15.fill();
			camotop15.setColor(drkcolor);
			camobttm15 = new Rectangle(195+x+a,78+y+c,5,8);
			camobttm15.fill();
			camobttm15.setColor(drkcolor);
			camotop16 = new Rectangle(205+x+a,73+y+c,5,12);
			camotop16.fill();
			camotop16.setColor(drkcolor);
			camobttm16 = new Rectangle(207+x+a,82+y+c,5,8);
			camobttm16.fill();
			camobttm16.setColor(drkcolor);
	}
	public int getX()
	{
		return basetop.getX();
	}
	public int getY()
	{
		return basetop.getY();
	}
	
	public int getHeight()
	{
		return basetop.getHeight();
	}
	public int getWidth()
	{
		return basetop.getWidth();
	}
	
	public void draw()
	{
		
	}
	public void translate(double xx, double yy)
	{
		basetop.translate(xx,yy);
		basemddle.translate(xx,yy);
		basebttm.translate(xx,yy);
		wheel1.translate(xx,yy);
		wheel2.translate(xx,yy);
		wheel3.translate(xx,yy);
		wheel4.translate(xx,yy);
		wheel5.translate(xx,yy);
		wheel6.translate(xx,yy);
		wheel7.translate(xx,yy);
		wheel8.translate(xx,yy);
		wheel9.translate(xx,yy);
		armorplatelefttop.translate(xx,yy);
		armorplateleftmddle.translate(xx,yy);
		armorplatemddlebttm.translate(xx,yy);
		armorplaterightbttm.translate(xx,yy);
		armorplaterightmddle.translate(xx,yy);
		armorplaterighttop.translate(xx,yy);
		treadtop.translate(xx,yy);
		treadbttm.translate(xx,yy);
		treadlefttop.translate(xx,yy);
		treadleftmddle.translate(xx,yy);
		treadrightbttm.translate(xx,yy);
		treadrightmddle.translate(xx,yy);
		treadrighttop.translate(xx,yy);
		treadleftbttm.translate(xx,yy);
		turrettop.translate(xx,yy);
		turretrighttop.translate(xx,yy);
		turrettopmddle.translate(xx,yy);
		turretmddle.translate(xx,yy);
		turretmddlebttm.translate(xx,yy);
		turretbttm.translate(xx,yy);
		turretright.translate(xx,yy);
		turretrightmddle.translate(xx,yy);
		turretrightmddlebttm.translate(xx,yy);
		entena.translate(xx,yy);
		turretleftbttm.translate(xx,yy);
		turretrightbttm.translate(xx,yy);
		turrethatch.translate(xx,yy);
		rcktlauncher.translate(xx,yy);
		rcktlauncherbck.translate(xx,yy);
		rckttip1.translate(xx,yy);
		rckttip2.translate(xx,yy);
		rckttip3.translate(xx,yy);
		rckt1.translate(xx,yy);
		rckt2.translate(xx,yy);
		rckt3.translate(xx,yy);
		barrel.translate(xx,yy);
		barrelsight.translate(xx,yy);
		barreltip.translate(xx,yy);
		barrelopening.translate(xx,yy);
		camotop1.translate(xx,yy);
		camobttm1.translate(xx,yy);
		camotop2.translate(xx,yy);
		camobttm2.translate(xx,yy);
		camotop3.translate(xx,yy);
		camobttm3.translate(xx,yy);
		camotop4.translate(xx,yy);
		camobttm4.translate(xx,yy);
		camotop5.translate(xx,yy);
		camobttm5.translate(xx,yy);
		camotop6.translate(xx,yy);
		camobttm6.translate(xx,yy);
		camotop7.translate(xx,yy);
		camobttm7.translate(xx,yy);
		camotop8.translate(xx,yy);
		camobttm8.translate(xx,yy);
		camotop9.translate(xx,yy);
		camobttm9.translate(xx,yy);
		camotop10.translate(xx,yy);
		camobttm10.translate(xx,yy);
		camotop11.translate(xx,yy);
		camobttm11.translate(xx,yy);
		camotop12.translate(xx,yy);
		camobttm12.translate(xx,yy);
		camotop13.translate(xx,yy);
		camobttm13.translate(xx,yy);
		camotop14.translate(xx,yy);
		camobttm14.translate(xx,yy);
		camotop15.translate(xx,yy);
		camobttm15.translate(xx,yy);
		camotop16.translate(xx,yy);
		camobttm16.translate(xx,yy);
		
		// armorplatemddlebttn.translate(xx,yy);
		
	}
	 // public void setColor(int r,int g,int b)
	// (
		
	// )
}
