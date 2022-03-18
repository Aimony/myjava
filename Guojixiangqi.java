import java.awt.Color;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javafx.scene.control.Label;


public class Guojixiangqi {
    private static Window label;

    public static void main(String[] args){
        JFrame frame = new JFrame("国际象棋");
        frame.setSize(415,435);
        for (int i = 0;i < 20;i ++){
            for (int j = 0;j < 20;j ++){
                JLabel labal = new JLabel();
                label.setSize(20,20);
                label.setBackground(((i + j) % 2 == 0) ? Color.BLACK
                        : Color.white);
                label.setLocation(20 * i,20 * j);
                label.setOpaque(true);
                frame.add(label);

            }
        }
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
