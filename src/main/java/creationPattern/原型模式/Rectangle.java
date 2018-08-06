package creationPattern.原型模式;

public class Rectangle extends Shape {
    public Rectangle(){
        super.setType("Rectangle");
    }
    void draw() {
        System.out.println("Rectangle.draw()");
    }
}
