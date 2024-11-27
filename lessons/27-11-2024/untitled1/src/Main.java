import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Set and Map
        // Has only unique elements
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(1);
        set.add(2);
        for (Integer i : set) {
            System.out.println(i);
        }
        System.out.println(set);
        System.out.println(list);

        Set<Double> doubleSet = new TreeSet<>();
        doubleSet.add(5.0);
        doubleSet.add(1.0);
        doubleSet.add(-3.00);

        System.out.println(doubleSet);

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("111111111111");
        treeSet.add("hello");
        treeSet.add("WORLD");

        System.out.println(treeSet);

//        Iterator<String> iterator = treeSet.iterator();
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        for (String s : treeSet) {
//            System.out.println(s);
//        }
//        for (int i = 0; i < treeSet.size(); i++) {
//            System.out.println(treeSet.remove(i));
//        }

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Ivan");
        map.put(1, "Ivan1");
        map.put(0, "Pesho");
        map.put(-10, "Lili");

        System.out.println(map);
        System.out.println(map.containsKey(5));
        System.out.println(map.containsValue("5"));
        System.out.println(map.containsValue("Lili"));
        System.out.println(map.get(-10));
        System.out.println(map.remove(-10));
        System.out.println(map);

        for(Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            if (entry.getKey().equals(0)) {
                entry.setValue("DrugoIme");
            }
        }
        System.out.println(map);

        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        Collection<String> valueList = map.values();
        System.out.println(valueList);

        Map<Integer,Integer> treeMap = new TreeMap<>();
        treeMap.put(1, 1);
        treeMap.put(2, 10);
        treeMap.put(-100, 1000);
        treeMap.put(0,0);
        System.out.println(treeMap);
    }
}