package chapter6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TimerTest {

    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();

        //Timer t = new Timer(5000, listener);
        Timer t = new Timer(5000, e -> {
            System.out.println("At the tone, the time is " + new Date());
            Toolkit.getDefaultToolkit().beep();
        });
        t.start();

        JOptionPane.showMessageDialog(null, "Quit Program ?");
        System.exit(0);

    }

    static class TimePrinter implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("At the tone, the time is " + new Date());
            Toolkit.getDefaultToolkit().beep();
        }
    }
}