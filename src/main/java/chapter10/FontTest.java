package main.java.chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class FontTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new FontFrame();
            frame.setTitle("Draw Frame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }

    static class FontFrame extends JFrame {
        public FontFrame() throws HeadlessException {
            add(new FontComponent());
            pack();
        }
    }

    static class FontComponent extends JComponent {
        private static final int DEFAULT_WIDTH = 300;
        private static final int DEFAULT_HEIGHT = 200;

        public void paintComponent(Graphics g) {
            Graphics2D graphics2D = (Graphics2D) g;

            String message = "Hello, world!";

            Font f = new Font("Serif", Font.BOLD, 36);
            graphics2D.setFont(f);

            FontRenderContext context = graphics2D.getFontRenderContext();
            Rectangle2D bounds = f.getStringBounds(message, context);

            double x = (getWidth() - bounds.getWidth()) / 2;
            double y = (getHeight() - bounds.getHeight()) / 2;

            double ascent = -bounds.getY();
            double baseY = y + ascent;

            graphics2D.drawString(message, (int) x, (int) baseY);

            graphics2D.setPaint(Color.LIGHT_GRAY);

            graphics2D.draw(new Line2D.Double(x, baseY, x + bounds.getWidth(), baseY));

            Rectangle2D rect = new Rectangle2D.Double(x, y, bounds.getWidth(), bounds.getHeight());

            graphics2D.draw(rect);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        }
    }
}
