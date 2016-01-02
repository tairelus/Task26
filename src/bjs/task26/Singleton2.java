package bjs.task26;

/**
 * Created by YM on 02.01.2016.
 * This variant based on Double-Checked Locking. Synchronization called only once
 */
public class Singleton2{
    //volatile guarantees that all threads get same instance reference
    private static volatile Singleton2 instance;

    private Singleton2() {
    }

    //Double-checked locking should be faster than synchronized method. Works only for JDK 5.0 and later
    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }

        return instance;
    }
}
