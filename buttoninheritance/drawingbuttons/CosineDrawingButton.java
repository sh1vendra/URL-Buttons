package buttoninheritance.drawingbuttons;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class CosineDrawingButton extends ParentDrawingButton {
    public CosineDrawingButton(String text){
        super(text);

    }
    @Override
    protected void plotter(JFrame plotterFrame){
        CosineDrawer cosineDrawer = new CosineDrawer();
        plotterFrame.add(cosineDrawer);
    }


    private static class CosineDrawer extends JPanel implements ActionListener {
        private final Timer timer; // Timer to update the "x" coordinate
        private double angle = 0.0; // Start angle
        private final List<Point> points; // To store points of the cosine curve
    
        public CosineDrawer() {
            points = new ArrayList<>();
            // Set up the timer to call actionPerformed method every 50 milliseconds
            timer = new Timer(10, this);
            timer.start();
        }
    
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (Point point : points) {
                g.fillOval(point.x, point.y, 4, 4); // Draw each point as a small circle
            }
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == timer) {
                // Increment the angle
                angle += 0.01; // Increment in 1/100th of a radian
                int x = (int) (angle * 100); // Scale the x-coordinate for visibility
                int y = (int) ((Math.cos(angle) + 1) * 100); // Calculate y, adjusted and scaled for visibility
                points.add(new Point(x, y)); // Add the new point
                
                // Repaint the panel to update the curve
                repaint();
            
                // Remove if you want the curve to continuously plot. 
                if (angle > 2 * Math.PI || x > getWidth()) {
                    timer.stop();
                }
            }
        }
    }
}
