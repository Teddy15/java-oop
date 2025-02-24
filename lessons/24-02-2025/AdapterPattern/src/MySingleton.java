public class MySingleton {
    private MySingleton() {}

    // Eager initialization
    //    private static MySingleton instance = new MySingleton();
    //    public static MySingleton getInstance() {
    //        return instance;
    //    }

    // Lazy initialization
    private static MySingleton instance;

    public static MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton();
        }

        return instance;
    }
}
