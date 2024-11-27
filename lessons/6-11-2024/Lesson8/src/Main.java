public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ComicBook b = new ComicBook();
        AbstractBook b1 = new ComicBook();
        IBook b3 = new ComicBook();
        System.out.println(ComicBook.getT());
        System.out.println(ComicBook.t);
    }
}

// Class, Abstract Class, Interface
// Enum, Record, Sealed / Non-sealed class

