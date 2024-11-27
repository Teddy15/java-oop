public class ComicBook extends AbstractBook implements IBook {
    public final static String t = "HIDDEN";

    @Override
    public void printInfo() {
        System.out.println("Print info Comic Book");
    }

    @Override
    public void printBook() {
        System.out.println(title);
        System.out.println(genre);
    }

    public static String getT() {
        return t;
    }
}
