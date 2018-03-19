import java.util.ArrayList;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import java.awt.*;

/**
 * aggregates ClockFace and ClockHand
 * @author Dylan
 *
 */
public class StopWatchDial extends JLayeredPane{
	
	private static final int CLOCK_RADIUS = 500;
	private ArrayList<ClockFace> dials;
	private ClockFace largeDial;
	private ClockFace smallDial;
	
	public StopWatchDial() {
		dials = new ArrayList<>();
		largeDial = new ClockFace(0,0,CLOCK_RADIUS);
		smallDial = new ClockFace(10,100,CLOCK_RADIUS/3);
		dials.add(largeDial);
		dials.add(smallDial);
		this.add(largeDial, DEFAULT_LAYER);
		this.add(smallDial, PALETTE_LAYER);
	}
	
	public void paintComponent(Graphics g) {
		for(ClockFace dial: this.dials) {
			dial.repaint();
		}
	}
	
}
