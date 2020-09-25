package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

public class SimpleGUI extends JFrame {
    private JButton button = new JButton("Draw rectangle");
    private JButton buttonUnion = new JButton("Test Union");
    private Label label1 = new Label("Enter weight");
    private Label label2 = new Label(" Enter height");
    private Label label3 = new Label("Enter out color");
    private Label label4 = new Label(" Enter in color");
    private JTextField inputWeight = new JTextField("600", 1);
    private JTextField inputHeight = new JTextField("300", 1);
    private JTextField inputColor1 = new JTextField("black", 1);
    private JTextField inputColor2 = new JTextField("gray", 1);
    private JRadioButton radio1 = new JRadioButton("DrawableRect");
    private JRadioButton radio2 = new JRadioButton("ColoredRect");

    public SimpleGUI() {
        super("DRAW");
        this.setBounds(100, 100, 250, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(6, 2, 2, 2));
        container.add(label1);
        container.add(label2);

        container.add(inputWeight);
        container.add(inputHeight);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);

        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);

        container.add(label3);
        container.add(label4);
        container.add(inputColor1);
        container.add(inputColor2);
        button.addActionListener(new ButtonEventListener ());
        buttonUnion.addActionListener(new ClickOpenUnion ());
        container.add(button);
        container.add(buttonUnion);
    }
    class ClickOpenUnion implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            UnionGUI unionGUI=new UnionGUI();
            unionGUI.setVisible(true);
        }
    }
    class ButtonEventListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Color colorOut, colorIN;
            try {
                Field field = Color.class.getField(inputColor1.getText());
                colorOut = (Color)field.get(null);
            } catch (Exception exception) {
                colorOut = null; // Not defined
            }
            try {
                Field field = Color.class.getField(inputColor2.getText());
                colorIN = (Color)field.get(null);
            } catch (Exception exception) {
                colorIN = null; // Not defined
            }
            if(radio1.isSelected()){
                DrawableRect rect = new DrawableRect(colorOut,new Rectangle( Integer.parseInt(inputWeight.getText()),Integer.parseInt(inputHeight.getText())));
                rect.outColor=colorOut;
            }
            if(radio2.isSelected()){
                ColoredRect rect = new ColoredRect(colorOut,new Rectangle(Integer.parseInt(inputWeight.getText()),Integer.parseInt(inputHeight.getText())));
                rect.inColor=colorIN;
            }
        }
    }
}