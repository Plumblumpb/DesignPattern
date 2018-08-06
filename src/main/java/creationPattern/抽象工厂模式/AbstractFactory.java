package creationPattern.抽象工厂模式;

public interface AbstractFactory {
    public Color getColor(String color);
    public Shape getShape(String shape);
}
