import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Review on Immutability before exam
        System.out.println("Hello world!");
        Integer i = 10;
        i = null;
        System.gc();
        String s = "Hello";
        s.substring(0, 2); // s.substring(0,2) is not the same as s = s.substring(0,2);
        System.out.println(s);
        s = s.substring(0,2);
        System.out.println(s);

        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder = stringBuilder.append("HE");
        // DOES NOT WORK THE SAME AS STRING stringBuilder = stringBuilder + stringBuilder;
        System.out.println(stringBuilder);

        List<Integer> list = new ArrayList<>();


        // LAMBDAS
        Predicate<Integer> predicate = (x) -> x < 10;
        predicate = (d) -> d > 10;
        System.out.println(predicate.test(20));

        // Our own implemnetation
        PredicateImpl predicateImpl = new PredicateImpl();
        System.out.println(predicateImpl.test(100));

        //MyConsumer functional interface
        MyConsumer<String> myConsumer = (String temp) -> System.out.println(temp);
        myConsumer.accept("Hello");

        //Java's Consumer interface
        Consumer<String> consumer = name -> {
            name=name.concat("END");
            System.out.println(name);
        };
        consumer.accept("World");

        // Bad practice
        Consumer dummyConsumer = (name) -> System.out.println(name); // working with Object because the type is omitted on the left side
        dummyConsumer.accept("Hello");

        Supplier<String> supplier = () -> "TEST";
        System.out.println(supplier.get());
    }
}