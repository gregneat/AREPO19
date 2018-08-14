public class starter {

        public static void main(String args[])
        {
			Rectangle box = new Rectangle(5,10,60,80);
			int r = (int)(Math.random()*255);
			int g = (int)(Math.random()*255);
			int b = (int)(Math.random()*255);
			Color joe = new Color(r,g,b);
			box.setColor(joe);
			box.fill();
		}

}
