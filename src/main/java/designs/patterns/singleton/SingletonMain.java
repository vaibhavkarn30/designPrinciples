package designs.patterns.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleTonObject();
        Singleton singleton2 = Singleton.getSingleTonObject();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
