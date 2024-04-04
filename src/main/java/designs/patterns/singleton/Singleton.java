package designs.patterns.singleton;

public class Singleton {

    private static Singleton singleton;
    /**
     * Making Constructor as SingleTon
     */
    private Singleton () {

    }

    public static Singleton getSingleTonObject() {
        /**
         * Lazy Initialisation
         */
        synchronized (Singleton.class) {
            if (singleton == null) {
                singleton = new Singleton();
            }
        }
       return singleton;
    }
}
