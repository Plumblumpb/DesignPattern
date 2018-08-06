package creationPattern.单例模式.懒汉模式线程安全;

public class Singleton {
    private static Singleton singleton = new Singleton();
//    记得将构造函数private
    private Singleton(){}

    private static Singleton getInStance(){
        return singleton;
    }
}
