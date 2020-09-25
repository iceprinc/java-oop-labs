package classes;

import javax.swing.*;
import java.awt.*;

public class ColoredRect extends DrawableRect {
    public Color inColor=Color.BLACK;

    public Color getInColor() {
        return inColor;
    }

    public void setInColor(Color inColor) {
        this.inColor = inColor;
    }

    public ColoredRect(Color color, Rectangle rect) {
        super(color, rect);
    }
    public void paint(Graphics g) {
        g.setColor(inColor);
        g.fillRect(rectangle.x1+10,rectangle.y1+10,rectangle.x2-rectangle.x1,rectangle.y2-rectangle.y1);
        g.setColor(outColor);
        g.drawRect(rectangle.x1+10,rectangle.y1+10,rectangle.x2-rectangle.x1,rectangle.y2-rectangle.y1);
    }
}
