public class starter {

        public static void main(String args[])
        {
			int r = (int)(Math.random()*255);
			int g = (int)(Math.random()*255);
			int b = (int)(Math.random()*255);
			Color temp = new Color(r,g,b);
			Car one = new Car(5,10,"volvo",temp,1);
			 r = (int)(Math.random()*255);
			 g = (int)(Math.random()*255);
			 b = (int)(Math.random()*255);
			Color temp2 = new Color(r,g,b);
			Car two = new Car(5,100,"vw",temp2,5);
			 r = (int)(Math.random()*255);
			 g = (int)(Math.random()*255);
			 b = (int)(Math.random()*255);
			Color temp3 = new Color(r,g,b);
			Car thr = new Car(5,300,"benz",temp3,3);
			int td = 7500;
			while(true)
			{
				Canvas.pause(td);
				one.translate(one.getSpeed(),0);
				two.translate(two.getSpeed(),0);
				thr.translate(thr.getSpeed(),0);
				if(one.getX() > 570)
				{
					one.translate(-570,0);
				}
				if(two.getX() > 570)
				{
					two.translate(-570,0);
				}
				if(thr.getX() > 570)
				{
					thr.translate(-570,0);
				}
			}
		}

}
