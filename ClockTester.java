import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
   This program implements an animation that moves
   a car shape.
*/
public class ClockTester
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      ClockFace icon = new ClockFace(0, 0, CLOCK_RADIUS);
      StopWatchDial icon2 = new StopWatchDial();
      
      JButton clockButton = new JButton("clock");
      JButton stopWatchButton = new JButton("stopwatch");
      
      clockButton.addActionListener(event -> {
    	  System.out.println("ClockButton Pressed");
    	  frame.remove(icon2);
    	  frame.add(icon, BorderLayout.CENTER);
    	  frame.revalidate();
    	  frame.repaint();
      });
      
      stopWatchButton.addActionListener(event -> {
    	  System.out.println("StopWatchButton Pressed");
    	  frame.remove(icon);
    	  frame.add(icon2, BorderLayout.CENTER);
    	  frame.revalidate();
    	  frame.repaint();
      });
      
      frame.setLayout(new BorderLayout());
      frame.add(icon, BorderLayout.CENTER);
      frame.add(icon2, BorderLayout.CENTER);
      
      // Adding JButtons to the topNav JPanel
      JPanel topNav = new JPanel(new FlowLayout());
      topNav.add(clockButton);
      topNav.add(stopWatchButton);
      frame.add(topNav, BorderLayout.NORTH);

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);

      
   }

   private static final int CLOCK_RADIUS = 500;
}
