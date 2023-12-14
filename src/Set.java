public interface Set<E> extends Collection<E>{
    int size();
    boolean isEmpty();
    boolean contains(Object element);
    boolean add(E element); // optional
    boolean remove(Object element); // optional
    boolean containsAll(java.util.Collection<?> c);
    boolean addAll(java.util.Collection<? extends E> c);
    boolean removeAll(java.util.Collection<?> c);
    boolean retainAll(java.util.Collection<?> c);
    void clear();
}
