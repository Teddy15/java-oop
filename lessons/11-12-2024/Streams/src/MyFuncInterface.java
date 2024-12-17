@FunctionalInterface
public interface MyFuncInterface<T> {
    boolean test(T t);
    //default,private, static, methods are allowed
}
