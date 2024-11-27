import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//       ArrayList -> List
//
//      LinkedList -> List
//      LinkedList -> Queue
        List<Integer> list = new LinkedList<>();
        list.add(1); // 0
        list.add(2); // 1
        // list.remove(1);
        boolean contains = list.contains(3);
        System.out.println(contains);
        Integer[] array = new Integer[list.size()];
        array = list.toArray(array);

        list.addAll(List.of(1));

        List<Integer> immutableList = List.of(1,2,3,10);
//        Integer v1 = immutableList.get(0);
//        v1 = 5;
//        immutableList.set(0, v1); // Throws exception
//        System.out.println(v1);

        // Like Vector, but Vector is deprecated in newer verions of Java
        // Faster than Vector
        List<String> list1 = new ArrayList<>();
        list1.add("one");

        // Queue, Stack
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        Integer two = queue.element(); // you can use .peek() but it will return null if element is not found
        two.equals(2);
        System.out.println(queue.remove());
        System.out.println(queue.peek());

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(5);
        System.out.println(stack.pop()); // returns last element and removes it from the stack
        System.out.println(stack.peek()); // returns last element of the stack



        Deque<Integer> deque = new LinkedList<>();
    }
}
