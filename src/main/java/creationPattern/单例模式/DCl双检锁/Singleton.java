package creationPattern.单例模式.DCl双检锁;

public class Singleton {
    private volatile static Singleton singleton;
//    记得将写private的构造函数
    private static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
