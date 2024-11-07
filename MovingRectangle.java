
import javax.swing.*;
import java.awt.*;

public class MovingRectangle extends JPanel {
    private int x = 50; // Initial x-coordinate of the rectangle
    private int y = 50; // Initial y-coordinate of the rectangle

    public void moveRectangle() {
        // Update the coordinates of the rectangle
        x += 5; // Move 5 units to the right
        y += 5; // Move 5 units downward

        // Repaint the panel to update the rectangle's position
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(x, y, 100, 50); // Draw the rectangle at (x, y)
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Moving Rectangle");
        MovingRectangle movingRectangle = new MovingRectangle();
        frame.add(movingRectangle);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Move the rectangle periodically
        Timer timer = new Timer(100, e -> movingRectangle.moveRectangle());
        timer.start();
    }
}
