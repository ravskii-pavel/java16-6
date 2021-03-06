package calculator;

import javax.swing.*;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by Ravskiy Pavel on 09.01.2017.
 */
public class Calculator {

    public static JTextField textField = new JTextField("0");


    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        frame.setSize(300, 270);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textField.setFont(new Font("",Font.PLAIN, 20));

        BorderLayout borderLayout = new BorderLayout();
        frame.setLayout(borderLayout);
        frame.add(textField, borderLayout.NORTH);
        MainPanel mainPanel = new MainPanel();
        frame.add(mainPanel, borderLayout.WEST);
        frame.setVisible(true);
		frame.setResizable(false);
        textField.setFocusable(false);
    }
}