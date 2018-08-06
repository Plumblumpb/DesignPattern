package creationPattern.抽象工厂模式;



public class ShapeFactory implements AbstractFactory{
    public Color getColor(String color) {
        return null;
    }

    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else {
            return null;
        }
    }

}
