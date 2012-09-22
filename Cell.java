/**Game framework for a cell--a room or other area where the player navigates
 **through
 */

import javax.swing.*;

public class Cell {

    private JPanel panel;
    private int length;
    private int width;

    public Cell(int l, int w) {

	panel = new JPanel();
	length = l;
	width = w;
    }

    public JPanel cellPane() {

	return panel;

    }
}
