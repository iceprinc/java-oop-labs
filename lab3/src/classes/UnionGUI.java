package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

public class UnionGUI extends JFrame {
    private JButton button = new JButton("Draw");
    private Label label1 = new Label("1.Enter weight");
    private Label label2 = new Label("1.Enter height");
    private Label label3 = new Label("2.Enter weight");
    private Label label4 = new Label("2.Enter height");
    private JTextField inputWeight1 = new JTextField("600", 1);
    private JTextField inputHeight1 = new JTextField("300", 1);
    private JTextField inputWeight2 = new JTextField("300", 1);
    private JTextField inputHeight2 = new JTextField("600", 1);

    public UnionGUI() {
        super("Union");
        this.setBounds(200, 200, 250, 170);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(5, 2, 2, 2));
        container.add(label1);
        container.add(label2);

        container.add(inputWeight1);
        container.add(inputHeight1);


        container.add(label3);
        container.add(label4);
        container.add(inputWeight2);
        container.add(inputHeight2);
        button.addActionListener(new ButtonEventListener ());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Rectangle unionRect = new Rectangle( Integer.parseInt(inputWeight1.getText()),Integer.parseInt(inputHeight1.getText()));
            unionRect=unionRect.Union(new Rectangle( Integer.parseInt(inputWeight2.getText()),Integer.parseInt(inputHeight2.getText())));
            DrawableRect rect = new DrawableRect(Color.BLACK,unionRect);
        }
    }
}