package classes;

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
        g.setColor(outColor);
        g.drawRect(10,10,rectangle.x2-rectangle.x1,rectangle.y2-rectangle.y1);
        g.setColor(inColor);
        g.fillRect(11,11,rectangle.x2-rectangle.x1-2,rectangle.y2-rectangle.y1-2);
    }
}
