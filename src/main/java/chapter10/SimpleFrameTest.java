package main.java.chapter10;

import javax.swing.*;
import java.awt.*;

public class SimpleFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new SizedFrame();
            frame.setTitle("Sized Frame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }

    static class SizedFrame extends JFrame{
        public SizedFrame() {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Dimension dimension = toolkit.getScreenSize();

            int height = dimension.height;
            int width = dimension.width;

            setSize(width/2, height/2);
            setLocationByPlatform(true);

            Image image = new ImageIcon("java-icon.png").getImage();
            setIconImage(image);
        }
    }
}


