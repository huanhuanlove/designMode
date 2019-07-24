package com.kang;

/************************************************************************************/
/******************************        单例模式      ********************************/
/************************************************************************************/
public class Singleton {
    /**
     * 单例模式:即一个应用程序中，某个类的实例对象只有一个，你没有办法去new，因为构造器是被private修饰的，
     * 一般通过getInstance()的方法来获取它们的实例。getInstance()的返回值是一个对象的引用，
     * 并不是一个新的实例，所以不要错误的理解成多个对象
     */


    //1.懒汉式写法
    /*private static Singleton instance;
    private Singleton() {};
    public static synchronized Singleton getInstance() {
        return  instance == null ? new Singleton() : instance;
    }*/

    //2、饿汉式写法
    /*private static Singleton instance = new Singleton();
    private Singleton (){}
    public static Singleton getInstance() {
        return instance;
    }*/

    //3、静态内部类
    /*private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton (){}
    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }*/

    //双重校验锁(避免多线程同步问题，而且还能防止反序列化重新创建新的对象，可谓是很坚强的壁垒)
    private volatile static Singleton singleton;
    private Singleton (){}
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
