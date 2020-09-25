package classes;



public class Rectangle {
    public int x1, y1,x2,y2;
    public Rectangle() {
        x1=0;y1=0;x2=0;y2=0;
    }
    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1=x1;this.y1=y1;this.x2=x2;this.y2=y2;
    }
    public Rectangle(int widht, int height) {
        x1=0;y1=0;x2=widht;y2=height;
    }
    public void rect_print(){
        System.out.println("x1="+x1+" y1="+y1+" x2="+x2+" y2="+y2);
    }
    public void move(int dx, int dy){
        x1+=dx;
        x2+=dx;
        y1+=dy;
        y2+=dy;
    }
    public Rectangle Union(Rectangle unionRect){
        Rectangle newRect = new Rectangle();
        if(x1>= unionRect.x1 && y1<= unionRect.y1){
            newRect.x1= x1;
            newRect.y1= unionRect.y1;
        }
        if(x1<= unionRect.x1 && y1>= unionRect.y1){
            newRect.x1= unionRect.x1;
            newRect.y1= y1;
        }
        if(x1<= unionRect.x1 && y1<= unionRect.y1){
            newRect.x1= unionRect.x1;
            newRect.y1= unionRect.y1;
        }
        if(x1>= unionRect.x1 && y1>= unionRect.y1){
            newRect.x1= x1;
            newRect.y1= y1;
        }



        if(x2<= unionRect.x2 && y2>= unionRect.y2){
            newRect.x2= x2;
            newRect.y2= unionRect.y2;
        }
        if(x2>= unionRect.x2 && y2<= unionRect.y2){
            newRect.x2= unionRect.x2;
            newRect.y2= y2;
        }
        if(x2>= unionRect.x2 && y2>= unionRect.y2){
            newRect.x2= unionRect.x2;
            newRect.y2= unionRect.y2;
        }
        if(x2<= unionRect.x2 && y2<= unionRect.y2){
            newRect.x2= x2;
            newRect.y2= y2;
        }
        return newRect;
    }
}
