package structuralModel.代理模式;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName)
    {
        this.fileName = fileName;
        loadFormDisk(fileName);
    }
    public void display() {

    }

    private void loadFormDisk(String fileName){
        System.out.println("loading"+fileName);
    }
}
