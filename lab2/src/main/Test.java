package main;

import classes.ColoredRect;
import classes.DrawableRect;
import classes.Rectangle;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        //3 прямоуг. по заданию
        Rectangle firstRect=new Rectangle();
        Rectangle secondRect=new Rectangle(4,5);
        Rectangle threeRect=new Rectangle(1,1,10,10);
        firstRect.rect_print();
        secondRect.rect_print();
        threeRect.rect_print();
        firstRect.move(-1,5);
        secondRect.move(10,10);
        threeRect.move(4,60);
        firstRect.rect_print();
        secondRect.rect_print();
        threeRect.rect_print();
        //Union
        Rectangle myRect = new Rectangle(2,1,4,4);
        myRect=myRect.Union(new Rectangle(1,2,5,5));
        myRect.rect_print();//получаем прямоуг с Точками Лев.верхн(2,2) / Прав.нижн(4,4)
        //рисуем
        DrawableRect drawableRect = new DrawableRect(Color.BLUE,new Rectangle(250,220));
        ColoredRect coloredRect=new ColoredRect(Color.GREEN,new Rectangle(400,300));
        coloredRect.inColor=Color.MAGENTA;
    }
}