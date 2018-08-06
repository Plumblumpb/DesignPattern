package creationPattern.原型模式;

public class Square extends Shape {
    public Square(){
        super.setType("Square");
    }
    void draw() {
        System.out.println("Square.draw()");
    }
}
