package structuralModel.桥梁模式;

public class Rectangle extends Shape {

    private int x;
    private int y;

    public Rectangle(int x, int y, DrawApi drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
    }
    public void draw() {
        drawAPI.draw(0, x, y);
    }
}

class Circle extends Shape {
    private int radius;

    public Circle(int radius, DrawApi drawAPI) {
        super(drawAPI);
        this.radius = radius;
    }

    public void draw() {
        drawAPI.draw(radius, 0, 0);
    }
}