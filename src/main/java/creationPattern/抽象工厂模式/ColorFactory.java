package creationPattern.抽象工厂模式;

public class ColorFactory implements AbstractFactory {
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        }else if (color.equalsIgnoreCase("GREEN")){
            return new Green();
        }else {
            return null;
        }

    }

    public Shape getShape(String shape) {
        return null;
    }
}
