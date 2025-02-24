public class Main {
    public static void main(String[] args) {
        IphoneNew iphoneNew = new IphoneNew(new IphoneOldToNewAdapter());
        iphoneNew.onCharge();
    }
}