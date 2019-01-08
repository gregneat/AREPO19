package pkg;
public class AndrewCarP2 implements Vehicle
{
	private Rectangle baseleft,baseright,basemddle,basemddledrwn,baserightmddle,baserightmddledrwn,basemddlemddledrwn,basemddlemddle,rooftopright,basetopright;
	private Rectangle basetop,windowtop,windowrighttop,windowmddle,windowrightbttm,windowbttm,windowframetop,windowframerighttop,windowframemddle,windowframerightbttm,windowframebttm,baseleftbttm;
	private Rectangle basemddleleft,basebttm,frontlighttop,frontlightbttm,bcklighttop,bcklightbttm,bcklighttopoutlne,bcklightbttmoutlne,frontlighttopoutlne;
	private Rectangle frontlightbttmoutlne,hitbox;
	private Line entena1,entena2;
	private Ellipse wheel1,wheel2,frontbumper,frontbumperlower,hood,bckbumper,bckbumperlower,trunk,rooftop,roofleft,roofright,roofrightlower,basemddleright;
	private Ellipse hubcap1,hubcap2,sirenlft,sirenrght;
	private Text Policetext;
	private int a,c,o,p,r,g,b,contrast;
	private Color litcolor,drkrlitcolor,color,litrdrkcolor,drkcolor,black,grey,crimsonred,bannanayellow;
	public AndrewCarP2(int x, int y)//, int r_MAIN, int g_MAIN, int b_MAIN, int contrast_MAIN)
	//public Tank(int x, int y)
	{
			crimsonred = new Color (190,0,0);
			bannanayellow = new Color (230,255,0);
			// contrast = 50; //20,30
			// r = 250;
			// g = 0;//120,180
			// b = 0;
			
			// r = r_MAIN;
			// g = g_MAIN;
			// b = b_MAIN;
			// contrast = contrast_MAIN;
			
			// litcolor = new Color (r,g,b);
			// if (r<contrast)
			// {
				// r=r-r;
			// }
			// if (r>=contrast)
			// {
				// r=r-contrast;
			// }
			// if (g<contrast)
			// {
				// g=g-g;
			// }
			// if (g>=contrast)
			// {
				// g=g-contrast;
			// }
			// if (b<contrast)
			// {
				// b=b-b;
			// }
			// if (b>=contrast)
			// {
				// b=b-contrast;
			// }
			// drkrlitcolor = new Color (r,g,b);
			// if (r<contrast )
			// {
				// r=r-r;
			// }
			// if (r>=contrast)
			// {
				// r=r-contrast;
			// }
			// if (g<contrast)
			// {
				// g=g-g;
			// }
			// if (g>=contrast)
			// {
				// g=g-contrast;
			// }
			// if (b<contrast)
			// {
				// b=b-b;
			// }
			// if (b>=contrast)
			// {
				// b=b-contrast;
			// }
			// color = new Color (r,g,b);
			// if (r<contrast)
			// {
				// r=r-r;
			// }
			// if (r>=contrast)
			// {
				// r=r-contrast;
			// }
			// if (g<contrast)
			// {
				// g=g-g;
			// }
			// if (g>=contrast)
			// {
				// g=g-contrast;
			// }
			// if (b<contrast)
			// {
				// b=b-b;
			// }
			// if (b>=contrast)
			// {
				// b=b-contrast;
			// }
			// litrdrkcolor = new Color (r,g,b);
			// if (r<contrast)
			// {
				// r=r-r;
			// }
			// if (r>=contrast)
			// {
				// r=r-contrast;
			// }
			// if (g<contrast)
			// {
				// g=g-g;
			// }
			// if (g>=contrast)
			// {
				// g=g-contrast;
			// }
			// if (b<contrast)
			// {
				// b=b-b;
			// }
			// if (b>=contrast)
			// {
				// b=b-contrast;
			// }
			// drkcolor = new Color (r,g,b);
			
			grey = new Color (75,75,60);
			black = new Color (25,25,20);
			a = 0;
			c = 0;
			o = 0;
			p = 0;
			sirenlft = new Ellipse(56+x+a,5+y+c,10,10);
			sirenlft.setColor(Color.BLUE);
			sirenrght = new Ellipse(61+x+a,5+y+c,10,10);
			sirenrght.setColor(crimsonred);
			entena1 = new Line(16+x+a,38+y+c,12+x+a,0+y+c);
			entena2 = new Line(19+x+a,29+y+c,18+x+a,8+y+c);
			
			bckbumperlower = new Ellipse(0+x+a,32+y+c,7,14);
			bckbumperlower.setColor(black);
			bckbumper = new Ellipse(2+x+a,23+y+c,6,22);
			bckbumper.setColor(black);
			trunk = new Ellipse(6+x+a,20+y+c,80,8);
			trunk.setColor(black);
			roofleft = new Ellipse(21+x+a,12+y+c,80,30);
			roofleft.setColor(black);
			rooftop = new Ellipse(31+x+a,10+y+c,52,10);
			rooftop.setColor(black);
			rooftopright = new Rectangle(51+x+a,11+y+c,28,10);
			rooftopright.setColor(black);
			roofright = new Ellipse(23+x+a,9+y+c,68,20);
			roofright.setColor(black);
			roofrightlower = new Ellipse(29+x+a,15+y+c,72,20);
			roofrightlower.setColor(black);
			baseleft = new Rectangle(4+x+a,24+y+c,27,22);
			baseleft.setColor(black);
			hood = new Ellipse(22+x+a,24+y+c,100,10);
			hood.setColor(black);
			basemddledrwn = new Rectangle(31+x+a,16+y+c,50,30);
			basemddledrwn.setColor(black);
			basemddle = new Rectangle(32+x+a,15+y+c,51,30);
			basemddle.setColor(Color.WHITE);
			baserightmddledrwn = new Rectangle(81+x+a,21+y+c,10,25);
			baserightmddledrwn.setColor(black);
			baserightmddle = new Rectangle(80+x+a,20+y+c,13,26);
			baserightmddle.setColor(Color.WHITE);
			basetopright = new Rectangle(29+x+a,17+y+c,59,17);
			basetopright.setColor(Color.WHITE);
			basetop = new Rectangle(38+x+a,13+y+c,40,25);
			basetop.setColor(Color.WHITE);
			frontbumper = new Ellipse(113+x+a,27+y+c,20,20);
			frontbumper.setColor(black);
			frontbumperlower = new Ellipse(121+x+a,33+y+c,12,14);
			frontbumperlower.setColor(black);
			baseright = new Rectangle(91+x+a,27+y+c,30,20);
			baseright.setColor(black);
			basemddleright = new Ellipse(88+x+a,24+y+c,8,22);
			basemddleright.setColor(Color.WHITE);
			baseleftbttm = new Rectangle(21+x+a,34+y+c,13,7);
			baseleftbttm.setColor(black);
			basemddleleft = new Rectangle(21+x+a,38+y+c,17,7);
			basemddleleft.setColor(black);
			basebttm = new Rectangle(21+x+a,43+y+c,75,3);
			basebttm.setColor(black);
			
			Policetext = new Text(46+x+a,27+y+a,"Polizei");
			Policetext.setColor(black);

			windowframetop = new Rectangle(40+x+a,15+y+c,37,10);
			windowframetop.setColor(black);
			windowframerighttop = new Rectangle(34+x+a,18+y+c,37,6);
			windowframerighttop.setColor(black);
			windowframemddle = new Rectangle(39+x+a,18+y+c,43,10);
			windowframemddle.setColor(black);
			windowframerightbttm = new Rectangle(81+x+a,23+y+c,10,4);
			windowframerightbttm.setColor(black);
			windowframebttm = new Rectangle(37+x+a,21+y+c,50,5);
			windowframebttm.setColor(black);
			
			windowtop = new Rectangle(42+x+a,17+y+c,33,6);
			windowtop.setColor(grey);
			windowrighttop = new Rectangle(38+x+a,20+y+c,35,2);
			windowrighttop.setColor(grey);
			windowmddle = new Rectangle(42+x+a,20+y+c,38,6);
			windowmddle.setColor(grey);
			windowrightbttm = new Rectangle(80+x+a,24+y+c,7,1);
			windowrightbttm.setColor(grey);
			windowbttm = new Rectangle(41+x+a,22+y+c,44,2);
			windowbttm.setColor(grey);

			
			wheel1 = new Ellipse(15+x+a,35+y+c,21,21);
			wheel1.setColor(grey);
			wheel2 = new Ellipse(99+x+a,35+y+c,21,21);
			wheel2.setColor(grey);
			hubcap1 = new Ellipse(17+x+a,37+y+c,17,17);
			hubcap1.setColor(black);
			hubcap2 = new Ellipse(101+x+a,37+y+c,17,17);
			hubcap2.setColor(black);
			
			frontlighttopoutlne = new Rectangle(5+x+a,24+y+c,6,5);
			frontlighttopoutlne.setColor(black);
			frontlightbttmoutlne = new Rectangle(3+x+a,26+y+c,8,5);
			frontlightbttmoutlne.setColor(black);
			frontlighttop = new Rectangle(122+x+a,29+y+c,6,3);
			frontlighttop.setColor(bannanayellow);
			frontlightbttm = new Rectangle(122+x+a,31+y+c,8,2);
			frontlightbttm.setColor(bannanayellow);
			bcklighttopoutlne = new Rectangle(5+x+a,24+y+c,6,5);
			bcklighttopoutlne.setColor(black);
			bcklightbttmoutlne = new Rectangle(3+x+a,26+y+c,8,5);
			bcklightbttmoutlne.setColor(black);
			bcklighttop = new Rectangle(6+x+a,25+y+c,4,3);
			bcklighttop.setColor(crimsonred);
			bcklightbttm = new Rectangle(4+x+a,27+y+c,6,3);
			bcklightbttm.setColor(crimsonred);
			
			hitbox= new Rectangle(0+x+a,8+y+c,132,45);
			hitbox.setColor(black);
			
	}
	public int getX()
	{
		return hitbox.getX();
	}
	public int getY()
	{
		return hitbox.getY();
	}
	
	public void draw()
	{
		sirenlft.fill();
		sirenrght.fill();
		entena1.draw();
		entena2.draw();
		bckbumperlower.fill();
		bckbumper.fill();
		trunk.fill();
		roofleft.fill();
		rooftop.fill();
		rooftopright.fill();
		roofright.fill();
		roofrightlower.fill();
		baseleft.fill();
		hood.fill();
		basemddledrwn.draw();
		baserightmddledrwn.draw();
		basemddle.fill();
		baserightmddle.fill();
		basetopright.fill();
		basetop.fill();
		frontbumper.fill();
		frontbumperlower.fill();
		baseright.fill();
		basemddleright.fill();
		baseleftbttm.fill();
		basemddleleft.fill();
		basebttm.fill();
		Policetext.draw();
		windowframetop.fill();
		windowframerighttop.fill();
		windowframemddle.fill();
		windowframerightbttm.fill();
		windowframebttm.fill();
		windowtop.fill();
		windowrighttop.fill();
		windowmddle.fill();
		windowrightbttm.fill();
		windowbttm.fill();
		wheel1.fill();
		wheel2.fill();
		hubcap1.fill();
		hubcap2.fill();
		frontlighttopoutlne.fill();
		frontlightbttmoutlne.fill();
		frontlighttop.fill();
		frontlightbttm.fill();
		bcklighttopoutlne.fill();
		bcklightbttmoutlne.fill();
		bcklighttop.fill();
		bcklightbttm.fill();
	}
	public void translate(double ex,double why)
	{
		baseleft.translate(ex,why);
		baseright.translate(ex,why);
		trunk.translate(ex,why);
		rooftopright.translate(ex,why);
		rooftop.translate(ex,why);
		roofleft.translate(ex,why);
		roofright.translate(ex,why);
		roofrightlower.translate(ex,why);
		basemddle.translate(ex,why);
		hood.translate(ex,why);
		wheel1.translate(ex,why);
		wheel2.translate(ex,why);
		hubcap1.translate(ex,why);
		hubcap2.translate(ex,why);
		entena1.translate(ex,why);
		entena2.translate(ex,why);
		basemddledrwn.translate(ex,why);
		baserightmddle.translate(ex,why);
		baserightmddledrwn.translate(ex,why);
		basetopright.translate(ex,why);
		basetop.translate(ex,why);
		basemddleright.translate(ex,why);
		frontbumper.translate(ex,why);
		frontbumperlower.translate(ex,why);
		bckbumper.translate(ex,why);
		bckbumperlower.translate(ex,why);
		windowframetop.translate(ex,why);
		windowframerighttop.translate(ex,why);
		windowframemddle.translate(ex,why);
		windowframebttm.translate(ex,why);
		windowframerightbttm.translate(ex,why);
		windowtop.translate(ex,why);
		windowrighttop.translate(ex,why);
		windowmddle.translate(ex,why);
		windowrightbttm.translate(ex,why);
		windowbttm.translate(ex,why);
		baseleftbttm.translate(ex,why);
		basemddleleft.translate(ex,why);
		basebttm.translate(ex,why);
		Policetext.translate(ex,why);
		frontlighttopoutlne.translate(ex,why);
		frontlightbttmoutlne.translate(ex,why);
		frontlighttop.translate(ex,why);
		frontlightbttm.translate(ex,why);
		bcklighttopoutlne.translate(ex,why);
		bcklightbttmoutlne.translate(ex,why);
		bcklighttop.translate(ex,why);
		bcklightbttm.translate(ex,why);
		sirenlft.translate(ex,why);
		sirenrght.translate(ex,why);
		hitbox.translate(ex,why);
		
	}
	 // public void setColor(int r,int g,int b)
	// (
		
	// )
}