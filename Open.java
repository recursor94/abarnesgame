import javax.swing.JApplet;
import javax.swing.SwingUtilities;
import javax.swing.*;
import javax.swing.JLabel;

public class Open extends JApplet {

    public void init () {

	JFrame frame = new JFrame("Hello user.");
	frame.setSize(600, 700);
	frame.setVisible(true);
    }
}
