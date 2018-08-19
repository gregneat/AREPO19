import pkg.*;

public class starter implements InputControl {

	static Rectangle box;

	public static void main(String args[])
        {
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			// put your code here:
			
			
		}


		public void onMouseClick(double x, double y){
			// and/or here
		}
}
