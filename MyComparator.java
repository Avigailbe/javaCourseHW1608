package home_work1608;

@FunctionalInterface
public interface MyComparator<T> {
    boolean compareAndCount(T t1, T t2);

}
