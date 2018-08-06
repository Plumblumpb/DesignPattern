package creationPattern.原型模式;

import java.util.HashMap;

public class ShapeCache {
    private static HashMap<String,Object> map = new HashMap<String, Object>();

    public static Shape getShape(String id){
        Shape cachedShape = (Shape)map.get(id);
        System.out.println(cachedShape);
        return (Shape)cachedShape.clone();
    }

    public static void loadCache(){
        Rectangle rectangle = new Rectangle();
        rectangle.setId("1");
        Square square = new Square();
        square.setId("2");
        map.put(rectangle.getId(),rectangle);
        System.out.println(rectangle);
        map.put(square.getId(),square);
    }

    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape clone1 = ShapeCache.getShape("1");
        System.out.println(clone1);
        System.out.println(clone1.getType());
    }
}
