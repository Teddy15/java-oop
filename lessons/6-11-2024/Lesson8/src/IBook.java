public abstract interface IBook {
    public static String t = "";
    abstract public void printBook();

    default void start() {
        System.out.println("Starting program ... ");
    }
}