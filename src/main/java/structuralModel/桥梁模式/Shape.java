package structuralModel.桥梁模式;

public abstract class Shape {
    protected DrawApi drawAPI;

    protected Shape(DrawApi drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}


