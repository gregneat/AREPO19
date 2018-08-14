import javax.swing.*;
import java.awt.*;

public class starter extends JPanel 
{
	static JFrame frame;
	
	public static void main(String[] args) {
		frame = new JFrame("App");
		frame.add(new starter());
		frame.setSize(600,600);
		frame.setVisible(true);
	}
	
	public starter()
	{
		Color a = new Color(0,255,0);
		setBackground(a);
		//setBackground(Color.GREEN);
	}

}

