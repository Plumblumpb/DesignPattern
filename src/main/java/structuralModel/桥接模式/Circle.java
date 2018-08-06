package structuralModel.桥接模式;

public class Circle extends Shape {

    private int x,y,redius;
    public Circle(int x,int y,int redius,DrawAPI drawAPI){
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.redius = redius;
    }
    public void draw() {
        drawAPI.drawCircle(redius,x,y);
    }
}
