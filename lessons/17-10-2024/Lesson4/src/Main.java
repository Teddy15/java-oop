public class Main {
    public static void main(String[] args) {
//        // Garbage Collection, String vs StringBuilder vs Buffer
//        // Immutable vs Mutable classes
//
//        // String - Immutable class
//        String str  = new String("Hello");
//        str.concat("World"); // -> new String ("HelloWorld")
//        System.out.println(str);
//
//        String empty = " ";
//        System.out.println(empty.isEmpty());
//        String blank = " ";
//        System.out.println(blank.isBlank());
//
//        System.out.println(str);
//
//        // StringBuilder - Mutable class
//        StringBuilder stringBuilder = new StringBuilder(str);
//        stringBuilder.append("World");
//
//        // stringBuilder = HelloWorld;
//        System.out.println(stringBuilder);
//
//        // StringBuffer - Mutable class
//        StringBuffer stringBuffer = new StringBuffer("Hello");
//        stringBuffer.append("World");

        String s1 = "";
        StringBuilder s2 = new StringBuilder(s1);
        StringBuffer s3 = new StringBuffer(s1);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            s1 = s1 + i;
        }
        System.out.println("End time: " + (System.currentTimeMillis() - startTime));


        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            s2.append(i);
        }
        System.out.println("End time: " + (System.currentTimeMillis() - startTime1));


        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            s3.append(i);
        }
        System.out.println("End time: " + (System.currentTimeMillis() - startTime2));


        // s1, s2, s3
        s1 = null;
        String s = new String("Hello");
        System.gc();


        Integer l = 12;
        Integer k = l;
        l = null;

    }
}