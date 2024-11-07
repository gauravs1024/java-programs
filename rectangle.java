import javax.swing.*;
import java.awt.*;

public class rectangle extends JFrame {
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    public rectangle() {
        setTitle("Rectangle Drawing");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(50, 50, 200, 100);  // Draw a rectangle with the given parameters
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            rectangle rectangleDrawing = new rectangle();
            rectangleDrawing.setVisible(true);
        });
    }
}
