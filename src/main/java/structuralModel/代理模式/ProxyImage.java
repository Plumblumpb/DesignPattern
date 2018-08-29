package structuralModel.代理模式;

public class ProxyImage implements Image {
    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    public void display() {
         if(realImage == null){
             realImage = new RealImage(fileName);
         }
         realImage.display();
    }

    public static void main(String[] args) {
        Image image = new ProxyImage("你好");
        image.display();
    }
}
