package bjs.task26;

/**
 * Created by YM on 02.01.2016.
 * This Singleton class has one flaw: we need synchronization only once, but synchronization applied for getInstance
 * every time. It is very clear and useful variant if getInstance() is called not often.
 */
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {
    }

    public static synchronized Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }

        return instance;
    }
}
