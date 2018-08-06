package creationPattern.抽象工厂模式;

public class FactoryProducor {
    public static  AbstractFactory getFactory(String factory){
        if (factory ==null ){
            return  null;
        }else if (factory.equalsIgnoreCase("shape")){
            return  new ShapeFactory();
        }else if (factory.equalsIgnoreCase("color")){
            return  new ColorFactory();
        }else {
            return null;
        }
    }

    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducor.getFactory("shape");
        Shape  shape = factory.getShape("square");
        shape.draw();



        AbstractFactory factory1 =FactoryProducor.getFactory("color");
        Color color = factory1.getColor("red");
        color.fillColor();
    }
}
