package creationPattern.单例模式.饿汉式线程安全;

public class Singleton2 {
    private static  Singleton2 singleton;
//  记得将构造函数private
    private Singleton2(){}

    public static synchronized Singleton2 getInstance(){
        if(singleton == null){
            return new Singleton2();
        }
        return singleton;
    }
}
