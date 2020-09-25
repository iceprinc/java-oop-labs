package classes;

import javax.swing.*;
import java.awt.*;

public class DrawableRect extends JPanel {
    public Color outColor;
    public Rectangle rectangle;
    public DrawableRect(Color color,Rectangle rect){
        outColor=color;
        rectangle=rect;
        JFrame frame = new JFrame("DrawableRect");
        frame.getContentPane().add(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(frame.getMaximumSize());//rectangle.x2-rectangle.x1,rectangle.y2-rectangle.y1);

        frame.setVisible(true);
    }
    public void paint(Graphics g) {
        g.setColor(outColor);
        g.drawRect(rectangle.x1+10,rectangle.y1+10,rectangle.x2-rectangle.x1,rectangle.y2-rectangle.y1);
    }
}