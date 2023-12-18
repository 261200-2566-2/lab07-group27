import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;

public class HashSetUsingHashmap<E> implements Set<E> {

    private final Object dummy = new Object();
    private final HashMap<E,Object> hashMap;

    public HashSetUsingHashmap(HashMap<E, Object> hashMap) {
        this.hashMap = hashMap;
    }

    public HashSetUsingHashmap(){
        hashMap = new HashMap<>();
    }

    @Override
    public int size() {
        return hashMap.size();
    }

    @Override
    public boolean isEmpty() {
        return hashMap.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return hashMap.containsKey(o);
    }

    @Override
    public Iterator<E> iterator() {
        return hashMap.keySet().iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        if (!hashMap.containsKey(e)) {
            hashMap.put(e,dummy);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean remove(Object o) {
        if (!hashMap.containsKey(o)) {
            return false;
        }else {
            hashMap.remove(o);
            return true;
        }
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return hashMap.keySet().containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean modified = false;
        for (E e : c) {
            if (add(e)) {
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return hashMap.keySet().retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return hashMap.keySet().removeAll(c);
    }

    @Override
    public void clear() {
        hashMap.clear();
    }
}
