import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        MyFuncInterface<String> result = x -> x.contains("test");
        System.out.println(result.test("false"));

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

//        for (Integer i : arrayList) {
//            if (i % 3 == 0) {
//                System.out.println(i);
//            }
//        }

//        arrayList.forEach(i -> System.out.println(i));
//
//        arrayList.forEach(x -> {
//            if (x % 3 == 0 ) {
//                System.out.println(x);
//            }
//        });

         Set<Integer> set = arrayList
                .stream()
                .filter(x -> x % 3 == 0)
                 .collect(Collectors.toSet());

         arrayList.stream()
                 .filter(x -> x % 3 == 0)
                 .collect(Collectors.toList());
         
         //****** Wildcards *****
        // Unbounded wildcard: List<?> list1 = new ArrayList<>();
        // It means that the List is of an unknown type.
        // It is useful when you need to used methods like List.size(), which do not depend on the type provided
        // to the Generic interface.
        // Bounded wildcards: List<? extends Test>, List<? super Test>
        // List<? extends Test> means that the list can hold objects that are subclasses of Test, or Test itself
        // List<? super Test> means that the list can hold objects that are super-classes of Test, or Test itself
        
        
        System.out.println(arrayList);
        System.out.println(set);

        List<String> strings = arrayList
                .stream() // source
                .map(x -> x.toString())
                .collect(Collectors.toList());

        arrayList.add(2);
        arrayList.add(2);

        List<String> names = List.of("Ivan", "Ivanka", "Mimi", "Mimi");
        Map<String, Long> map = names.
                stream()
                .collect(Collectors
                        .groupingBy(x -> x, Collectors.counting()));

        System.out.println("groupingBy: " + map);

        Map<Boolean, Long> map2= names.stream()
                .collect(Collectors
                        .partitioningBy(
                                x -> x.equals("Ivan"),
                                Collectors.counting()));
        System.out.println("partitioningBy: " + map2);

        Map<String, Integer> resultMap = new HashMap<>();
        resultMap.put("Ivan", 1);
        resultMap.put("Ivanka", 2);

        resultMap.values().stream().forEach(System.out::println);
    }
}