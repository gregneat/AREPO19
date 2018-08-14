import javax.swing.*;

public class starter extends JPanel
{
	static JFrame frame;
	static JFrame frame2;
	public static void main(String[] args) {
		frame2 = new JFrame("Second Frame");
		frame2.add(new starter());
		frame2.setSize(1000,1000);
		frame2.setVisible(true);
		frame = new JFrame("First Frame");
		frame.add(new starter());
		frame.setSize(600,600);
		frame.setVisible(true);
	}
	
	public starter()
	{
		
	}
	
}

