import java.util.function.Predicate;

public class PredicateImpl implements Predicate<Integer> {
    @Override
    public boolean test(Integer x) {
        return x < 10;
    }
}
