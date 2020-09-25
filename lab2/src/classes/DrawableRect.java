package classes;

import javax.swing.*;
import java.awt.*;

public class DrawableRect extends JPanel {
    public Color outColor;
    public Rectangle rectangle;
    public DrawableRect(Color color,Rectangle rect){
        outColor=color;
        rectangle=rect;
        JFrame frame = new JFrame();
        frame.getContentPane().add(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(frame.getMaximumSize());//rectangle.x2-rectangle.x1,rectangle.y2-rectangle.y1);

        frame.setVisible(true);
    }
    public void paint(Graphics g) {
        g.setColor(outColor);
        g.drawRect(10,10,rectangle.x2-rectangle.x1,rectangle.y2-rectangle.y1);
    }
}