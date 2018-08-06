package creationPattern.单例模式.懒汉模式非线程安全;

public class Singleton {
    private static Singleton singleton;
    //让构造函数为private，这样该类才不会被实例化
    private Singleton(){}

    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

}
