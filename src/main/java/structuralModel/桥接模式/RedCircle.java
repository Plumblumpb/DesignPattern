package structuralModel.桥接模式;

public class RedCircle implements DrawAPI {
    public void drawCircle(int redius, int x, int y) {
        System.out.println("red"+x+y);
    }
}
