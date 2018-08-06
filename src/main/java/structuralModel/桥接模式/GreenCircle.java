package structuralModel.桥接模式;

public class GreenCircle implements DrawAPI {
    public void drawCircle(int redius, int x, int y) {
        System.out.println("Green"+x+y);
    }


}
