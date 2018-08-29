package creationPattern.单例模式.饿汉模式;

public class Singleton {
//    堵死 new Singleton() 这条路
    private static volatile Singleton singleton = null;

    private Singleton(){};

    public static Singleton getSingleton(){
        if(singleton == null){
            // 加锁
            synchronized (Singleton.class){
                // 这一次判断也是必须的，不然会有并发问题
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
