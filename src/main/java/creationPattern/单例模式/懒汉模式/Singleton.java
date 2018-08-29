package creationPattern.单例模式.懒汉模式;

public class Singleton {

    // 创建私有静态实例，意味着这个类第一次使用的时候就会进行创建
    private static Singleton singleton = new Singleton();
    // 将 new Singleton() 堵死
    private Singleton(){};

    private Singleton getSingleton(){
        return  singleton;
    }
}
